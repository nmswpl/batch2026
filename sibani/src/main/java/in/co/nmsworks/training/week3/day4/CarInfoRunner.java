package in.co.nmsworks.training.week3.day4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.*;

public class CarInfoRunner {
    public static void main(String[] args) {
        CarInfoRunner carInfoRunner = new CarInfoRunner();
        List<CarInfo> carDetails = carInfoRunner.readFromDB();
        Map<String, List<String>> manufacturerWiseCar = carInfoRunner.manufacturerWiseCars(carDetails);
        carInfoRunner.writeToFile(manufacturerWiseCar);

    }

    private void writeToFile(Map<String, List<String>> manufacturerWiseCar) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/ManufacturersWiseCarDetails.txt"))) {
            for (Map.Entry<String, List<String>> manuWiseCar : manufacturerWiseCar.entrySet()) {
                bufferedWriter.write(manuWiseCar.getKey() + "\n");
                bufferedWriter.write(String.valueOf(manuWiseCar.getValue()) + "\n");
                bufferedWriter.write("===================================================================================================================================================================================" + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Map<String, List<String>> manufacturerWiseCars(List<CarInfo> carDetails) {
        Map<String, List<String>> manufacturerWiseCar = new HashMap<>();

        for (CarInfo carDetail : carDetails) {
            String manufacturer = carDetail.getManufacturer();
            List<String> cars = manufacturerWiseCar.get(manufacturer);
            if (cars == null){
                cars = new ArrayList<>();
                manufacturerWiseCar.put(manufacturer,cars);
            }
            cars.add(carDetail.getName());
        }
        for (Map.Entry<String, List<String>> manuWiseCar : manufacturerWiseCar.entrySet()) {
            System.out.println("Manufacturer : " + manuWiseCar.getKey() + " " + " Cars : " + manuWiseCar.getValue());
        }
        return manufacturerWiseCar;
    }

    protected List<CarInfo> readFromDB() {
        List<CarInfo> carDetails = new ArrayList<>();
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             PreparedStatement ps = con.prepareStatement("select * from CarInfo")) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    CarInfo carInfo = new CarInfo(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getInt(4),CarInfo.Status.valueOf(rs.getString(5)));
                    carDetails.add(carInfo);
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return carDetails;
    }
}
