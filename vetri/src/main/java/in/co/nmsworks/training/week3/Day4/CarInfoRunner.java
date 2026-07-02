package in.co.nmsworks.training.week3.Day4;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarInfoRunner {
    public static void main(String[] args) throws SQLException, IOException {
        CarInfoRunner cr = new CarInfoRunner();
        List<CarInfo> carsList = cr.getCarsList();
        Map<String, List<CarInfo>> carInfoMap = cr.getCarInfoMap(carsList);
        cr.writeToFile(carInfoMap);
    }

    private void writeToFile(Map<String, List<CarInfo>> carInfoMap) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("/home/nms-training/Downloads/ManufacturerCarsInfo.txt"));
        try {
            for (Map.Entry<String,List<CarInfo>>cars:carInfoMap.entrySet()){
                bw.write(cars.getKey() + " : " );
                List<CarInfo> value = cars.getValue();
                for (CarInfo carInfo : value) {
                    bw.write(carInfo.getName());
                    bw.write("\n");
                }
                bw.write("\n");
            }
            bw.close();
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Map<String, List<CarInfo>> getCarInfoMap(List<CarInfo> carsList) {
        Map<String, List<CarInfo>> carMap = new HashMap<>();

        try {
            for (CarInfo carData : carsList) {
                String manufacturer = carData.getManufacturer();
                //System.out.println(manufacturer);

                if (!carMap.containsKey(manufacturer)){
                    carMap.put(manufacturer,new ArrayList<>());
                }
                carMap.get(manufacturer).add(carData);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //System.out.println(carMap);
        return carMap;
    }

    public List<CarInfo> getCarsList() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/TRAINING";
        String userName = "nms-training";
        String passWord = "";

        String query = "SELECT * FROM CarInfo";
        List<CarInfo> cars = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(url, userName, passWord);
             PreparedStatement statement = conn.prepareStatement(query)) {

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Integer Id = resultSet.getInt(1);
                String Name = resultSet.getString(2);
                String Manufacturer = resultSet.getString(3);
                Integer YearOfProduction = resultSet.getInt(4);
                String Status = resultSet.getString(5);

                CarInfo cr = new CarInfo(Id, Name, Manufacturer, YearOfProduction, Status);
                cars.add(cr);


//                System.out.println("Id: " + Id);
//                System.out.println("Name: " + Name);
//                System.out.println("Manufacturer: " + Manufacturer);
//                System.out.println("YearOfProduction: " + YearOfProduction);
//                System.out.println("Status: " + Status);
//                System.out.println("\n");

            }
            //System.out.println(cars);
            return cars;
        }
    }
}
