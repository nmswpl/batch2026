package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CandidateRunner {
    public static void main(String[] args) {
        CandidateRunner cr = new CandidateRunner();
        cr.readData();

    }
    private void readData(){
        FileReader fr = null;

        try {
            fr = new FileReader("/home/nms-training/Downloads/StudentDetails.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(fr);
        List<Candidate> candidateList = new ArrayList<>();

        String line = "";
        while (true){
            try {
                if (!((line = br.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            String[] str = line.split(",");
            Candidate candidate = new Candidate(str[0],Integer.parseInt(str[1]),str[2],str[3]);

            candidateList.add(candidate);
        }

        printCandidateList(candidateList);
    }

    private void printCandidateList(List<Candidate> candidateList) {
        for (Candidate candidate : candidateList) {
            System.out.println("id : " + candidate.getId());
            System.out.println("name: " + candidate.getName());
            System.out.println("college : " + candidate.getCollege());
            System.out.println("dept : " + candidate.getDept());
            System.out.println("------------------------");
        }
    }
}
