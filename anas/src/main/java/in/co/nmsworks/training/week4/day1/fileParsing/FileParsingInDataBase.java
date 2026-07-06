package in.co.nmsworks.training.week4.day1.fileParsing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FileParsingInDataBase {
    public static void main(String[] args) {
        FileParsingInDataBase fp = new FileParsingInDataBase();
        fp.readFile();
    }

    private void readFile() {
        String url = "jdbc:mysql://localhost:3306/training";
        try(BufferedReader br = new BufferedReader(
                new FileReader("/home/nms-training/Downloads/annual-enterprise-survey-2025-financial-year-provisional-size-bands.csv"))){


            String line = "";
            String[] words = null;

            while((line = br.readLine()) != null){

                line = line.replace("\"","");
                words = line.split(",");
                String unit = words[6];
                if (unit.equals("COUNT")){
                    try(Connection conn = DriverManager.getConnection(url,"nms-training","");
                        PreparedStatement ps = conn.prepareStatement("insert into count_table values(?,?,?,?,?,?)")) {

                        ps.setInt(1,Integer.parseInt(words[0]));
                        ps.setString(2,words[1]);
                        ps.setString(3,words[2]);
                        ps.setString(4,words[3]);
                        ps.setString(5,words[4]);
                        ps.setString(6,words[5]);

                        ps.executeUpdate();

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                }

                else if(words[6].equals("DOLLARS(millions)")){
                    try(Connection conn = DriverManager.getConnection(url,"nms-training","");
                    PreparedStatement ps = conn.prepareStatement("insert into dollar_table values(?,?,?,?,?,?)")){

                        ps.setInt(1,Integer.parseInt(words[0]));
                        ps.setString(2,words[1]);
                        ps.setString(3,words[2]);
                        ps.setString(4,words[3]);
                        ps.setString(5,words[4]);
                        ps.setString(6,words[5]);

                        ps.executeUpdate();

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
