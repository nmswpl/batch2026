package in.co.nmsworks.training.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class CarProcessor {
    public static void main(String[] args) {
        CarProcessor carProcessor = new CarProcessor();
        List<CarInfo> carInfoList = carProcessor.readDataFromFile();
//        System.out.println(carInfoList);
        carProcessor.write(carInfoList);
    }

    private void write(List<CarInfo> carInfoList) {
        Map<String, List<CarInfo>> statusToCarInfoMap = new HashMap<>();

        for (CarInfo carInfo : carInfoList) {
            statusToCarInfoMap.computeIfAbsent(carInfo.getStatus(), v -> new ArrayList<>()).add(carInfo);
        }

        writeToDB(statusToCarInfoMap.get("Active"));
        writeToFile(statusToCarInfoMap.get("Discontinued"));
    }

    private void writeToFile(List<CarInfo> disconnectedCars) {
        System.out.println("Write to FILE");
        try (FileWriter fileWriter = new FileWriter("/home/nms-training/Desktop/DisconnectedCarInfo.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);){

            System.out.println("Discontinued car size : " + disconnectedCars.size());

            bufferedWriter.write("Discontinued Cars : " + "\n");

            for (CarInfo car : disconnectedCars) {
                bufferedWriter.write("ID : " + car.getId() + "\n");
                bufferedWriter.write("Name : " + car.getName() + "\n");
                bufferedWriter.write("Manufacturer : " + car.getManufacturer() + "\n");
                bufferedWriter.write("Year of production : " + car.getYearOfProduction() + "\n");
                bufferedWriter.write("Status : " + car.getStatus() + "\n");

                bufferedWriter.write("\n\n");
            }

            bufferedWriter.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void writeToDB(List<CarInfo> activeCars) {

        System.out.println("Write to DB");

        String url = "jdbc:mysql://localhost:3306/training";

        try (Connection connection = DriverManager.getConnection(url, "nms-training", "");
        PreparedStatement ps = connection.prepareStatement("insert into active_car_info values(?,?,?,?,?)")) {
            for (CarInfo activeCar : activeCars) {
                ps.setInt(1, activeCar.getId());
                ps.setString(2, activeCar.getName());
                ps.setString(3, activeCar.getManufacturer());
                ps.setInt(4, activeCar.getYearOfProduction());
                ps.setString(5, activeCar.getStatus());

                ps.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<CarInfo> readDataFromFile() {
        String url = "jdbc:mysql://localhost:3306/training";

        List<CarInfo> carInfos = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(url, "nms-training", "");
             PreparedStatement ps = connection.prepareStatement("select * from CarInfo");) {

            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String manufacturer = resultSet.getString(3);
                int yearOfProduction = resultSet.getInt(4);
                String status = resultSet.getString(5);

                CarInfo carInfo = new CarInfo(id, name, manufacturer, yearOfProduction, status);

                carInfos.add(carInfo);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return carInfos;
    }
}
