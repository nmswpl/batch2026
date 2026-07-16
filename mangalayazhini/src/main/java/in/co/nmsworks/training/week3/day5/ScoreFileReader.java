package in.co.nmsworks.training.week3.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ScoreFileReader {
    public List<Cricketer> scoreReader(String path){
        List<Cricketer> cricketerList = new ArrayList<>();
        try(BufferedReader readerObj = new BufferedReader(new FileReader(path))){
            String scoreRow ;
            String fileScore = "";
            String[] scoreDetails;

            while((scoreRow = readerObj.readLine()) != null){
                scoreDetails = scoreRow.split(",");

                String cricketerName = scoreDetails[0];
                String cricketerTeam = scoreDetails[1];
                List<Integer> scoreList = new ArrayList<>();
                for (int i = 2; i < scoreDetails.length; i++) {
                    scoreList.add(Integer.valueOf(scoreDetails[i]));
                }

                cricketerList.add(new Cricketer(cricketerName,cricketerTeam,scoreList));
//                for (int i = 0; i < scoreDetails.length; i++) {
//                    System.out.print(scoreDetails[i] + " : ");
//                }
                fileScore += scoreRow + "\n";
            }

//            System.out.println("fileScore : \n"+fileScore);
        }catch(Exception e){
            e.printStackTrace();
        }

        for (Cricketer cricketer : cricketerList) {
            System.out.println(cricketer.getName() + " " + cricketer.getTeam() + " " + cricketer.getScorePoints() + " " + cricketer.getTotalScore());
        }


        return cricketerList;
    }


    public List<Cricketer> groupTeamMembers(List<Cricketer> cricketers, String teamName){
        List<Cricketer> teamMembersList = new ArrayList<>();

        for (Cricketer cricketer : cricketers) {
            if(teamName.equals(cricketer.getTeam())){
                teamMembersList.add(cricketer);
            }
        }

        return teamMembersList;
    }

}
