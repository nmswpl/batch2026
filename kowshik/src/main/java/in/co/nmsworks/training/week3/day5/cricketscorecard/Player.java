package in.co.nmsworks.training.week3.day5.cricketscorecard;

public class Player {
    private String name;
    private String teamName;
    private int ballsFaced;
    private int runsScored;

    public Player() {
    }

    public Player(String name, String teamName, int ballsFaced, int runsScored) {
        this.name = name;
        this.teamName = teamName;
        this.ballsFaced = ballsFaced;
        this.runsScored = runsScored;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBallsFaced() {
        return ballsFaced;
    }

    public void setBallsFaced(int ballsFaced) {
        this.ballsFaced = ballsFaced;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", teamName='" + teamName + '\'' +
                ", ballsFaced=" + ballsFaced +
                ", runsScored=" + runsScored +
                '}';
    }
}
