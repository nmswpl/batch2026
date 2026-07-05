package in.co.nmsworks.training.week3.day6;

public class CricketScoreCard {
    private String name;
    private String teamName;
    private Integer noOfBalls;
    private Integer noOfRuns;

    public CricketScoreCard(String name, String teamName, Integer noOfBalls, Integer noOfRuns) {
        this.name = name;
        this.teamName = teamName;
        this.noOfBalls = noOfBalls;
        this.noOfRuns = noOfRuns;
    }

    public CricketScoreCard() {
    }

    public String getName() {
        return name;
    }

    public String getTeamName() {
        return teamName;
    }

    public Integer getNoOfBalls() {
        return noOfBalls;
    }

    public Integer getNoOfRuns() {
        return noOfRuns;
    }

    @Override
    public String toString() {
        return "CricketScoreCard{" +
                "name='" + name + '\'' +
                ", teamName='" + teamName + '\'' +
                ", noOfBalls=" + noOfBalls +
                ", noOfRuns=" + noOfRuns +
                '}';
    }
}
