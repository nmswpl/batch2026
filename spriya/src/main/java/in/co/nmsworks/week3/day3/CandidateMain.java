package in.co.nmsworks.week3.day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CandidateMain {
    public static void main(String[] args) {

        readFile();

    }


    private static void readFile() {

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/StudentDetails.txt"));
            String line = " ";


            while ((line = bufferedReader.readLine()) != null) {
                List<List<String>> candidateList = new ArrayList<>();

                List<String> list = new ArrayList<>();
                String[] arr;
                arr = line.split(",");

                for (String s : arr) {
                    list.add(s);
                }

                candidateList.add(list);

                printList(candidateList);

            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void printList(List<List<String>> finalList) {

        for (int i = 0; i < finalList.size(); i++) {
            Candidate candidate = new Candidate(finalList.get(i).get(i), Integer.valueOf(finalList.get(i).get(i + 1)), finalList.get(i).get(i + 2), finalList.get(i).get(i + 3));
            System.out.println(candidate.getId());
            System.out.println(candidate.getName());
            System.out.println(candidate.getCollegeName());
            System.out.println(candidate.getDept());
            System.out.println();
        }
    }

}
