package in.co.nmsworks.training.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarRunner {
    public static void main(String[] args) {
        CarRunner carRunner = new CarRunner();
        List<Car> carObjectList = carRunner.readFromDB("jdbc:mysql://localhost:3306/training","nms-training","");

        Map<String, List<String>> manufacturerWiseCar = carRunner.convertToMap(carObjectList);

        for(String manufacturer : manufacturerWiseCar.keySet()){
            System.out.println(manufacturer + " : " + manufacturerWiseCar.get(manufacturer) );
        }

        carRunner.writeToFile(manufacturerWiseCar);
//        carRunner.writeToFile();
//        System.out.println("type of list : " + (carObjectList instanceof List));
//        System.out.println("type of object in list : " + (carObjectList.get(0) instanceof Car));
    }

    private void writeToFile(Map<String, List<String>> manufacturerWiseCar) {

        try(BufferedWriter writerObj = new BufferedWriter(new FileWriter("/home/nms-training/Downloads/car.txt"))){
            for(String manufacturer : manufacturerWiseCar.keySet()){
                writerObj.write(manufacturer + " : ");
                writerObj.write(manufacturerWiseCar.get(manufacturer).toString());
                writerObj.write("\n");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private Map<String, List<String>> convertToMap(List<Car> carObjectList) {
        Map<String, List<String>> manufacturerWiseCar = new HashMap<>();

        for (Car car : carObjectList) {
            String carManufacturer = car.getManufacturer();
            List<String> carNamesList = manufacturerWiseCar.get(carManufacturer);
            if(carNamesList == null){
                carNamesList = new ArrayList<>();
                manufacturerWiseCar.put(carManufacturer,carNamesList);
            }
            carNamesList.add(car.getName());
        }
        return manufacturerWiseCar;
    }

    private void writeToFile(List<Car> carObjectList, String path) {
        try(BufferedWriter writerObj = new BufferedWriter(new FileWriter(path,true)); ){
            for (Car car : carObjectList) {
                writerObj.write(car.getManufacturer() + car.getName());
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }

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
