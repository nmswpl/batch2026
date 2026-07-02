package in.co.nmsworks.training.week3.day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CandidateRunner {
    public static void main(String[] args) {
        Candidate candidate = new Candidate();
        List<Candidate> candidateList = getCandidatesFromFile();
        writeToDB(candidateList);
    }

    private static void writeToDB(List<Candidate> listOfCandidate) {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
            PreparedStatement pstm = con.prepareStatement("insert into Candidate values(?,?,?,?)")){
            for (Candidate candidate : listOfCandidate) {
                pstm.setInt(1,candidate.getId());
                pstm.setString(2, candidate.getName());
                pstm.setString(3, candidate.getClgName());
                pstm.setString(4, candidate.getDept());
                pstm.executeUpdate();


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static List<Candidate> getCandidatesFromFile() {
        List<Candidate> listOfCandidates = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/StudentDetails.txt"));
            String line;
            while((line = bufferedReader.readLine())!=null){
                String[] candidateArray = line.split(",");
                String name =candidateArray[0].trim();
                int id = Integer.parseInt(candidateArray[1]);
                String clg = candidateArray[2];
                String dept = candidateArray[3];
                listOfCandidates.add(new Candidate(name,id,clg,dept));
                //listOfCandidates.add(new name,id,clg,dept);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listOfCandidates;
    }




}
