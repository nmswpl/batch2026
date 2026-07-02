package in.co.nmsworks.training.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarInfoRunner {
    public static void main(String[] args) {
        CarInfoRunner runner = new CarInfoRunner();
        List<CarInfo> carInfoList = runner.getCarInfo();
//        carInfoList.forEach(System.out::println);
        Map<String, List<CarInfo>> manufacturerBasedMap = runner.getManufacturerWiseMapping(carInfoList);
        runner.getManufacturerReport(manufacturerBasedMap);

        CarProcessor.write(carInfoList);
    }

    private void getManufacturerReport(Map<String, List<CarInfo>> manufacturerBasedMap) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/in/co/nmsworks/training/week3/day4/data/manufacturer-report.txt"))){
            writer.write("MANUFACTURER\t|\tCARS MANUFACTURED\n");
            for (Map.Entry<String, List<CarInfo>> entry : manufacturerBasedMap.entrySet()) {
                writer.write(entry.getKey() + "\t------->\t" + entry.getValue() + "\n");
                writer.newLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private Map<String, List<CarInfo>> getManufacturerWiseMapping(List<CarInfo> carInfoList) {
        Map<String, List<CarInfo>> manufacturerBasedMap = new HashMap<>();
        for (CarInfo carInfo : carInfoList) {
            List<CarInfo> carsByManufacturerList = manufacturerBasedMap.getOrDefault(carInfo.getManufacturer(), new ArrayList<>());
            manufacturerBasedMap.put(carInfo.getManufacturer(), carsByManufacturerList);
            carsByManufacturerList.add(carInfo);
        }
        return manufacturerBasedMap;
    }

    private List<CarInfo> getCarInfo() {
        List<CarInfo> carInfoList = new ArrayList<>();

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             PreparedStatement ps = con.prepareStatement("select * from CarInfo")) {
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()){
                CarInfo carInfo = new CarInfo();
                carInfo.setId(resultSet.getInt("Id"));
                carInfo.setName(resultSet.getString("Name"));
                carInfo.setManufacturer(resultSet.getString("Manufacturer"));
                carInfo.setYearOfProduction(resultSet.getInt("YearOfProduction"));
                carInfo.setProdStatus(Status.valueOf(resultSet.getString("Status")));

                carInfoList.add(carInfo);
            }
        } catch (SQLException e) {
            System.out.println("ERROR : " + e.getMessage());
        }

        return carInfoList;
    }
}