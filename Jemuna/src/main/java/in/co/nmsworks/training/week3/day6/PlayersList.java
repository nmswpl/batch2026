package in.co.nmsworks.training.week3.day6;

public class PlayersList {

    private String name;
    private String teamName;
    private int noOfBalls;
    private int noOfRuns;


    public PlayersList() {
    }

    public PlayersList(String name, String teamName, int noOfBalls, int noOfRuns) {
        this.name = name;
        this.teamName = teamName;
        this.noOfBalls = noOfBalls;
        this.noOfRuns = noOfRuns;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getNoOfBalls() {
        return noOfBalls;
    }

    public void setNoOfBalls(int noOfBalls) {
        this.noOfBalls = noOfBalls;
    }

    public int getNoOfRuns() {
        return noOfRuns;
    }

    public void setNoOfRuns(int noOfRuns) {
        this.noOfRuns = noOfRuns;
    }

    @Override
    public String toString() {
        return "PlayersList{" +
                "name='" + name + '\'' +
                ", teamName='" + teamName + '\'' +
                ", noOfBalls=" + noOfBalls +
                ", noOfRuns=" + noOfRuns +
                '}'+"\n";
    }
}
