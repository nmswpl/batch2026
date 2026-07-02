package in.co.nmsworks.training.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class CarProcessor {
    public static void main(String[] args) {
        CarProcessor processor = new CarProcessor();
        CarRunner runner = new CarRunner();
        List<CarInfo> list = new ArrayList<>();
        list = runner.readCarInfo();
        System.out.println(list);
        processor.write(list);
    }

    private void write(List<CarInfo> cars) {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
            PreparedStatement statement = con.prepareStatement("insert into cars values(?, ?, ?, ?)");
            BufferedWriter writer = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/Car   Status.txt"))){
            for (CarInfo car : cars) {
                if(car.getStatus() == Status.Active){
                    statement.setInt(1,car.getYear());
                    statement.setString(2,car.getManufacturer());
                    statement.setString(3,car.getName());
                    statement.setInt(4,car.getId());
                    statement.executeUpdate();
                }
                else{
                    writer.write(car.getId() + car.getYear() + car.getManufacturer() + car.getName() + "\n");
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
