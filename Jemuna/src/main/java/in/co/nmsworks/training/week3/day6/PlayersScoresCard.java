package in.co.nmsworks.training.week3.day6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlayersScoresCard {

    public static void main(String[] args) {
        List<PlayersList> playersLists = new ArrayList<>();
        readPlayersFile(playersLists);
        printDetails(playersLists);
    }

    private static void printDetails(List<PlayersList> playersLists ) {
        System.out.println("Team : Team Alpha");
        int totalBallA = 0;
        int totalrunsA = 0;
        int totalBallB = 0;
        int totalrunsB = 0;
        for (PlayersList playersList : playersLists) {
            if(playersList.getTeamName().equals("Team Alpha")){
                totalBallA+= playersList.getNoOfBalls();
                totalrunsA+= playersList.getNoOfRuns();
                System.out.println(playersList.getName()+ "  "+ playersList.getNoOfBalls()+"  "+playersList.getNoOfRuns());
            }
        }
        System.out.println("Total          "+totalBallA+"  "+totalrunsA);
        System.out.println("Team : Team Omega");
        for (PlayersList playersList : playersLists) {

            if(playersList.getTeamName().equals("Team Omega")){
                totalBallB+= playersList.getNoOfBalls();
                totalrunsB+= playersList.getNoOfRuns();
                System.out.println(playersList.getName()+ "  "+ playersList.getNoOfBalls()+"  "+playersList.getNoOfRuns());
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

    public static void readPlayersFile(List<PlayersList> playersLists ) {
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
                PlayersList players = new PlayersList(name, teamName, noOfBalls, runs);
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
