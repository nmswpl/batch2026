package in.co.nmsworks.training.week4.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CsvParser {

    public static void main(String[] args) throws SQLException {
        List<Data> data = getData();
        classifyByUnit(data);
    }

    private static List<Data> getData() {

        List<Data> dataList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(
                new FileReader("/home/nms-training/Downloads/annual-enterprise-survey-2025-financial-year-provisional-size-bands.csv"))) {

            String line;

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                if (data.length < 7) {
                    continue;
                }

                for (int i = 0; i < data.length; i++) {
                    data[i] = data[i].replace("\"", "").trim();
                }

                int year = Integer.parseInt(data[0]);
                String industryCode = data[1];
                String industryName = data[2];
                String rmeSizeGrp = data[3];
                String variable = data[4];
                String value = data[5];
                String unit = data[6];

                dataList.add(new Data(year, industryCode, industryName, rmeSizeGrp, variable, value, unit));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataList;
    }

    private static void classifyByUnit(List<Data> dataList) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/TRAINING";
        String username = "nms-training";
        String password = "";

        String countQuery =
                "INSERT INTO COUNT_TABLE VALUES (?, ?, ?, ?, ?, ?)";

        String millionQuery =
                "INSERT INTO MILLION_TABLE VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement countStmt = conn.prepareStatement(countQuery);
             PreparedStatement millionStmt = conn.prepareStatement(millionQuery)) {

            for (Data datum : dataList) {

                String unit = datum.getUnit().trim();

                System.out.println("Inserting data : " + datum);

                if ("COUNT".equalsIgnoreCase(unit)) {

                    countStmt.setInt(1, datum.getYear());
                    countStmt.setString(2, datum.getIndustry_code_ANZSIC());
                    countStmt.setString(3, datum.getIndustry_name_ANZSIC());
                    countStmt.setString(4, datum.getRme_size_grp());
                    countStmt.setString(5, datum.getVariable());
                    countStmt.setString(6, datum.getValue());

                    countStmt.executeUpdate();

                } else {

                    millionStmt.setInt(1, datum.getYear());
                    millionStmt.setString(2, datum.getIndustry_code_ANZSIC());
                    millionStmt.setString(3, datum.getIndustry_name_ANZSIC());
                    millionStmt.setString(4, datum.getRme_size_grp());
                    millionStmt.setString(5, datum.getVariable());
                    millionStmt.setString(6, datum.getValue());

                    millionStmt.executeUpdate();
                }
            }

            System.out.println("Data inserted successfully.");
        }
    }
}