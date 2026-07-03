package in.co.nmsworks.training.week3.day5;

import java.util.HashMap;
import java.util.Map;

public class Multiplex {
    private Integer screen ;
    private static Integer seatNo = 0;
    Map<Integer,Integer> screenToCapacity = new HashMap<>();
    public void setScreen(Integer screen) {
        this.screen = screen;
    }

    public void setScreenToCapacity() {
        screenToCapacity.put(1,200);
        screenToCapacity.put(2,150);
        screenToCapacity.put(3,100);
    }

    public void getScreen(){
        for (Map.Entry<Integer,Integer> screens : screenToCapacity.entrySet()){
            System.out.println("Screens : " +screens.getKey());
        }
    }

    public void bookTicket(Integer noOfTickets){
        if ( noOfTickets < checkAvailable(screen)){
            System.out.println("Ticket booked ...");
            for (int i = 0; i < noOfTickets; i++) {
                System.out.println("Seat No : "+ ++seatNo );
            }
            Integer remainingSeats = screenToCapacity.get(screen) - noOfTickets ;
            screenToCapacity.put(screen,remainingSeats);
        }
        else {
            System.out.println("Ticket not available....");
        }
    }


    public Integer checkAvailable(Integer screen) {
        System.out.println("Available seats in screen"+screen +" : "+screenToCapacity.get(screen));
        return screenToCapacity.get(screen);
    }



}
