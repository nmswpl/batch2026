package in.co.nmsworks.training.week4.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CountData {

    public static void main(String[] args) {
        new CountData().readValueFromDb();
    }

    private void readValueFromDb() {

        try (BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/annual-enterprise-survey-2025-financial-year-provisional-size-bands.csv"));
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             PreparedStatement psCount = conn.prepareStatement("INSERT INTO CountData VALUES (?,?,?,?,?,?)");
             PreparedStatement psAmount = conn.prepareStatement("INSERT INTO AmountData VALUES (?,?,?,?,?,?)"))
        {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                int year = Integer.parseInt(data[0].replace("\"", ""));
                String industryCode = data[1].replace("\"", "");
                String industryName = data[2].replace("\"", "");
                String rmeSizeGrp = data[3].replace("\"", "");
                String variable = data[4].replace("\"", "");
                String value = data[5].replace("\"", "");
                String unit = data[6].replace("\"", "");

                if (unit.equalsIgnoreCase("COUNT")) {

                    psCount.setInt(1, year);
                    psCount.setString(2, industryCode);
                    psCount.setString(3, industryName);
                    psCount.setString(4, rmeSizeGrp);
                    psCount.setString(5, variable);
                    psCount.setString(6, value);

                    psCount.executeUpdate();

                } else if (unit.equalsIgnoreCase("DOLLARS(millions)")) {

                    psAmount.setInt(1, year);
                    psAmount.setString(2, industryCode);
                    psAmount.setString(3, industryName);
                    psAmount.setString(4, rmeSizeGrp);
                    psAmount.setString(5, variable);
                    psAmount.setString(6, value);

                    psAmount.executeUpdate();
                }
            }

            System.out.println("Data inserted successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}