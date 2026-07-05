package in.co.nmsworks.training.week3.weekendpractise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CricketEvaluation {

    List<CricketPlayer> players = new ArrayList<>();

    public static void main(String[] args) {
        CricketEvaluation cricketEvaluation = new CricketEvaluation();
        cricketEvaluation.readFile();
        cricketEvaluation.scoreCard();

        for (CricketPlayer player : cricketEvaluation.players) {
            System.out.println(player);
        }
    }

    private void scoreCard() {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Downloads/cricket_score_card.txt")))
        {
            bufferedWriter.write("Team : Team Alpha\n");
            Integer teamAlphaRun = 0;

            for (CricketPlayer player : players) {
                if("Team Alpha".equals(player.getTeamName()))
                {
                    Integer totalRuns = 0;
                    Integer totalBalls = player.getRuns().size();
                    for (Integer run : player.getRuns()) {
                        totalRuns += run;
                    }

                    teamAlphaRun += totalRuns;
                    String data = player.getName() + "\t" + totalRuns + "\t" + totalBalls +"\n";
                    bufferedWriter.write(data);
                }
            }

            bufferedWriter.write("\nTOTAL \t" + teamAlphaRun);

            bufferedWriter.flush();
            bufferedWriter.write("\n\nTeam : Team Omega\n");

            Integer teamOmegaRun = 0;

            for (CricketPlayer player : players) {
                if("Team Omega".equals(player.getTeamName()))
                {
                    Integer totalRuns = 0;
                    Integer totalBalls = player.getRuns().size();
                    for (Integer run : player.getRuns()) {
                        totalRuns += run;
                    }

                    teamOmegaRun += totalRuns;
                    String data = player.getName() + "\t" + totalRuns + "\t" + totalBalls +"\n";
                    bufferedWriter.write(data);
                }
            }

            bufferedWriter.write("\nTOTAL \t" + teamOmegaRun);

            if((teamAlphaRun - teamOmegaRun) > 0)
            {
                bufferedWriter.write("\n\nRESULT : TEAM ALPHA WON BY "+ (teamAlphaRun-teamOmegaRun)+" RUNS" );
            } else if ((teamAlphaRun - teamOmegaRun) < 0) {
                bufferedWriter.write("\n\nRESULT : TEAM OMEGA WON BY "+ (teamOmegaRun-teamAlphaRun)+" RUNS" );
            }
            else
            {
                bufferedWriter.write("\n\nMATCH DRAW!!!");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readFile() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/cricket_match_data.txt")))
        {
            String line = "";

            bufferedReader.readLine();

            while ((line = bufferedReader.readLine())!= null)
            {
                String[] onePlayer = line.split(",");
                String name = onePlayer[0];
                String teamName = onePlayer[1];

                List<Integer> runs = new ArrayList<>();
                for (int i = 2; i < onePlayer.length; i++) {
                    runs.add(Integer.parseInt(onePlayer[i]));
                }

                players.add(new CricketPlayer(name,teamName,runs));

            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
