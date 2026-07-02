package in.co.nmsworks.training.week3.day4;

import in.co.nmsworks.training.week3.day3.Candidate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CandidateExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/candidateDetails";
        String user = "nms-training";
        String password ="";

        CandidateExample runner = new CandidateExample();
        List<Candidate> candidateList = runner.getCandidateList();

        //runner.writeIntoDataBase(url,user,password,candidateList);

//        create table candidate(
//                name varchar(100),
//                id int primary key,
//                college varchar(100),
//                dept varchar(100)
//        );

        runner.printRows(url,user,password);

    }

    private void printRows(String url, String user, String password) {

        try(
                Connection connection = DriverManager.getConnection(url,user,password);
                Statement statement = connection.createStatement();
        )
        {
            String select = "select * from candidate";
            ResultSet resultSet = statement.executeQuery(select);

            while(resultSet.next()){
                System.out.println(resultSet.getString(1) +" "
                        + resultSet.getString(2)
                        +" " + resultSet.getString(3)
                        +" " + resultSet.getString(4)
                );
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private void writeIntoDataBase(String url, String user, String password, List<Candidate> candidateList) {

        try(
                Connection connection = DriverManager.getConnection(url,user,password);

                ) {

            int totalRows = 0;
            String insert = "insert into candidate values(?,?,?,?)";

            for(Candidate candidate : candidateList){
                PreparedStatement preparedStatement = connection.prepareStatement(insert);
                preparedStatement.setString(1,candidate.getName());
                preparedStatement.setInt(2,candidate.getId());
                preparedStatement.setString(3,candidate.getCollege());
                preparedStatement.setString(4,candidate.getDept());

                int row = preparedStatement.executeUpdate();

                totalRows = totalRows + row;
            }

            System.out.println("total rows : " + totalRows);
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private List<Candidate> getCandidateList() {
        List<Candidate> candidateList = new ArrayList<>();

        try(
                BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/StudentDetails.txt"));
        ){
            String line = "";

            while((line = bufferedReader.readLine())!= null){
                String[] elements = line.split(",");
                candidateList.add(new Candidate(elements[0], Integer.parseInt(elements[1]), elements[2], elements[3]));
            }
        }
         catch (IOException e) {
            throw new RuntimeException(e);
        }

        return candidateList;
    }
}
