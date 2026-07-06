package in.co.nmsworks.training.week3.weekend.cricketScoreCard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CricketScoreCard {

    public List<Player> readFile(String fileName) {

        List<Player> players = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            br.readLine(); // Skip header

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];
                String team = data[1];

                int runs = 0;
                int balls = data.length - 2;

                for (int i = 2; i < data.length; i++) {
                    runs += Integer.parseInt(data[i]);
                }

                players.add(new Player(name, team, runs, balls));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return players;
    }

    public void printScoreCard(List<Player> players) {

        Map<String, List<Player>> teamMap = new LinkedHashMap<>();

        for (Player player : players) {
            teamMap.computeIfAbsent(player.getTeam(), k -> new ArrayList<>()).add(player);
        }

        Map<String, Integer> teamScore = new LinkedHashMap<>();

        for (String team : teamMap.keySet()) {

            System.out.println("\nTeam : " + team);
            System.out.printf("%-20s %5s %5s%n", "Player", "Runs", "Balls");

            int totalRuns = 0;
            int totalBalls = 0;

            for (Player player : teamMap.get(team)) {

                System.out.println(player);

                totalRuns += player.getRuns();
                totalBalls += player.getBalls();
            }

            System.out.printf("%-20s %5d %5d%n",
                    "TOTAL", totalRuns, totalBalls);

            teamScore.put(team, totalRuns);
        }

        List<String> teams = new ArrayList<>(teamScore.keySet());

        int score1 = teamScore.get(teams.get(0));
        int score2 = teamScore.get(teams.get(1));

        System.out.println();

        if (score1 > score2) {
            System.out.println("RESULT : "
                    + teams.get(0)
                    + " WON BY "
                    + (score1 - score2)
                    + " RUNS");
        }
        else if (score2 > score1) {
            System.out.println("RESULT : "
                    + teams.get(1)
                    + " WON BY "
                    + (score2 - score1)
                    + " RUNS");
        }
        else {
            System.out.println("RESULT : MATCH TIED");
        }
    }
}
