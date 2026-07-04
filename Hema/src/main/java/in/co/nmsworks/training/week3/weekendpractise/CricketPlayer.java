package in.co.nmsworks.training.week3.weekendpractise;

import java.util.List;

public class CricketPlayer {
    private String name;
    private String teamName;
    private List<Integer> runs ;

    public CricketPlayer(String name, String teamName, List<Integer> runs) {
        this.name = name;
        this.teamName = teamName;
        this.runs = runs;
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

    public List<Integer> getRuns() {
        return runs;
    }

    public void setRuns(List<Integer> runs) {
        this.runs = runs;
    }

    @Override
    public String toString() {
        return "CricketPlayer{" +
                "name='" + name + '\'' +
                ", teamName='" + teamName + '\'' +
                ", runs=" + runs +
                '}';
    }
}
