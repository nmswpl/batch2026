package in.co.nmsworks.training.week4.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Jdbc {

    public static void main(String[] args) {
        Jdbc jdbc = new Jdbc();

        Map<String, List<List<String>>> map = jdbc.getFile();
        jdbc.writeDb(map);
    }

    private Map<String, List<List<String>>> getFile() {

        Map<String, List<List<String>>> map = new HashMap<>();

        map.put("COUNT", new ArrayList<>());
        map.put("DOLLARS(millions)", new ArrayList<>());

        try (BufferedReader br = new BufferedReader(
                new FileReader("/home/nms-training/Downloads/annual-enterprise-survey-2025-financial-year-provisional-size-bands.csv"))) {

            String line;

            while ((line = br.readLine()) != null) {

                line = line.replace("\"", "");
                String[] data = line.split(",");

                if (data.length < 6) continue;

                String type = data[5];

                List<String> row = new ArrayList<>();


                for (int i = 0; i < 5; i++) {
                    row.add(data[i]);
                }

                if (map.containsKey(type)) {
                    map.get(type).add(row);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return map;
    }


    private void writeDb(Map<String, List<List<String>>> map) {

        String amountSql =
                "INSERT INTO amount_data(year, industry_code_ANZSIC, industry_name_ANZSIC, size_band, variable, value) VALUES (?,?,?,?,?,?)";

        String countSql =
                "INSERT INTO count_data(year, industry_code_ANZSIC, industry_name_ANZSIC, size_band, variable, value) VALUES (?,?,?,?,?,?)";

        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/training",
                "nms-training",
                "");
             PreparedStatement amountPs = con.prepareStatement(amountSql);
             PreparedStatement countPs = con.prepareStatement(countSql)) {

            for (List<String> row : map.get("COUNT")) {

                countPs.setInt(1, Integer.parseInt(row.get(0)));
                countPs.setString(2, row.get(1));
                countPs.setString(3, row.get(2));
                countPs.setString(4, row.get(3));
                countPs.setString(5, row.get(4));
                countPs.setDouble(6, 0);

                countPs.executeUpdate();
            }
            for (List<String> row : map.get("DOLLARS(millions)")) {

                amountPs.setInt(1, Integer.parseInt(row.get(0)));
                amountPs.setString(2, row.get(1));
                amountPs.setString(3, row.get(2));
                amountPs.setString(4, row.get(3));
                amountPs.setString(5, row.get(4));
                amountPs.setDouble(6, Double.parseDouble(row.get(4)));

                amountPs.executeUpdate();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}