package in.co.nmsworks.training.week3.day3;

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
        List<Candidate> candidateObjList = candidateExample.readFromFile("/home/nms-training/Downloads/StudentDetails.txt");
//        for (Candidate candidate : candidateObjList) {
//            System.out.println(candidate.getName() + ", "+ candidate.getId() +" , "+ candidate.getDept() + " , "+candidate.getCollege());
//        }

        candidateExample.writeCandidateIntoDB(candidateObjList);
    }

    private void writeCandidateIntoDB(List<Candidate> candidateObjList) {

        System.out.println("\nCandidate Object List : ");
        for (Candidate candidate : candidateObjList) {
            System.out.println(candidate.getName() + " "+ candidate.getId() +" "+ candidate.getDept() + " "+candidate.getCollege());
        }

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
            PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO candidates VALUES (?,?,?,?)")){


            for (Candidate candidate : candidateObjList) {
                preparedStatement.setInt(1,candidate.getId());
                preparedStatement.setString(2,candidate.getName());
                preparedStatement.setString(3,candidate.getDept());
                preparedStatement.setString(4,candidate.getCollege());
              preparedStatement.executeUpdate();
              //  System.out.println(preparedStatement.executeUpdate());
            }

        }
        catch(Exception e){
        e.printStackTrace();
        }
    }


    private List<Candidate> readFromFile(String path) {
        List<Candidate> candidateObjectList = new ArrayList<>();
        try(BufferedReader readerObj = new BufferedReader(new FileReader(path));){

            String candidateString;

            while((candidateString = readerObj.readLine()) != null){
//              System.out.println("candidate : " + candidateString);
                String[] candidateList = candidateString.split(",");
                candidateObjectList.add(new Candidate(candidateList[0],Integer.valueOf(candidateList[1]),candidateList[2],candidateList[3]));
            }

//            for (Candidate candidate : candidateObjectList) {
//                System.out.println(candidate.getName() + " "+ candidate.getId() +" "+ candidate.getDept() + " "+candidate.getCollege());
//            }

        }
        catch(Exception e){

        }

        return candidateObjectList;
    }
}
