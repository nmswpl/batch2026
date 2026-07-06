package in.co.nmsworks.training.week3.weekendpractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class CricketScoreCard {

    public static void main(String[] args) {
            in.co.nmsworks.training.week3.weekendpractice.CricketScoreCard scoreCard = new in.co.nmsworks.training.week3.weekendpractice.CricketScoreCard();
            List<CricketPlayer> list = scoreCard.getListOfPlayers();
            Map<String,List<CricketPlayer>> map = scoreCard.getPlayersByTeam(list);

            for(Map.Entry<String, List<CricketPlayer>> play : map.entrySet()){
                System.out.println(play.getKey() + " " + play.getValue());
            }

            scoreCard.printPlayers(map.get("Team Alpha"), map.get("Team Omega"));
        }

        private void printPlayers(List<CricketPlayer> teamAlpha, List<CricketPlayer> teamOmega) {
            int teamAlphaRuns  = 0;
            int teamAlphaBallsFaced = 0;

            System.out.println("Team : Team Alpha");
            for (int i = 0; i < teamAlpha.size() ; i++) {
                System.out.println( (i+1) + " " + teamAlpha.get(i).getName()
                        + "     "  + teamAlpha.get(i).getBallCount() + "  " + teamAlpha.get(i).getRuns());

                teamAlphaRuns += teamAlpha.get(i).getRuns();
                teamAlphaBallsFaced += teamAlpha.get(i).getBallCount();
            }

            System.out.println("Total  balls faced : " + teamAlphaBallsFaced);
            System.out.println("Total runs scored  : " + teamAlphaRuns);

            int teamOmegaBallsFaced = 0;
            int teamOmegaRuns = 0;

            System.out.println();
            System.out.println("Team : Team Omega");
            for (int i = 0; i < teamOmega.size() ; i++) {
                System.out.println( (i+1) + " " + teamOmega.get(i).getName()
                        + "     "  + teamOmega.get(i).getBallCount() + "  " + teamOmega.get(i).getRuns());

                teamOmegaRuns += teamOmega.get(i).getRuns();
                teamOmegaBallsFaced += teamOmega.get(i).getBallCount();
            }

            System.out.println("Total  balls faced : " + teamOmegaBallsFaced);
            System.out.println("Total runs scored  : " + teamOmegaRuns);
            System.out.println();

            if(teamAlphaRuns > teamOmegaRuns){
                System.out.println("Result : Team Alpha won by " + (teamAlphaRuns-teamOmegaRuns) + "  runs");
            }
            else if (teamAlphaRuns < teamOmegaRuns){
                System.out.println("Result : Team Omega won by " + (teamOmegaRuns-teamAlphaRuns) + "  runs");
            }
            else {
                System.out.println("Result : Match draws");
            }

        }

        private  Map<String, List<CricketPlayer>> getPlayersByTeam(List<CricketPlayer> list) {
            Map<String, List<CricketPlayer>> playerMap = new HashMap<>();

            for(CricketPlayer player : list){

                playerMap.putIfAbsent(player.getTeamName(), new ArrayList<>());
                playerMap.get(player.getTeamName()).add(player);
            }

            return playerMap;
        }

        private List<CricketPlayer> getListOfPlayers() {
            List<CricketPlayer> list = new ArrayList<>();

            try(BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/files/cricket_match_data.txt"))) {
                bufferedReader.readLine();

                String line = "";

                while((line = bufferedReader.readLine()) != null){
                    String[] words = line.split(",");
                    String playerName = words[0];
                    String teamName = words[1];
                    int ballCount = 0;
                    int totalRun = 0;

                    for(int i = 2; i < words.length; i++){
                        totalRun = totalRun + Integer.parseInt(words[i]);
                        ballCount++;
                    }
                    list.add(new CricketPlayer(playerName,teamName,ballCount,totalRun));
                }
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }

            return list;
        }

}
