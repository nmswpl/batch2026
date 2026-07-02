package in.co.nmsworks.training.week3.day4;

import in.co.nmsworks.training.week3.day3.Candidate;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CandidateRWExample {
    public static void main(String[] args) throws Exception {
        CandidateRWExample c = new CandidateRWExample();
        List<Candidate> l = c.readFromFile();
        c.writeToDB(l);


    }

    private void writeToDB(List<Candidate> list) throws SQLException {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training","");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into Candidate values(?,?,?,?)")){
            ResultSet resultSet = preparedStatement.executeQuery("Select * from Candidate");
           for (Candidate c : list){
               preparedStatement.setString(1,c.getName());
               preparedStatement.setInt(2,c.getId());
               preparedStatement.setString(3,c.getCollegeName());
               preparedStatement.setString(4,c.getDept());

           }

           if (resultSet.next()) {
               System.out.println(resultSet.getString("NAME"));
           }
    }
    }


    private List<Candidate> readFromFile() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/StudentDetails.txt"));

        String line = "";
        String[] arrayList = {};
        List<Candidate> candidates = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            //System.out.println(line);
            arrayList = line.split(",");
            String name = "";
            Integer id = null;
            String college = "";
            String dept = "";
            for (int i = 0; i < arrayList.length; i++) {
                name = arrayList[0];
                id = Integer.valueOf(arrayList[1]);
                college = arrayList[2];
                dept = arrayList[3];
            }
            Candidate cd = new Candidate(name, id, college, dept);
            candidates.add(cd);

        }System.out.println(candidates);
        return candidates;

    }
}
