package in.co.nmsworks.training.week3.day6.cricketScoreCardGenertor;

import java.util.Objects;

public class BatsMan {
    private String name;
    private String team;
    private Integer ballsFaced;
    private Integer runs;

    public BatsMan() {
    }

    public BatsMan(String name, String team, Integer ballsFaced, Integer runs) {
        this.name = name;
        this.team = team;
        this.ballsFaced = ballsFaced;
        this.runs = runs;
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

    public Integer getBallsFaced() {
        return ballsFaced;
    }

    public void setBallsFaced(Integer ballsFaced) {
        this.ballsFaced = ballsFaced;
    }

    public Integer getRuns() {
        return runs;
    }

    public void setRuns(Integer runs) {
        this.runs = runs;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        BatsMan batsMan = (BatsMan) o;
        return Objects.equals(name, batsMan.name) && Objects.equals(team, batsMan.team) && Objects.equals(ballsFaced, batsMan.ballsFaced) && Objects.equals(runs, batsMan.runs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, team, ballsFaced, runs);
    }

    @Override
    public String
    toString() {
        return "BatsMan{" +
                "name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", ballsFaced=" + ballsFaced +
                ", runs=" + runs +
                '}';
    }
}
