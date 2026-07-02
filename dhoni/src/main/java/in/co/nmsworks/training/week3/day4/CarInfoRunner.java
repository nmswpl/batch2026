package in.co.nmsworks.training.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarInfoRunner {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/cars";
        String user = "nms-training";
        String password ="";

        CarInfoRunner runner = new CarInfoRunner();
        List<CarInfo> carList = runner.getCarList(url,user,password);

        Map<String,List<CarInfo>> manufactureWiseCars = runner.getMapOfCars(carList);

//        for(Map.Entry<String,List<CarInfo>> car : manufactureWiseCars.entrySet()){
//            System.out.println( car.getKey() + " " + car.getValue());
//        }

        runner.writeToFile(manufactureWiseCars);
    }

    private void writeToFile(Map<String, List<CarInfo>> manufactureWiseCars) {

        try(
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/files/ManufacturerAndCars.txt"));

                ){

            for(Map.Entry<String,List<CarInfo>> car : manufactureWiseCars.entrySet()){
                bufferedWriter.write("\n");
                bufferedWriter.write("Manufacture name : " + car.getKey() + "\n");

                List<String> carNames = carNames(car.getValue());
                bufferedWriter.write("Car names : " + "\n");

                for(String name : carNames){
                    bufferedWriter.write(name +"\n");
                }

                bufferedWriter.write("\n");
            }

            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<String> carNames(List<CarInfo> cars){
        List<String> carNamesList = new ArrayList<>();

        for(CarInfo car : cars){
            carNamesList.add(car.getName());
        }
        return carNamesList;
    }

    private Map<String, List<CarInfo>> getMapOfCars(List<CarInfo> carList) {
        Map<String, List<CarInfo>> map = new HashMap<>();

        for(CarInfo car : carList){
            map.putIfAbsent(car.getManufacture(),new ArrayList<>());
            map.get(car.getManufacture()).add(car);
        }

        return map;
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
