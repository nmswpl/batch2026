package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CandidateRunner {
    public static void main(String[] args) {

        CandidateRunner candidateRunner = new CandidateRunner();
        List<Candidate> candidates = candidateRunner.readDataFromFile();
        candidateRunner.writeDataToFile(candidates);
    }
    private void writeDataToFile(List<Candidate> candidateList) {
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("/home/nms-training/Desktop/Output.txt");
            bufferedWriter = new BufferedWriter(fileWriter);

            for (int i = 0; i < candidateList.size(); i++) {
                bufferedWriter.write("------" + (i+1) + "------");
                bufferedWriter.write("\n");
                bufferedWriter.write("id : " + candidateList.get(i).getId());
                bufferedWriter.write("\n");
                bufferedWriter.write("name : " + candidateList.get(i).getName());
                bufferedWriter.write("\n");
                bufferedWriter.write("college : " + candidateList.get(i).getCollege());
                bufferedWriter.write("\n");
                bufferedWriter.write("department : " + candidateList.get(i).getDept());
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
            }

            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private List<Candidate> readDataFromFile() {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        List<Candidate> candidateList = new ArrayList<>();

        try {
            fileReader = new FileReader("/home/nms-training/Downloads/StudentDetails.txt");
            bufferedReader = new BufferedReader(fileReader);

            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(",");

                Candidate candidate = new Candidate(Integer.parseInt(words[1]), words[0], words[2], words[3]);
                candidateList.add(candidate);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        printCandidateList(candidateList);

        return candidateList;
    }

    private void printCandidateList(List<Candidate> candidateList) {
        System.out.println("Candidate list Size : " + candidateList.size());

        for (Candidate candidate : candidateList) {
            System.out.println("ID : " + candidate.getId());
            System.out.println("Name : " + candidate.getName());
            System.out.println("College : " + candidate.getCollege());
            System.out.println("Department : " + candidate.getDept());
            System.out.println();
        }
    }
}
