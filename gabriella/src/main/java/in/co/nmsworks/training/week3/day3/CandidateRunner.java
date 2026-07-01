package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CandidateRunner {
    public static void main(String[] args) {
        CandidateRunner cr = new CandidateRunner();
        List<Candidate> candidates = cr.readFile();
        System.out.println(candidates.size());
        cr.printCandidates(candidates);

    }

    private void printCandidates(List<Candidate> candidates) {
        for (Candidate candidate : candidates) {
            System.out.print("Name: " + candidate.getName() + ", ");
            System.out.print("Roll No: " + candidate.getRollNo() + ", ");
            System.out.print("College: " + candidate.getCollege() + ", ");
            System.out.print("Department: " + candidate.getDept());
            System.out.println();
        }
    }

    private List<Candidate> readFile() {
        BufferedReader bufferedReader = null;
        String text = "";
        List<Candidate> candidateList = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/StudentDetails.txt"));
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                String[] splitLine = line.split(",");

                Candidate c = new Candidate(splitLine[0], Integer.valueOf(splitLine[1]), splitLine[2], splitLine[3]);
                candidateList.add(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return candidateList;

    }


}
