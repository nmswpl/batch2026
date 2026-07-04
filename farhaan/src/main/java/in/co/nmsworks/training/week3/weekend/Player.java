package in.co.nmsworks.training.week3.weekend;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String team;
    private String name;
    private Integer totalRuns;
    private List<Integer> runScored;

    public Player(String team, String name, Integer totalRuns) {
        this.team = team;
        this.name = name;
        this.totalRuns = totalRuns;
    }

    public Player(String name, String team) {
        this.team = team;
        this.name = name;
        runScored = new ArrayList<>();
    }

    public List<Integer> getRunScored() {
        return runScored;
    }

    @Override
    public String toString() {
        return
                "team : " + team +
                " name : " + name  +
                " Total Runs Scored : " + totalRuns
                + "Balls Faced : " + runScored.size();
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(Integer totalRuns) {
        this.totalRuns = totalRuns;
    }
}
