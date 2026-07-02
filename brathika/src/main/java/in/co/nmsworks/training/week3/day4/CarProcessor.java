package in.co.nmsworks.training.week3.day4;
import in.co.nmsworks.training.week2.day3.Car;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarProcessor{
    public static void main(String[] args) {
        CarProcessor carProcessor = new CarProcessor();
        List<CarInfo> carList = carProcessor.readFromFile();
        carProcessor.write(carList);
    }

    private List<CarInfo> readFromFile() {
        List<CarInfo> carList = new ArrayList<>();
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
            Statement statement = con.createStatement()) {
            ResultSet resultset = statement.executeQuery("select * from CarInfo");
            while (resultset.next()) {
                int id = resultset.getInt(1);
                String name = resultset.getString(2);
                String dept = resultset.getString(3);
                int year = resultset.getInt(4);
                String status = resultset.getString(5);
                CarInfo car = new CarInfo(id,name,dept,year,status);
                carList.add(car);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return carList;
    }

    public void write(List<CarInfo> cars) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/CarFiles.txt"));
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
            PreparedStatement statement = con.prepareStatement("insert into Car values(?,?,?,?,?)")) {
            writer.write("Id Name Manufacturer yearofproduction status");
            for (CarInfo car : cars) {
                if (car.getStatus().equals("Active")) {
                    statement.setInt(1,car.getId());
                    statement.setString(2,car.getName());
                    statement.setString(3, car.getManufacturer());
                    statement.setInt(4,car.getYearOfProduction());
                    statement.setString(5,car.getStatus());
                    statement.executeUpdate();
                }
                else {
                    writer.write(car.getId()+" "+car.getName()+" "+car.getManufacturer()+" "+car.getYearOfProduction()+" "+car.getStatus()+"\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
