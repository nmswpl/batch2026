package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CandidateRunner {
    public static void main(String[] args) throws IOException {

        CandidateRunner candidate = new CandidateRunner();
        candidate.readFile();
    }
    public void readFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/StudentDetails.txt"));


        String line = "";
        BufferedWriter bw = new BufferedWriter(new FileWriter("/home/nms-training/Downloads/StudentDetailsOutput.txt)"));
        String[] arrayList = {};
        List<Candidate> candidates = new ArrayList<>();
        while ((line = br.readLine()) != null){
//            System.out.println(line);
            arrayList = line.split(",");
            String name = "";
            Integer id = null;
            String college = "";
            String dept = "";
            for (int i = 0; i < arrayList.length; i++){
                name = arrayList[0];
                id = Integer.valueOf(arrayList[1]);
                college= arrayList[2];
                dept= arrayList[3];
            }
            Candidate cd = new Candidate(name, id, college, dept);
            candidates.add(cd);
//            System.out.println(cd);


        }

        System.out.println("List size :" + candidates.size());

        for (Candidate can : candidates){
            System.out.print("Name : " + can.getName());
            System.out.print(" ID : " + can.getId());
            System.out.print(" Dept : " + can.getDept());
            System.out.print(" College name : " + can.getCollegeName());
            System.out.println("\n################");
        }
    }
}
