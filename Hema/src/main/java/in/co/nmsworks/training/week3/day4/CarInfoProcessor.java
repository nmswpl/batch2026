package in.co.nmsworks.training.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarInfoProcessor {
    public static void main(String[] args) {

        CarInfoProcessor carInfoProcessor = new CarInfoProcessor();

        List<CarInfo> carList = readFromDB();

        Map<String,List<CarInfo>> manufacturerToCarMap = identifyManufacturerWiseCars(carList);

        writeToFile(manufacturerToCarMap);

        carInfoProcessor.write(carList);

    }

    private void write(List<CarInfo> cars) {

        List<CarInfo> activeList = new ArrayList<>();
        List<CarInfo> discontinued = new ArrayList<>();


        for (CarInfo car : cars) {

            if (car.getStatus().equals("Active")) {
                activeList.add(car);
            } else {
                discontinued.add(car);
            }

        }

        for (CarInfo car : activeList) {


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

            for (CarInfo car : discontinued) {

                bufferedWriter.write(car.getId()+","+car.getName()+","+car.getManufacturer()+","+car.getYearOfProduction()+","+car.getStatus()+"\n");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void writeToFile(Map<String, List<CarInfo>> map) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/ManufactureWiseCarList.txt"))) {
            for (String key : map.keySet()) {
                bufferedWriter.write("========================================================================\n");
                bufferedWriter.write("\nManufacturer : " + key + "\n\n");

                int i = 1;
                for (CarInfo carObject : map.get(key)) {

                    bufferedWriter.write((i++) + ". " + carObject.getName() + "\n");
                }
                bufferedWriter.write("\n========================================================================\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static Map<String, List<CarInfo>> identifyManufacturerWiseCars(List<CarInfo> carList) {
        Map<String, List<CarInfo>> map = new HashMap<>();
        for (CarInfo car : carList) {

            String key = car.getManufacturer();
            List<CarInfo> value = map.get(key);

            if (value == null) {
                value = new ArrayList<>();
                map.put(key, value);
            }
            value.add(car);
        }

        return map;
    }

    private static List<CarInfo> readFromDB() {
        List<CarInfo> carList = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             PreparedStatement preparedStatement = connection.prepareStatement("select * from CarInfo")) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("Id");
                String name = resultSet.getString("Name");
                String manufacturer = resultSet.getString("Manufacturer");
                int yop = resultSet.getInt("YearOfProduction");
                String status = resultSet.getString("Status");

                carList.add(new CarInfo(id, name, manufacturer, yop, status));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return carList;
    }
}
