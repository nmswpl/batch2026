package in.co.nmsworks.training.week3.weekend.cricketScoreCard;

import java.util.List;

public class CricketRunner {

    public static void main(String[] args) {

        CricketScoreCard scoreCard = new CricketScoreCard();

        List<Player> players =
                scoreCard.readFile("/home/nms-training/Downloads/cricket_match_data.txt");

        scoreCard.printScoreCard(players);
    }
}
