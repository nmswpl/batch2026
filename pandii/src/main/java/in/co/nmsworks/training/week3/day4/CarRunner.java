package in.co.nmsworks.training.week3.day4;

import java.io.BufferedReader;
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

public class CarRunner {
    public static void main(String[] args) {
        CarRunner carRunner=new CarRunner();
        List<CarInfo> carInfoList=carRunner.carInfoFromDb();
        System.out.println(carInfoList);
        Map<String,List<String>> manufacturerWiseCarMap=carRunner.manufacturerWiseCarInfo(carInfoList);
        System.out.println(manufacturerWiseCarMap);
        carRunner.mapToFile(manufacturerWiseCarMap,"/home/nms-training/Desktop/CarInfoOutput.txt");

        CarProccessor carProccessor=new CarProccessor();
        carProccessor.write(carInfoList);

    }

    private void mapToFile(Map<String, List<String>> manufacturerWiseCarMap,String path) {
        BufferedWriter bufferedWriter=null;
        try {
            bufferedWriter =new BufferedWriter(new FileWriter(path));
            for(String key:manufacturerWiseCarMap.keySet())
            {
                bufferedWriter.write(key+"\n");
                List<String> carDetails=manufacturerWiseCarMap.get(key);
                for (String carDetail : carDetails) {
                    bufferedWriter.write(carDetail);
                }
                bufferedWriter.write("\n---------------------------------------------------------------------------------\n");
                bufferedWriter.flush();
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private Map<String, List<String>> manufacturerWiseCarInfo(List<CarInfo> carInfoList) {
        Map<String,List<String>> manufacturerToCar=new HashMap<>();

        for (CarInfo carInfo : carInfoList) {
            String manufacturer=carInfo.getManufacturer();
            List<String> nameOfCar=manufacturerToCar.get(manufacturer);
            if(nameOfCar==null)
            {
                nameOfCar=new ArrayList<>();
                manufacturerToCar.put(manufacturer,nameOfCar);
            }
            nameOfCar.add(carInfo.getName());
        }
        return manufacturerToCar;
    }

    private List<CarInfo> carInfoFromDb() {
        List<CarInfo> carInfoList=new ArrayList<>();

        try(Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
            PreparedStatement preparedStatement=connection.prepareStatement("select * from CarInfo");
            ResultSet resultSet=preparedStatement.executeQuery()) {

            while(resultSet.next())
            {
                Status status ;
                String statusf=resultSet.getString(5);
                if(statusf.trim().equalsIgnoreCase("ACTIVE"))
                {
                    status= Status.ACTIVE;
                }
                else {
                    status=Status.DISCONTINUED;
                }

//                System.out.println(statusf);
                carInfoList.add(new CarInfo(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getInt(4),status));
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(carInfoList);
        return carInfoList;
    }
}
