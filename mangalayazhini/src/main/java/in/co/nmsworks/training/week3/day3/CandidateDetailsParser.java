package in.co.nmsworks.training.week3.day3;

import javax.crypto.spec.PSource;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CandidateDetailsParser {


    public static void printDetails(List<String> candidateList) {
        List<Candiate> candiateObjArr = new ArrayList<>();
        for (String candidate : candidateList) {
            String[] candidateCompleteInfo = candidate.split(",");
            candiateObjArr.add(new Candiate(candidateCompleteInfo[0] , Integer.parseInt(candidateCompleteInfo[1]), candidateCompleteInfo[2], candidateCompleteInfo[3]));
        }
        System.out.println("candiateObjArr : " + candiateObjArr.size());

        System.out.println("Candiate Details : ");
        for (Candiate candiate : candiateObjArr) {
            System.out.println("Name : "+ candiate.getName());
            System.out.println("ID : "+ candiate.getId());
            System.out.println("College Name : "+ candiate.getCollege());
            System.out.println("Department : "+ candiate.getDept());
            System.out.println();
        }


    }


    public List<String> collectDetails(String filePath) {
        BufferedReader readerObj = null;
        String candiateDetail;
        List<String> candidateDetailsList = new ArrayList<>();
        try {
            readerObj = new BufferedReader(new FileReader(filePath));
            while ((candiateDetail = readerObj.readLine()) != null) {
                candidateDetailsList.add(candiateDetail);
                System.out.println("details : " + candiateDetail);
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

