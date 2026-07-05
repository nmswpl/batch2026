package in.co.nmsworks.training.week3practices;

public class PlayerStats {
    String name;
    int runs;
    int balls;

    public String getName() {
        return name;
    }

    public void setPlayer(String player) {
        this.name = name;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public PlayerStats() {
    }

    public PlayerStats(String player, int runs, int balls) {
        this.name = name;
        this.runs = runs;
        this.balls = balls;
    }
}
