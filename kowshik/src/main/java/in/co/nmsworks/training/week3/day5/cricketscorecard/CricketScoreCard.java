package in.co.nmsworks.training.week3.day5.cricketscorecard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CricketScoreCard {

    public static void main(String[] args) {
        Map<String, List<Player>> teamToPlayersMap = readDataFromFile();
        printScoreCard(teamToPlayersMap);
    }

    private static void printScoreCard(Map<String, List<Player>> teamToPlayersMap) {

        List<Team> teams = new ArrayList<>();

        for (Map.Entry<String, List<Player>> entry : teamToPlayersMap.entrySet()) {
            Team team = new Team();
            team.setTeamName(entry.getKey());
            team.setPlayers(entry.getValue());

            int totalScore = 0;
            int totalBallsFaced = 0;
            for (Player player : entry.getValue()) {
                totalScore += player.getRunsScored();
                totalBallsFaced += player.getBallsFaced();
            }

            team.setTotalScore(totalScore);
            team.setBallsFaced(totalBallsFaced);

            teams.add(team);
        }

        for (Team team : teams) {
            System.out.println("Team : " + team.getTeamName());

            for (Player player : team.getPlayers()) {
                System.out.println(player.getName() + "\t" + player.getRunsScored() + "\t" + player.getBallsFaced());
            }

            System.out.println("Total : " + team.getTotalScore());
            System.out.println();
        }

        printResult(teams);
    }

    private static void printResult(List<Team> teams) {
        Team teamA = teams.get(0);
        Team teamB = teams.get(1);

        int teamAScore = teamA.getTotalScore();
        int teamBScore = teamB.getTotalScore();

        int diff = teamAScore > teamBScore ? (teamAScore-teamBScore) : (teamBScore-teamAScore);

        String result = teamAScore > teamBScore ? (teamA.getTeamName() + " won by " + diff + " runs.")
                :  (teamB.getTeamName() + " won by " + diff + " runs.");

        System.out.println("Result : " + result);
    }

    private static Map<String, List<Player>> readDataFromFile() {
        Map<String, List<Player>> teamToPlayersMap = new HashMap<>();

        try (FileReader fileReader = new FileReader("/home/nms-training/Downloads/cricket_match_data.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)){

            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(",");

                Player player = new Player();
                player.setName(words[0]);
                player.setTeamName(words[1]);

                int runsScored = 0;
                int ballsFaced = 0;
                for (int i = 2; i < words.length; i++) {
                    runsScored += Integer.parseInt(words[i]);
                    ballsFaced++;
                }

                player.setRunsScored(runsScored);
                player.setBallsFaced(ballsFaced);

                teamToPlayersMap.computeIfAbsent(words[1].toUpperCase(), v -> new ArrayList<>()).add(player);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

//        System.out.println(teamToPlayersMap);
        return teamToPlayersMap;
    }
}
