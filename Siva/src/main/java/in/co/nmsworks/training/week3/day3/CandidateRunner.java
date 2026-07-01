package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CandidateRunner {
    public static void main(String[] args) {
        CandidateRunner cr = new CandidateRunner();
        List<Candidate> candidates = cr.insertDataFromFile("/home/nms-training/Downloads/StudentDetails.txt");
        cr.printStudentInfo(candidates);
        cr.writeStudentInfo("/home/nms-training/Downloads/StudentInfo.txt",candidates);
    }

    private void writeStudentInfo(String filePath, List<Candidate> candidate) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filePath));
            writer.write("---------------------------------------------Candidate Information-------------------------------------------\n");
            writer.flush();
            for (int i = 0; i < candidate.size(); i++) {
                writer.write("****************************************** "+(i+1)+" ******************************************\n");
                writer.flush();
                writer.write("Id : "+candidate.get(i).getId()+"\nName : "+candidate.get(i).getName()+"\nCollege : "+candidate.get(i).getCollege()+"\nDepartment : "+candidate.get(i).getDept()+'\n');
                writer.flush();
                writer.write("---------------------------------------------------------------------------------------------------\n");
                writer.flush();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private void printStudentInfo(List<Candidate> candidates) {
        System.out.println("---------------------------------------------Candidate Information-------------------------------------------");
        for (Candidate candidate : candidates) {
            System.out.println("Id : "+candidate.getId()+"\nName : "+candidate.getName()+"\nCollege : "+candidate.getCollege()+"\nDepartment : "+candidate.getDept());
            System.out.println("************************************************************************************************************************");
        }
    }

    private List<Candidate> insertDataFromFile(String filePath) {
        List<Candidate> candidates = new ArrayList<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String eachStudent = "";
            while ((eachStudent = reader.readLine()) != null) {
                String[] studentInfo = eachStudent.split(",");
                candidates.add(new Candidate(Integer.parseInt(studentInfo[1]),studentInfo[0],studentInfo[2],studentInfo[3]));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return candidates;
    }
}
