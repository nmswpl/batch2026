package in.co.nmsworks.training.week3.day5;

public class Screen {

    private int seatCapacity;
    private String screenName;
    private int filledSeats;

    public Screen(int seatCapacity, String screenName) {
        this.seatCapacity = seatCapacity;
        this.screenName = screenName;
        this.filledSeats = 0;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public int getFilledSeats() {
        return filledSeats;
    }

    public void setFilledSeats(int filledSeats) {
        this.filledSeats = filledSeats;
    }
}