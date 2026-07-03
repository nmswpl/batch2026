package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Multiplex {
    private Integer capacity;
    private String screenName;
    List<String> seats = new ArrayList<>();

    public Multiplex() {
    }

    public Multiplex(Integer capacity, String screenName) {
        this.capacity = capacity;
        this.screenName = screenName;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Multiplex{" +
                "capacity=" + capacity +
                ", screenName='" + screenName + '\'' +
                '}';
    }

    List<String> addSeats(Integer capacity) {
        for (int i = 1; i <= getCapacity(); i++) {
            seats.add(getScreenName()+i);
        }
        return seats;
    }

    public List<String> bookTicket() {
        List<String> bookedSeats = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("No of seats needed : ");
            Integer ticketCount = scanner.nextInt();

            System.out.println("Received value is :: "+ ticketCount);

            Integer availCount = checkAvailability(bookedSeats);
            System.out.println("Available count : " + availCount);
            if (availCount < ticketCount) {
                System.out.println("Requested seat count not available for :  " + getScreenName() + "Only " + availCount + " seats available");
            } else {

                for (int i = 0; i < ticketCount; i++) {
                    bookedSeats.add(seats.get(i));
                }
                System.out.print("Seats Booked : ");
                System.out.println(bookedSeats);
                System.out.println("Available Seat Count Is : " + (seats.size() - bookedSeats.size()));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        //Integer availableCount = seats.size() - bookedSeats.size();
        return bookedSeats;
    }

    Integer checkAvailability(List<String> bookedSeats) {
        Integer count ;
        if (seats.containsAll(bookedSeats)) {
            seats.removeAll(bookedSeats);
             count = seats.size();
        }else {
            count = getCapacity();
        }

         return count;
    }
}
