package in.co.nmsworks.training.week4.day1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProcessEnterPrise {

    public static void main(String[] args) {
        ProcessEnterPrise processEnterPrise = new ProcessEnterPrise();

        List<EnterpriseSurvey> enterpriseSurveyList;

        enterpriseSurveyList = processEnterPrise.readFile();

        System.out.println("Size => "+enterpriseSurveyList.size());

        for (int i = 0; i < 3; i++) {
            System.out.println(enterpriseSurveyList.get(i));
        }

        processEnterPrise.writeToDB(enterpriseSurveyList);


    }

    private void writeToDB(List<EnterpriseSurvey> list) {

        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into Count_Table values (?,?,?,?,?,?)"))
        {
            for (EnterpriseSurvey survey : list) {

                if( "COUNT".equals(survey.getUnit()) )
                {
                    preparedStatement.setInt(1,survey.getYear());
                    preparedStatement.setString(2, survey.getIndustryCode());
                    preparedStatement.setString(3, survey.getIndustryName());
                    preparedStatement.setString(4,survey.getRmeSizeGroup());
                    preparedStatement.setString(5,survey.getVariable());
                    preparedStatement.setLong(6,survey.getValue());

                    preparedStatement.addBatch();

                }
            }
            preparedStatement.executeBatch();
            System.out.println("Count_Table entries done!!!");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }


        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into Amount_table values (?,?,?,?,?,?)"))
        {
            for (EnterpriseSurvey survey : list) {

                if( "DOLLARS(millions)".equals(survey.getUnit()) )
                {
                    preparedStatement.setInt(1,survey.getYear());
                    preparedStatement.setString(2, survey.getIndustryCode());
                    preparedStatement.setString(3, survey.getIndustryName());
                    preparedStatement.setString(4,survey.getRmeSizeGroup());
                    preparedStatement.setString(5,survey.getVariable());
                    preparedStatement.setLong(6,survey.getValue());

                    preparedStatement.addBatch();

                }
            }
            preparedStatement.executeBatch();

            System.out.println("Amount_Table entries done!!!");

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }


    private List<EnterpriseSurvey> readFile() {

        List<EnterpriseSurvey> enterpriseSurveyList = new ArrayList<>();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/annual-enterprise-survey-2025-financial-year-provisional-size-bands.csv")))
        {
            String line ;

            bufferedReader.readLine();

            while ((line = bufferedReader.readLine()) != null)
            {
                line = line.replace("\"","");
                String[] dataArray = line.split(",");

                enterpriseSurveyList.add(new EnterpriseSurvey(Integer.parseInt(dataArray[0]),dataArray[1],dataArray[2],dataArray[3],dataArray[4],Long.parseLong(dataArray[5]),dataArray[6]));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return enterpriseSurveyList;
    }
}


