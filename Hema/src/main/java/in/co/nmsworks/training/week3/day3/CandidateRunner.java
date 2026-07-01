package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CandidateRunner {



    public static void main(String[] args) throws IOException {

        readFile();
    }

    public static void readFile() throws IOException {

        List<Candidate> candidateList = new ArrayList<>();

        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader( new FileReader("/home/nms-training/Downloads/StudentDetails.txt"));

            String line = "";

            while( (line = bufferedReader.readLine())!= null )
            {
//                System.out.println(line);

                String[] columns = line.split(",");
//
//                for (int i = 0; i < columns.length; i++) {
//                    System.out.println(i+" - "+columns[i]);
//                }
//                System.out.println();

                candidateList.add(new Candidate(columns[0],Integer.parseInt(columns[1]), columns[2], columns[3]));

//                for (String column : columns) {
//
//                    Candidate c = new Candidate(column[0], column[1], column[2], column[3]);
//
//                }
            }


            for (Candidate candidate : candidateList) {
                System.out.println("Name = "+ candidate.getName());
                System.out.println("Roll No = "+candidate.getRollNo());
                System.out.println("College Name = "+candidate.getCollegeName());
                System.out.println("Department = "+candidate.getDept());
                System.out.println();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if( bufferedReader != null)
            {
                bufferedReader.close();
            }
        }
    }
}
