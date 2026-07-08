package in.co.nmsworks.training.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarRunner {
    public static void main(String[] args) {
        CarRunner runner = new CarRunner();
        List<CarInfo> carsList = runner.readCarInfo();
        Map<String, List<CarInfo>> mapCar = runner.createMap(carsList);
        runner.writeInFile(mapCar);

    }

    private void writeInFile(Map<String, List<CarInfo>> mapCar) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/Cars.txt"))){
            for (String s : mapCar.keySet()) {
                writer.write(s + " ::  :: " + mapCar.get(s) + " \n");
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private Map<String, List<CarInfo>> createMap(List<CarInfo> carsList) {
        Map<String, List<CarInfo>> map = new HashMap<>();
        for (CarInfo carInfo : carsList) {
            List<CarInfo> carManufacturer = map.getOrDefault(carInfo.getManufacturer(),new ArrayList<>());
            map.putIfAbsent(carInfo.getManufacturer(),carManufacturer);
            carManufacturer.add(carInfo);
        }
        System.out.println(map);
        return map;
    }

    public List<CarInfo> readCarInfo() {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
            PreparedStatement statement = con.prepareStatement("select * from CarInfo"))
        {
            ResultSet resultSet = statement.executeQuery();
            List<CarInfo> carInfoList = new ArrayList<>();
            while(resultSet.next()){
                CarInfo car = new CarInfo();
                car.setId(resultSet.getInt("id"));
                car.setName(resultSet.getString(2));
                car.setManufacturer(resultSet.getString(3));
                car.setYear(resultSet.getInt(4));
                car.setStatus(Status.valueOf(resultSet.getString(5)));
                carInfoList.add(car);
            }
            return carInfoList;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
