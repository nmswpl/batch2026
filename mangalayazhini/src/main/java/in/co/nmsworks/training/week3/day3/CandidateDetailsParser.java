package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CandidateDetailsParser {


    public static void printDetails(List<String> candidateList) {
        List<Candidate> candidateObjArr = new ArrayList<>();
        for (String candidate : candidateList) {
            String[] candidateCompleteInfo = candidate.split(",");
            candidateObjArr.add(new Candidate(candidateCompleteInfo[0] , Integer.parseInt(candidateCompleteInfo[1]), candidateCompleteInfo[2], candidateCompleteInfo[3]));
        }
        System.out.println("candidateObjArr : " + candidateObjArr.size());

        System.out.println("Candiate Details : ");
        for (Candidate candidate : candidateObjArr) {
            System.out.println("Name : "+ candidate.getName());
            System.out.println("ID : "+ candidate.getId());
            System.out.println("College Name : "+ candidate.getCollege());
            System.out.println("Department : "+ candidate.getDept());
            System.out.println();
        }


    }


    public List<String> collectDetails(String filePath) {
        BufferedReader readerObj = null;
        String candidateDetail;
        List<String> candidateDetailsList = new ArrayList<>();
        try {
            readerObj = new BufferedReader(new FileReader(filePath));
            while ((candidateDetail = readerObj.readLine()) != null) {
                candidateDetailsList.add(candidateDetail);
                System.out.println("details : " + candidateDetail);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (readerObj != null) {
                try {
                    readerObj.close();
                } catch (Exception e) {

                }
            }
        }
        return candidateDetailsList;

    }
}

