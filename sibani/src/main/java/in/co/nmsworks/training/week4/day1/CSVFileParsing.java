package in.co.nmsworks.training.week4.day1;

import in.co.nmsworks.training.week3.day4.CarInfo;

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
public class CSVFileParsing {
    public static void main(String[] args) {
        CSVFileParsing csvFileParsing = new CSVFileParsing();
        List<Industry> industryContents = csvFileParsing.readFromFile();
        System.out.println(industryContents.size());
        csvFileParsing.classifyBasedOnUnit(industryContents);

    }

    private void classifyBasedOnUnit(List<Industry> industryContents) {
        List<Industry> countIndustries = new ArrayList<>();
        List<Industry> dollarIndustries = new ArrayList<>();
        for (Industry industryContent : industryContents) {
            if ("COUNT".equals(industryContent.getUnit())) {
                countIndustries.add(industryContent);
            }
            if ("DOLLARS(millions)".equals(industryContent.getUnit())) {
                dollarIndustries.add(industryContent);
            }
        }
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", ""))
            {
                for (int i = 0; i < countIndustries.size(); i++) {
                    PreparedStatement ps = con.prepareStatement("insert into countBasedIndustry values(?, ?,?, ?, ?, ?)");
                    ps.setInt(1,countIndustries.get(i).getYear());
                    ps.setString(2,countIndustries.get(i).getCode());
                    ps.setString(3,countIndustries.get(i).getName());
                    ps.setString(4,countIndustries.get(i).getRmeSize());
                    ps.setString(5, countIndustries.get(i).getVariable());
                    ps.setString(6, countIndustries.get(i).getValue());
                    ps.executeUpdate();
                }
                for (int i = 0; i < dollarIndustries.size(); i++) {
                    PreparedStatement ps = con.prepareStatement("insert into dollarBasedIndustry values(?, ?,?, ?, ?, ?)");
                    ps.setInt(1,dollarIndustries.get(i).getYear());
                    ps.setString(2,dollarIndustries.get(i).getCode());
                    ps.setString(3,dollarIndustries.get(i).getName());
                    ps.setString(4,dollarIndustries.get(i).getRmeSize());
                    ps.setString(5, dollarIndustries.get(i).getVariable());
                    ps.setString(6, dollarIndustries.get(i).getValue());
                    ps.executeUpdate();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }


    }

    private List<Industry> readFromFile() {
        List<Industry> industryContents = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/annual-enterprise-survey-2025-financial-year-provisional-size-bands.csv"))) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] industries = line.split(",");
                Integer year = Integer.parseInt(industries[0]);
                String code = industries[1].replaceAll("\"", "");
                String name = industries[2].replaceAll("\"", "");
                String rmeSize = industries[3].replaceAll("\"", "");
                String variable = industries[4].replaceAll("\"", "");
                String value = industries[5].replaceAll("\"", "");
                String unit = industries[6].replaceAll("\"", "");
                Industry industry = new Industry(year, code,name,rmeSize,variable,value,unit);
                industryContents.add(industry);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return industryContents;
    }
}
