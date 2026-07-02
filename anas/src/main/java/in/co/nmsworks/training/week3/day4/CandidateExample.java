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
import java.util.List;

public class CandidateExample {
    public static void main(String[] args) {
        CandidateExample cd = new CandidateExample();
        List<Candidate> candidateList = cd.readFile();
        cd.writeInsideDB(candidateList);
    }

    private void writeInsideDB(List<Candidate> candidateList) {
        String url = "jdbc:mysql://localhost:3306/training";
        try(Connection con = DriverManager.getConnection(url,"nms-training","");
            PreparedStatement ps = con.prepareStatement("insert into candidate values(?,?,?,?)")){

            for (Candidate candidate : candidateList) {
                String name = candidate.getName();
                int id = candidate.getId();
                String clg = candidate.getCollege();
                String dept = candidate.getDept();

                ps.setString(1, name);
                ps.setInt(2, id);
                ps.setString(3, clg);
                ps.setString(4, dept);
                ps.executeUpdate();
            }



        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private List<Candidate> readFile() {


        List<Candidate> candidateList = null;
        try {

            FileReader fr = new FileReader("/home/nms-training/Downloads/StudentDetails.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            candidateList = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                String[] words = line.split(",");
                Candidate candidate = new Candidate(words[0], Integer.parseInt(words[1]), words[2], words[3]);
                candidateList.add(candidate);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return candidateList;
    }
}
