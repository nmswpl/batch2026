package in.co.nmsworks.training.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

public class CarProccessor {

    public void write(List<CarInfo> carList) {
        BufferedWriter bufferedWriter=null;
        System.out.println(carList);
        try (Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO ActiveCarInfo values(?,?,?,?,?)")){
            bufferedWriter=new BufferedWriter(new FileWriter("/home/nms-training/Desktop/DiscontinuedCars.txt"));
            for (CarInfo carInfo : carList) {
                System.out.println(carInfo);
                if(carInfo.getStatus().equals(Status.ACTIVE)) {
                    preparedStatement.setInt(1,carInfo.getId());
                    preparedStatement.setString(2,carInfo.getName());
                    preparedStatement.setString(3,carInfo.getManufacturer());
                    preparedStatement.setInt(4,carInfo.getYearOfProduction());
                    preparedStatement.setString(5, String.valueOf(Status.ACTIVE));

                    preparedStatement.executeUpdate();
                }
                else {
                    bufferedWriter.write(String.valueOf(carInfo)+"\n");
                    bufferedWriter.flush();
                }
            }

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
