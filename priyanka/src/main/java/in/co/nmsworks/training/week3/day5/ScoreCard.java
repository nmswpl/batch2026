package in.co.nmsworks.training.week3.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ScoreCard {

    public static void main(String[] args) {

        ScoreCard scoreCard = new ScoreCard();
        scoreCard.fileParsing();
    }

    public void fileParsing() {

        try (BufferedReader reader = new BufferedReader(
                new FileReader("/home/nms-training/Desktop/cricket_match_data.txt"))) {

            reader.readLine(); // Skip header

            String line;

            List<PLayerDetails> alpha = new ArrayList<>();
            List<PLayerDetails> omega = new ArrayList<>();

            while ((line = reader.readLine()) != null) {

                String[] words = line.split(",");

                String playerName = words[0];
                String teamName = words[1];

                List<Integer> runsList = new ArrayList<>();

                for (int i = 2; i < words.length; i++) {
                    runsList.add(Integer.parseInt(words[i]));
                }

                PLayerDetails player =
                        new PLayerDetails(playerName, teamName, runsList);

                if (teamName.equals("Team Alpha")) {
                    alpha.add(player);
                } else {
                    omega.add(player);
                }
            }

            printScoreCard(alpha, "Team Alpha");
            printScoreCard(omega, "Team Omega");

            printResult(alpha, omega);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void printScoreCard(List<PLayerDetails> players, String teamName) {

        int totalRuns = 0;
        int totalBalls = 0;

        System.out.println("\nTeam : " + teamName);
        System.out.println("Player\t"+"Runs\t"+ "Balls\t");

        for (PLayerDetails player : players) {

            int runs = player.getTotalRuns();
            int balls = player.getBallsFaced();

            totalRuns += runs;
            totalBalls += balls;

            System.out.println(player.getName()+"\t"+runs+"\t"+ balls);
        }

        System.out.println("--------------------------------------------");

        System.out.println("TOTAL:\t"+ totalRuns+ "\t"+totalBalls);
    }

    private void printResult(List<PLayerDetails> alpha,
                             List<PLayerDetails> omega) {

        int alphaRuns = getTeamRuns(alpha);
        int omegaRuns = getTeamRuns(omega);

        if (alphaRuns > omegaRuns) {
            System.out.println("\nRESULT : TEAM ALPHA WON BY "
                    + (alphaRuns - omegaRuns) + " RUNS.");
        }
        else if (omegaRuns > alphaRuns) {
            System.out.println("\nRESULT : TEAM OMEGA WON BY "
                    + (omegaRuns - alphaRuns) + " RUNS.");
        }
        else {
            System.out.println("\nRESULT : MATCH TIED.");
        }
    }

    private int getTeamRuns(List<PLayerDetails> players) {

        int total = 0;

        for (PLayerDetails player : players) {
            total += player.getTotalRuns();
        }

        return total;
    }
}