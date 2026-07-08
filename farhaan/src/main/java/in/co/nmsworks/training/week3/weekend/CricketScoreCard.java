package in.co.nmsworks.training.week3.weekend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CricketScoreCard {
    List<Player> teamAlpha = new ArrayList<>();
    List<Player> teamOmega = new ArrayList<>();
    public static void main(String[] args) {
        CricketScoreCard runner = new CricketScoreCard();
        runner.getPlayers();
        int alphaScore = runner.getTeamScore(runner.teamAlpha);
        int omegaScore = runner.getTeamScore(runner.teamOmega);
        System.out.println("--------------------------------------- TEAM OMEGA ---------------------------------------");
        runner.printScoreboard(runner.teamOmega,omegaScore);
        System.out.println("--------------------------------------- TEAM ALPHA ---------------------------------------");
        runner.printScoreboard(runner.teamAlpha,alphaScore);
        runner.printWinners(alphaScore,omegaScore);
    }

    private void printWinners(int teamOneScore, int teamTwoScore) {
        if(teamOneScore > teamTwoScore){
            System.out.println("Team Alpha Wins by " + (teamOneScore - teamTwoScore) + " Runs");
        }
        else {
            System.out.println("Team Omega Wins by " + (teamTwoScore - teamOneScore) + " Runs");
        }
    }

    private void printScoreboard(List<Player> team, int teamScore) {
        int totalTeamBalls = 0;
        for (Player player : team) {
            totalTeamBalls += player.getRunScored().size();
            System.out.println("Name : " + player.getName() + " \t\t\tRuns : " + player.getTotalRuns() + "\t\t\t Balls Faced :: " + totalTeamBalls);
        }
        System.out.println("Total Runs Scored :: " + teamScore + " \t\t Total Balls Faced :: " + totalTeamBalls);
    }

    private int getTeamScore(List<Player> team) {
        int totalTeamScore = 0;
        for (Player player : team) {
            player.setTotalRuns(player.getRunScored().stream().mapToInt(Integer::intValue).sum());
            totalTeamScore += player.getTotalRuns();
        }
        return totalTeamScore;
    }

    private void getPlayers() {
        try(BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Downloads/cricket_match_data.txt"))) {
            String line;
            reader.readLine();
            while((line = reader.readLine()) != null){
                String[] details =  line.split(",");
                Player player = new Player(details[0],details[1]);
                for(int i = 2; i < details.length; i++){
                    player.getRunScored().add(Integer.valueOf(details[i]));
                }
                if("Team Alpha".equals(player.getTeam())){
                    teamAlpha.add(player);
                }
                else{
                    teamOmega.add(player);
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
