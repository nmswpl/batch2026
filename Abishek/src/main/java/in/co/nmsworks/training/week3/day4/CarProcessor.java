package in.co.nmsworks.training.week3.day4;

import java.util.*;
import java.util.Map;
import java.sql.*;
import java.io.*;

public class CarProcessor extends CarDetails{

        public static void main(String[] args)
        {
            CarProcessor cr = new CarProcessor();
            List<CarInfo> details = new ArrayList<>();
            convertDbToList(details);
            List<CarInfo> carInfoList = details;
            cr.write(carInfoList);
        }
        public void write(List<CarInfo> cars) {
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/candidates","nms-training","");
                 PreparedStatement ps = connection.prepareStatement("Insert into carData values (?, ?, ?, ?)");
                 BufferedWriter writer = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/DiscontinuedCarInfo.txt"))) {
                for (CarInfo car : cars) {
                    if (car.getStatus().equals(Status.Active)) {
                        ps.setInt(1,car.getId());
                        ps.setString(2,car.getName());
                        ps.setString(3,car.getManufacturer());
                        ps.setInt(4,car.getYearOfProduction());
                        ps.executeUpdate();
                    }
                    else if (car.getStatus().equals(Status.Discontinued)) {
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
