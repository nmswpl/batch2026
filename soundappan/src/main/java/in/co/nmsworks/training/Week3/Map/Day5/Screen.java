package in.co.nmsworks.training.Week3.Map.Day5;

public class Screen {
    private Integer screenName;
    private String movie;
    private Integer totalSeat;
    private Integer price;

    public Screen(Integer screenName, String movie, Integer totalSeat, Integer price) {
        this.screenName = screenName;
        this.movie = movie;
        this.totalSeat = totalSeat;
        this.price = price;
    }

    public Integer getScreenName() {
        return screenName;
    }

    public void setScreenName(Integer screenName) {
        this.screenName = screenName;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public Integer getTotalSeat() {
        return totalSeat;
    }

    public void setTotalSeat(Integer totalSeat) {
        this.totalSeat = totalSeat;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void display() {
        System.out.println("Screen : " + screenName);
        System.out.println("Movie  : " + movie);
        System.out.println("Seats  : " + totalSeat);
        System.out.println("Price  : " + price);
        System.out.println("---------------------------");
    }

    public boolean checkAvailable(int ticket) {
        if (ticket <= totalSeat) {
            totalSeat -= ticket;
            return true;
        }
        return false;
    }
}