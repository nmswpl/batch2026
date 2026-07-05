package in.co.nmsworks.week3.day6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CricketScoreCard {
    Map<String, Map<String, List<Integer>>> teamList = new HashMap<>();

    public void readFile() {

        try (BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Downloads/cricket_match_data.txt"))) {

            String line = "";

            reader.readLine();


            while ((line = reader.readLine()) != null) {
                String[] str = line.split(",");

                String player = str[0];
                String team = str[1];
                List<Integer> scoreList = new ArrayList<>();

                for (int i = 2; i < str.length; i++) {
                    scoreList.add(Integer.valueOf(str[i]));
                }

                Map<String, List<Integer>> playerList = teamList.get(team);

                if (playerList == null) {
                    playerList = new HashMap<>();
                    teamList.put(team, playerList);
                }

                playerList.put(player, scoreList);

            }
        } catch (Exception e) {

            e.printStackTrace();
        }


    }

    public void print() {

        int totalScoreOfTeamA = 0;
        int totalScoreOfTeamB = 0;

        for (Map.Entry<String, Map<String, List<Integer>>> teamEntry : teamList.entrySet()) {
            String team = teamEntry.getKey();

            Map<String, List<Integer>> perPlayerList = teamEntry.getValue();
            System.out.println("Team Name :" + team.toUpperCase() + "    " + "No of Balls" + "    " + "No of Runs");


            for (Map.Entry<String, List<Integer>> players : perPlayerList.entrySet()) {
                int noOfBalls = 0;
                int runs = 0;
                System.out.print(players.getKey() + "    ");
                List<Integer> score = players.getValue();
                for (Integer i : score) {
                    runs += i;
                    noOfBalls++;
                }
                System.out.print("    " + noOfBalls);
                System.out.print("    " + runs);
                System.out.println();


                if (team.equals("Team Alpha")) {
                    totalScoreOfTeamA += runs;
                } else {
                    totalScoreOfTeamB += runs;
                }

            }
        }

        if (totalScoreOfTeamA > totalScoreOfTeamB) {
            int grandScore = totalScoreOfTeamA - totalScoreOfTeamB;
            System.out.println("\n" + "*******TEAM ALPHA WON BY " + grandScore + " RUNS*******");
        } else {
            int grandScore = totalScoreOfTeamB - totalScoreOfTeamA;
            System.out.println("\n" + "*******TEAM ALPHA WON BY " + grandScore + " RUNS*******");
        }
    }
}
