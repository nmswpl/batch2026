package in.co.nmsworks.training.week3.day4;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarRunner {
    public static void main(String[] args) {
        CarRunner carRunner = new CarRunner();
        List<CarInfo> carList = carRunner.readFromFile();
        System.out.println(carList);
        Map<String, List<String>> manufacturerWiseCars = carRunner.manufacturerToCars(carList);
        System.out.println(manufacturerWiseCars);
        carRunner.writeFromFile(manufacturerWiseCars);

    }



    private void writeFromFile(Map<String, List<String>> manufacturerWiseCars) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/CarInfo.txt"))) {
            for (Map.Entry<String, List<String>> entry : manufacturerWiseCars.entrySet()) {
                writer.write("Manufacturer: "+entry.getKey()+"\n");
                writer.write("Cars:\n");
                for (String s : entry.getValue()) {
                    writer.write(s+"\n");
                }
                writer.write("***********************************\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Map<String, List<String>> manufacturerToCars(List<CarInfo> carList) {
        Map<String, List<String>> manufacturerWiseCars = new HashMap<>();
        for (CarInfo carInfo : carList) {
            String manufacturer = carInfo.getManufacturer();
            List<String> cars = manufacturerWiseCars.get(manufacturer);
            if (cars == null) {
                cars = new ArrayList<>();
                manufacturerWiseCars.put(manufacturer,cars);
            }
            cars.add(carInfo.getName());
        }
        return manufacturerWiseCars;

    }

    private List<CarInfo> readFromFile() {
        List<CarInfo> carList = new ArrayList<>();
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
            Statement statement = con.createStatement()) {
            ResultSet resultset = statement.executeQuery("select * from CarInfo");
            while (resultset.next()) {
                int id = resultset.getInt(1);
                String name = resultset.getString(2);
                String dept = resultset.getString(3);
                int year = resultset.getInt(4);
                String status = resultset.getString(5);
                CarInfo car = new CarInfo(id,name,dept,year,status);
                carList.add(car);


            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return carList;
    }
}
