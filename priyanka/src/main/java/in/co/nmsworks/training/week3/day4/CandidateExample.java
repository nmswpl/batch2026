package in.co.nmsworks.training.week3.day4;

import in.co.nmsworks.training.week3.day3.Candidate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CandidateExample {
    public static void main(String[] args) {
        CandidateExample candidateExample = new CandidateExample();
        List<Candidate> candidates = candidateExample.getCandidate();
        candidateExample.writeToDatabase(candidates);
    }



    private void writeToDatabase(List<Candidate> candidates) {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
            PreparedStatement preparedStatement = con.prepareStatement("insert into candidate values(?,?,?,?)");
            ){
            for (Candidate candidate : candidates) {
                preparedStatement.setString(1,candidate.getName());
                preparedStatement.setInt(2,candidate.getRollNo());
                preparedStatement.setString(3,candidate.getClgName());
                preparedStatement.setString(4,candidate.getDept());
                preparedStatement.executeUpdate();
            }

//            ResultSet resultSet = ps.executeQuery();
//            while (resultSet.next()){
//                System.out.println("name: "+ resultSet.getString("name"));
//                System.out.println("id: "+ resultSet.getInt("id"));
//                System.out.println("clgName: "+ resultSet.getString("clgName"));
//                System.out.println("dept: "+ resultSet.getString("dept"));
//            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private List<Candidate> getCandidate() {
        try (BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Desktop/StudentDetails.txt"));
        ){
            String line = "";
            List<Candidate> candidates = new ArrayList<>();
            while ((line = reader.readLine())!= null){
                String[] candidateArray = line.split(",");
                Candidate candidate  =  new Candidate(candidateArray[0],Integer.parseInt(candidateArray[1]),candidateArray[2],candidateArray[3] );
                candidates.add(candidate);
            }
//            for (Candidate candidate : candidates) {
//                System.out.println(candidate);
//            }
            return candidates;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
