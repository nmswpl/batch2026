package in.co.nmsworks.training.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarProcessor {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/cars";
        String user = "nms-training";
        String password ="";

        CarProcessor runner = new CarProcessor();
        List<CarInfo> carList = runner.getCarList(url,user,password);
        Map<String,List<CarInfo>> carStatusMap = runner.getStatusMap(carList);

        List<CarInfo>  activeCars = carStatusMap.get("Active");
        //runner.writeIntoDataBase(url,user,password,activeCars);

        List<CarInfo>  discontinuedCars = carStatusMap.get("Discontinued");
        runner.writeToFile(discontinuedCars);

    }

    private void writeToFile(List<CarInfo> discontinuedCars) {

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/files/DiscontinuedCars.txt"));)
        {
            for (CarInfo car : discontinuedCars){
                bufferedWriter.write("id : " + car.getId() + " name : " + car.getName() +
                        " manufacturer : " + car.getManufacture() +
                        " yearOfProduction : " + car.getYearOfProduction() +
                        " Status : " + car.getStatus()
                );
                bufferedWriter.write("\n");
            }
            bufferedWriter.flush();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    private void writeIntoDataBase(String url, String user, String password, List<CarInfo> active) {

        try(    Connection connection = DriverManager.getConnection(url,user,password);)
        {
            String insert = "insert into CarProcessor value(?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insert);

            int totalRows = 0;

            for(CarInfo car : active){
                preparedStatement.setInt(1,car.getId());
                preparedStatement.setString(2,car.getName());
                preparedStatement.setString(3, car.getManufacture());
                preparedStatement.setInt(4,car.getYearOfProduction());
                preparedStatement.setString(5,car.getStatus());

                int row = preparedStatement.executeUpdate();
                totalRows = totalRows + row;
            }

            System.out.println("Total rows : " + totalRows);
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Map<String, List<CarInfo>> getStatusMap(List<CarInfo> carList) {
        Map<String,List<CarInfo>> carStatusMap = new HashMap<>();

        for(CarInfo car : carList){
            carStatusMap.putIfAbsent(car.getStatus(),new ArrayList<>());
            carStatusMap.get(car.getStatus()).add(car);
        }

        return carStatusMap;
    }


    private List<CarInfo> getCarList(String url, String user, String password) {
        List<CarInfo> carList = new ArrayList<>();

        try(
                Connection connection = DriverManager.getConnection(url,user,password);
                Statement statement = connection.createStatement();
        )
        {
            String select = "select * from CarInfo";
            ResultSet resultSet = statement.executeQuery(select);

            while (resultSet.next()){

                carList.add(new CarInfo(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getInt(4),
                        resultSet.getString(5))
                );

            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return carList;
    }
}
