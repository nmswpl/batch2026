package in.co.nmsworks.training.week3.day6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cricket {
    public static void main(String[] args) {
       Cricket cricket = new Cricket();
       Map<Players,Score>playersScoreMap=cricket.readFile();
//        for (Map.Entry<Players, Score> playersScoreEntry : playersScoreMap.entrySet()) {
//            System.out.println(playersScoreEntry.getKey());
//            System.out.println(playersScoreEntry.getValue());
//        }
        System.out.println("Team Alpaha");
       Map<Players,Score>alpha = cricket.team1(playersScoreMap);
        int totalscoreForAlpha = 0,totalBallsFaced = 0;
        for (Map.Entry<Players, Score> playersScoreEntry : alpha.entrySet()) {
            totalscoreForAlpha += playersScoreEntry.getValue().getTotalScore();
            totalBallsFaced += playersScoreEntry.getValue().getCount();
        }
        for (Map.Entry<Players, Score> playersScoreEntry : alpha.entrySet()) {
            System.out.println(playersScoreEntry.getKey().getName());
            System.out.println(playersScoreEntry.getValue());

        }
        System.out.print("Total score : " +totalscoreForAlpha );
        System.out.print("Total balls faced :"+totalBallsFaced);
        System.out.println("---------------------------");
        System.out.println("Team Omega ");
      Map<Players,Score>omega = cricket.team2(playersScoreMap);
        int totalscoreForOmega = 0,totalBallsFacedOmega = 0 ;
        for (Map.Entry<Players, Score> playersScoreEntry : omega.entrySet()) {
            totalscoreForOmega += playersScoreEntry.getValue().getTotalScore();
            totalBallsFacedOmega += playersScoreEntry.getValue().getCount();
        }
        for (Map.Entry<Players, Score> playersScoreEntry : omega.entrySet()) {
            System.out.println(playersScoreEntry.getKey().getName());
            System.out.println(playersScoreEntry.getValue());

        }
        System.out.println("Total score :"+totalscoreForOmega+"  ");
        System.out.print("balls faced :"+totalBallsFacedOmega);
        if (totalscoreForAlpha < totalscoreForOmega){
            System.out.println("Omega teams wins with difference :"+(totalscoreForOmega-totalscoreForAlpha));
        }else{
            System.out.println("Alpha teams wins with diffrenec :"+(totalscoreForAlpha-totalscoreForOmega));
        }

    }

    private  Map<Players, Score> team2(Map<Players, Score> playersScoreMap) {
        Map<Players,Score> teamOmega = new HashMap<>();
        for (Map.Entry<Players, Score> playersScoreEntry : playersScoreMap.entrySet()) {
            if ("Team Omega".equals(playersScoreEntry.getKey().getTeamName())) {
                teamOmega.put(playersScoreEntry.getKey(),playersScoreEntry.getValue());

            }


        }
        return  teamOmega;

    }

    private Map<Players, Score> team1(Map<Players, Score> playersScoreMap) {
        Map<Players,Score> teamAlpha = new HashMap<>();
        for (Map.Entry<Players, Score> playersScoreEntry : playersScoreMap.entrySet()) {
            if ("Team Alpha".equals(playersScoreEntry.getKey().getTeamName())) {
                teamAlpha.put(playersScoreEntry.getKey(),playersScoreEntry.getValue());

            }


        }
        return  teamAlpha;
    }


    private Map<Players,Score> readFile() {
        Map<Players, Score> players = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/cricket_match_data.txt"))) {
            String line = "";
            players = new HashMap<>();
            while ((line = bufferedReader.readLine()) != null) {
                int count = 0;
                String[] str = line.split(",");
                Players p = new Players(str[0], str[1]);

                Score s = new Score();
                int runs = 0;
                for (int i = 2; i < str.length; i++) {
                    runs += Integer.parseInt(str[i]);
                    s = new Score(runs , count);
                    count++;

                }
                players.put(p, s);


            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return players;


    }
}
