package in.co.nmsworks.training.week3.weekend;

import java.util.ArrayList;
import java.util.List;

public class Cricketer {
    private final String name;
    private final String team;
    private List<Integer> runsScored;

    public Cricketer(String name, String team) {
        this.name = name;
        this.team = team;
        runsScored = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public List<Integer> getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(List<Integer> runsScored) {
        this.runsScored = runsScored;
    }

    @Override
    public String toString() {
        return getName() + " (" + getTeam() + ") : " + getRunsScored();

    }
}
