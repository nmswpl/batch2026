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
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
             PreparedStatement countStatement = connection.prepareStatement("INSERT INTO countData values (?, ?, ?, ?, ?, ?)");
             PreparedStatement amountStatement = connection.prepareStatement("INSERT INTO amountData values (?, ?, ?, ?, ?, ?)")){
            for (String survey : surveyList) {
                String[] surveyValues = survey.split(",");
                int year = Integer.parseInt(surveyValues[0]);
                String industryCode = surveyValues[1];
                String industryName = surveyValues[2];
                String rmeSize = surveyValues[3];
                String variable = surveyValues[4];
                String value = surveyValues[5];

                if ("COUNT".equals(surveyValues[6])){
                    countStatement.setInt(1,year);
                    countStatement.setString(2, industryCode);
                    countStatement.setString(3, industryName);
                    countStatement.setString(4, rmeSize);
                    countStatement.setString(5,variable);
                    countStatement.setString(6,value);
                    countStatement.executeUpdate();
                    }
                else {
                    amountStatement.setInt(1,year);
                    amountStatement.setString(2, industryCode);
                    amountStatement.setString(3, industryName);
                    amountStatement.setString(4, rmeSize);
                    amountStatement.setString(5,variable);
                    amountStatement.setString(6,value);
                    amountStatement.executeUpdate();
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
