package in.co.nmsworks.training.week3.day4;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarProcessor {
    public static void main(String[] args) {
        CarProcessor carProcessor = new CarProcessor();
        List<CarInfo> cars = new ArrayList<>();
        carProcessor.write(cars);
    }

    private void write(List<CarInfo> cars) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
            PreparedStatement ps = con.prepareStatement("SELECT Id, Name, Manufacturer, Status FROM CarInfo");
             BufferedWriter bw = new BufferedWriter(new FileWriter("/home/nms-training/Downloads/carstatus.txt"));
             ResultSet rs= ps.executeQuery())
        {

            while (rs.next()) {
                int id = rs.getInt("Id");
                String name = rs.getString("Name");
                String manufacturer = rs.getString("Manufacturer");
                String status = rs.getString("Status");

                if ("Discontinued".equalsIgnoreCase(status)) {
                    bw.write("Car id " + id + "\n" + "Car Name : " + name + "\n" + "Manufacturer : " + manufacturer + "\n" + "Car status: " + status + "\n ");
                    bw.write("\n");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
