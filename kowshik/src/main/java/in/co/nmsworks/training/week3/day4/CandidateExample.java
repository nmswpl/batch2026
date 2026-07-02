package in.co.nmsworks.training.week3.day4;

import in.co.nmsworks.training.week3.day3.Candidate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class CandidateExample {
    public static void main(String[] args) {
       CandidateExample candidateExample = new CandidateExample();

        List<Candidate> candidates = candidateExample.readDataFromFile();
        candidateExample.writeDataIntoDB(candidates);
    }

    private void writeDataIntoDB(List<Candidate> candidates) {
        String url = "jdbc:mysql://localhost:3306/training";

        try (Connection connection = DriverManager.getConnection(url, "nms-training", "");
             PreparedStatement ps = connection.prepareStatement("insert into candidate values (?,?,?,?)");) {

            for (Candidate candidate : candidates) {
                ps.setInt(1, candidate.getId());
                ps.setString(2, candidate.getName());
                ps.setString(3, candidate.getCollege());
                ps.setString(4, candidate.getDept());

                ps.executeUpdate();
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }


    private List<Candidate> readDataFromFile() {

        List<Candidate> candidateList = new ArrayList<>();

        try (FileReader fileReader = new FileReader("/home/nms-training/Downloads/StudentDetails.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line = "";

            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");

                candidateList.add(new Candidate(Integer.parseInt(data[1]), data[0], data[2], data[3]));
            }

            for (Candidate candidate : candidateList) {
                System.out.println(candidate);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return candidateList;
    }
}
