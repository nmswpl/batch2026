package in.co.nmsworks.training.week3.day6;

public class CardRunner {
    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.shuffle();

        int players = 3;
        int cardsPerPlayer = 5;

        for (int i = 1; i <= players; i++) {
            System.out.println("Player " + i + ": " + deck.draw(cardsPerPlayer));
        }
    }
}
