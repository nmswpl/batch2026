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
        carInfo.readCarInfo();
    }

    private void readCarInfo() {
        Map<String, List<String>> manufacturerCarMap = new HashMap<>();
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             Statement stm = con.createStatement()) {
            ResultSet resultSet = stm.executeQuery("select * from CarInfo");
            while (resultSet.next())
            {
                String manufacturer = resultSet.getString("manufacturer");
                String car = resultSet.getString("name");
                manufacturerCarMap.putIfAbsent(manufacturer, new ArrayList<>());
                manufacturerCarMap.get(manufacturer).add(car);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/ManufacturerCars.txt"))) {
            for (Map.Entry<String, List<String>> entry : manufacturerCarMap.entrySet()) {
                writer.write("Manufacturer:\n" + entry.getKey());
                writer.newLine();
                for (String car : entry.getValue()) {
                    writer.write(" "+car);
                    writer.newLine();
                }
                writer.newLine();
            }
            System.out.println("Car information written Successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
