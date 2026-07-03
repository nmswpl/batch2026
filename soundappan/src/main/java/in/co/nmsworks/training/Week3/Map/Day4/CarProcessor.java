package in.co.nmsworks.training.Week3.Map.Day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarProcessor {
    public static void main(String[] args) {
        CarProcessor pr = new CarProcessor();
        List<CarInfo> cars = pr.fetchDataInSql();
        Map<String, List<CarInfo>> map = pr.addIntoMap(cars);

        List<CarInfo> activeCars = map.get("Active");
        for (CarInfo car : activeCars) {
            System.out.println(car);
        }
        List<CarInfo> discontinuedCars = map.get("Discontinued");
        pr.writeIntoFile(discontinuedCars);

    }
    private void writeIntoFile(List<CarInfo> discontinuedCars) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/DiscontinuedCars.txt"))) {
            bw.write(" Discontinued cars From Car Processor : ");
            bw.newLine();
            int count=0;
            for (CarInfo car : discontinuedCars) {
                if (car.getStatus().equalsIgnoreCase("Discontinued")){
                    bw.write("-----------------------------------------------------------");
                    bw.newLine();
                    bw.write("Id : " + car.getId());
                    bw.newLine();
                    bw.write("Name : " + car.getName());
                    bw.newLine();
                    bw.write("Manufacturer : " + car.getManufacturer());
                    bw.newLine();
                    bw.write("Year Of Production : " + car.getYearOfProduction());
                    bw.newLine();
                    bw.write("Status : " + car.getStatus());
                    bw.newLine();
                    bw.write("-----------------------------------------------------------");
                    bw.newLine();
                    bw.newLine();
                    count++;
                }
            }
            System.out.println("Discontinued cars written successfully.");
            bw.write("Total Discontinued Cars Are : "+count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void writeIntoDatabase(List<CarInfo> activeCars) {
        String url = "jdbc:mysql://localhost:3306/training";
        String user = "nms-training";
        String password = "";
        String query = "INSERT INTO Active_Car (Id, Name, Manufacturer, YearOfProduction, Status) VALUES (?, ?, ?, ?, ?)";

        try (
                Connection con = DriverManager.getConnection(url, user, password);
                PreparedStatement ps = con.prepareStatement(query)
        ) {

            for (CarInfo car : activeCars) {

                if (car.getStatus().equalsIgnoreCase("Active")) {

                    ps.setInt(1, car.getId());
                    ps.setString(2, car.getName());
                    ps.setString(3, car.getManufacturer());
                    ps.setInt(4, car.getYearOfProduction());
                    ps.setString(5, car.getStatus());

                    ps.executeUpdate();
                }
            }

            System.out.println("Active cars inserted successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private Map<String, List<CarInfo>> addIntoMap(List<CarInfo> cars) {
        Map<String, List<CarInfo>> data = new HashMap<>();
        for (CarInfo car : cars) {
            data.putIfAbsent(car.getStatus(), new ArrayList<>());
            data.get(car.getStatus()).add(car);
        }
        return data;
    }

    private List<CarInfo> fetchDataInSql() {
        List<CarInfo> carList = new ArrayList<>();
        String url = "jdbc:mysql://localhost:3306/training";
        String user = "nms-training";
        String password = "";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery("SELECT * FROM CarInfo");
            while (rs.next()) {
                Integer Id = rs.getInt("Id");
                String Name = rs.getString("Name");
                String Manufacture = rs.getString("Manufacturer");
                Integer YearOfProduction = rs.getInt("YearOfProduction");
                String Status = rs.getString("Status");
                carList.add(new CarInfo(Id, Name, Manufacture, YearOfProduction, Status));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return carList;
    }
}
