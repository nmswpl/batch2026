package in.co.nmsworks.training.week3.Day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CarProcessor {
    public static void main(String[] args) throws SQLException, IOException {
        CarInfoRunner cr = new CarInfoRunner();
        CarProcessor cp = new CarProcessor();
        List<CarInfo> carsList = cr.getCarsList();

        cp.write(carsList);
    }

    private void write(List<CarInfo> carsList) throws SQLException, IOException {

        String url = "jdbc:mysql://localhost:3306/TRAINING";
        String userName = "nms-training";
        String passWord = "";
        String query = "INSERT INTO CARS_FOUND VALUES(?,?,?,?,?)";

        BufferedWriter bw = new BufferedWriter(new FileWriter("/home/nms-training/Downloads/notActive.txt"));

        try (Connection conn = DriverManager.getConnection(url, userName, passWord)) {
            for (CarInfo carInfo : carsList) {
                //System.out.println(carInfo);
                String status = carInfo.getStatus();
                //System.out.println(status);
                if (status.equals("Active")) {
                    PreparedStatement statement = conn.prepareStatement(query);
                    Integer id = carInfo.getId();
                    String name = carInfo.getName();
                    String manufacturer = carInfo.getManufacturer();
                    Integer yearOfProduction = carInfo.getYearOfProduction();
                    String statusF = carInfo.getStatus();

                    statement.setInt(1, id);
                    statement.setString(2, name);
                    statement.setString(3, manufacturer);
                    statement.setInt(4, yearOfProduction);
                    statement.setString(5, statusF);
                    statement.executeUpdate();
                } else {
                    bw.write(String.valueOf(carInfo.getId()));
                    bw.write("\n");
                    bw.write(carInfo.getName());
                    bw.write("\n");
                    bw.write(carInfo.getManufacturer());
                    bw.write("\n");
                    bw.write(String.valueOf(carInfo.getYearOfProduction()));
                    bw.write("\n");
                    bw.write(carInfo.getStatus());
                    bw.write("\n\n");
                }

            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
