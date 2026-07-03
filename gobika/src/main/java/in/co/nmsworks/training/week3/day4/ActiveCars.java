package in.co.nmsworks.training.week3.day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ActiveCars implements CarProcessor{
    @Override
    public  void write(List<CarInfo> cars) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
             PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO ActiveCars values (?, ?, ?, ?)")){
            for (CarInfo car : cars) {
                if (car.getStatus().equals("Active")){
                    preparedStatement.setInt(1,car.getId());
                    preparedStatement.setString(2,car.getName());
                    preparedStatement.setString(3,car.getManufacturer());
                    preparedStatement.setInt(4,car.getYearOfProduction());
                    preparedStatement.executeUpdate();
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
