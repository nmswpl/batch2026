package in.co.nmsworks.training.week3.weekendpractice;

public class CricketPlayer {
    private String name;
    private String teamname;
    private Integer individualRuns;

    public CricketPlayer(String name, String teamname, Integer individualRuns) {
        this.name = name;
        this.teamname = teamname;
        this.individualRuns = individualRuns;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public Integer getIndividualRuns() {
        return individualRuns;
    }

    public void setIndividualRuns(Integer individualRuns) {
        this.individualRuns = individualRuns;
    }

    @Override
    public String toString() {
        return "CricketPlayer{" +
                "name='" + name + '\'' +
                ", teamname='" + teamname + '\'' +
                ", individualRuns=" + individualRuns +
                '}';
    }
}
