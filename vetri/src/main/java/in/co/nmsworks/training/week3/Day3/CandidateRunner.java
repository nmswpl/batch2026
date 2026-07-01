package in.co.nmsworks.training.week3.Day3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CandidateRunner {
    public static void main(String[] args) throws IOException {
        CandidateRunner cr = new CandidateRunner();
        cr.getCandidates();
    }

    private void getCandidates() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/StudentDetails.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/studentWrite.txt"));
        String line = "";
        try {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                //System.out.println(line);
                String name = data[0];
                Integer id = Integer.parseInt(data[1]);
                String college = data[2];
                String department = data[3];
                Candidate cr = new Candidate(name, id, college, department);
                //System.out.println(cr);

                List<Candidate> candidateList = new ArrayList<>();
                candidateList.add(cr);

                for (Candidate candidate : candidateList) {
                    bw.write("Name:" + candidate.getName());
                    bw.write("\t");
                    bw.write("ID:" + candidate.getId());
                    bw.write("\t");
                    bw.write("College: " + candidate.getCollege());
                    bw.write("\t");
                    bw.write("Department:" + candidate.getDepartment());
                    bw.write("\n");
                }
                candidateList.size();


            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            bw.close();
            br.close();
        }
    }
}
