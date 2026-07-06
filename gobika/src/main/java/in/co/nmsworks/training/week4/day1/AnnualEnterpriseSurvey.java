package in.co.nmsworks.training.week4.day1;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AnnualEnterpriseSurvey {
    public static void main(String[] args) {
        AnnualEnterpriseSurvey annualEnterpriseSurvey = new AnnualEnterpriseSurvey();
        List<String> surveyList = annualEnterpriseSurvey.listOfSurvey();
        annualEnterpriseSurvey.splitSurvey(surveyList);
    }

    private void splitSurvey(List<String> surveyList) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","")){
            for (String survey : surveyList) {
                String[] surveyValues = survey.split(",");
                int year = Integer.parseInt(surveyValues[0]);
                String industry_code = surveyValues[1];
                String industry_name = surveyValues[2];
                String rme_size = surveyValues[3];
                String variable = surveyValues[4];
                String value = surveyValues[5];

                if ("COUNT".equals(surveyValues[6])){
                    try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO countData values (?, ?, ?, ?, ?, ?)")){
                        preparedStatement.setInt(1,year);
                        preparedStatement.setString(2,industry_code);
                        preparedStatement.setString(3,industry_name);
                        preparedStatement.setString(4,rme_size);
                        preparedStatement.setString(5,variable);
                        preparedStatement.setString(6,value);
                        preparedStatement.executeUpdate();
                    }
                }
                else {
                    try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO amountData values (?, ?, ?, ?, ?, ?)")){
                        preparedStatement.setInt(1,year);
                        preparedStatement.setString(2,industry_code);
                        preparedStatement.setString(3,industry_name);
                        preparedStatement.setString(4,rme_size);
                        preparedStatement.setString(5,variable);
                        preparedStatement.setString(6,value);
                        preparedStatement.executeUpdate();
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private List<String> listOfSurvey() {
        List<String> surveyList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/annual-enterprise.csv"))){
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null){
                surveyList.add(line.replace("\"",""));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }  catch (IOException e) {
            e.printStackTrace();
        }
        return surveyList;
    }
}
