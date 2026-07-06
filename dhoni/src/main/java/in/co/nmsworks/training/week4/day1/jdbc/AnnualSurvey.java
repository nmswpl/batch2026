package in.co.nmsworks.training.week4.day1.jdbc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AnnualSurvey {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/annualReport";
        String user = "nms-training";
        String password = "";
        AnnualSurvey annualSurvey = new AnnualSurvey();
        List<AnnualReport> annualReportList = annualSurvey.getList();
        Map<String, List<AnnualReport>> map = annualSurvey.getMap(annualReportList);

//        for(Map.Entry<String, List<AnnualReport>> m : map){
//            System.out.println(m.getKey() + "  " + m.getValue());
//        }

        String insert = "insert into annualCount values(?,?,?,?,?,?);";
        annualSurvey.writeIntoDBCount(insert, map.get("COUNT"), url, user, password);
        String insertDollar = "insert into annualDollars values(?,?,?,?,?,?)";
        annualSurvey.writeIntoDBCount(insertDollar,map.get("DOLLARS(millions)"),url ,user, password);

    }

    private void writeIntoDBCount(String insert, List<AnnualReport> list, String url, String user, String password) {

        try(Connection connection = DriverManager.getConnection(url,user,password))
        {
            PreparedStatement preparedStatement = connection.prepareStatement(insert);
            int totalRows = 0;
            for(AnnualReport annualReport : list){
                preparedStatement.setInt(1,annualReport.getYear());
                preparedStatement.setString(2,annualReport.getIndustryCode());
                preparedStatement.setString(3,annualReport.getIndustryName());
                preparedStatement.setString(4, annualReport.getRmeSize());
                preparedStatement.setString(5,annualReport.getVariable());
                preparedStatement.setString(6,annualReport.getValue());

                int row = preparedStatement.executeUpdate();
                totalRows = totalRows + row;
            }

            System.out.println(" total rows inserted : "+totalRows);
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private Map<String, List<AnnualReport>> getMap(List<AnnualReport> list){
        Map<String, List<AnnualReport>> map = new HashMap<>();

        for(AnnualReport annualReport : list ){
            map.putIfAbsent(annualReport.getUnit() , new ArrayList<>());
            map.get(annualReport.getUnit()).add(annualReport);
        }

        return map;
    }

    private List<AnnualReport> getList() {
        List<AnnualReport> list = new ArrayList<>();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/annual-enterprise-survey-2025-financial-year-provisional-size-bands.csv")))
        {
            bufferedReader.readLine();

            String line;

            while((line = bufferedReader.readLine())!= null){
                //System.out.println(line);

                String[] elements = line.split(",");
                //System.out.println(Arrays.toString(elements));

                int year = Integer.parseInt(elements[0].trim());
                //System.out.println(elements[1].substring(1,elements[1].length()-1));
                String code = elements[1].substring(1,elements[1].length()-1);
                String name = elements[2].substring(1,elements[2].length()-1);
                String rme = elements[3].substring(1,elements[3].length()-1);
                String variable = elements[4].substring(1,elements[4].length()-1);
                String value = elements[5].trim();
                String unit = elements[6].substring(1,elements[6].length()-1);

                //System.out.println(year +" " +code + " "+name +" "+ rme + " "+ variable + " " +value +" " +unit);

                list.add(new AnnualReport(year,code,name,rme,variable,value,unit));
            }

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }


        return list;

    }

}
