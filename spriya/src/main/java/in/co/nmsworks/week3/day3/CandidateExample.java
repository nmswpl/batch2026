package in.co.nmsworks.week3.day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CandidateExample {

    public List<List <String>> getCandidateFile() {
        List<List<String>> list = new ArrayList<>();
        try {
            try (BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Downloads/StudentDetails.txt"));) {

                String line = " ";


                while ((line = reader.readLine()) != null) {
                    String[] res = line.split(",");
                    List<String> main = new ArrayList<>();

                    for (int i = 0; i < res.length; i++) {
                        main.add(res[i]);
                    }

                    list.add(main);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void writeToDb(List<List<String>> candidateList){

        try {
            try(Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/candidate","nms-training","");
                PreparedStatement statement=con.prepareStatement("insert into candidateList values(?,?,?,?);")){

                for (int i = 0; i < candidateList.size(); i++) {
                    String name=candidateList.get(i).get(0);
                    String id=candidateList.get(i).get(1);
                    String collegeName=candidateList.get(i).get(2);
                    String dept=candidateList.get(i).get(3);

                    statement.setString(1,name);
                    statement.setString(2,id);
                    statement.setString(3,collegeName);
                    statement.setString(4,dept);
                    statement.executeUpdate();
                }


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
