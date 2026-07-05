package in.co.nmsworks.week3.day6;


public class MainScoreCard {
    public static void main(String[] args) {
        CricketScoreCard card = new CricketScoreCard();

        card.readFile();
        card.print();
    }

}
