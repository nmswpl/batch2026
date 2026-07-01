package in.co.nmsworks.training.week3.Day3;

public class GameScore {
    private String gameName;
    private Double gameScore;

    public GameScore(String gameName, Double gameScore) {
        this.gameName = gameName;
        this.gameScore = gameScore;
    }

    public String getGameName() {
        return gameName;
    }

    public Double getGameScore() {
        return gameScore;
    }

    @Override
    public String toString() {
        return "GameScore{" +
                "gameName='" + gameName + '\'' +
                ", gameScore=" + gameScore +
                '}';
    }
}
