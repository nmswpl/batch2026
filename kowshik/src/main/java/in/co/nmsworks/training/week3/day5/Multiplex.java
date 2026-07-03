package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Multiplex {

    private Map<Integer, Screen> screenMap = new HashMap<>();

    public Map<Integer, Screen> getScreenMap() {
        return screenMap;
    }

    public boolean isSeatAvailable(int requiredCount, int screenNum) {
        int totalAvailableSeats = screenMap.get(screenNum).getTotalAvailableSeats();
        return totalAvailableSeats >= requiredCount;
    }

    public void checkAvailability(int requiredCount, int screenNum) {
        if(isSeatAvailable(requiredCount, screenNum)) {
            System.out.println("Tickets available for " + requiredCount + " in screen-" + screenMap.get(screenNum).getScreenName());
        }
        else {
            System.out.println("Tickets not available for " + requiredCount + " in screen-" + screenMap.get(screenNum).getScreenName() + ". Only " + screenMap.get(screenNum).getTotalAvailableSeats() + " available!!");
        }

        displayAvailableTickets(screenNum);
    }

    public Ticket bookTicket(int requiredCount, int screenNum) {
        if (!isSeatAvailable(requiredCount, screenNum)) {
            System.out.println("Tickets not available for " + requiredCount + "members in Screen-" + screenMap.get(screenNum).getScreenName());
            return null;
        }

        Screen screen = screenMap.get(screenNum);
        screen.reduceAvailableSeats(requiredCount);

        List<Integer> seatNums = new ArrayList<>();
        for (int i = 0; i < requiredCount; i++) {
            seatNums.add(screen.getSeatNum());
        }

        Ticket ticket = new Ticket();
        ticket.setScreenName(screen.getScreenName());
        ticket.setSeatNum(seatNums);

        System.out.println("Ticket booked for Screen-" + screen.getScreenName() + " for seat no's - " + seatNums);

        return ticket;
    }

    public int displayAvailableTickets(int screenNum) {
        int totalAvailableSeats = screenMap.get(screenNum).getTotalAvailableSeats();
        System.out.println("Available seats : " + totalAvailableSeats);
        return totalAvailableSeats;
    }
}
