package in.co.nmsworks.training.week3.day4;

import in.co.nmsworks.training.week3.day3.Candidate;

import java.io.BufferedReader;
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
        CarInfoRunner carInfoRunner = new CarInfoRunner();
        List<CarInfo> carInfoList = carInfoRunner.carDbToList();

        Map<String, List<String>> manufacturerToCars = carInfoRunner.getManufacturerToCars(carInfoList);
        System.out.println(manufacturerToCars);

        carInfoRunner.writeManufacturersToFile(manufacturerToCars);

        ActiveCars activeCars = new ActiveCars();
        activeCars.write(carInfoList);

        DiscontinuedCars discontinuedCars = new DiscontinuedCars();
        discontinuedCars.write(carInfoList);

        }


    private void writeManufacturersToFile(Map<String, List<String>> manufacturerToCars) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/Manufacturer.txt"))){
            for (Map.Entry<String, List<String>> manufacturer : manufacturerToCars.entrySet()){
                bufferedWriter.write("Manufacturer : "+manufacturer.getKey() +"\nCarsList :" + manufacturer.getValue()+ "\n") ;
                bufferedWriter.write("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Map<String,List<String>> getManufacturerToCars(List<CarInfo> carInfoList) {
        Map<String,List<String>> manufacturerToCars = new HashMap<>();
        for (CarInfo carInfo : carInfoList) {
            String manufacturer = carInfo.getManufacturer();
            List<String> cars = manufacturerToCars.get(manufacturer);
            if (cars == null){
                cars = new ArrayList<>();
                manufacturerToCars.put(manufacturer,cars);
            }
            cars.add(carInfo.getName());
        }
        return manufacturerToCars;
    }

    private List<CarInfo> carDbToList() {
        List<CarInfo> carInfoList = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
             PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM CarInfo");) {
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    CarInfo carInfo = new CarInfo(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("Manufacturer"), resultSet.getInt("YearOfProduction"), resultSet.getString("Status"));
                    carInfoList.add(carInfo);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return carInfoList;
    }
}
