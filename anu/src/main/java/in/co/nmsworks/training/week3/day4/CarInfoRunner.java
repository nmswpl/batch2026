package in.co.nmsworks.training.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarInfoRunner {

    private static CarInfo CarInfo;

    public static void main(String[] args) {
        List<CarInfo> car = fetchCarsFromDb("jdbc:mysql://localhost:3306/training", "nms-training", "");

        Map<String, List<String>> groupedCars = groupCarsByManufacturer(car);
        try {
            writeMapToFile(groupedCars, "/home/nms-training/Downloads/ManufacturerCars.txt");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<CarInfo> fetchCarsFromDb(String url, String user, String password) {
        List<CarInfo> carList = new ArrayList<>();

        String query = "SELECT manufacturer, name FROM CarInfo ORDER BY manufacturer";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                String manufacturer = rs.getString("Manufacturer");
                String name = rs.getString("Name");
                CarInfo carInfo  = new CarInfo();
                carInfo.setManufacturer(manufacturer);
                carInfo.setName(name);
                carList.add(carInfo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return carList;
    }

    public static Map<String, List<String>> groupCarsByManufacturer(List<CarInfo> carList) {
        Map<String, List<String>> maplist = new HashMap<>();
        for (CarInfo car : carList) {
            String manufacturer = car.getManufacturer();
            if (!maplist.containsKey(manufacturer)) {
                maplist.put(manufacturer, new ArrayList<>());
            }
            maplist.get(manufacturer).add(car.getName());
        }
        return maplist;
    }

    public static void writeMapToFile(Map<String, List<String>> carMap, String filePath)  {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Map.Entry<String, List<String>> entry : carMap.entrySet()) {

                writer.write("Manufacturer: " + entry.getKey() + "\n");

                for (String carName : entry.getValue()) {
                    writer.write("Car: " + carName + " \n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
