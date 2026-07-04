package in.co.nmsworks.training.week3.day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

public class CarDBWriter implements CarProcessor{

    public void write(List<CarInfo> carsList){
        String url = "jdbc:mysql://localhost:3306/training";
        String username = "nms-training";
        String password = "";

        try(Connection con = DriverManager.getConnection(url, username,password);
            PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO activeCarInfo VALUES (?,?,?,?)");) {

            for (CarInfo carInfo : carsList) {
                preparedStatement.setInt(1,carInfo.getId());
                preparedStatement.setString(2,carInfo.getName());
                preparedStatement.setString(3,carInfo.getManufacturer());
                preparedStatement.setInt(4,Integer.valueOf(carInfo.getYearOfProduction()));
                preparedStatement.executeUpdate();
            }

        }catch(Exception e){

        }
    }
}
