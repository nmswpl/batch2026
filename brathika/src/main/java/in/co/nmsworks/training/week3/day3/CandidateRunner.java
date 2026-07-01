package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CandidateRunner {
    public static void main(String[] args) {
        CandidateRunner candidateRunner = new CandidateRunner();
        candidateRunner.readAndPrintFile();
    }

    private void readAndPrintFile() {
        try {
            List<Candidate> candidateList = new ArrayList<>();
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/StudentDetails.txt"));
            String text = "";
            while ((text = bufferedReader.readLine()) != null) {
              //  System.out.println(text);
                String[] array = text.split(",");
                String name = array[0];
                Integer id = Integer.valueOf(array[1]);
                String college = array[2];
                String department = array[3];
                Candidate candidate = new Candidate(name,id,college,department);
                System.out.println("Name: "+candidate.getName());
                System.out.println("Id: "+candidate.getId());
                System.out.println("College Name: "+candidate.getCollege());
                System.out.println("Department: "+candidate.getDepartment());
                System.out.println("***********************************");
            }
            System.out.println(candidateList);
            bufferedReader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
