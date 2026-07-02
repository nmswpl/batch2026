package in.co.nmsworks.training.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

public class CarProcessor {
    public static void write(List<CarInfo> cars){
        int activeCount = 0, discontinuedCount = 0;
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/in/co/nmsworks/training/week3/day4/data/discontinued-cars.txt"));
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
            PreparedStatement ps = con.prepareStatement("insert into ActiveProductionCars values (?, ?, ?, ?)");
        ){
            for (CarInfo car : cars) {
                if(car.getProdStatus() == Status.Active){
                    ps.setInt(1, car.getId());
                    ps.setString(2, car.getName());
                    ps.setString(3, car.getManufacturer());
                    ps.setInt(4, car.getYearOfProduction());

                    int rowsAffected = ps.executeUpdate();
                    activeCount++;
                    if (rowsAffected == 1)
                        System.out.println("[ADDED TO DB ] : " + car);
                    else
                        System.err.println("[FAILED TO DB] : " + car);
                } else if (car.getProdStatus() == Status.Discontinued) {
                    writer.write(car.toString() + "\n");
                    System.out.println("[TO FILE ] : " + car);
                    discontinuedCount++;
                }
            }
            System.out.println(activeCount + "," + discontinuedCount);
        } catch (Exception e){
            System.err.println("ERROR : " + e.getMessage());
        }
    }
}
