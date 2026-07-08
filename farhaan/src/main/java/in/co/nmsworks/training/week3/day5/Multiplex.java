package in.co.nmsworks.training.week3.day5;

import java.util.List;

public class Multiplex {

    public void checkAvailability(List<Screen> screens, Screen screen) {

        if (checkScreen(screens, screen)) {

            int availableSeats = screen.getSeatCapacity() - screen.getFilledSeats();

            if (availableSeats > 0) {
                System.out.println("Available Seats : " + availableSeats);
            } else {
                System.out.println("No seats available.");
            }
        } else {
            System.out.println("Screen not found.");
        }
    }

    public void bookTicket(List<Screen> screens, Screen screen, int noOfTickets) {

        if (!checkScreen(screens, screen)) {
            System.out.println("Screen not found.");
            return;
        }

        int availableSeats = screen.getSeatCapacity() - screen.getFilledSeats();

        if (noOfTickets <= availableSeats) {

            int seatNumber = screen.getFilledSeats() + 1;

            for (int i = 1; i <= noOfTickets; i++) {
                System.out.println("-------------------------");
                System.out.println("Ticket Booked Successfully");
                System.out.println("Screen : " + screen.getScreenName());
                System.out.println("Ticket Number : " + seatNumber);
                seatNumber++;
            }


            screen.setFilledSeats(screen.getFilledSeats() + noOfTickets);

        } else {
            System.out.println("Only " + availableSeats + " seats are available.");
        }
    }

    private boolean checkScreen(List<Screen> screens, Screen screen) {
        return screens.contains(screen);
    }
}