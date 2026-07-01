package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CandidateRunner {
    public static void main(String[] args) {
        CandidateRunner candidate = new CandidateRunner();
        candidate.readCandidateFile();

    }

    private void readCandidateFile() {
        BufferedReader bufferedReader = null;
        List<Candidate> candidateList = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/StudentDetails.txt"));
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
//                System.out.println(line);
                String[] candidates = line.split(",");
                for (int i = 0; i < candidates.length; i++) {
                    Candidate candidate = new Candidate(candidates[0],Integer.parseInt(candidates[1]),candidates[2],candidates[3]);
                    candidateList.add(candidate);
                }

            }
            for (Candidate candidate : candidateList) {
                System.out.println("Name : " + candidate.getName());
                System.out.println("Id : " + candidate.getId());
                System.out.println("College : " + candidate.getCollege());
                System.out.println("Dept : "+ candidate.getDept());
                System.out.println("*******************************************************************");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
