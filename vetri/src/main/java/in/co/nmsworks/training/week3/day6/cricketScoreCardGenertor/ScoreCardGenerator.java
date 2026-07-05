package in.co.nmsworks.training.week3.day6.cricketScoreCardGenertor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ScoreCardGenerator {

    public static void main(String[] args) {
        ScoreCardGenerator scg=new ScoreCardGenerator();
        scg.generateScoreCard();
    }

    private void generateScoreCard() {

        try (BufferedReader br=new BufferedReader(new FileReader("/home/nms-training/Downloads/cricket_match_data.txt"))){
            String line="";
            br.readLine();
            List<BatsMan>alphaTeam=new ArrayList<>();
            List<BatsMan>betaTeam=new ArrayList<>();
            int alphaTotalRuns=0;
            int alphaTotalBalls=0;
            int betaTotalRuns=0;
            int betaTotalballs=0;

            while ((line=br.readLine())!=null){
                String[] data = line.split(",");
                String PlayerName = data[0].trim();
                String unTeamNmae = data[1].trim();
                String[] cleanedTeamName = unTeamNmae.split(" ");
                String TeamName = cleanedTeamName[1];
                Integer ballsFaced= data.length-2;
                Integer runs=0;
                for (int i = 2; i < data.length; i++) {
                    runs+=Integer.parseInt(data[i].trim());
                }
                BatsMan bt=new BatsMan(PlayerName,TeamName,ballsFaced,runs);


                if (TeamName.equalsIgnoreCase("Alpha")){
                    alphaTeam.add(bt);
                    alphaTotalBalls+=ballsFaced;
                    alphaTotalRuns+=runs;
                }
                else {
                    betaTeam.add(bt);
                    betaTotalballs+=ballsFaced;
                    betaTotalRuns+=runs;
                }
            }

            System.out.println("Team Score Board");
            System.out.println("Team Alpha   Runs  Balls");
            for (BatsMan batsMan : alphaTeam) {

                System.out.println(batsMan.getName() + " " + batsMan.getRuns()+ " "+batsMan.getBallsFaced());

            }
            System.out.println();
            System.out.println("Team Beta  Runs  Balls");
            for (BatsMan batsMan : betaTeam) {

                System.out.println(batsMan.getName() + " " + batsMan.getRuns()+ " "+batsMan.getBallsFaced() );
            }
            if (alphaTotalRuns > betaTotalRuns) {
                System.out.println("RESULT : TEAM ALPHA WON BY " + (alphaTotalRuns - betaTotalRuns) + " RUNS.");
            } else if (betaTotalRuns > alphaTotalRuns) {
                System.out.println("RESULT : TEAM OMEGA WON BY " + (betaTotalRuns - alphaTotalRuns) + " RUNS.");
            } else {
                System.out.println("RESULT : MATCH TIED.");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
