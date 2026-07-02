package in.co.nmsworks.training.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CarProcessor {

   void write(List<CarInfo> list) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
            ) {
       BufferedWriter bw = null;
       try {
           bw = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/CarInfo.txt", true));

           for (CarInfo car : list) {
                if(car.getStatus().equals("Active")){
                    PreparedStatement ps = con.prepareStatement("INSERT INTO CarStatus values(?,?,?,?,?)");
                    ps.setInt(1,car.getId());
                    ps.setString(2, car.getName());
                    ps.setString(3, car.getManufacturer());
                    ps.setInt(4,car.getYearOfProduction());
                    ps.setString(5, car.getStatus());
                    ps.executeUpdate();
                }

               else if (car.getStatus().equals("Discontinued")) {
                   bw.write(car.toString());
                   bw.newLine();

               }
           }
           bw.close();
       } catch (Exception e) {
           e.printStackTrace();
       }
   } catch (SQLException e) {
            throw new RuntimeException(e);
        }
   }
}




