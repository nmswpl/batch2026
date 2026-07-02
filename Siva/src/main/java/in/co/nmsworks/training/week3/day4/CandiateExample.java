package in.co.nmsworks.training.week3.day4;

import in.co.nmsworks.training.week3.day3.Candidate;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.*;

public class CandiateExample {
    public static void main(String[] args) {
        CandiateExample ce = new CandiateExample();
        Set<Candidate> candiateList = ce.getCandiatesFromFile("/home/nms-training/Downloads/StudentDetails.txt");
//        ce.writeTableToDB();
        for (Candidate candidate : candiateList) {
            System.out.println(candidate);
        }
        ce.writeDataToTable(candiateList);
    }

    private void writeTableToDB() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
             PreparedStatement ps = connection.prepareStatement("Create table candidate (id int primary key,name varchar(150), college varchar(150), dept varchar(150))");){
            ps.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void writeDataToTable(Set<Candidate> candiateList) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
             PreparedStatement ps = connection.prepareStatement("Insert into candidate values (?, ?, ?, ?)")){

            for (Candidate candidate : candiateList) {
                System.out.println("Candidate :: "+ candidate);
                ps.setInt(1,candidate.getId());
                ps.setString(2,candidate.getName());
                ps.setString(3,candidate.getDept());
                ps.setString(4,candidate.getDept());
                ps.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Set<Candidate> getCandiatesFromFile(String filePath) {
        Set<Candidate> candiateList = new HashSet<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String candiateInfo = "";
            List<Integer> idList = new ArrayList<>();
            while ((candiateInfo = reader.readLine()) != null) {
                String[] splitCandiateInfo = candiateInfo.split(",");
                if (idList.contains(Integer.parseInt(splitCandiateInfo[1]))) {
                    continue;
                }
                candiateList.add(new Candidate(Integer.parseInt(splitCandiateInfo[1]),splitCandiateInfo[0],splitCandiateInfo[2],splitCandiateInfo[3]));
                idList.add(Integer.parseInt(splitCandiateInfo[1]));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return candiateList;
    }
}
