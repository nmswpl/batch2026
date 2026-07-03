package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class Multiplex {
    private List<Screen> screens;
    private static int ticketCounter = 0;

    public Multiplex() {
        this.screens = new ArrayList<>();
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }

    private Screen getScreen(int id){
        return getScreens().get(id - 1);
    }

    public boolean bookSeats(int numOfTickets, int screenId){
        String ticketId = "";
        if (screenId > getScreens().size()){
            System.err.println(" ERROR : SCREEN ID NOT FOUND, try again" + screenId + "," + getScreens().size());
        }

        Screen bookedScreen = getScreen(screenId);
        if(checkSeatAvailability(numOfTickets, bookedScreen)){
            bookedScreen.setSeatsFilled(bookedScreen.getSeatsFilled() + numOfTickets);
            ++Multiplex.ticketCounter;
            ticketId += "SC-" + bookedScreen.getId() + "-T" + Multiplex.ticketCounter;
            System.out.println("--------BOOKING SUCCESSFUL -------");
            System.out.println("---------------------------------");
            System.out.println("TICKET ID  : " + ticketId);
            System.out.println("SCREEN NO  : " + bookedScreen.getId());
            System.out.println("MOVIE NAME : " + bookedScreen.getMovieName());
            System.out.println("SEAT NO    : " + (bookedScreen.getSeatsFilled() - numOfTickets + 1) + " to " + bookedScreen.getSeatsFilled());
            System.out.println("-------------------------------");
            return true;
        }else {
            System.out.println("CAN'T BOOK " + numOfTickets + " TICKETS !!");
            System.out.println("NO OF TICKETS AVAILABLE FOR SCREEN " + screenId + " : " + getAvailableSeats(bookedScreen.getId()));
        }
        return false;
    }

    public boolean checkSeatAvailability(int numOfTickets, Screen screen) {
        return  (screen.getCapacity() - screen.getSeatsFilled()) > numOfTickets;
    }

    public int getAvailableSeats(int screenId) {
        Screen screen = getScreen(screenId);
        return  (screen.getCapacity() - screen.getSeatsFilled());
    }

    public void addScreen(int capacity, String movieName){
        int numOfScreens = getScreens().size();
        Screen screen = new Screen(numOfScreens + 1, capacity, movieName);
        screens.add(screen);
    }

    public void displayScreens(){
        for (Screen screen : screens) {
            System.out.println(screen);
        }
    }
}
