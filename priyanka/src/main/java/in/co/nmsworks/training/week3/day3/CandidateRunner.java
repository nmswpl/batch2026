package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CandidateRunner {
    public static void main(String[] args) {
        CandidateRunner candidate = new CandidateRunner();
        candidate.fileParsing();

    }
    private void printName(List<Candidate> list){
        for (Candidate candidate : list) {
            System.out.println("name: ");
            System.out.println(candidate);
        }

    }
    private void fileParsing() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("/home/nms-training/Desktop/StudentDetails.txt"));
            String line = "";
            List<Candidate> candidates = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
                String[] arrayList =  line.split(",");

                Candidate c = new Candidate();
                for (int i = 0; i < arrayList.length; i++) {
                    c.setName(arrayList[0]);
                    c.setRollNo(Integer.parseInt(arrayList[1]));
                    c.setClgName(arrayList[3]);
                    c.setDept(arrayList[3]);


                }
                candidates.add(c);


            }
            System.out.println("Size: " + candidates.size());
            for (Candidate candidate : candidates) {
                System.out.println("Name: "+candidate.getName());
                System.out.println("Rollno: "+candidate.getRollNo());
                System.out.println("ClgName: "+candidate.getClgName());
                System.out.println("Dept: "+candidate.getDept());
                System.out.println("-------------------------");

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
