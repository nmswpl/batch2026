package in.co.nmsworks.training.week3.day4;

import in.co.nmsworks.training.week3.day3.Candidate;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CandidateExample {
    public static void main(String[] args) {
        CandidateExample candidateExample = new CandidateExample();
        candidateExample.writeToDB(candidateExample.getCandidateFromFile());
    }

    private void writeToDB(List<Candidate> candidateList) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", ""))
        {
            for (int i = 0; i < candidateList.size(); i++) {
                PreparedStatement ps = con.prepareStatement("insert into candidate values(?, ?,?, ?)");
                ps.setString(1,candidateList.get(i).getName());
                ps.setInt(2,candidateList.get(i).getRollNo());
                ps.setString(3,candidateList.get(i).getCollege());
                ps.setString(4,candidateList.get(i).getDept());
                ps.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private List<Candidate> getCandidateFromFile() {
        List<Candidate> candidateList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/StudentDetails.txt"));){
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                String[] candidates = line.split(",");
                Candidate candidate = new Candidate(candidates[0], Integer.parseInt(candidates[1]), candidates[2], candidates[3]);
                candidateList.add(candidate);
            }
            System.out.println(candidateList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return candidateList;
    }
}
