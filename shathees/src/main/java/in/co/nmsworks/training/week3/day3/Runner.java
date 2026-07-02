package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Runner{

    public static void main(String[] args)  {
        List<Candidate> candidates=getDetails();
        for (Candidate candidate : candidates) {
            System.out.println(" name= "+candidate.getName()+" Id = "+candidate.getId()+" college = "+candidate.getCollege()+" dept = "+candidate.getDept());

        }
        System.out.println("total no of candidates :"+candidates.size());

    }

    private static List<Candidate> getDetails() {
        List<Candidate> list = new ArrayList<>();
        BufferedReader  bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/StudentDetails.txt"));
            String line = "";
            while((line = bufferedReader.readLine())!= null) {
                String[] arr = line.split(",");
                for (int i = 0; i < arr.length; i++) {
                    list.add(new Candidate(arr[0],Integer.parseInt(arr[1]),arr[2],arr[3]));
                    break;

                }

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedReader.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
        return list;
    }
}
