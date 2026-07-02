package in.co.nmsworks.training.week3.day4;

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

public class CarInfoRunner {
    public static void main(String[] args) {
        CarInfoRunner cr = new CarInfoRunner();
        List<CarInfo> carList = cr.readCarInfo();
        Map<String, List<CarInfo>> manfacturerToListOfCarsMap = new HashMap<>();
        cr.manfacturerToListOfCars(carList, manfacturerToListOfCarsMap);
        cr.writeToCarFile(manfacturerToListOfCarsMap);
        CarProcessor cp = new CarProcessor();
        cp.write(carList);
    }

    private void writeToCarFile(Map<String, List<CarInfo>> manfacturerToListOfCarsMap) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/CarInfoMap.txt"));
            for (String s : manfacturerToListOfCarsMap.keySet()) {
                bw.write(s + "------" + manfacturerToListOfCarsMap.get(s));

            }
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private void manfacturerToListOfCars
            (List<CarInfo> carList, Map<String, List<CarInfo>> manfacturerToListOfCarsMap) {

        for (CarInfo cars : carList) {
            String manufact = cars.getManufacturer();
            List<CarInfo> objList = manfacturerToListOfCarsMap.get(manufact);
            if (objList == null) {
                objList = new ArrayList<>();
                manfacturerToListOfCarsMap.put(manufact, objList);
            }

            objList.add(cars);
        }
        for (String s : manfacturerToListOfCarsMap.keySet()) {
            System.out.println(s + carList);
        }


    }


    private List<CarInfo> readCarInfo() {
        List<CarInfo> list = new ArrayList<>();
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             PreparedStatement preparedStatement = con.prepareStatement("SELECT * from CarInfo")) {

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String manufacturer = rs.getString(3);
                Integer yearOfProduction = rs.getInt(4);
                String status = rs.getString(5);

                CarInfo cars = new CarInfo(id, name, manufacturer, yearOfProduction, status);
                list.add(cars);
            }
//            for(CarInfo c : list) {
//                System.out.println(c);
//            }
        } catch (Exception e) {
            e.printStackTrace();


        } return list;
    }
}



