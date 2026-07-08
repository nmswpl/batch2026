package in.co.nmsworks.training.week3.weekend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CricketScoreCard {
    public static void main(String[] args) {
        CricketScoreCard cricketScoreCard = new CricketScoreCard();
        System.out.println("SCORE CARD" + "\n");
        List<List<String>> teams = cricketScoreCard.readScores();
        cricketScoreCard.printScores(teams);
    }

    private void printScores(List<List<String>> teams) {
        List<Integer> teamsTotals = new ArrayList<>();
        for (List<String> team : teams) {
            String teamName = (team.get(1).split(",", 3))[1].toUpperCase();
            System.out.println("TEAM: " + teamName);
            Integer teamTotalRuns = 0;
            Integer teamTotalBalls = 0;
            for (String teamDetails : team ){
                String[] splitString = teamDetails.split(",", 3);
                String spaces = "";
                for (int i = 0; i < 30-splitString[0].length(); i++){
                    spaces += " ";
                }
                System.out.print(splitString[0] + spaces);
                String[] splitScores = splitString[2].split(",");
                Integer runs = 0; Integer balls = 0;
                for (String splitScore : splitScores) {
                    runs += Integer.valueOf(splitScore);
                    balls ++;
                }

                System.out.println(runs + "    " + balls);
                teamTotalRuns += runs;
                teamTotalBalls += balls;
            }
            System.out.println("TOTAL:                       " + teamTotalRuns + "    " + teamTotalBalls);
            teamsTotals.add(teamTotalRuns);
            System.out.println("\n" + "=================================================================" + "\n");
        }

        if (teamsTotals.get(0) > teamsTotals.get(1)){
            System.out.println("TEAM ALPHA WON BY " + (teamsTotals.get(0) - teamsTotals.get(1)) + " RUNS");
        } else {
            System.out.println("TEAM OMEGA WON BY " + (teamsTotals.get(1) - teamsTotals.get(0)) + " RUNS");
        }
    }

    private List<List<String>> readScores() {
        List<List<String>> teams = new ArrayList<>();
        List<String> teamAlpha = new ArrayList<>();
        List<String> teamOmega = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/cricket_match_data.txt"))){
            String line = "";
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null){
                String[] splitLine = line.split(",", 3);
                if (splitLine[1].equals("Team Alpha")){
                    teamAlpha.add(line);
                } else {
                    teamOmega.add(line);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        teams.add(teamAlpha);
        teams.add(teamOmega);

        return teams;


    }
}
