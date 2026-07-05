package in.co.nmsworks.training.week3.weekend;

import java.util.List;

public class Players {
    private String name;
    private String teamName;
    private List<Integer> runsInEachBall;

    public Players(String name, String teamName, List<Integer> runsInEachBall) {
        this.name = name;
        this.teamName = teamName;
        this.runsInEachBall = runsInEachBall;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<Integer> getRunsInEachBall() {
        return runsInEachBall;
    }

    public void setRunsInEachBall(List<Integer> runsInEachBall) {
        this.runsInEachBall = runsInEachBall;
    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", teamName='" + teamName + '\'' +
                ", runsInEachBall=" + runsInEachBall +
                '}';
    }
}
