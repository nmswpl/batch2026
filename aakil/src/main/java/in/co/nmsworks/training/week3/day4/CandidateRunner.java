package in.co.nmsworks.training.week3.day4;

import in.co.nmsworks.training.week3.day3.Candidate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CandidateRunner {
    public static void main(String[] args) {
        CandidateRunner runner = new CandidateRunner();
        List<Candidate> candidates = runner.readCandidates();

        runner.insertCandidatesToDatabase(candidates);
    }

    private void insertCandidatesToDatabase(List<Candidate> candidates) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             PreparedStatement ps = con.prepareStatement("insert into candidates values (?, ?, ?, ?)")){
            for (Candidate candidate : candidates) {
                ps.setInt(1, candidate.getRollNo());
                ps.setString(2, candidate.getName());
                ps.setString(3, candidate.getCollegeName());
                ps.setString(4, candidate.getDepartment());

                int rowsAffected = ps.executeUpdate();

                if(rowsAffected != 1){
                    System.out.println("COULDN'T INSERT CANDIDATE INFO : " + candidate);
                }else
                    System.out.println("INSERT CANDIDATE INFO SUCCESS : " + candidate);
            }
        } catch (SQLException e) {
            System.err.println("ERROR : " + e.getMessage());;
        }
    }

    private List<Candidate> readCandidates() {
        List<Candidate> candidates = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Desktop/Data/StudentDetails.txt"))
        ) {
            String line;
            while ((line = reader.readLine()) != null){
                Candidate candidate = new Candidate();
                String[] details = line.split(",");
                candidate.setName(details[0]);
                candidate.setRollNo(Integer.valueOf(details[1]));
                candidate.setCollegeName(details[2]);
                candidate.setDepartment(details[3]);

                candidates.add(candidate);
            }
        } catch (IOException e) {
            System.err.println("ERROR: " + e.getMessage());
        }
        return candidates;
    }
}