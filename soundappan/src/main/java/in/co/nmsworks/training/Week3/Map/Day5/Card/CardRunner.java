package in.co.nmsworks.training.Week3.Map.Day5.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Players : ");
        int n = sc.nextInt();

        List<Player> players = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            players.add(new Player("Player " + i));
        }

        Dealer dealer = new Dealer();

        dealer.distributeCards(players);

        dealer.printPlayers(players);
    }
}