package in.co.nmsworks.training.week3.day5;

import java.util.List;

public class CricketScoreRunner {
    public static void main(String[] args) {
        ScoreFileReader reader = new ScoreFileReader();
        List<Cricketer> cricketerList = reader.scoreReader("/home/nms-training/Downloads/cricket_match_data.txt");

//        List<Cricketer> teamAlpha = reader.groupTeamMemebers(cricketerList,"Team Alpha");
//        List<Cricketer> teamOmega = reader.groupTeamMemebers(cricketerList,"Team Omega");


        Team myTeamAlpha = new Team(reader.groupTeamMemebers(cricketerList,"Team Alpha"));
        Team myTeamOmega = new Team(reader.groupTeamMemebers(cricketerList,"Team Omega"));

        myTeamOmega.printTeamMembers();
        myTeamAlpha.printTeamMembers();

        Integer alphaScore = myTeamAlpha.getTeamScore();
        Integer omegaScore = myTeamOmega.getTeamScore();

        if( alphaScore > omegaScore){
            Integer diffScore = alphaScore - omegaScore;
            System.out.println("Team Alpha wins by : " + diffScore);
        }
        else {
            Integer diffScore = omegaScore - alphaScore;
            System.out.println("Team Omega wins by : " + diffScore);
        }

//        System.out.println("\n\nAlpha");
//        for (Cricketer cricketer : teamAlpha) {
//            System.out.println(cricketer.getName() + " " + cricketer.getTeam() + " " + cricketer.getScorePoints() + " " + cricketer.getTotalScore());
//        }
//
//
//        System.out.println("\n\nOmega");
//        for (Cricketer cricketer : teamOmega) {
//            System.out.println(cricketer.getName() + " " + cricketer.getTeam() + " " + cricketer.getScorePoints() + " " + cricketer.getTotalScore());
//        }
    }
}
