package in.co.nmsworks.training.week4.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AnnualEnterpriseSurveyJDBC {
    public static void main(String[] args) {
        readFile("/home/nms-training/Downloads/annual-enterprise-survey-2025-financial-year-provisional-size-bands.csv");
//        countDBWriter(arr[i]);
    }

    private static void readFile(String path) {
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(path));
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
            PreparedStatement preparedStatement=connection.prepareStatement("insert into surveyEnterpriseCount values (?,?,?,?,?,?)");
            PreparedStatement preparedStatement1=connection.prepareStatement("insert into surveyEnterpriseDollar values (?,?,?,?,?,?)"))
        {
            bufferedReader.readLine();
            String line="";
            while((line=bufferedReader.readLine())!=null)
            {
                String[] arr =line.split(",");
                if("COUNT".equals(arr[6].substring(1,arr[6].length()-1))){
                    preparedStatement.setInt(1,Integer.parseInt(arr[0]));
                    preparedStatement.setString(2,arr[1].substring(1,arr[1].length()-1));
                    preparedStatement.setString(3,arr[2].substring(1,arr[2].length()-1));
                    preparedStatement.setString(4,arr[3]);
                    preparedStatement.setString(5,arr[4].substring(1,arr[4].length()-1));
                    preparedStatement.setString(6,arr[5]);

                    preparedStatement.executeUpdate();
                }
                else
                {
                    preparedStatement1.setInt(1,Integer.parseInt(arr[0]));
                    preparedStatement1.setString(2,arr[1].substring(1,arr[1].length()-1));
                    preparedStatement1.setString(3,arr[2].substring(1,arr[2].length()-1));
                    preparedStatement1.setString(4,arr[3]);
                    preparedStatement1.setString(5,arr[4].substring(1,arr[4].length()-1));
                    preparedStatement1.setString(6,arr[5]);

                    preparedStatement1.executeUpdate();
                }
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}
