package in.co.nmsworks.training.Week3.Map.Day6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CricketScore {
    public static void main(String[] args) {
        Map<Player, Score> team = dataSplit();
        Map<Player, Score> team1 = SplitTeam1(team);
        Map<Player, Score> team2 = SplitTeam2(team);
        winningTeam(team1, team2);
    }

    private static Map<Player, Score> SplitTeam1(Map<Player, Score> team) {
        Map<Player, Score> teamPlayer = new HashMap<>();
        for (Map.Entry<Player, Score> ent : team.entrySet()) {
            if (ent.getKey().getTeam().equals("Team Omega")) {
                teamPlayer.put(ent.getKey(), ent.getValue());
            }
        }
        return teamPlayer;
    }

    private static void winningTeam(Map<Player, Score> team1, Map<Player, Score> team2) {
        int team1Score = 0;
        int team2Score = 0;
        System.out.println("Team : Team A");
        for (Map.Entry<Player, Score> ent : team1.entrySet()) {
            team1Score += ent.getValue().getScore();
            System.out.printf("%-20s %-15s %-10d %-10d%n",
                    ent.getKey().getName(),
                    ent.getKey().getTeam(),
                    ent.getValue().getScore(),
                    ent.getValue().getBalls());
        }
        System.out.println("Total " + team1Score);
        System.out.println("Team : Team B");
        for (Map.Entry<Player, Score> ent : team2.entrySet()) {
            team2Score += ent.getValue().getScore();
            System.out.printf("%-20s %-15s %-10d %-10d%n",
                    ent.getKey().getName(),
                    ent.getKey().getTeam(),
                    ent.getValue().getScore(),
                    ent.getValue().getBalls());
        }
        System.out.println("Total " + team2Score);
        if (team1Score > team2Score) {
            System.out.println("Team A Win");
        } else {
            System.out.println("Team B Win");
        }

    }


    private static Map<Player, Score> SplitTeam2(Map<Player, Score> team) {
        Map<Player, Score> teamPlayer = new HashMap<>();
        for (Map.Entry<Player, Score> ent : team.entrySet()) {
            if (ent.getKey().getTeam().equals("Team Alpha")) {
                teamPlayer.put(ent.getKey(), ent.getValue());
            }
        }
        return teamPlayer;
    }

    private static Map<Player, Score> dataSplit() {
        Map<Player, Score> teamMember = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/cricket_match_data.txt"))) {
            String line = "";
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] word = line.split(",");
                String name = word[0];
                String team = word[1];
                Player player = new Player(name, team);
                int sum = 0;
                int count = 0;
                for (int i = 2; i < word.length; i++) {
                    sum += Integer.parseInt(word[i]);
                    count++;
                }
                Score score = new Score(sum, count);
                teamMember.put(player, score);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return teamMember;
    }
}

