package in.co.nmsworks.training.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.*;
import java.util.*;

public class CarInfoRunner {
    public static void main(String[] args) {
        CarInfoRunner carInfoRunner = new CarInfoRunner();
        carInfoRunner.getFromDB();

    }

    private void getFromDB() {
        String sql = "select * from CarInfo";
        Map<String,List<String>> carDetails =  new HashMap<>();
        List<CarInfo> list = new ArrayList<>();
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training",""); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                list.add(new CarInfo(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4)));

            }
            for (CarInfo carInfo : list) {
                carDetails.putIfAbsent(carInfo.getManufacturer(),new ArrayList<>());
                carDetails.get(carInfo.getManufacturer()).add(carInfo.getName());

            }
            for (Map.Entry<String, List<String>> stringListEntry : carDetails.entrySet()) {
                System.out.println(stringListEntry.getKey()+stringListEntry.getValue());

            }
            writeTextFile(carDetails);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private void writeTextFile(Map<String, List<String>> carDetails) {
        try {
            FileWriter fp = new FileWriter("/home/nms-training/Desktop/CarInfo.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fp);
            for (Map.Entry<String, List<String>> stringListEntry : carDetails.entrySet()) {
                bufferedWriter.write(" manufacturar name : "+stringListEntry.getKey());
                bufferedWriter.newLine();
                bufferedWriter.write(" cars models : "+stringListEntry.getValue().toString());
                bufferedWriter.newLine();
            }
            System.out.println("File writed ......");
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
