package in.co.nmsworks.training.week3.weekend.cricketScoreCard;


public class Player {

    private String name;
    private String team;
    private int runs;
    private int balls;

    public Player(String name, String team, int runs, int balls) {
        this.name = name;
        this.team = team;
        this.runs = runs;
        this.balls = balls;
    }

    public String getTeam() {
        return team;
    }

    public int getRuns() {
        return runs;
    }

    public int getBalls() {
        return balls;
    }

    @Override
    public String toString() {
        return String.format("%-20s %5d %5d", name, runs, balls);
    }
}
