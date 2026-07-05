package in.co.nmsworks.training.week3practices;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CricketSummary {

    public static void main(String[] args) {
        CricketSummary cr = new CricketSummary();
        cr.summaryRead();
    }

    private void summaryRead() {


        String path = "/home/nms-training/Downloads/cricket_match_data.txt";

        List<PlayerStats> teamAlpha = new ArrayList<>();
        List<PlayerStats> teamOmega = new ArrayList<>();

        try (BufferedReader read = new BufferedReader(new FileReader(path))) {
            String line;
            boolean isHeader = true;

            while ((line = read.readLine()) != null) {

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] tokens = line.split(",");
                if (tokens.length < 3) continue;

                String playerName = tokens[0].trim();
                String teamName = tokens[1].trim();

                int totalRuns = 0;
                int ballsFaced = tokens.length - 2; // Everything after name and team


                for (int i = 2; i < tokens.length; i++) {
                    totalRuns += Integer.parseInt(tokens[i].trim());
                }

                PlayerStats player = new PlayerStats(playerName, totalRuns, ballsFaced);


                if (teamName.equalsIgnoreCase("Team Alpha")) {
                    teamAlpha.add(player);
                } else if (teamName.equalsIgnoreCase("Team Omega")) {
                    teamOmega.add(player);
                }
            }

            printScorecard(teamAlpha, teamOmega);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void printScorecard(List<PlayerStats> team1, List<PlayerStats> team2) {
        int team1Runs = 0, team1Balls = 0;
        int team2Runs = 0, team2Balls = 0;


        System.out.println("Team : Team Alpha");
        int counter1=1;

        for (PlayerStats p : team1) {

            String pname = "Player "+counter1++;
            System.out.printf("%-20s %5d %5d%n", pname,p.runs, p.balls);
            team1Runs += p.runs;
            team1Balls += p.balls;
        }
        System.out.printf("%-20s %5d %5d%n%n", "TOTAL", team1Runs, team1Balls);

        int counter2=1;
        System.out.println("Team : Team Omega");

        for (PlayerStats p : team2) {
            String pname = "Player "+counter2++;
            System.out.printf("%-20s %5d %5d%n",pname, p.runs, p.balls);
            team2Runs += p.runs;
            team2Balls += p.balls;
        }
        System.out.printf("%-20s %5d %5d%n%n", "TOTAL", team2Runs, team2Balls);

        System.out.println("===============================================================");

        if (team1Runs > team2Runs) {
            int margin = team1Runs - team2Runs;
            System.out.println("RESULT : TEAM ALPHA WON BY " + margin + " RUNS.");
        } else if (team2Runs > team1Runs) {
            int margin = team2Runs - team1Runs;
            System.out.println("RESULT : TEAM OMEGA WON BY " + margin + " RUNS.");
        } else {
            System.out.println("RESULT : MATCH TIED.");
        }
    }
}