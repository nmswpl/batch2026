package in.co.nmsworks.training.week3.day5;

public class Screen {

    private int seatNum = 1;

    private int screenId;
    private String screenName;
    private int totalSeats;
    private int totalAvailableSeats;

    public Screen() {
    }

    public Screen(int screenId, String screenName, int totalSeats, int totalAvailableSeats) {
        this.screenId = screenId;
        this.screenName = screenName;
        this.totalSeats = totalSeats;
        this.totalAvailableSeats = totalAvailableSeats;
    }

    public int getScreenId() {
        return screenId;
    }

    public void setScreenId(int screenId) {
        this.screenId = screenId;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getTotalAvailableSeats() {
        return totalAvailableSeats;
    }

    public void setTotalAvailableSeats(int totalAvailableSeats) {
        this.totalAvailableSeats = totalAvailableSeats;
    }

    public int getSeatNum() {
        return seatNum++;
    }

    public void reduceAvailableSeats(int count) {
        totalAvailableSeats -= count;
    }
}
