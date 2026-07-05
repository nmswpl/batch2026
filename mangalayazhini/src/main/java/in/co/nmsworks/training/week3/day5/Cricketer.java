package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class Cricketer {
    String name;
    String team;
    List<Integer> scorePoints = new ArrayList<>();
    Integer totalScore = 0 ;


    public Cricketer(String name, String team, List<Integer> scorePoints) {
        this.name = name;
        this.team = team;
        this.scorePoints = scorePoints;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public List<Integer> getScorePoints() {
        return scorePoints;
    }

    public void setTotalScore() {
        for (int i = 0; i < scorePoints.size(); i++) {
            totalScore += scorePoints.get(i);
        }
    }

    public Integer getTotalScore(){
        setTotalScore();
        return totalScore;
    }
}
