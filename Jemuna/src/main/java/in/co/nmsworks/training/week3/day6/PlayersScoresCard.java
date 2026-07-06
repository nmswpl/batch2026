package in.co.nmsworks.training.week3.day6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlayersScoresCard {

    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        readPlayersFile(players);
        printDetails(players);
    }

    private static void printDetails(List<Player> players) {
        System.out.println("Team : Team Alpha");
        int totalBallA = 0;
        int totalrunsA = 0;
        int totalBallB = 0;
        int totalrunsB = 0;
        for (Player player : players) {
            if(player.getTeamName().equals("Team Alpha")){
                totalBallA+= player.getNoOfBalls();
                totalrunsA+= player.getNoOfRuns();
                System.out.println(player.getName()+ "  "+ player.getNoOfBalls()+"  "+ player.getNoOfRuns());
            }
        }
        System.out.println("Total          "+totalBallA+"  "+totalrunsA);
        System.out.println("Team : Team Omega");
        for (Player player : players) {

            if(player.getTeamName().equals("Team Omega")){
                totalBallB+= player.getNoOfBalls();
                totalrunsB+= player.getNoOfRuns();
                System.out.println(player.getName()+ "  "+ player.getNoOfBalls()+"  "+ player.getNoOfRuns());
            }
        }
        System.out.println("Total          "+totalBallB+"  "+totalrunsB);

        //team won

        if(totalrunsA>totalrunsB){
            System.out.println("Team Alpha won Team Omega by "+totalrunsA+" runs");
        }
        else{
            System.out.println("Team Alpha won Team Omega by "+totalrunsB+" runs");
        }
    }

    public static void readPlayersFile(List<Player> playersLists ) {
        try(BufferedReader reader =  new BufferedReader(new FileReader("/home/nms-training/Downloads/cricket_match_data.txt"))){
            String line ;
            while((line = reader.readLine())!=null){
                String[] playerDetails = line.split(",");
                String name = playerDetails[0];
                String teamName = playerDetails[1];
                int noOfBalls = playerDetails.length-2;
                int runs = 0;
                for (int i = 2; i <playerDetails.length; i++) {
                    runs += Integer.parseInt(playerDetails[i]);
                }
                Player players = new Player(name, teamName, noOfBalls, runs);
                playersLists.add(players);
            }

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
