package in.co.nmsworks.training.week4.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AnnualEnterprise {
    public static void main(String[] args) {
        AnnualEnterprise enterprise = new AnnualEnterprise();
        List<String> listOfLines = enterprise.readFile();
        try {
            enterprise.setToDatabase(listOfLines);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setToDatabase(List<String> list) throws Exception {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
            PreparedStatement statement = con.prepareStatement("insert into amount values(?, ?, ?, ?, ?, ?)");
            PreparedStatement statement1 = con.prepareStatement("insert into value values(?, ?, ?, ?, ?, ?)")){
            for (String s : list) {
                String[] splitedWords = s.split(",");
                System.out.println(s);
                if("COUNT".equalsIgnoreCase(splitedWords[6].trim())){
                    statement.setInt(1, Integer.parseInt(splitedWords[0]));
                    statement.setString(2,splitedWords[1]);
                    statement.setString(3,splitedWords[2]);
                    statement.setString(4,splitedWords[3]);
                    statement.setString(5,splitedWords[4]);
                    statement.setString(6,splitedWords[5]);
                    int rowsAffected = statement.executeUpdate();
                    System.out.println("The rows affected are :: " + rowsAffected);
                } else if ("DOLLARS(millions)".equalsIgnoreCase(splitedWords[6].trim())) {
                    statement1.setInt(1, Integer.parseInt(splitedWords[0]));
                    statement1.setString(2,splitedWords[1]);
                    statement1.setString(3,splitedWords[2]);
                    statement1.setString(4,splitedWords[3]);
                    statement1.setString(5,splitedWords[4]);
                    statement1.setString(6, splitedWords[5]);
                    int rowsAffected = statement1.executeUpdate();
                    System.out.println("The rows affected are :: " + rowsAffected);
                }
            }
        }
    }

    private List<String> readFile() {
        try(BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Downloads/annual_enterprise.csv"))){
            String line = "";
            List<String> lines = new ArrayList<>();
            reader.readLine();
            while((line = reader.readLine()) != null){
                line = line.replaceAll("\"","");
                lines.add(line);
            }
            return lines;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
