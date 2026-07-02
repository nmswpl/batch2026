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
        CandidateExample candidateExample = new CandidateExample();
        List<Candidate> candidateList = new ArrayList<>();
        candidateExample.getCandidateFromFile(candidateList);

        candidateExample.writeToDb(candidateList);
    }

    private void writeToDb(List<Candidate> candidateList) {
        try(Connection con= DriverManager.getConnection("jdbc:mysql://localHost:3306/training","nms-training","");
            PreparedStatement prep = con.prepareStatement("INSERT INTO candidateInfo VALUES (?,?,?,?)"))
        {
            for (Candidate s : candidateList) {
                prep.setString(1,s.getName());
                prep.setInt(2, s.getId());
                prep.setString(3,s.getCollege());
                prep.setString(4,s.getDept());
                int a= prep.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private List<Candidate> getCandidateFromFile(List<Candidate> candidateList) {

        try(BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/StudentDetails.txt")))
        {
            String line =" ";
            while((line = br.readLine()) !=  null){
                String[] data = line.split(",");

                Candidate candidate = new Candidate();
                candidate.setName(data[0]);
                candidate.setId(Integer.parseInt(data[1]));
                candidate.setCollege(data[2]);
                candidate.setDept(data[3]);

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
