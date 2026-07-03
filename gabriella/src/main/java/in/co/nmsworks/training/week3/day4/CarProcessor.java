package in.co.nmsworks.training.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.List;

public class CarProcessor {
    public static void main(String[] args) {
        CarProcessor carProcessor = new CarProcessor();
        CarInfoRunner carInfoRunner = new CarInfoRunner();
        List<CarInfo> carInfoList = carInfoRunner.dbToObject();
        carProcessor.write(carInfoList);
    }

    private void write(List<CarInfo> carInfoList) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/dicontinuedCars.txt"));
             PreparedStatement preparedStatement = conn.prepareStatement("insert into ActiveCars values(?, ?, ?, ?, ?)")){
            for (CarInfo carInfo : carInfoList) {
                if (carInfo.getStatus().equals("Active")) {
                    preparedStatement.setInt(1, carInfo.getId());
                    preparedStatement.setString(2, carInfo.getName());
                    preparedStatement.setString(3, carInfo.getManufacturer());
                    preparedStatement.setInt(4, carInfo.getYear());
                    preparedStatement.setString(5, carInfo.getStatus());
                    preparedStatement.executeUpdate();
                } else {
                    bufferedWriter.write(carInfo.getId() + ", " + carInfo.getName() + ", " + carInfo.getManufacturer() + ", " + carInfo.getYear() + ", " + carInfo.getStatus() + "\n");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
