package in.co.nmsworks.training.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

public class CarProcessor extends CarInfoRunner{
    public static void main(String[] args) {
        CarProcessor cr = new CarProcessor();
        List<CarInfo> carInfoList = cr.readDataFromDB();
        cr.write(carInfoList);
    }
    public void write(List<CarInfo> cars) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
             PreparedStatement ps = connection.prepareStatement("Insert into cars values (?, ?, ?, ?)");
             BufferedWriter writer = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/DiscontinuedCarInfo.txt"))) {
            for (CarInfo car : cars) {
                if (car.getStatus().equals(Status.ACTIVE)) {
                    ps.setInt(1,car.getId());
                    ps.setString(2,car.getName());
                    ps.setString(3,car.getManufacturer());
                    ps.setInt(4,car.getYearOfProduction());
                    ps.executeUpdate();
                }
                else if (car.getStatus().equals(Status.DISCONTINUED)) {
                    writer.write("Car Name : "+car.getName()+"\nManufacturer : "+car.getManufacturer()+"\nYear of Production : "+car.getYearOfProduction()+"\n");
                    writer.write("------------------------------------------------------------------------------------------------------------------\n");
                }
            }
            writer.flush();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
