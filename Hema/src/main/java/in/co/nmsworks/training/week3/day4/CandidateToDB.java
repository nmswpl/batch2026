package in.co.nmsworks.training.week3.day4;

import in.co.nmsworks.training.week3.day3.Candidate;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CandidateToDB {
    public static void main(String[] args) {

        List<Candidate> candidateList = getCandidateFromFile();

        printToDB(candidateList);

        readFromDB();

    }

    private static void readFromDB() {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from Candidate"))
        {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next())
            {
                System.out.println("Name = "+resultSet.getString("name"));
                System.out.println("Roll No = "+resultSet.getString("rollNo"));
                System.out.println("College Name = "+resultSet.getString("collegeName"));
                System.out.println("Department = "+resultSet.getString("dept"));
                System.out.println();
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void printToDB(List<Candidate> candidateList) {

        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into Candidate values (?,?,?,?)"))
        {

            for (Candidate candidate : candidateList) {
                preparedStatement.setString(1,candidate.getName());
                preparedStatement.setInt(2,candidate.getRollNo());
                preparedStatement.setString(3,candidate.getCollegeName());
                preparedStatement.setString(4,candidate.getDept());

                preparedStatement.addBatch();
            }

            preparedStatement.executeBatch();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static List<Candidate> getCandidateFromFile() {

        List<Candidate> candidateList = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/StudentDetails.txt")))
        {
            String line = "";
            while ( (line= bufferedReader.readLine()) != null)
            {
                String[] columns = line.split(",");
                candidateList.add(new Candidate(columns[0],Integer.parseInt(columns[1]), columns[2], columns[3]));

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return candidateList;
    }
}
