package in.co.nmsworks.training.week3.day5.card;

import java.util.*;

public class CardRunner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> variables = new ArrayList<>();
        variables.add("ace");
        variables.add("king");
        variables.add("queen");
        variables.add("jack");
        variables.add("2");
        variables.add("3");
        variables.add("4");
        variables.add("5");
        variables.add("6");
        variables.add("7");
        variables.add("8");
        variables.add("9");
        variables.add("10");

        List<String> heart =new ArrayList<>();
        for (String variable : variables) {
           heart.add("H:" + variable);
        }


        List<String> diamond = new ArrayList<>();
        for (String variable : variables) {
            diamond.add("D:" + variable);
        }

        List<String> spade = new ArrayList<>();
        for (String variable : variables) {
            spade.add("S:" + variable);
        }

        List<String> clavor = new ArrayList<>();
        for (String variable : variables) {
            clavor.add("C:" + variable);
        }



        List<String> shuffledCards = new ArrayList<>();
        shuffledCards.addAll(heart);
        shuffledCards.addAll(diamond);
        shuffledCards.addAll(spade);
        shuffledCards.addAll(clavor);

        System.out.println(shuffledCards);

        Collections.shuffle(shuffledCards);


        System.out.println("no.of players : ");
        int noOfPlayers = sc.nextInt();

        distribution(noOfPlayers, shuffledCards);

    }

    private static void distribution(int noOfPlayers, List<String> shuffledCards) {

        int cardsPerPlayer = shuffledCards.size() / noOfPlayers;
        int index = 0;

        for (int i = 1; i <= noOfPlayers; i++) {

            List<String> player = new ArrayList<>();

            for (int j = 0; j < cardsPerPlayer; j++) {
                player.add(shuffledCards.get(index++));
            }

            System.out.println("Player " + i + " : " + player);
        }

        if (index < shuffledCards.size()) {
            System.out.println("Remaining Cards : "
                    + shuffledCards.subList(index, shuffledCards.size()));
        }
    }
}
