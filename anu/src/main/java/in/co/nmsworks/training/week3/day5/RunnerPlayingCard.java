package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RunnerPlayingCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52"};

        List<PlayingCard> deck = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new PlayingCard(suit, rank));
            }
        }

        Collections.shuffle(deck);

        List<PlayingCard> player1 = new ArrayList<>();
        List<PlayingCard> player2 = new ArrayList<>();
        List<PlayingCard> player3 = new ArrayList<>();
        List<PlayingCard> player4 = new ArrayList<>();

        int cardIndex = 0;
        System.out.println("enter the number of players ");
        int noOfPlayers = scanner.nextInt();

        for (int i = 0; i < deck.size() / noOfPlayers; i++) {
            for (int j = 0; j < noOfPlayers; j++) {

                PlayingCard currentCard = deck.get(cardIndex);

                if (j == 0) {
                    player1.add(currentCard);
                }
                else if(j == 1){
                    player2.add(currentCard);
                }
                else if (j == 2){
                    player3.add(currentCard);
                }
                else if (j == 3) {
                    player4.add(currentCard);
                }

                cardIndex++;
            }
        }

        System.out.println("Player 1: " + player1);
        System.out.println("Player 2: " + player2);
        System.out.println("Player 3: " + player3);
        System.out.println("Player 4: " + player4);


    }
}
