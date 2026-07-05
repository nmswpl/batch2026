package in.co.nmsworks.training.week3.weekend;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ScoreCard {
    private String teamName;
    private Integer totalScore;
    private Integer noOfWickets;
    private Map<String, Integer> eachPlayerWithScore = new LinkedHashMap<>();

    public ScoreCard() {
    }

    public ScoreCard(String teamName) {
        this.teamName = teamName;
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }

    public Integer getNoOfWickets() {
        return noOfWickets;
    }

    public void setNoOfWickets(Integer noOfWickets) {
        this.noOfWickets = noOfWickets;
    }

    public Map<String, Integer> getEachPlayerWithScore() {
        return eachPlayerWithScore;
    }

    public void setEachPlayerWithScore(Map<String, Integer> eachPlayerWithScore) {
        this.eachPlayerWithScore = eachPlayerWithScore;
    }

    public String getteamName() {
        return teamName;
    }

    public void setteamName(String teamName) {
        this.teamName = teamName;
    }
}
