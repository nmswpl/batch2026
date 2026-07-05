package in.co.nmsworks.training.week3.day6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Player {
    private String Name;
    private String teamName;
    private  List<Integer> runs = new ArrayList<>();

    public Player() {
    }

    public Player(String name, String teamName, List<Integer> runs) {
        Name = name;
        this.teamName = teamName;
        this.runs = runs;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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
        return "Player{" +
                "Name='" + Name + '\'' +
                ", teamName='" + teamName + '\'' +
                ", runs=" + runs +
                '}';
    }
}
