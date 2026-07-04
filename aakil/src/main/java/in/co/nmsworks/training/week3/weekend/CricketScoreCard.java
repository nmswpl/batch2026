package in.co.nmsworks.training.week3.weekend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CricketScoreCard {
    public static void main(String[] args) {
        CricketScoreCard scoreCard = new CricketScoreCard();
        List<Cricketer> teamAlpha = new ArrayList<>();
        List<Cricketer> teamOmega = new ArrayList<>();
        scoreCard.getCricketersList(teamAlpha, teamOmega);
        scoreCard.printScoreCard(teamAlpha, teamOmega);
    }

    private void printScoreCard(List<Cricketer> teamAlpha, List<Cricketer> teamOmega) {
        int alphaScore = printTeamScore(teamAlpha, teamAlpha.get(0).getTeam());
        int omegaScore = printTeamScore(teamOmega, teamOmega.get(0).getTeam());

        int margin = Math.abs(alphaScore - omegaScore);
        if (alphaScore > omegaScore) {
            System.out.println("\n\nRESULT : TEAM ALPHA WON BY " + margin);
        } else {

            System.out.println("\n\nRESULT : TEAM OMEGA WON BY " + margin);
        }
    }

    private static int printTeamScore(List<Cricketer> teamAlpha, String team) {
        System.out.println(team.toUpperCase());
        int teamScore = 0;
        int totalBalls = 0;
        for (Cricketer c : teamAlpha) {
            int playerScore = c.getRunsScored().stream().mapToInt(Integer::intValue).sum();
            teamScore += playerScore;
            totalBalls += c.getRunsScored().size();
            System.out.println(c.getName() + "\t\t\t\t" + playerScore + "\t\t" + c.getRunsScored().size());
        }
        System.out.println("TOTAL\t\t\t\t\t" + teamScore + "\t\t" + totalBalls + "\n");
        return teamScore;
    }

    private void getCricketersList(List<Cricketer> teamAlpha, List<Cricketer> teamOmega) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/in/co/nmsworks/training/week3/weekend/data/cricket_match_data.txt"))){
            reader.readLine();
            String line;
            while ((line = reader.readLine()) != null){
                String[] info = line.split(",",3);
                Cricketer cricketer = new Cricketer(info[0], info[1]);
                List<Integer> runsScored = Arrays.stream(info[2].split(",")).map(Integer::parseInt).collect(Collectors.toList());
                cricketer.setRunsScored(runsScored);
                if ("Team Alpha".equals(info[1])){
                    teamAlpha.add(cricketer);
                } else if ("Team Omega".equals(info[1])) {
                    teamOmega.add(cricketer);
                }
            }
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
