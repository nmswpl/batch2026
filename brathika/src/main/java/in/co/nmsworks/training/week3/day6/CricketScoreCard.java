package in.co.nmsworks.training.week3.day6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CricketScoreCard {
    public static void main(String[] args) {
        CricketScoreCard scoreCard = new CricketScoreCard();
        List<Player> players = scoreCard.readDataFromFile();
        System.out.println(players);
        scoreCard.printScoreCard(players);
    }

    private void printScoreCard(List<Player> players) {
        int teamATotal = 0, teamBTotal = 0;
        System.out.println("Team: Team Alpha");
        for (Player player : players) {
            int playerTotal = 0;
            if (player.getTeamName().equals("Team Alpha")) {

                for (Integer run : player.getRuns()) {
                    playerTotal += run;
                }
                teamATotal += playerTotal;
                System.out.println(player.getName()+" "+playerTotal);

            }
        }
        System.out.println("Team Alpha Total: "+teamATotal);
        System.out.println("Team: Team Omega");
        for (Player player : players) {
            int playerTotal = 0;
            if (player.getTeamName().equals("Team Omega")) {

                for (Integer run : player.getRuns()) {
                    playerTotal += run;
                }
                teamBTotal += playerTotal;
                System.out.println(player.getName()+" "+playerTotal);

            }
        }
        if (teamATotal > teamBTotal) {
            System.out.println("Result : Team Alpha won by "+(teamATotal - teamBTotal)+" runs");
        }
        else {
            System.out.println("Result : Team Omega won by "+(teamBTotal - teamATotal)+" runs");

        }

    }

    private List<Player> readDataFromFile() {
        List<Player> players = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Downloads/cricket_match_data.txt"))){
            String text = "";
            reader.readLine();
            while ((text = reader.readLine()) != null) {
                String[] array = text.split(",");
                String name = array[0];
                String teamName = array[1];
                List<Integer> runs = new ArrayList<>();
                for (int i = 2; i < array.length; i++) {
                    int run = Integer.valueOf(array[i]);
                    runs.add(run);
                }
                players.add(new Player(name, teamName, runs));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return players;
    }
}
