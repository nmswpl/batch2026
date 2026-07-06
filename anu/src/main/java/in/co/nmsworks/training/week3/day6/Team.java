package in.co.nmsworks.training.week3.day6;

import java.util.ArrayList;
import java.util.List;

public class Team {
    public String name;
    List<Player> players = new ArrayList<>();
    int totalRuns = 0;
    int totalBalls = 0;

    Team(String name) {
        this.name = name;
    }

    void addPlayer(Player p) {
        players.add(p);
        totalRuns += p.runs;
        totalBalls += p.balls;
    }
}
