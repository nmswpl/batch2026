package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class Multiplex {
    List<Integer> screen = new ArrayList<>();
    public void noOfScreenAvailable() {
        screen.add(1);
        screen.add(2);
        screen.add(3);
        for (Integer i : screen) {
            System.out.println(i);
        }
    }
    public void screen1bookticket(int noOfTickets,List<Integer> screen1) {

        int limit = 10;
        bookticket(noOfTickets,limit,screen1,'A');

    }
    public void screen2bookticket(int noOfTickets,List<Integer> screen2) {
        int limit = 190;
        bookticket(noOfTickets,limit,screen2,'B');
    }
    public void screen3bookticket(int noOfTickets,List<Integer> screen3) {
        int limit = 120;
        bookticket(noOfTickets,limit,screen3,'C');
    }

    public void bookticket(int noOfTickets, int limit, List<Integer> screen,Character ch) {
        int n = screen.size();
        int available = limit - n;
        System.out.println("Intial available: "+available);
        if (available == noOfTickets || available > noOfTickets) {
            System.out.println("Your ticket is: ");
            while (noOfTickets > 0 ) {
                System.out.println(ch+"-"+(screen.size()+1));
                screen.add(noOfTickets);
                noOfTickets--;
            }

        }
        else if (available < noOfTickets && available > 0){

            System.out.println("Only "+(noOfTickets - available)+" is available");
        }
        else {
            System.out.println("Screen is full");
        }
    }
}
