package in.co.nmsworks.training.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarInfoRunner {
    public static void main(String[] args) {
        CarInfoRunner carInfoRunner = new CarInfoRunner();
        List<CarInfo> carInfoList = carInfoRunner.dbToObject();
        // System.out.println(carInfoList);
        // System.out.println(carInfoList.size());
        Map<String, List<CarInfo>> manufacturerToCars = carInfoRunner.getManufacturerCars(carInfoList);
        // System.out.println(manufacturerToCars);
        // System.out.println(manufacturerToCars.size());
        carInfoRunner.printToFile(manufacturerToCars);
    }

    private void printToFile(Map<String, List<CarInfo>> manufacturerToCars) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/manufacturerAndCars.txt"))) {
            for (String s : manufacturerToCars.keySet()) {
                bufferedWriter.write(s + ":" + "\n");
                for (CarInfo carInfo : manufacturerToCars.get(s)) {

                    bufferedWriter.write(carInfo.getName() + ", ");
                }
                bufferedWriter.write("\n" + "\n");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Map<String, List<CarInfo>> getManufacturerCars(List<CarInfo> carInfoList) {
        Map<String, List<CarInfo>> manufacturerToCars = new HashMap<>();
        for (CarInfo carInfo : carInfoList) {
            String manufacturer = carInfo.getManufacturer();
            List<CarInfo> carsWithManufacturer = manufacturerToCars.get(manufacturer);
            if (carsWithManufacturer == null){
                carsWithManufacturer = new ArrayList<>();
                manufacturerToCars.put(manufacturer, carsWithManufacturer);
            }
            carsWithManufacturer.add(carInfo);

        }

        return manufacturerToCars;
    }

    public List<CarInfo> dbToObject() {
        List<CarInfo> carInfoList = new ArrayList<>();
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             PreparedStatement preparedStatement = con.prepareStatement("select * from CarInfo")){
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){

                Integer carId = resultSet.getInt("Id");
                String name = resultSet.getNString("Name");
                String manufacturer = resultSet.getString("Manufacturer");
                Integer year = resultSet.getInt("YearOfProduction");
                String status = resultSet.getString("Status");
                CarInfo car = new CarInfo(carId, name, manufacturer, year, status);
                carInfoList.add(car);
            }

        } catch (Exception e){
            e.printStackTrace();
        }
        return carInfoList;
    }
}
