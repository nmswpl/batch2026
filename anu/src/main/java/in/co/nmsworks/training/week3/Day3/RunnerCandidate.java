package in.co.nmsworks.training.week3.Day3;

import java.io.*;
import java.util.List;

public class RunnerCandidate {

    public static void main(String[] args) {
        RunnerCandidate candidate = new RunnerCandidate();
        candidate.bufferedReadercandidate();

    }


    public void bufferedReadercandidate() {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("/home/nms-training/Downloads/StudentDetails.txt"));
            String line = " ";
            while ((line = br.readLine()) != null) {
                String[] separate = line.split(",");
                if (separate.length >= 4) {
                    Candidate candidate = new Candidate();
                    candidate.setName(separate[0].trim());
                    int parsedId = Integer.parseInt(separate[1].trim());
                    candidate.setId(parsedId);
                    candidate.setCollege(separate[2].trim());
                    candidate.setDept(separate[3].trim());

                    System.out.println(candidate);
                }
                System.out.println();
                System.out.println();
            }
        }
        catch (NumberFormatException e){
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
