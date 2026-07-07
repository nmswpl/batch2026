package in.co.nmsworks.training.week4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;

public class FileParsingAndDatabaseUpdate {
    public static void main(String[] args) {
        readCsvAndWriteInDB();
    }

    private static void readCsvAndWriteInDB() {
        int rowsUpdated = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/in/co/nmsworks/training/week4/data/annual-enterprise-survey-2025-financial-year-provisional-size-bands.csv"))){
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null){
                line = line.replace('"', ' ');
                String[] row = line.split(",");
                for (int i = 0; i < row.length; i++) {
                    row[i] = row[i].trim();
                }
                if ("COUNT".equals(row[6])){
                    System.out.println("C : " + Arrays.toString(row));
                    rowsUpdated += addToCountTable(row);
                } else if ("DOLLARS(millions)".equals(row[6])){
                    System.out.println("D : " + Arrays.toString(row));
                    rowsUpdated += addToCostTable(row);
                }
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("updated rows = " + rowsUpdated);
    }

    private static int addToCostTable(String[] row) {
        int rowsUpdated = 0;
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             PreparedStatement ps = con.prepareStatement("insert into CostTable values(?, ?, ?, ?, ?, ?)");
        ){
            ps.setInt(1, Integer.parseInt(row[0]));
            ps.setString(2, row[1]);
            ps.setString(3, row[2]);
            ps.setString(4, row[3]);
            ps.setString(5, row[4]);
            ps.setString(6, row[5]);

           rowsUpdated = ps.executeUpdate();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return rowsUpdated;
    }

    private static int addToCountTable(String[] row) {
        int rowsUpdated = 0;
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             PreparedStatement ps = con.prepareStatement("insert into CountTable values(?, ?, ?, ?, ?, ?)");
        ){
            ps.setInt(1, Integer.parseInt(row[0]));
            ps.setString(2, row[1]);
            ps.setString(3, row[2]);
            ps.setString(4, row[3]);
            ps.setString(5, row[4]);
            ps.setString(6, row[5]);

            rowsUpdated = ps.executeUpdate();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return rowsUpdated;
    }
}
