package in.co.nmsworks.training.week3.weekend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collection;
import java.util.Map;


public class MatchRunner {
    public static void main(String[] args) {
        MatchRunner matchRunner = new MatchRunner();
        Match match = matchRunner.run();
        matchRunner.printScoreCard(match.gethomeTeamScoreCard());
        matchRunner.printScoreCard(match.getawayTeamScoreCard());
        matchRunner.printResult(match);
    }

    private void printResult(Match match) {
        String teamName;
        Integer runDifference = Math.abs(match.gethomeTeamScoreCard().getTotalScore() - match.getawayTeamScoreCard().getTotalScore());
        if (match.getWonTheMatch().equals(Result.HOMETEAM)) {
            teamName = match.gethomeTeamScoreCard().getteamName();
        }
        else {
            teamName = match.getawayTeamScoreCard().getteamName();
        }
        System.out.println("RESULT : "+ teamName+" WON BY "+runDifference+" RUNS.");
    }

    private void printScoreCard(ScoreCard scoreCard) {
        System.out.println("********************************");
        System.out.println("Team : "+scoreCard.getteamName());
        System.out.println("********************************");
        for (String playername : scoreCard.getEachPlayerWithScore().keySet()) {
            System.out.println(playername+"\t"+scoreCard.getEachPlayerWithScore().get(playername));
        }
        System.out.println("----------------------------------------");
        System.out.println("Total\t"+scoreCard.getTotalScore());
        System.out.println();
    }

    private Match run() {
        ScoreCard team1 = new ScoreCard("Alpha");
        ScoreCard team2 = new ScoreCard("Omega");
        getDataFromFile(team1,team2);
        Match match = new Match(team1,team2);
        if (team1.getTotalScore() > team2.getTotalScore())
            match.setWonTheMatch(Result.HOMETEAM);
        else if (team1.getTotalScore() < team2.getTotalScore())
            match.setWonTheMatch(Result.AWAYTEAM);
        else {
            if (team1.getEachPlayerWithScore().size() < team2.getEachPlayerWithScore().size())
                match.setWonTheMatch(Result.HOMETEAM);
            else
                match.setWonTheMatch(Result.AWAYTEAM);
        }
        return match;
    }

    private void getDataFromFile(ScoreCard team1, ScoreCard team2) {
        try (BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Downloads/cricket_match_data.txt"))){
            String content = "";
            reader.readLine();
            while ((content = reader.readLine()) != null) {
                String[] splitContent = content.split(",",3);

                Integer score = getScore(splitContent[2]);
                if (splitContent[1].equals("Team Alpha")) {
                    Map<String, Integer> playerWithScore = team1.getEachPlayerWithScore();
                    playerWithScore.put(splitContent[0], score);
                    team1.setEachPlayerWithScore(playerWithScore);
                }
                else {
                    Map<String, Integer> playerWithScore = team2.getEachPlayerWithScore();
                    playerWithScore.put(splitContent[0], score);
                    team2.setEachPlayerWithScore(playerWithScore);
                }
            }
            team1.setNoOfWickets(team1.getEachPlayerWithScore().size());
            team2.setNoOfWickets(team1.getEachPlayerWithScore().size());
            team1.setTotalScore(calculateTotalScore(team1.getEachPlayerWithScore().values()));
            team2.setTotalScore(calculateTotalScore(team2.getEachPlayerWithScore().values()));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Integer calculateTotalScore(Collection<Integer> scores) {
        Integer score  = 0;
        for (Integer i : scores) {
            score += i;
        }
        return score;
    }

    private Integer getScore(String scoreString) {
        Integer score = 0;
        String[] scoreSplit = scoreString.split(",");
        for (String eachScore : scoreSplit) {
            score += Integer.parseInt(eachScore);
        }
        return score;
    }
}
