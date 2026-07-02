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
        CandidateExample candidate = new CandidateExample();
        List<Candidate> list = candidate.getCandidateList();
        System.out.println(list);
        candidate.writeToDatabase(list);
    }

    private void writeToDatabase(List<Candidate> list) {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
        PreparedStatement statement = con.prepareStatement("insert  into candidate values (?,?,?,?) ")){
            for (Candidate candidate : list) {
                statement.setString(1,candidate.getName());
                statement.setInt(2,candidate.getId());
                statement.setString(3,candidate.getUniversity());
                statement.setString(4,candidate.getDept());
                int i = statement.executeUpdate();
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    List<Candidate> getCandidateList() {
        List<Candidate> candidateList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Downloads/StudentDetails.txt"))) {
            String text = "";
            while((text = reader.readLine()) != null) {
                String[] words = text.split(",");
                    Candidate c = new Candidate(words[0], Integer.parseInt(words[1]), words[2], words[3]);
                    candidateList.add(c);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return candidateList;
    }
}
