package in.co.nmsworks.training.week4.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class FileToDbWriter {
    public static void main(String[] args) {
        fileParsing();
    }

    private static void fileParsing() {
        try(BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Downloads/annual-enterprise-survey-2025-financial-year-provisional-size-bands.csv"));
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
            PreparedStatement preparedStatementUnit= connection.prepareStatement("insert into unit_data values(?,?,?,?,?,?)");
            PreparedStatement preparedStatementAmount= connection.prepareStatement("insert into amount_data values(?,?,?,?,?,?)")){

            String line = reader.readLine();
            while ((line=reader.readLine())!=null){
                line = line.replace("\"","");
                String[] eachline = line.split(",");

                if(eachline[6].equals("COUNT")){
                    writeToUnit_data(eachline);
                }
                else{
                    writeToAmount_data(eachline);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void writeToUnit_data(String[] eachline) {
        try( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training",""); PreparedStatement preparedStatementUnit= connection.prepareStatement("insert into unit_data values(?,?,?,?,?,?)")){
            preparedStatementUnit.setInt(1,Integer.parseInt(eachline[0]));
            preparedStatementUnit.setString(2,eachline[1]);
            preparedStatementUnit.setString(3,eachline[2]);
            preparedStatementUnit.setString(4,eachline[3]);
            preparedStatementUnit.setString(5,eachline[4]);
            preparedStatementUnit.setString(6,eachline[5]);

            preparedStatementUnit.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void writeToAmount_data(String[] eachline) {
        try( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training",""); PreparedStatement preparedStatementAmount= connection.prepareStatement("insert into amount_data values(?,?,?,?,?,?)")){
            preparedStatementAmount.setInt(1,Integer.parseInt(eachline[0]));
            preparedStatementAmount.setString(2,eachline[1]);
            preparedStatementAmount.setString(3,eachline[2]);
            preparedStatementAmount.setString(4,eachline[3]);
            preparedStatementAmount.setString(5,eachline[4]);
            preparedStatementAmount.setString(6,eachline[5]);

            preparedStatementAmount.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
