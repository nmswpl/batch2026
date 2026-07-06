package in.co.nmsworks.training.week4.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AnnualEnterprise {
    public static void main(String[] args) {
        AnnualEnterprise annualEnterprise = new AnnualEnterprise();
        annualEnterprise.run();
    }

    private void run() {
        readFromFileAndWriteToDB("/home/nms-training/Downloads/annual-enterprise-survey-2025-financial-year-provisional-size-bands.csv");
    }

    private void readFromFileAndWriteToDB(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
             PreparedStatement ps1 = connection.prepareStatement("Insert into count_data values (?, ?, ?, ?, ?, ?)");
             PreparedStatement ps2 = connection.prepareStatement("Insert into amount_data values (?, ?, ?, ?, ?, ?)")){
            String content;
            reader.readLine();
            while ((content = reader.readLine()) != null) {
                String[] splitContent = content.split(",");
                if ("COUNT".equals(splitContent[6].substring(1,splitContent[6].length()-1))){
                    ps1.setInt(1,Integer.parseInt(splitContent[0]));
                    ps1.setString(2,splitContent[1]);
                    ps1.setString(3,splitContent[2]);
                    ps1.setString(4,splitContent[3]);
                    ps1.setString(5,splitContent[4]);
                    ps1.setString(6,splitContent[5]);
                    ps1.executeUpdate();
                }
                else {
                    ps2.setInt(1,Integer.parseInt(splitContent[0]));
                    ps2.setString(2,splitContent[1].substring(1,splitContent[1].length()-1));
                    ps2.setString(3,splitContent[2].substring(1,splitContent[2].length()-1));
                    ps2.setString(4,splitContent[3].substring(1,splitContent[3].length()-1));
                    ps2.setString(5,splitContent[4].substring(1,splitContent[4].length()-1));
                    ps2.setString(6,splitContent[5]);
                    ps2.executeUpdate();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
