package in.co.nmsworks.training.week3.day5;

public class Screen {
    private int id;
    private int capacity;
    private int seatsFilled;
    private String movieName;


    public Screen(int id, int capacity, String movieName) {
        this.id = id;
        this.capacity = capacity;
        this.movieName = movieName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSeatsFilled() {
        return seatsFilled;
    }

    public void setSeatsFilled(int seatsFilled) {
        this.seatsFilled = seatsFilled;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Screen " + getId() + " " +  getMovieName() +  ", seats = " + getSeatsFilled() +
                " / " + getCapacity();
    }
}
