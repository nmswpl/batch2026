package in.co.nmsworks.week3.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainCard {

    public static void main(String[] args) {


        List<String> redCard = new ArrayList<>();
        List<String> blackCard = new ArrayList<>();

        List<String> deckOfCard = new ArrayList<>();

        String[] arr = {"Heart", "Diamond", "Spade", "Ace"};

        for (int i = 0; i < arr.length; i++) {
            {
                for (int j = 1; j <= 13; j++) {
                    deckOfCard.add(arr[i] + j);

                }
            }

        }

        System.out.println("Enter no of players");
        try (Scanner sc = new Scanner(System.in)) {
            int noOfPlayers = sc.nextInt();
            Card card = new Card(noOfPlayers, deckOfCard);
            Map<String, List<String>> map = card.distribute();

            card.printCard(map);

        }


    }
}
