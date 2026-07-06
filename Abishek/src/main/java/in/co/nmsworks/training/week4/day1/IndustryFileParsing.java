package in.co.nmsworks.training.week4.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class IndustryFileParsing {

    public static void main(String[] args) {
        List<String[]> csvRows = readFile();
        insertCountTable(csvRows);
        insertAmountTable(csvRows);
    }

    private static void insertAmountTable(List<String[]> csvRows) {

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
             PreparedStatement ps = con.prepareStatement("INSERT INTO byamount values (?,?,?,?,?,?)") )
        {
            for (String[] row : csvRows) {

                String dup = row[6].replace("\""," ").trim();
                if(dup.equalsIgnoreCase("DOLLARS(MILLIONS)"))
                {
                    String one = row[0].replace("\""," ").trim();
                    ps.setString(1, one);
                    String two = row[1].replace("\""," ").trim();
                    ps.setString(2, two);
                    String three = row[2].replace("\""," ").trim();
                    ps.setString(3, three);
                    String four = row[3].replace("\""," ").trim();
                    ps.setString(4, four);
                    String five = row[4].replace("\""," ").trim();
                    ps.setString(5, five);
                    String six = row[5].replace("\""," ").trim();
                    ps.setString(6, six);
                    ps.executeUpdate();
                }
            }

            System.out.println("Amount table insertion completed.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void insertCountTable(List<String[]> csvRows) {


        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
             PreparedStatement ps = con.prepareStatement("INSERT INTO bycount values (?,?,?,?,?,?)") )
        {
            System.out.println(csvRows.size());
            for (String[] row : csvRows) {
                String dup = row[6].replace("\""," ").trim();
                if(dup.equalsIgnoreCase("COUNT"))
                {
                    String one = row[0].replace("\""," ").trim();
                    ps.setString(1, one);
                    String two = row[1].replace("\""," ").trim();
                    ps.setString(2, two);
                    String three = row[2].replace("\""," ").trim();
                    ps.setString(3, three);
                    String four = row[3].replace("\""," ").trim();
                    ps.setString(4, four);
                    String five = row[4].replace("\""," ").trim();
                    ps.setString(5, five);
                    String six = row[5].replace("\""," ").trim();
                    ps.setString(6, six);
                    ps.executeUpdate();
                }
            }
            System.out.println("Count table insertion completed.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<String[]> readFile() {

        List<String[]> collectionOfRows = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/annual-enterprise-survey-2025-financial-year-provisional-size-bands.csv"))){
            String line =  "";
            boolean isHeader = true;

            while((line = br.readLine()) != null )
            {
                if(isHeader) {
                    isHeader = false;
                    continue;
                }

                String splits[] = line.split(",");
//                System.out.println(splits.length);
                collectionOfRows.add(splits);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return collectionOfRows;
    }
}