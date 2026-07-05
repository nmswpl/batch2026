package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class Team {
    List<Cricketer> teamMemebers = new ArrayList<>();
    Integer teamScore = 0 ;

    Team(List<Cricketer> teamMemebers){
        this.teamMemebers = teamMemebers;
    }

    public void setTeamScore(){
        for (Cricketer teamMemeber : teamMemebers) {
            teamScore += teamMemeber.getTotalScore();
        }
    }

    public Integer getTeamScore(){
        setTeamScore();
        System.out.println("The total score of " + teamMemebers.get(0).getTeam() + " : " + teamScore);
        return teamScore;
    }

    public void printTeamMembers(){
        System.out.println("\n\n\nMemebers of " +teamMemebers.get(0).getTeam()+ " :");
        for (Cricketer cricketer : teamMemebers) {
            System.out.println(cricketer.getName() + " " + cricketer.getTeam() + " " + cricketer.getScorePoints() + " " + cricketer.getTotalScore());
        }
    }
}

