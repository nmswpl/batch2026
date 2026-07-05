package in.co.nmsworks.training.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarProfessor {
    public static void main(String[] args) {
        CarProfessor carProfessor = new CarProfessor();
        List<Car> cars = new ArrayList<>();
        carProfessor.write(cars);
    }

    private void write(List<Car> cars) {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
            PreparedStatement pstm = con.prepareStatement("select Id, Name, Manufacturer,Status from CarInfo");
            BufferedWriter writer = new BufferedWriter(new FileWriter("/home/nms-training/Downloads/carInfoStatus.txt"))){
                ResultSet rs = pstm.executeQuery();
                while (rs.next()){
                    int id = rs.getInt("Id");
                    String name = rs.getString("Name");
                    String manufacturer = rs.getString("Manufacturer");
                    String status = rs.getString("Status");

                    if("Discontinued".equals(status)){
                        writer.write("Car ID : "+ id + "Car Name : "+ name +"Manufacturer : "+ manufacturer);
                        writer.newLine();
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
