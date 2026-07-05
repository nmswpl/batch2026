package in.co.nmsworks.training.week3.weekend;

public class Match {
    private ScoreCard homeTeamScoreCard;
    private ScoreCard awayTeamScoreCard;
    private Result wonTheMatch;

    public Match() {
    }

    public Match(ScoreCard homeTeamScoreCard, ScoreCard awayTeamScoreCard) {
        this.homeTeamScoreCard = homeTeamScoreCard;
        this.awayTeamScoreCard = awayTeamScoreCard;
    }

    public ScoreCard gethomeTeamScoreCard() {
        return homeTeamScoreCard;
    }

    public void sethomeTeamScoreCard(ScoreCard homeTeamScoreCard) {
        this.homeTeamScoreCard = homeTeamScoreCard;
    }

    public ScoreCard getawayTeamScoreCard() {
        return awayTeamScoreCard;
    }

    public void setawayTeamScoreCard(ScoreCard awayTeamScoreCard) {
        this.awayTeamScoreCard = awayTeamScoreCard;
    }

    public Result getWonTheMatch() {
        return wonTheMatch;
    }

    public void setWonTheMatch(Result wonTheMatch) {
        this.wonTheMatch = wonTheMatch;
    }
}
