package in.co.nmsworks.training.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.*;

public class CarInfoRunner {
    public static void main(String[] args) {
        CarInfoRunner runner = new CarInfoRunner();
        List<CarInfo> carInfoList = runner.readDataFromDB();
//        System.out.println(carInfoList);
        Map<String, List<CarInfo>> manufacturerTOCarInfo = runner.mapManufacturerTOCarInfo(carInfoList);
//        System.out.println(manufacturerTOCarInfo.size());
        runner.writeCarInfoToFile(manufacturerTOCarInfo);
    }

    private void writeCarInfoToFile(Map<String, List<CarInfo>> manufacturerTOCarInfo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/CarDeatils.txt"))){
            for (String key : manufacturerTOCarInfo.keySet()) {
                writer.write(key+"\n");
                for (CarInfo carInfo : manufacturerTOCarInfo.get(key)) {
                    writer.write(carInfo.getName()+", ");
                }
                writer.write("\n");
                writer.write("----------------------------------------------------------------------------------------------------------------------------------------------------\n");
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Map<String, List<CarInfo>> mapManufacturerTOCarInfo(List<CarInfo> carInfoList) {
        Map<String, List<CarInfo>> manufacturerTOCarInfo = new HashMap<>();
        for (CarInfo carInfo : carInfoList) {
            List<CarInfo> currentCarInfos = manufacturerTOCarInfo.get(carInfo.getManufacturer());
            if (currentCarInfos == null) {
                currentCarInfos = new ArrayList<>();
                manufacturerTOCarInfo.put(carInfo.getManufacturer(),currentCarInfos);
            }
            currentCarInfos.add(carInfo);
        }
        return manufacturerTOCarInfo;
    }

    protected List<CarInfo> readDataFromDB() {
        List<CarInfo> carInfoList = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
             PreparedStatement ps = connection.prepareStatement("select * from CarInfo");
             ResultSet resultSet = ps.executeQuery()){
            while (resultSet.next()) {
                Integer id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String manufacturer = resultSet.getString(3);
                Integer year = resultSet.getInt(4);
                String statusFromDB = resultSet.getString(5);
                Status status;
                if (statusFromDB.equals("Active"))
                    status = Status.ACTIVE;
                else
                    status = Status.DISCONTINUED;
                carInfoList.add(new CarInfo(id,name,manufacturer,year,status));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return carInfoList;
    }
}
