package in.co.nmsworks.training.week3.Day4;

import in.co.nmsworks.training.week3.Day3.Candidate;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CandidateDB {
    public static void main(String[] args) throws IOException, SQLException {
        CandidateDB cd=new CandidateDB();
        List<Candidate> candidateFromFile = cd.getCandidateFromFile();
        cd.writeIntoTheDb(candidateFromFile);
        System.out.println(candidateFromFile);
    }

    private void writeIntoTheDb(List<Candidate> candidates) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/TRAINING";
        String userName = "nms-training";
        String passWord = "";

        String query="INSERT INTO CANDIDATE VALUES(?,?,?,?)";

        try(Connection conn = DriverManager.getConnection(url, userName, passWord);
            PreparedStatement statement = conn.prepareStatement(query)){

            for (int i = 0; i < candidates.size(); i++) {
                Candidate candidate = candidates.get(i);
                //System.out.println(candidate);
                Integer id = candidate.getId();
                String name = candidate.getName();
                String college = candidate.getCollege();
                String department = candidate.getDepartment();

                statement.setInt(1,id);
                statement.setString(2,name);
                statement.setString(3,college);
                statement.setString(4,department);

                statement.executeUpdate();

                //System.out.println();
            }


        }

    }

    private List<Candidate> getCandidateFromFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/StudentDetails.txt"));

        List<Candidate> candidates=new ArrayList<>();
        String line = "";
        try {
            while((line=br.readLine())!=null){
                String[] data = line.split(",");
                String name = data[0];
                Integer id = Integer.valueOf(data[1]);
                String collegeName = data[2];
                String department = data[3];


                Candidate c=new Candidate(name,id,collegeName,department);
                candidates.add(c);

            }
            br.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return candidates;
    }
}
