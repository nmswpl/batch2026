package in.co.nmsworks.training.Week3.Map.Day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarInfoRunner {

    public static void main(String[] args) {
        List<CarInfo> cars = fetchDataFromSql();
        Map<String, List<String>> manufacturerMap = addIntoMap(cars);
        fileWrite(manufacturerMap);
    }

    private static List<CarInfo> fetchDataFromSql() {

        List<CarInfo> carList = new ArrayList<>();

        String url = "jdbc:mysql://localhost:3306/training";
        String user = "nms-training";
        String password = "";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery("SELECT * FROM CarInfo");
            while (rs.next()) {
                Integer id = rs.getInt("Id");
                String name = rs.getString("Name");
                String manufacturer = rs.getString("Manufacturer");
                Integer year = rs.getInt("YearOfProduction");
                String status = rs.getString("Status");
                carList.add(new CarInfo(id, name, manufacturer, year, status));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return carList;
    }

    private static Map<String, List<String>> addIntoMap(List<CarInfo> cars) {
        Map<String, List<String>> data = new HashMap<>();
        for (CarInfo car : cars) {
            data.putIfAbsent(car.getManufacturer(), new ArrayList<>());
            data.get(car.getManufacturer()).add(car.getName());
        }
        return data;
    }

    private static void fileWrite(Map<String, List<String>> value) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/car.txt"))) {
            int count = 0;
            for (Map.Entry<String, List<String>> entry : value.entrySet()) {
                bw.write(entry.getKey());
                bw.newLine();
                for (String carName : entry.getValue()) {
                    bw.write("   " + carName);
                    bw.newLine();
                    count++;
                }
                bw.newLine();
            }
            System.out.println("Total Cars : " + count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}