package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Cricketer> teamMembers = new ArrayList<>();
    private Integer teamScore = 0 ;

    public Team(List<Cricketer> teamMembers){
        this.teamMembers = teamMembers;
        setTeamScore();

    }

    public void setTeamScore(){
        teamScore = 0;
        for (Cricketer teamMember : teamMembers) {
            teamScore += teamMember.getTotalScore();
        }
    }

    public Integer getTeamScore(){
        System.out.println("The total score of " + teamMembers.get(0).getTeam() + " : " + teamScore);
        return teamScore;
    }

    public void printTeamMembers(){
        System.out.println("\n\n\nMembers of " +teamMembers.get(0).getTeam()+ " :");
        for (Cricketer cricketer : teamMembers) {
            System.out.println(cricketer.getName() + " " + cricketer.getTeam() + " " + cricketer.getScorePoints() + " " + cricketer.getTotalScore());
        }
    }
}

