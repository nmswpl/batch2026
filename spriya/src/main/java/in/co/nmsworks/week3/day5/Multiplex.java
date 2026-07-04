package in.co.nmsworks.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class Multiplex {

    private int totalNoOfSeats;
    private String screenName;
    private int noOftickets;
    private List<String> availableSeats = new ArrayList<>();
    private List<String> bookedTickets;

    public int getNoOftickets() {
        return noOftickets;
    }

    public void setNoOftickets(int noOftickets) {
        this.noOftickets = noOftickets;
    }

    public int getTotalNoOfSeats() {
        return totalNoOfSeats;
    }

    public List<String> getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(List<String> availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void setTotalNoOfSeats(int totalNoOfSeats) {
        this.totalNoOfSeats = totalNoOfSeats;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public Multiplex(int totalNoOfSeats, String screenName) {
        this.totalNoOfSeats = totalNoOfSeats;
        this.screenName = screenName;
        this.bookedTickets = new ArrayList<>();

        for (int i = 1; i <= totalNoOfSeats; i++) {
            availableSeats.add(screenName + i);
        }
    }


    public void checkAvailability() {
        boolean isAvailable = getAvailableSeats(availableSeats, getNoOftickets());
        if (isAvailable) {
            System.out.println("====================");
            System.out.println("You can book tickets.There are " + getAvailableSeats().size() + " seats available!!!");
            System.out.println("====================");

        } else {
            System.out.println("Sorry!House Full.There are " + getAvailableSeats().size() + " seats available!!!");
        }

    }


    public boolean getAvailableSeats(List<String> availableSeats, int tickets) {

        if (tickets <= availableSeats.size()) {
            return true;

        } else {
            return false;
        }
    }

    public List<String> getBookedTickets() {
        return bookedTickets;
    }

    public void setBookedTickets(List<String> bookedTickets) {
        this.bookedTickets = bookedTickets;
    }

    public List<String> bookTickets(List<String> availableSeats, int tickets) {

        setNoOftickets(tickets);
        for (int i = 0; i < getNoOftickets(); i++) {
            bookedTickets.add(availableSeats.remove(0));
        }
        return availableSeats;
    }

    public void printtickets() {
        System.out.println("--- YOUR SEATS ---");
        for (int i = 0; i < bookedTickets.size(); i++) {
            System.out.println(bookedTickets.get(i));
        }
    }


}
