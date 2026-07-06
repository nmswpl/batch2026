package in.co.nmsworks.training.week3.day6;

import java.util.*;

public class Cards {

    public static void main(String[] args) {

        String[] suits = {"H", "D", "S", "C"};
        List<String> deck = new ArrayList<>();
        for (String suite : suits) {
            for (int i = 1; i <=13 ; i++) {
                deck.add(suite+i);
            }
        }
        Collections.shuffle(deck);

        Map<String,List<String>> playersMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of Players : ");
        int noOfPlayers = scanner.nextInt();
        if(noOfPlayers>0){
            for (int i = 0; i < deck.size(); i++) {
                int playerIndex = i % noOfPlayers;
                String cards= deck.get(i);
                String players = "Player "+playerIndex;
                playersMap.putIfAbsent(players,new ArrayList<>());
                playersMap.get(players).add(cards);
            }
            for (Map.Entry<String, List<String>> cardsPerPlayer : playersMap.entrySet()) {
                System.out.println(cardsPerPlayer.getKey()+" : "+cardsPerPlayer.getValue());

            }
            scanner.close();
        }
        else{
            System.out.println("Enter a valid number of players...");
        }

        }
    }


