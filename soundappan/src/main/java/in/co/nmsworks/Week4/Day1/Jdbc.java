package in.co.nmsworks.Week4.Day1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc {
    public static void main(String[] args) {
        Jdbc j = new Jdbc();
        j.readFileMillion();
    }

    private void readFileMillion() {
        String url = "jdbc:mysql://localhost:3306/training";
        String name = "nms-training";
        String pass = "";

        String query = "Insert Into amount values(?,?,?,?,?,?)";
        String million = "Insert Into counter values(?,?,?,?,?,?)";
        try (BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/annual-enterprise-survey-2025-financial-year-provisional-size-bands.csv"));) {
            Connection con = DriverManager.getConnection(url, name, pass);
            PreparedStatement pr = con.prepareStatement(query);
            PreparedStatement rs = con.prepareStatement(million);
            String line = "";
            br.readLine();
            while ((line = br.readLine()) != null) {
                line = line.replace("\"", "");
                String[] data = line.split(",");
                for (int i = 0; i < data.length; i++) {
                    String calYear = data[0];
                    String code = data[1];
                    String IndusName = data[2];
                    String size = data[3];
                    String variable = data[4];
                    String val = data[5];
                    String unit = data[6];
                    if (unit.equals("DOLLARS(millions)")) {
                        pr.setString(1, calYear);
                        pr.setString(2, code);
                        pr.setString(3, IndusName);
                        pr.setString(4, size);
                        pr.setString(5, variable);
                        pr.setString(6, val);
                        pr.executeUpdate();
                    } else {
                        rs.setString(1, calYear);
                        rs.setString(2, code);
                        rs.setString(3, IndusName);
                        rs.setString(4, size);
                        rs.setString(5, variable);
                        rs.setString(6, val);
                        rs.executeUpdate();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
