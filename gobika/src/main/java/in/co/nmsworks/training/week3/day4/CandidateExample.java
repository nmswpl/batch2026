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
        List<Candidate> candidateList = candidateExample.getCandidateFromFile();
        candidateExample.writeToDb(candidateList);

    }

    private void writeToDb(List<Candidate> candidateList) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
             PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO candidate values (?, ?, ?, ?)");) {
            for (int i = 0; i < candidateList.size(); i++) {
                preparedStatement.setString(1, String.valueOf(candidateList.get(i).getName()));
                preparedStatement.setInt(2, candidateList.get(i).getId());
                preparedStatement.setString(3, String.valueOf(candidateList.get(i).getCollege()));
                preparedStatement.setString(4, String.valueOf(candidateList.get(i).getDept()));
                preparedStatement.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private List<Candidate> getCandidateFromFile() {
        BufferedReader bufferedReader = null;
        List<Candidate> candidateList = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/StudentDetails.txt"));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] candidate = line.split(",");
                Candidate candidate1 = null;
                for (String s : candidate) {
                    candidate1 = new Candidate(candidate[0], Integer.parseInt(candidate[1]), candidate[2], candidate[3]);
                }
                candidateList.add(candidate1);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (Candidate candidate : candidateList) {
            System.out.println(candidate);
        }
        return candidateList;
    }
}
