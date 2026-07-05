package in.co.nmsworks.training.week3.day5.multiplex;

public class Multiplex {



    int checkAvailability(Screen s) {
        int capacity = s.getCapacity();
        int occupied = s.getOccupied();
        int remaining = capacity - occupied;
        return remaining;
    }

    Screen bookTickets(Screen s, int noOfTickets) {
        int capacity = s.getCapacity();
        int occupied = s.getOccupied();
        int remaining = capacity - occupied;


        if (remaining <= noOfTickets){
            System.out.println("tickets are not available");
        }
        else{
            System.out.println("ticket booked");
            s.occupied += noOfTickets;
        }
        return s;

    }
}
