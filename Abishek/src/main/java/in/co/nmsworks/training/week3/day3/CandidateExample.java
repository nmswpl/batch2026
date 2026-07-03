package in.co.nmsworks.training.week3.day3;

import in.co.nmsworks.training.week3.day2.Candidate;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class CandidateExample {

    public static void main(String[] args) {
        List<Candidate> candidates = new ArrayList<>();
        candidates = getCandidateFromFile();
        System.out.println(candidates.size());
        System.out.println(candidates.get(4));
        writeToDb(candidates);
    }

    private static void writeToDb(List<Candidate> candidates) {

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/candidates","nms-training",""); PreparedStatement ps = con.prepareStatement("INSERT INTO candidate values (?,?,?,?)"))
        {

            for (Candidate c : candidates) {

                ps.setInt(1,c.getId());
                ps.setString(2,c.getName());
                ps.setString(3, c.getDept());
                ps.setString(4,c.getCollege());
                ps.executeUpdate();
            }
        }
        catch (Exception e) {
           e.printStackTrace();
        }
    }

    private static List<Candidate> getCandidateFromFile() {

        List<Candidate> candidate = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/StudentDetails.txt"));
            String line="";
            while((line = br.readLine()) != null)
            {
                  String split[] = line.split(",");
                  int count = 0;
                  Candidate c = new Candidate();
                for (String s : split) {

                    if(count == 0)
                    {
                        c.setName(s);
                    }
                    if (count == 1)
                    {
                        c.setId(Integer.parseInt(s));
                    }
                    if (count == 2)
                    {
                        c.setCollege(s);
                    }
                    if (count == 3)
                    {
                        c.setDept(s);
                    }

                    count++;
                }
                candidate.add(c);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return candidate;
    }
}
