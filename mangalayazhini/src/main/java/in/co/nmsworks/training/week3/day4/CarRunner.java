package in.co.nmsworks.training.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.*;
import java.util.*;

public class CarRunner {
    public static void main(String[] args) throws Exception {
        CarRunner carRunner = new CarRunner();
        List<Car> carObjectList = carRunner.readFromDB("jdbc:mysql://localhost:3306/training","nms-training","");
        Map<String,List<Car>> manufacturerCarMap = carRunner.writeManufactureWiseCars(carObjectList);
        carRunner.writeToFile(manufacturerCarMap, "/home/nms-training/Downloads/car_manufactures.txt");

    }

    private void writeToFile(Map<String, List<Car>> manufacturerCarMap, String path) {
        try(BufferedWriter writerObj = new BufferedWriter(new FileWriter(path))){
            for (String manufacturer : manufacturerCarMap.keySet()) {

                List<Car> carsList = manufacturerCarMap.get(manufacturer);
                writerObj.write("\n\n"+manufacturer + " : ");
                for (Car car : carsList) {
                    writerObj.write(car.getName());
                }
            }

        }catch(Exception e){

        }
    }


    private Map<String,List<Car>> writeManufactureWiseCars(List<Car> carObjectList){
        Map<String,List<Car>> manufacturerCarMap = new HashMap<>();


        for (Car car : carObjectList) {
            String manufacturer = car.getManufacturer();
            List<Car> cars = manufacturerCarMap.get(manufacturer);
            if(cars == null){
                cars = new ArrayList<>();
                manufacturerCarMap.put(manufacturer,cars);
            }
            cars.add(car);
        }


        for (String carManufacturer : manufacturerCarMap.keySet()) {
            System.out.println("\n"+carManufacturer + " : ");
            List<Car> carsList = manufacturerCarMap.get(carManufacturer);
            System.out.println(carsList);
        }
        return manufacturerCarMap;
    }

    private List<Car> readFromDB(String path,String username, String password) {
        List<Car> carObjectList = new ArrayList<>();
        try(Connection con = DriverManager.getConnection(path,username,password);
            Statement stmt = con.createStatement();){

//            Integer id, String name, String manufacturer, Integer yearOfProduction, String status
            ResultSet result = stmt.executeQuery("SELECT * FROM CarInfo");
            while(result.next()){
                System.out.println(result.getInt("id") + " " +
                        result.getString("name") + " " + result.getString("manufacturer")+
                        result.getInt("yearOfProduction") + " " + result.getString("status"));

                carObjectList.add(new Car(result.getInt("id"),result.getString("name"),
                        result.getString("manufacturer"),result.getInt("yearOfProduction"),
                        result.getString("status")));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return carObjectList;
    }


}
