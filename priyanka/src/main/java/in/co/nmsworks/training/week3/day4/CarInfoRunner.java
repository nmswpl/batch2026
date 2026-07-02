package in.co.nmsworks.training.week3.day4;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarInfoRunner implements CarProcessor{
    public static void main(String[] args) {
        CarInfoRunner carInfoRunner = new CarInfoRunner();
        List<CarInfo> carInfoList = carInfoRunner.covertToList();
        Map<String,List<CarInfo>> map = carInfoRunner.createMap(carInfoList);
        carInfoRunner.writeToFile(map);
        carInfoRunner.write(carInfoList);

    }

    private void writeToFile(Map<String, List<CarInfo>> map) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/ManufacturerWiseCars"))){
            for (String s : map.keySet()) {
                writer.write(s +":\n" + map.get(s));
                writer.newLine();
                writer.newLine();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private Map<String,List<CarInfo>> createMap(List<CarInfo> carInfoList) {
        Map<String,List<CarInfo>> map = new HashMap<>();
        for (CarInfo carInfo : carInfoList) {
            String manufacturer = carInfo.getManufacturer();
            List<CarInfo> list = map.get(manufacturer);
            if(list == null){
                list = new ArrayList<>();
                map.put(manufacturer,list);
            }
            list.add(carInfo);
        }
        for (String s : map.keySet()) {
            System.out.println(s+"--->" + map.get(s));
        }
        return map;
    }

    private List<CarInfo> covertToList() {
        List<CarInfo> carInfoList = new ArrayList<>();
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
            PreparedStatement preparedStatement = con.prepareStatement("select * from CarInfo")){
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String manufacturer = resultSet.getString(3);
                int year = resultSet.getInt(4);
                String status = resultSet.getString(5);

                CarInfo carInfo = new CarInfo(id, name, manufacturer, year, status);
                carInfoList.add(carInfo);
            }


        }
        catch (Exception e){
            e.printStackTrace();
        }
//        for (CarInfo carInfo : carInfoList) {
//            System.out.println(carInfo);
//        }
        return carInfoList;
    }


    @Override
    public void write(List<CarInfo> cars) {
        try(FileWriter writer = new FileWriter("/home/nms-training/Desktop/DiscontinuedCars.txt")){
            for (CarInfo car : cars) {
                if(car.getStatus().equalsIgnoreCase("Active")){
                    insertToTable(car);
                }
                else{
                    writer.write(car.toString());
                    writer.write("\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void insertToTable(CarInfo car) {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
            PreparedStatement preparedStatement = con.prepareStatement("insert into ActiveCars values(?,?,?,?,?)")){

            preparedStatement.setInt(1,car.getId());
            preparedStatement.setString(2,car.getName());
            preparedStatement.setString(3,car.getManufacturer());
            preparedStatement.setInt(4,car.getYearOfProduction());
            preparedStatement.setString(5,car.getStatus());

            preparedStatement.executeUpdate();

        }
        catch (Exception e ){
            e.printStackTrace();
        }
    }

}
