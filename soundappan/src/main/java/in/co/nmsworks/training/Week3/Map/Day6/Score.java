package in.co.nmsworks.training.Week3.Map.Day6;

public class Score {
    private Integer score;
    private Integer balls;

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getBalls() {
        return balls;
    }

    public void setBalls(Integer balls) {
        this.balls = balls;
    }

    public Score(Integer score, Integer balls) {
        this.score = score;
        this.balls = balls;
    }
}
