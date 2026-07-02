package in.co.nmsworks.training.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarInfo {
    public static void main(String[] args) {

        CarInfo carInfo = new CarInfo();

        List<Car> carList = readFromDB();

        Map<String,List<Car>> manufacturerToCarMap = identifyManufacturerWiseCars(carList);

        writeToFile(manufacturerToCarMap);

        carInfo.write(carList);

    }

    private void write(List<Car> cars) {

        List<Car> activeList = new ArrayList<>();
        List<Car> discontinued = new ArrayList<>();


        for (Car car : cars) {

            if (car.getStatus().equals("Active")) {
                activeList.add(car);
            } else {
                discontinued.add(car);
            }

        }

        for (Car car : activeList) {


            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
                 PreparedStatement preparedStatement = connection.prepareStatement("insert into ActiveCars values (?,?,?,?,?)")) {
                preparedStatement.setInt(1, car.getId());
                preparedStatement.setString(2, car.getName());
                preparedStatement.setString(3, car.getManufacturer());
                preparedStatement.setInt(4, car.getYearOfProduction());
                preparedStatement.setString(5, car.getStatus());

                preparedStatement.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/Discontinued Cars.txt"))) {
            bufferedWriter.write("DISCONTINUED CARS LIST\n\n");
            bufferedWriter.write("Id,Name,Manufacturer,Year Of Production,Status\n");

            for (Car car : discontinued) {

                bufferedWriter.write(car.getId()+","+car.getName()+","+car.getManufacturer()+","+car.getYearOfProduction()+","+car.getStatus()+"\n");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void writeToFile(Map<String, List<Car>> map) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/ManufactureWiseCarList.txt"))) {
            for (String key : map.keySet()) {
                bufferedWriter.write("========================================================================\n");
                bufferedWriter.write("\nManufacturer : " + key + "\n\n");

                int i = 1;
                for (Car carObject : map.get(key)) {

                    bufferedWriter.write((i++) + ". " + carObject.getName() + "\n");
                }
                bufferedWriter.write("\n========================================================================\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static Map<String, List<Car>> identifyManufacturerWiseCars(List<Car> carList) {
        Map<String, List<Car>> map = new HashMap<>();
        for (Car car : carList) {

            String key = car.getManufacturer();
            List<Car> value = map.get(key);

            if (value == null) {
                value = new ArrayList<>();
                map.put(key, value);
            }
            value.add(car);
        }

        return map;
    }

    private static List<Car> readFromDB() {
        List<Car> carList = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             PreparedStatement preparedStatement = connection.prepareStatement("select * from CarInfo")) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("Id");
                String name = resultSet.getString("Name");
                String manufacturer = resultSet.getString("Manufacturer");
                int yop = resultSet.getInt("YearOfProduction");
                String status = resultSet.getString("Status");

                carList.add(new Car(id, name, manufacturer, yop, status));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return carList;
    }
}
