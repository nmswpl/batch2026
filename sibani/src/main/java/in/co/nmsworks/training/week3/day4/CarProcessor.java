package in.co.nmsworks.training.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarProcessor {
    public static void main(String[] args) {
        CarProcessor carProcessor = new CarProcessor();
        CarInfoRunner carInfoRunner = new CarInfoRunner();
        List<CarInfo> carDetails = carInfoRunner.readFromDB();
        carProcessor.write(carDetails);
    }

    private void write(List<CarInfo> carDetails) {
        List<CarInfo> activeCars = new ArrayList<>();
        List<CarInfo> disContinuedCars = new ArrayList<>();

        for (CarInfo carDetail : carDetails) {
            CarInfo.Status status = carDetail.getStatus();
            if (CarInfo.Status.Active.equals(status) ){
                activeCars.add(carDetail);
            }
            else  {
               disContinuedCars.add(carDetail);
            }
        }
       System.out.println(activeCars);
       System.out.println(disContinuedCars);
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", ""))
        {
            for (int i = 0; i < activeCars.size(); i++) {
                PreparedStatement ps = con.prepareStatement("insert into ActiveCars values(?, ?,?, ?, ?)");
                ps.setInt(1,activeCars.get(i).getId());
                ps.setString(2,activeCars.get(i).getName());
                ps.setString(3,activeCars.get(i).getManufacturer());
                ps.setInt(4,activeCars.get(i).getYearOfProduction());
                ps.setString(5, activeCars.get(i).getStatus().name());
                ps.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/DiscontinuedCarInfos.txt"))){
            for (CarInfo disContinuedCar : disContinuedCars) {
                bufferedWriter.write(disContinuedCar.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();;
        }
    }
}
