package in.co.nmsworks.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class CarInfo {

    public Map<String, List<String>> readFromDb() {
        Map<String, List<String>> carMap = new HashMap<>();

        try {
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "nms-training", "");
                 PreparedStatement statement = con.prepareStatement("select Manufacturer,Name from CarInfo")) {

                ResultSet rs = statement.executeQuery();

                while (rs.next()) {
                    List<String> list = carMap.getOrDefault(rs.getString(1), new ArrayList<>());
                    list.add(rs.getString(2));
                    carMap.put(rs.getString(1), list);

                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return carMap;
    }


    public void writeToFile(Map<String, List<String>> carMap) {

        try {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/CarInfoOutput.txt"))) {

                for (Map.Entry<String, List<String>> stringListEntry : carMap.entrySet()) {
                    writer.write("--MANUFACTURER-- :" + stringListEntry.getKey() + "\n" + "---LIST OF CARS--- :" + stringListEntry.getValue() + "\n");
                    writer.write("\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

