package in.co.nmsworks.training.week3.day3;

import java.util.List;

public class CandidateRunner {
    public static void main(String[] args) {

        CandidateDetailsParser candidateParser = new CandidateDetailsParser();
        List<String> candidateList = candidateParser.collectDetails("/home/nms-training/Downloads/StudentDetails.txt");
        System.out.println("List of Candidates : ");
        System.out.println(candidateList);
        System.out.println("len : " + candidateList.size());

        CandidateDetailsParser.printDetails(candidateList);

    }
}
