package in.co.nmsworks.training.week4.day1;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SplitData {
    public static void main(String[] args) {
        SplitData splitData = new SplitData();
        List<String> data = splitData.readFromDB();
//        for (String datum : data) {
//            System.out.println(datum);
//        }
        // System.out.println(data.size());

        splitData.writeToDB(data);

//        int code = Integer.parseInt(splitString[0]);
//        String industry_code = splitString[1];
//        String industry_name = splitString[2];
//        String rme_size = splitString[3];
//        String variable = splitString[4];
//        int value = Integer.parseInt(splitString[5]);
    }

    private void writeToDB(List<String> data) {
        for (String datum : data) {
            String[] splitData = datum.split(",");
            //System.out.println(Arrays.toString(splitData));
            int year = Integer.parseInt(splitData[0]);
            String industry_code = splitData[1].replace("\"", "");
            String industry_name = splitData[2].replace("\"", "");
            String rme_size = splitData[3].replace("\"", "");
            String variable = splitData[4].replace("\"", "");
            String value = splitData[5];
            String unit = splitData[6];
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
                 PreparedStatement preparedStatement1 = con.prepareStatement("insert into count_unit values(?,?,?,?,?,?)");
                 PreparedStatement preparedStatement2 = con.prepareStatement("insert into amount_unit values(?,?,?,?,?,?)")){
                if (Objects.equals(unit, "\"DOLLARS(millions)\"")){
                    preparedStatement2.setInt(1, year);
                    preparedStatement2.setString(2, industry_code);
                    preparedStatement2.setString(3, industry_name);
                    preparedStatement2.setString(4, rme_size);
                    preparedStatement2.setString(5, variable);
                    preparedStatement2.setString(6, value);
                    preparedStatement2.executeUpdate();
                } else {
                    preparedStatement1.setInt(1, year);
                    preparedStatement1.setString(2, industry_code);
                    preparedStatement1.setString(3, industry_name);
                    preparedStatement1.setString(4, rme_size);
                    preparedStatement1.setString(5, variable);
                    preparedStatement1.setString(6, value);
                    preparedStatement1.executeUpdate();
                }



            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    private List<String> readFromDB() {
        List<String> data = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/annual-enterprise-survey-2025-financial-year-provisional-size-bands.csv"));
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             Statement statement = con.createStatement()){
            String line = "";
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null){
                data.add(line);



            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}
