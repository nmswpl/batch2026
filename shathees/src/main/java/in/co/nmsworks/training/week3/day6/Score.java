package in.co.nmsworks.training.week3.day6;

public class Score {
    private int totalScore;
    private int count;

    public Score(int totalScore, int count) {
        this.totalScore = totalScore;
        this.count = count;
    }

    public Score() {
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Score{" +
                "totalScore=" + totalScore +
                ", count=" + count +
                '}';
    }
}
