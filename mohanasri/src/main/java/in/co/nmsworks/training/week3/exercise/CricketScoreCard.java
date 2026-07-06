package in.co.nmsworks.training.week3.exercise;

import in.co.nmsworks.training.week3.exercise.PlayerPerformance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class CricketScoreCard {
    public static void main(String[] args) {

        List<PlayerPerformance> alphaPlayers = new ArrayList<>();
        List<PlayerPerformance> omegaPlayers = new ArrayList<>();

        int alphaTotalRuns = 0;
        int omegaTotalRuns = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/cricket_match_data.txt"))) {
            String line;
            int lineNumber = 0;

            while ((line = br.readLine()) != null) {
                lineNumber++;
                System.out.println("Processing line #" + lineNumber + ": " + line);

                if (line.trim().isEmpty()) {
                    continue;
                }

                if (line.contains("Player Name") || line.contains("Balls Faced")) {
                    continue;
                }

                String[] scores = line.split(",");
                if (scores.length < 3) {
                    continue;
                }

                String playerName = scores[0].trim();
                String teamName = scores[1].trim();

                int playerRuns = 0;
                int ballsFaced = 0;

                for (int i = 2; i < scores.length; i++) {
                    String runValue = scores[i].trim();

                    if (runValue.isEmpty()) {
                        continue;
                    }

                    try {
                        playerRuns += Integer.parseInt(runValue);
                        ballsFaced++;
                    } catch (NumberFormatException e) {
                        System.out.println("   Skipped non-numeric item: " + runValue);
                    }
                }

                PlayerPerformance player = new PlayerPerformance(playerName, playerRuns, ballsFaced);

                if (teamName.equalsIgnoreCase("Team Alpha")) {
                    alphaPlayers.add(player);
                    alphaTotalRuns += playerRuns;
                } else if (teamName.equalsIgnoreCase("Team Omega")) {
                    omegaPlayers.add(player);
                    omegaTotalRuns += playerRuns;
                }
            }
            System.out.println("\nSuccessfully finished reading file. Total lines: " + lineNumber + "\n");

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("SCORECARD: TEAM ALPHA");
        for (PlayerPerformance p : alphaPlayers) {
            System.out.println(p.name + " : " + p.runs + " runs off " + p.ballsFaced + " balls");
        }
        System.out.println("TOTAL SCORE: " + alphaTotalRuns);
        System.out.println();

        System.out.println("SCORECARD: TEAM OMEGA");
        for (PlayerPerformance p : omegaPlayers) {
            System.out.println(p.name + " : " + p.runs + " runs off " + p.ballsFaced + " balls");
        }
        System.out.println("TOTAL SCORE: " + omegaTotalRuns);
        System.out.println();


        System.out.println("MATCH RESULT");
        if (alphaTotalRuns > omegaTotalRuns) {
            int margin = alphaTotalRuns - omegaTotalRuns;
            System.out.println("Team Alpha wins by " + margin + " runs!");
        } else if (omegaTotalRuns > alphaTotalRuns) {
            int margin = omegaTotalRuns - alphaTotalRuns;
            System.out.println("Team Omega wins by " + margin + " runs!");
        } else {
            System.out.println("The match is a Tie!");
        }

    }
}
