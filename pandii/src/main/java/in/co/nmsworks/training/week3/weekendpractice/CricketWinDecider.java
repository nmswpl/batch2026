package in.co.nmsworks.training.week3.weekendpractice;

import org.apache.commons.collections.map.LinkedMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CricketWinDecider {
    public static void main(String[] args) {
        CricketWinDecider cricketWinDecider=new CricketWinDecider();
        cricketWinDecider.cricketMatch("/home/nms-training/Downloads/cricket_match_data.txt");
    }

    private void cricketMatch(String path) {
        try (BufferedReader bufferedReader=new BufferedReader(new FileReader(path))){
            bufferedReader.readLine();
            String lines="";
            String [] arr;
            List<Integer> individualScores=new ArrayList<>();
            Map<String,List<CricketPlayer>> teamMap=new LinkedHashMap<>();

            List<Integer> teamRuns=new ArrayList<>();

            while((lines=bufferedReader.readLine())!=null) {
                arr = lines.split(",");

                int sum = 0;

                for (int i = 2; i < arr.length; i++) {
                    sum += Integer.parseInt(arr[i]);
                }
                CricketPlayer cricketPlayer = new CricketPlayer(arr[0], arr[1], sum);

                if (!teamMap.containsKey(arr[1])) {
                    teamMap.put(arr[1], new ArrayList<>());
                }
                teamMap.get(arr[1]).add(cricketPlayer);
            }

                for (String key : teamMap.keySet()) {
                    System.out.println(key);
                    int totalRuns=0;
                    for (CricketPlayer player : teamMap.get(key)) {
                        System.out.println(player.getName()+" "+player.getIndividualRuns());
                        totalRuns+=player.getIndividualRuns();
                    }
                    teamRuns.add(totalRuns);
                    System.out.println("Total Runs of "+key+" : "+totalRuns);
                }
                if(teamRuns.get(0)>teamRuns.get(1))
                {
                    System.out.println("team Alpha won by " + (teamRuns.get(0)-teamRuns.get(1)));
                }
                else if(teamRuns.get(0)<teamRuns.get(1)){
                    System.out.println("team Omega won by " + (teamRuns.get(1)-teamRuns.get(0)));
                }
                else {
                    System.out.println("Match drawn");
                }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
