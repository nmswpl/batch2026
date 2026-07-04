package in.co.nmsworks.training.week3.day5;

public class Screen {
    private String name;

    private int size;

    private int bookedTickets ;

    private int remainingTickets ;

    public Screen(String name,int size) {
        this.name = name;
        this.size = size;
        remainingTickets = size;
        bookedTickets = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getBookedTickets() {
        return bookedTickets;
    }

    public void setBookedTickets(int bookedTickets) {
        this.bookedTickets = bookedTickets;
    }

    public int getRemainingTickets() {
        return remainingTickets;
    }

    public void setRemainingTickets(int remainingTickets) {
        this.remainingTickets = remainingTickets;
    }
}
