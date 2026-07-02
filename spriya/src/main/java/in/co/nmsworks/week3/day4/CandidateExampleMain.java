package in.co.nmsworks.week3.day4;

import java.util.List;


public class CandidateExampleMain {

    public static void main(String[] args) {
        CandidateExample candidateExample=new CandidateExample();
        List<List<String>> candidateList=candidateExample.getCandidateFile();

        candidateExample.writeToDb(candidateList);


    }
}
