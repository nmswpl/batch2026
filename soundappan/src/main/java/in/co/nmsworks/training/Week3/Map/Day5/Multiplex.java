package in.co.nmsworks.training.Week3.Map.Day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Multiplex {
    private Map<Integer, Screen> screens = new HashMap<>();
    public Multiplex() {
        screens.put(1, new Screen(1, "Leo", 100, 150));
        screens.put(2, new Screen(2, "Jailer", 80, 200));
        screens.put(3, new Screen(3, "Vikram", 120, 180));
    }

    public void displayScreens() {
        for (Screen screen : screens.values()) {
            screen.display();
        }
    }
    public void bookTicket(int screenNo, int tickets) {
        Screen screen = screens.get(screenNo);
        if (screen == null) {
            System.out.println("Screen not found!");
            return;
        }
        if (screen.checkAvailable(tickets)) {
            int amount = tickets * screen.getPrice();
            System.out.println("Booked");
            System.out.println("Movie : " + screen.getMovie());
            System.out.println("Tickets : " + tickets);
            System.out.println("Total Amount : " + amount);
            System.out.println("Remaining Seats : " + screen.getTotalSeat());
        }
    }
}

