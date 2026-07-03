package in.co.nmsworks.training.week3.day4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.*;

public class CarInfoRunner {
    public static void main(String[] args) {
        CarInfoRunner cr = new CarInfoRunner();
        Map<String, List<CarInfo>> manufacturerCarMap = cr.readFromDB();
        cr.writeFile(manufacturerCarMap);
    }

    private void writeFile(Map<String, List<CarInfo>> manufacturerCarMap) {
        BufferedWriter bw = null;
        try {
            FileWriter fw = new FileWriter("/home/nms-training/Desktop/manufacturerAndCar.txt");
            bw = new BufferedWriter(fw);

            for(Map.Entry<String, List<CarInfo>> data : manufacturerCarMap.entrySet()){
                bw.write(data.getKey() + "\n");
                List<CarInfo> carInfoList = data.getValue();
                for (CarInfo carInfo : carInfoList) {
                    bw.write("car name : " + carInfo.getName() + "\n");
                    bw.write("car id : " + carInfo.getId()+ "\n");
                    bw.write("car status : " + carInfo.getStatus()+ "\n");
                    bw.write("model year : " + carInfo.getYear()+ "\n");

                }
                bw.write("-------------------------------------------------------------" + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                bw.flush();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private Map<String, List<CarInfo>> readFromDB() {
        String url = "jdbc:mysql://localhost:3306/training";
        List<CarInfo> carInfoList = null;
        Map<String, List<CarInfo>> manufacturerCarMap = new HashMap<>();

        try (Connection connection = DriverManager.getConnection(url, "nms-training", "");
             PreparedStatement ps = connection.prepareStatement("select * from CarInfo;");){

            carInfoList = new ArrayList<>();

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String manufacturer = rs.getString(3);
                int year = rs.getInt(4);
                String status = rs.getString(5);

                CarInfo carInfo = new CarInfo(id,name,manufacturer,year,status);

                if(!manufacturerCarMap.containsKey(manufacturer)){
                    carInfoList.add(carInfo);
                    manufacturerCarMap.put(manufacturer, carInfoList);
                }
                manufacturerCarMap.get(manufacturer).add(carInfo);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        for(Map.Entry<String,List<CarInfo>> data : manufacturerCarMap.entrySet()){
            String key = data.getKey();
            List<CarInfo> carList = manufacturerCarMap.get(key);

            storeData(carList);
        }

        return manufacturerCarMap;
    }

    private void storeData(List<CarInfo> finalList) {
        String url = "jdbc:mysql://localhost:3306/training";
        for (CarInfo carInfo : finalList) {
            String status = carInfo.getStatus();
            if (status.equals("Active")){
                try(Connection connection = DriverManager.getConnection(url, "nms-training", "");
                    PreparedStatement ps = connection.prepareStatement("insert into CarInfo1 values(?,?,?,?,?);")) {
                    ps.setInt(1,carInfo.getId());
                    ps.setString(2,carInfo.getName());
                    ps.setString(3, carInfo.getManufacturer());
                    ps.setInt(4, carInfo.getYear());
                    ps.setString(5, carInfo.getStatus());
                    ps.executeUpdate();

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            else{
                try(FileWriter fw = new FileWriter("/home/nms-training/Desktop/carStatusDiscontinued.txt",true);
                BufferedWriter bw = new BufferedWriter(fw)){

                    bw.write("id : " + carInfo.getId() + "\n");
                    bw.write("name : " + carInfo.getName() + "\n");
                    bw.write("manufacturer : " + carInfo.getManufacturer() + "\n");
                    bw.write("model year : " + carInfo.getYear() + "\n");
                    bw.write("status : " + carInfo.getStatus() + "\n");
                    bw.write("----------------------------------");

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
