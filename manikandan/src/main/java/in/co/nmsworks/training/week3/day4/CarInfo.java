package in.co.nmsworks.training.week3.day4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.*;
import java.util.*;

public class CarInfo {
    private Integer id;
    private String name;
    private String manufacturer;
    private Integer year;
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CarInfo(){

    }
    public CarInfo(Integer id, String name, String manufacturer, Integer year, String status) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.year = year;
        this.status = status;
    }

    @Override
    public String toString() {
        return "CarInfo{" + "id=" + id + ", name='" + name + '\'' + ", manufacturer='" + manufacturer + '\'' + ", year=" + year + ", status='" + status + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CarInfo carInfo = (CarInfo) o;
        return Objects.equals(id, carInfo.id) && Objects.equals(name, carInfo.name) && Objects.equals(manufacturer, carInfo.manufacturer) && Objects.equals(year, carInfo.year) && Objects.equals(status, carInfo.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, manufacturer, year, status);
    }

    //*************************************************************************************************************************************************************//

    public static void main(String[] args) {
        CarInfo car = new CarInfo();
        Map<String, List<String>> mappedObj = car.readFromDb();
        car.writeToFile(mappedObj);
        car.ReadfromFile();
    }

    // Reads and processes the text file written by writeToFile()
    public void ReadfromFile() {
        String path = "/home/nms-training/Desktop/CarAndManufacturer.txt";
        System.out.println("--- Reading from File ---");
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            String currentManufacturer = null;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                if (line.contains(" manufacture:")) {
                    currentManufacturer = line.replace(" manufacture:", "").trim();
                } else if (currentManufacturer != null) {
                    System.out.println("Manufacturer: " + currentManufacturer + " -> Cars: " + line);
                    currentManufacturer = null; // reset for next entry
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void writeToFile(Map<String, List<String>> mappedObj) {
        String path = "/home/nms-training/Desktop/CarAndManufacturer.txt";
        try (BufferedWriter wr = new BufferedWriter(new FileWriter(path))){
            for(Map.Entry<String,List<String>> entry: mappedObj.entrySet()){
                String manufacturer = entry.getKey();
                List<String> cars = entry.getValue();

                String line = manufacturer + " manufacture: " +"\n"+ String.join(", ", cars)+"\n";
                wr.write(line);
                wr.newLine();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Map<String, List<String>> readFromDb() {
        String url = "jdbc:mysql://localhost:3306/training";
        String user = "nms-training";
        String pwd ="";
        String query ="SELECT Id,Name,Manufacturer,YearOfProduction,Status from CarInfo";
        Map<String, List<String>> groupedMap = new HashMap<>();
        try(Connection con = DriverManager.getConnection(url,user,pwd);
            PreparedStatement smt = con.prepareStatement(query); // Fixed: changed prepareCall to prepareStatement
            ResultSet rs = smt.executeQuery()) {
            while (rs.next()) {
                String name = rs.getString("Name");
                String manufacturer = rs.getString("Manufacturer");
                if (!groupedMap.containsKey(manufacturer)) {
                    groupedMap.put(manufacturer, new ArrayList<>());
                }
                groupedMap.get(manufacturer).add(name);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return groupedMap;
    }
}