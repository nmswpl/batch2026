package in.co.nmsworks.training.week4.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FileDBWriter {
    public List<String[]> read(String path) {

        List<String[]> fileData = new ArrayList<>();
        try (BufferedReader readerObj = new BufferedReader(new FileReader(path))) {
            String data;

            int i = 0;
            data = readerObj.readLine();
            while ((data = readerObj.readLine()) != null) {
                data = data.replaceAll("\"\"", "");
                String dataArr[] = data.split(",");
                fileData.add(dataArr);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return fileData;
    }

    public void writeToCountData(List<String[]> fileData) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO CountData VALUES (?,?,?,?,?,?)");) {
            for (String[] fileDatum : fileData) {
                if ("\"COUNT\"".equals(fileDatum[6])) {
                    preparedStatement.setInt(1, Integer.valueOf(fileDatum[0]));
                    preparedStatement.setString(2, fileDatum[1]);
                    preparedStatement.setString(3, fileDatum[2]);
                    preparedStatement.setString(4, fileDatum[3]);
                    preparedStatement.setString(5, fileDatum[4]);
                    preparedStatement.setString(6, fileDatum[5]);
                    preparedStatement.executeUpdate();
                }
                else{

                    System.out.println("Invalid");
                    System.out.print(fileDatum[0] + " " + fileDatum[1] + " " + fileDatum[2] + " " + fileDatum[3] + " " + fileDatum[4] + " " + fileDatum[5] + " " + fileDatum[6] + "\n");

                }




            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void writeToAmountData(List<String[]> fileData) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO AmountData VALUES (?,?,?,?,?,?)");) {
            for (String[] fileDatum : fileData) {
                if ("\"DOLLARS(millions)\"".equals(fileDatum[6])) {
                    preparedStatement.setInt(1, Integer.valueOf(fileDatum[0]));
                    preparedStatement.setString(2, fileDatum[1]);
                    preparedStatement.setString(3, fileDatum[2]);
                    preparedStatement.setString(4, fileDatum[3]);
                    preparedStatement.setString(5, fileDatum[4]);
                    preparedStatement.setString(6, fileDatum[5]);
                    preparedStatement.executeUpdate();
                }


                System.out.print(fileDatum[0] + " " + fileDatum[1] + " " + fileDatum[2] + " " + fileDatum[3] + " " + fileDatum[4] + " " + fileDatum[5] + " " + fileDatum[6] + "\n");


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
