package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CandidateRunner {
    public static void main(String[] args) {
        CandidateRunner candidateRunner=new CandidateRunner();
        candidateRunner.readFile();
    }

    private void readFile() {
        BufferedReader bufferedReader=null;
        try {
            bufferedReader=new BufferedReader(new FileReader("/home/nms-training/Downloads/StudentDetails.txt"));
            bufferedReader.readLine();
            String stu="";
            List<Candidate> students= new ArrayList<>();
            while((stu=bufferedReader.readLine())!=null) {
                String arr[]=stu.split(",");
                students.add(new Candidate(arr[0],Integer.parseInt(arr[1]),arr[2],arr[3]));
            }
            for (Candidate student : students) {
                System.out.println("ID : "+student.getName());
                System.out.println("Roll No : "+student.getRollNo());
                System.out.println("College: "+student.getCollege());
                System.out.println("Dept : "+student.getDept());
                System.out.println("==============================");

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
