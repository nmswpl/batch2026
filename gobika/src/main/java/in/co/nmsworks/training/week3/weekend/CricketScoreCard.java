package in.co.nmsworks.training.week3.weekend;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class CricketScoreCard {
    public static void main(String[] args) {
        CricketScoreCard cricketScoreCard = new CricketScoreCard();
        cricketScoreCard.scoreCard();

    }

    private void scoreCard() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/cricket_match_data.txt"))){
            Map<String,List<Integer>> playersAlpha = new HashMap<>();
            Map<String,List<Integer>> playersOmega = new HashMap<>();
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null){
                String[] player = line.split(",", 3);

                List<Integer> playerScoreList = new ArrayList<>();
                String[] scores = player[2].split(",");
                for (String score : scores) {
                    playerScoreList.add(Integer.valueOf(score));
                }
                Players playerObj = new Players(player[0],player[1],playerScoreList);
                if ("Team Alpha".equals(player[1])){
                    playersAlpha.put(player[0],playerScoreList );
                }
                else {
                    playersOmega.put(player[0],playerScoreList);
                }

            }
            System.out.println("Team Alpha");
            Integer totalAlphaScore = printScoreCard(playersAlpha);
            System.out.println("Team Omega");
            Integer totalOmegaScore = printScoreCard(playersOmega);
            int difference = totalAlphaScore - totalOmegaScore;
            if (totalAlphaScore > totalOmegaScore){
                System.out.println("Team Alpha won by "+ difference +" runs");
            }
            else if (totalOmegaScore > totalAlphaScore){
                System.out.println("Team Omega won by "+ difference +" runs");
            }
            else {
                System.out.println("Draw...");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Integer printScoreCard(Map<String, List<Integer>> players) {
        Integer totalScore = 0;
        Integer totalNoOfBalls = 0;
        for (Map.Entry<String,List<Integer>> player : players.entrySet()){
            Integer playerScore = 0;
            for (int i = 0; i < player.getValue().size(); i++) {
                playerScore += player.getValue().get(i);
            }
            System.out.println(player.getKey()+ "  " +  player.getValue().size()  + "  " + playerScore );
            totalScore += playerScore;
            totalNoOfBalls += player.getValue().size();

        }
        System.out.println("Total : "+ totalNoOfBalls +" "+ totalScore);
        return totalScore;
    }

}
