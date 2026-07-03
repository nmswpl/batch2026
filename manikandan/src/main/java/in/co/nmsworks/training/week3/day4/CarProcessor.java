package in.co.nmsworks.training.week3.day4;

import java.util.List;
import java.util.*;
import java.sql.*;
import java.io.*;

public class CarProcessor extends CarInfo {

    public static void main(String[] args) {
        CarProcessor cr = new CarProcessor();
        List<CarInfo> details = new ArrayList<>();
        cr.convertDbToList(details);
        cr.write(details);
    }

    public void convertDbToList(List<CarInfo> details) {
        String url = "jdbc:mysql://localhost:3306/training";
        String user = "nms-training";
        String pwd = "";
        String query = "SELECT Id, Name, Manufacturer, YearOfProduction, Status from CarInfo";

        try (Connection con = DriverManager.getConnection(url, user, pwd);
             PreparedStatement smt = con.prepareStatement(query);
             ResultSet rs = smt.executeQuery()) {

            while (rs.next()) {
                CarInfo car = new CarInfo();
                car.setId(rs.getInt("Id"));
                car.setName(rs.getString("Name"));
                car.setManufacturer(rs.getString("Manufacturer"));
                car.setYear(rs.getInt("YearOfProduction"));
                car.setStatus(rs.getString("Status"));
                details.add(car);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void write(List<CarInfo> cars) {
        String dbUrl = "jdbc:mysql://localhost:3306/training";
        String fileOutput = "/home/nms-training/Desktop/CarInfo1.txt";

        try (Connection connection = DriverManager.getConnection(dbUrl, "nms-training", "");
             PreparedStatement ps = connection.prepareStatement("Insert into carData values (?, ?, ?, ?)");
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileOutput))) {

            for (CarInfo car : cars) {
                // Safeguard against potential null statuses in the database
                if (car.getStatus() == null) continue;

                if (car.getStatus().equalsIgnoreCase("Active")) {
                    ps.setInt(1, car.getId());
                    ps.setString(2, car.getName());
                    ps.setString(3, car.getManufacturer());
                    ps.setInt(4, car.getYear()); // Fixed: matches field 'year' via getYear()
                    ps.executeUpdate();
                }
                else if (car.getStatus().equalsIgnoreCase("Discontinued")) {
                    writer.write("Car Name : " + car.getName() +
                            "\nManufacturer : " + car.getManufacturer() +
                            "\nYear of Production : " + car.getYear() + "\n");
                    writer.write("------------------------------------------------------------------------------------------------------------------\n");
                }
            }
            writer.flush();
            System.out.println("Processing completed successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}