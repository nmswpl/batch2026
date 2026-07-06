package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class PLayerDetails {
    private String name;
    private String teamName;
    private List<Integer> runsList = new ArrayList<>();
    private Integer totalRuns = 0;

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

    public List<Integer> getRunsList() {
        return runsList;
    }

    public void setRunsList(List<Integer> runsList) {
        this.runsList = runsList;
    }

    public Integer getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(List<Integer> runsList) {
        for (Integer i : runsList) {
            totalRuns += i;
        }
    }
}
