package in.co.nmsworks.training.Week3.Map.Day6;

import java.util.Objects;

public class Player {
    private String name;
    private String team;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name) && Objects.equals(team, player.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, team);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Player(String name, String team) {
        this.name = name;
        this.team = team;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
