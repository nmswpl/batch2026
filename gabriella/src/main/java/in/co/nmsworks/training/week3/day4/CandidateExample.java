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
        CandidateExample candidateExample = new CandidateExample();
        List<Candidate> candidateList = candidateExample.getCandidateFromFile();
        System.out.println(candidateList);

        candidateExample.writeToDb(candidateList);
    }

    private void writeToDb(List<Candidate> candidateList) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             PreparedStatement preparedStatement = con.prepareStatement("insert into candidates values(?, ?, ?, ?)")){
            for (Candidate candidate : candidateList) {
                preparedStatement.setInt(1, candidate.getRollNo());
                preparedStatement.setString(2, candidate.getName());
                preparedStatement.setString(3, candidate.getCollege());
                preparedStatement.setString(4, candidate.getDept());
                preparedStatement.executeUpdate();
            }


        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private List<Candidate> getCandidateFromFile() {

        List<Candidate> candidateList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/StudentDetails.txt"));
            String line = "";
            while((line = bufferedReader.readLine()) != null){
                String[] splitLine = line.split(",");
                Candidate c = new Candidate();
                for (String s : splitLine) {

                    c.setName(splitLine[0]);
                    c.setRollNo(Integer.valueOf(splitLine[1]));
                    c.setCollege(splitLine[2]);
                    c.setDept(splitLine[3]);
                }
                candidateList.add(c);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return candidateList;
    }
}
