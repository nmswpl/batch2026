package in.co.nmsworks.training.week3.day4;

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

public class CandidateExample {
    public static void main(String[] args) {
        CandidateExample candidateExample = new CandidateExample();
        List<String> candidateList = candidateExample.readCandidateFromFile();
        candidateExample.writeToDataBase(candidateList);

    }

    private void writeToDataBase(List<String> candidateList) {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
            PreparedStatement statement = con.prepareStatement("insert into Candidate values(?,?,?,?)")) {
            for (String s : candidateList) {
                String[] array = s.split(",");
                statement.setString(1,array[0]);
                statement.setString(2,array[1]);
                statement.setString(3,array[2]);
                statement.setString(4,array[3]);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private List<String> readCandidateFromFile() {
        List<String> candidateList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Downloads/StudentDetails.txt"))) {
            String text = "";
            while ((text = reader.readLine()) != null) {
                candidateList.add(text);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return candidateList;
    }
}
