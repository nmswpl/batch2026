package in.co.nmsworks.training.week3.day4;

import in.co.nmsworks.training.week3.day3.Candidate;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class CandidateExample {
    public static void main(String[] args) {
        CandidateExample candidateExample=new CandidateExample();
        List<Candidate> candidateList=candidateExample.getCandidateFromFile("/home/nms-training/Downloads/StudentDetails.txt");
        System.out.println(candidateList);
        candidateExample.writeToDB(candidateList);
    }

    private void writeToDB(List<Candidate> candidateList) {
        try (Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             PreparedStatement ps= con.prepareStatement("INSERT INTO Candidate values(?,?,?,?)")){
            for (Candidate candidate : candidateList) {
                ps.setString(1,candidate.getName());
                ps.setInt(2,candidate.getRollNo());
                ps.setString(3,candidate.getCollege());
                ps.setString(4,candidate.getDept());
                ps.executeUpdate();
            }


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private List<Candidate> getCandidateFromFile(String path) {
        List<Candidate> candidateList=new ArrayList<>();
        BufferedReader bufferedReader=null;
        try {
            bufferedReader=new BufferedReader(new FileReader(path));
            String line="";
            String arr[]=new String[0];
            while((line=bufferedReader.readLine())!=null)
            {
                arr=line.split(",");
                candidateList.add(new Candidate(arr[0],Integer.parseInt(arr[1]),arr[2],arr[3]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return candidateList;
    }
}
