package in.co.nmsworks.training.week3.day6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CricketScoreCardRunner {
    List<CricketScoreCard> playersList = new ArrayList<>();
    public static void main(String[] args) {
        CricketScoreCardRunner cricketScoreCardRunner = new CricketScoreCardRunner();
        cricketScoreCardRunner.readFromFile();
        cricketScoreCardRunner.printScoreCard();
    }

    private void printScoreCard() {
        Integer totalBallsA = 0;
        Integer totalRunsA = 0;
        Integer totalBallsB = 0;
        Integer totalRunsB = 0;
        System.out.println("******************************************************************");
        System.out.println("                        Team Alpha  ");
        System.out.println("******************************************************************");
        for (CricketScoreCard players : playersList) {
            if ("Team Alpha".equals(players.getTeamName())) {
                totalBallsA += players.getNoOfBalls();
                totalRunsA += players.getNoOfRuns();
                System.out.println("Player Name : " + players.getName() + "Total Runs : " + players.getNoOfRuns() + " in Total Balls : " + players.getNoOfBalls());
            } else {
                totalBallsB += players.getNoOfBalls();
                totalRunsB += players.getNoOfRuns();
            }
        }
        System.out.println("******************************************************************");
        System.out.println("Total No of Runs : " + totalRunsA + " in balls : " + totalBallsA);
        System.out.println("******************************************************************");
        System.out.println("                        Team Omega  ");
        System.out.println("******************************************************************");
        for (CricketScoreCard players : playersList) {
            if ("Team Omega".equals(players.getTeamName())) {

                System.out.println("Player Name : " + players.getName() + "Total Runs : " + players.getNoOfRuns() + " in Total Balls : " + players.getNoOfBalls());
            }
        }
        System.out.println("******************************************************************");
        System.out.println("Total No of Runs : " + totalRunsB + " in balls : " + totalBallsB);
        System.out.println("******************************************************************");
        if (totalRunsA > totalRunsB) {
            System.out.println("Team Alpha beats Team Omega by " + (totalRunsA - totalRunsB) + " runs!!");

        } else {
            System.out.println("Team Omega beats Team Alpha by " + (totalRunsB - totalRunsA) + " runs!!");

        }
    }

    private void readFromFile() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/cricket_match_data.txt"))) {
            String line = "";
            Integer runs = 0;
            while ((line = bufferedReader.readLine()) != null) {
                String[] scoreCard = line.split(",");
                String name = scoreCard[0];
                String teamName = scoreCard[1];
                Integer numOfBalls = scoreCard.length - 2;
                for (int i = 2; i < scoreCard.length; i++) {
                    runs += Integer.parseInt(scoreCard[i]);
                }
                CricketScoreCard players = new CricketScoreCard(name, teamName, numOfBalls, runs);
                playersList.add(players);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
