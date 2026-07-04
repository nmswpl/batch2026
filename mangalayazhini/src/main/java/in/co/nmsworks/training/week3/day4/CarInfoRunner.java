package in.co.nmsworks.training.week3.day4;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarInfoRunner {
    public static void main(String[] args) {
        CarInfoRunner carInfoRunner = new CarInfoRunner();
        List<CarInfo> carInfoList = carInfoRunner.readCarInfoFromDatabase("jdbc:mysql://localhost:3306/training","nms-training","");

        for (CarInfo carInfo : carInfoList) {
            System.out.println(carInfo.getId() + " " + carInfo.getName() + " " +
                               carInfo.getManufacturer() + " " + carInfo.getYearOfProduction() + " " +
                               carInfo.getStatus());
        }

        List<CarInfo> activeCarInfoList = carInfoRunner.classifyCarInfo(carInfoList, "Active");
        List<CarInfo> discontinuedCarInfoList = carInfoRunner.classifyCarInfo(carInfoList, "Discontinued");

        CarDBWriter dbWriterObj = new CarDBWriter();
        CarFileWriter fileWriterObj = new CarFileWriter();
        dbWriterObj.write(activeCarInfoList);
        fileWriterObj.write(discontinuedCarInfoList);

        System.out.println("\n\nActive Cars : ");
//        for (CarInfo carInfo : activeCarInfoList) {
//            System.out.println(carInfo.getId() + " " + carInfo.getName() + " " +
//                    carInfo.getManufacturer() + " " + carInfo.getYearOfProduction() + " " +
//                    carInfo.getStatus());
//        }

        System.out.println("\n\nDiscontinued Cars : ");
//        for (CarInfo carInfo : discontinuedCarInfoList) {
//            System.out.println(carInfo.getId() + " " + carInfo.getName() + " " +
//                    carInfo.getManufacturer() + " " + carInfo.getYearOfProduction() + " " +
//                    carInfo.getStatus());
//        }

    }

    public List<CarInfo> readCarInfoFromDatabase(String url, String user, String password){
        List<CarInfo> carsList = new ArrayList<>();
        try(Connection con = DriverManager.getConnection(url,user,password);
            Statement stmt = con.createStatement();){
            ResultSet result = stmt.executeQuery("SELECT * FROM CarInfo");

            while(result.next()){
//                System.out.println(
//                                  result.getInt("id") + " , "
//                                + result.getString("name") + ", "
//                                + result.getString("manufacturer") + " , "
//                                + result.getString("yearofproduction") + " , "
//                                + result.getString("status"));

                carsList.add(new CarInfo(result.getInt("id"),
                                         result.getString("name"),
                                         result.getString("manufacturer"),
                                         result.getString("yearofproduction"),
                                         result.getString("status")));
            }
        }
        catch(Exception e){

        }
        return carsList;
    }

    public List<CarInfo> classifyCarInfo(List<CarInfo> carList, String category){
        List<CarInfo> classifiedCarList = new ArrayList<>();
        for (CarInfo carInfo : carList) {
            if(category.equals(carInfo.getStatus())){
                classifiedCarList.add(carInfo);
            }
        }

        return classifiedCarList;
    }
}
