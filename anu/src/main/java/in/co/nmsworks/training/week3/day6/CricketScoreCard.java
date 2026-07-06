package in.co.nmsworks.training.week3.day6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CricketScoreCard {

    public static void main(String[] args) {
        CricketScoreCard scoreCard = new CricketScoreCard();
        scoreCard.readCsvFile();
    }

    private void readCsvFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/cricket_match_data.txt"))) {
            String line = br.readLine();

            String currentTeam = "";
            int totalRuns = 0;
            int totalBalls = 0;

            List<String> teamAlphaList = new ArrayList<>();
            List<String> teamOmegaList = new ArrayList<>();
            
            int alphaRuns = 0;
            int omegaRuns = 0;
            
            while ((line = br.readLine()) != null) {
                
                String[] data = line.split(",");
                
                String playerName = data[0];
                String teamName = data[1];

                System.out.println("data length : " + data.length);
                int runs = 0;
                int balls = data.length - 2;
                System.out.println("balls length : " + balls);

                for (int i = 2; i < data.length; i++) {
                    runs += Integer.parseInt(data[i]);
                }

                if (!teamName.equals(currentTeam)) {
                    if (!currentTeam.equals("")) {
                        System.out.println("total runs and total balls : " + (totalRuns + totalBalls));
                        System.out.println();
                    }
                    currentTeam = teamName;
                    totalRuns = 0;
                    totalBalls = 0;
                }
                System.out.println("player name : " + playerName + " " + "runs : " + runs+ " " + "balls :" + balls);
                System.out.println();
                totalRuns += runs;
                totalBalls += balls;

                String playerInfo = playerName + " " + runs + " " + balls;
                if (teamName.equals("Team Alpha")) {
                    teamAlphaList.add(playerInfo);
                    alphaRuns += runs;
                } else {
                    teamOmegaList.add(playerInfo);
                    omegaRuns += runs;
                }
            }
            System.out.println("Team Alpha ");
            for (String p : teamAlphaList) {
                System.out.println(p);
            }
            System.out.println("Team Orange");
            for (String p : teamOmegaList) {
                System.out.println(p);
            }

            if (alphaRuns > omegaRuns) {
                System.out.println("result : team alpha " + (alphaRuns - omegaRuns) + " runs");
            } else{
                System.out.println("result : team orange " + (omegaRuns - alphaRuns) + " runs");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}