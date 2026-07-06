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

public class IndustryRunner {
    public static void main(String[] args) {
        IndustryRunner industryRunner = new IndustryRunner();
        List<Industry> industries = industryRunner.readFromFile();
        System.out.println("Size: "+industries.size());
        industryRunner.writeInDataabase(industries);
    }

    private void writeInDataabase(List<Industry> industries) {
        for (Industry industry : industries) {
            if ("COUNT".equals(industry.getUnit())) {
                writeInCountAmount(industry);
            }
            else if ("DOLLARS(millions)".equals(industry.getUnit())){
                writeInDollarAmount(industry);

            }
        }
    }

    private void writeInDollarAmount(Industry industry) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
             PreparedStatement statement = con.prepareStatement("insert into DollarAmount values(?, ?, ?, ?, ?, ?)")){
            statement.setInt(1,industry.getYear());
            statement.setString(2,industry.getIndustryCode());
            statement.setString(3,industry.getIndustryName());
            statement.setString(4,industry.getRmeSize());
            statement.setString(5,industry.getVariable());
            statement.setString(6,industry.getValue());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private void writeInCountAmount(Industry industry) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
             PreparedStatement statement = con.prepareStatement("insert into CountAmount values(?, ?, ?, ?, ?, ?)")){
            statement.setInt(1,industry.getYear());
            statement.setString(2,industry.getIndustryCode());
            statement.setString(3,industry.getIndustryName());
            statement.setString(4,industry.getRmeSize());
            statement.setString(5,industry.getVariable());
            statement.setString(6,industry.getValue());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private List<Industry> readFromFile() {
        List<Industry> industries = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Downloads/annual-enterprise-survey-2025-financial-year-provisional-size-bands.csv"))) {
            String text = "";
            reader.readLine();
            while ((text = reader.readLine()) != null) {
                String[] array = text.split(",");
                Integer year = Integer.valueOf(array[0]);
                String industryCode = array[1];
                industryCode = industryCode.replaceAll("\"","");
                String industryName = array[2];
                industryName = industryName.replaceAll("\"","");
                String rme_size = array[3];
                rme_size = rme_size.replaceAll("\"","");
                String variable = array[4];
                variable = variable.replaceAll("\"","");
                String value = array[5];
                String unit = array[6];
                unit = unit.replaceAll("\"","");
                Industry industry = new Industry(year,industryCode,industryName,rme_size,variable,value,unit);
                industries.add(industry);

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return industries;
    }
}
