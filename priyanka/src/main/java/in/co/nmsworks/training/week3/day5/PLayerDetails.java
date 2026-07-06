package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class PLayerDetails {

    private String name;
    private String teamName;
    private List<Integer> runsList = new ArrayList<>();

    public PLayerDetails(String name, String teamName, List<Integer> runsList) {
        this.name = name;
        this.teamName = teamName;
        this.runsList = runsList;
    }

    public String getName() {
        return name;
    }

    public String getTeamName() {
        return teamName;
    }

    public List<Integer> getRunsList() {
        return runsList;
    }

    public int getTotalRuns() {
        int total = 0;

        for (Integer run : runsList) {
            total += run;
        }

        return total;
    }

    public int getBallsFaced() {
        return runsList.size();
    }
}