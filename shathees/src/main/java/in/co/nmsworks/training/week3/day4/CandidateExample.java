package in.co.nmsworks.training.week3.day4;

import in.co.nmsworks.training.week3.day3.Candidate;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CandidateExample {
    public static void main(String[] args) {
        CandidateExample candidateExample = new CandidateExample();
        List<Candidate> list = candidateExample.getCandidateFromFile();
        candidateExample.writeToDb(list);

    }

    private void writeToDb(List<Candidate> list) {
        String sql = "insert into Candidate(id,name,college,dept) values( ?, ?,?,?)";

        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training",""); PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            for (Candidate c : list){
                preparedStatement.setInt(1,c.getId());
                preparedStatement.setString(2,c.getName());
                preparedStatement.setString(3,c.getCollege());
                preparedStatement.setString(4,c.getDept());
                int val = preparedStatement.executeUpdate();


            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private List<Candidate> getCandidateFromFile() {
        List<Candidate> list = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/StudentDetails.txt"));
            String line = "";
            while((line = bufferedReader.readLine())!= null) {
                String[] arr = line.split(",");
                list.add(new Candidate(
                        arr[1],
                        Integer.parseInt(arr[0]),
                        arr[2],
                        arr[3]
                ));

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedReader.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
        return list;
    }
    }

