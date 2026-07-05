package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CandidateRunner {
    public static void main(String[] args) {
        Candidate candidate = new Candidate();
        CandidateRunner.readFile();
        List<String> candidateList = CandidateRunner.readFile();
        System.out.println("List of Students : ");
        System.out.println(candidateList);
        printDetails(candidateList);
    }

    private static void printDetails(List<String>  candidateList) {
        List<Candidate> canditateDetailPrint = new ArrayList<>();
        for (String candidate : candidateList) {
            String[] candidateSplit = candidate.split(",");
            canditateDetailPrint.add(new Candidate(candidateSplit[0], Integer.parseInt(candidateSplit[1]),candidateSplit[2],candidateSplit[3]));
        }
        System.out.println("Candidate Size : "+canditateDetailPrint.size());

        for (Candidate candidate : canditateDetailPrint) {
            System.out.println("Name : "+ candidate.getName());
            System.out.println("Student ID : "+ candidate.getId());
            System.out.println("Department : "+ candidate.getDept());
            System.out.println("College Name  : "+ candidate.getClgName());
            System.out.println(" ");

        }

    }

    private static List<String> readFile() {
        List<String> studentObjList = new ArrayList<>();
        String candidateDetails;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/StudentDetails.txt"));
            while((candidateDetails=bufferedReader.readLine())!=null){
                studentObjList.add(candidateDetails);
                System.out.println("Students list : "+ candidateDetails);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return studentObjList;
    }

}
