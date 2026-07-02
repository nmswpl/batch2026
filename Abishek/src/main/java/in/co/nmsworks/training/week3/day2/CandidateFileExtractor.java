package in.co.nmsworks.training.week3.day2;

import java.util.*;
import java.io.*;

public class CandidateFileExtractor {

    public static void main(String[] args) {
        getValueFromFile();
    }

    private static void getValueFromFile() {

        List<Candidate> ls = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/StudentDetails.txt"));
            String line ="";
            while ((line = br.readLine()) != null)
            {
                  String[] split = line.split(",");
                  int count = 0;
                  Candidate c = new Candidate();
                  for(String data: split)
                  {
                        if(count == 0)
                        {
                            c.setName(data);
                        }

                        if(count == 1)
                        {
                            int s = Integer.parseInt(data);
                            c.setId(s);
                        }
                        if(count == 2)
                        {
                            c.setCollege(data);
                        }
                        if(count == 3)
                        {
                            c.setDept(data);
                        }
                        count++;
                  }
                  ls.add(c);
            }
            for (int i=0; i < ls.size(); i++)
            {
                System.out.println(i+1);
                System.out.println(ls.get(i));
                System.out.println("---------------------");
            }
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
