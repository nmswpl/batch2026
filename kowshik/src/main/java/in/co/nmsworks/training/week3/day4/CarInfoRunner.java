package in.co.nmsworks.training.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarInfoRunner {
    public static void main(String[] args) {

        CarInfoRunner carInfoRunner = new CarInfoRunner();
        Map<String, List<CarInfo>> manufacturerToCarInfoMap = carInfoRunner.readDataFromFile();

        //System.out.println(manufacturerToCarInfoMap);

        carInfoRunner.writeDataToFile(manufacturerToCarInfoMap);
    }

    private void writeDataToFile(Map<String, List<CarInfo>> manufacturerToCarInfoMap) {
        try (FileWriter fileWriter = new FileWriter("/home/nms-training/Desktop/CarInfoOutput.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);) {

            for (Map.Entry<String, List<CarInfo>> entry : manufacturerToCarInfoMap.entrySet()) {
                bufferedWriter.write(entry.getKey() + " : " + "\n");
                for (CarInfo carInfo : entry.getValue()) {
                    bufferedWriter.write(carInfo.getName() + " , ");
                }
                bufferedWriter.write("\n\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Map<String, List<CarInfo>> readDataFromFile() {
        String url = "jdbc:mysql://localhost:3306/training";

        Map<String, List<CarInfo>> manufacturerToCarInfoMap = new HashMap<>();

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
//                System.out.println("OBJ : " + carInfo);

                manufacturerToCarInfoMap.computeIfAbsent(manufacturer, v -> new ArrayList<>()).add(carInfo);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return manufacturerToCarInfoMap;
    }
}
