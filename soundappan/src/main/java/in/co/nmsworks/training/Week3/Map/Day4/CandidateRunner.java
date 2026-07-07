package in.co.nmsworks.training.Week3.Map.Day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CandidateRunner {
    public static void main(String[] args) {
        CandidateRunner cr = new CandidateRunner();
        List<Candidate> candidates = cr.readCandidate();
        cr.writeCandidateFile(candidates);
        cr.readCandidateFile(candidates);

    }

    private void readCandidateFile(List<Candidate> candidates) {
        System.out.println(candidates);
    }

    private void writeCandidateFile(List<Candidate> candidates) {
        String url = "JDBC:mysql://localhost:3306/training";
        String user = "nms-training";
        String password = "";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement ps = connection.prepareStatement("INSERT INTO candidates (rollNo, name, college, department) VALUES (?, ?, ?, ?)")) {
            for (Candidate c : candidates) {
                ps.setInt(1, c.getRollNo());
                ps.setString(2, c.getName());
                ps.setString(3, c.getCollege());
                ps.setString(4, c.getDepartment());

                ps.executeUpdate();
            }
            System.out.println("Table Updated");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private List<Candidate> readCandidate() {
        List<Candidate> list = new ArrayList<>();
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("/home/nms-training/Downloads/StudentDetails.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] split = line.split(",");
                int rollNo = Integer.parseInt(split[0]);
                String name = split[1];
                String college = split[2];
                String department = split[3];

                list.add(new Candidate(rollNo,name,college, department));
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Exception Found");
        }
        return list;
    }
}







