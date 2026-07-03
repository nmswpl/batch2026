package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class Multiplex {

    public List<String> screen1 = new ArrayList<>();
    public List<String> screen2 = new ArrayList<>();
    public List<String> screen3 = new ArrayList<>();


    public Integer getTickets1() {
        return screen1.size();
    }


    public Integer getTickets2() {
        return screen2.size();
    }


    public Integer getTickets3() {
        return screen3.size();
    }

    public void setScreens(){
        for (int i = 1; i <= 100; i++){
            screen1.add("a" + String.valueOf(i));
            screen2.add(("b" + String.valueOf(i)));
            screen3.add("c" + String.valueOf(i));
        }
    }

    public Integer checkAvailability(String screen){
        if (screen.equals("screen1")) {
            if (getTickets1() > 0){
                System.out.println(getTickets1() + " seats available");
                return getTickets1();
            } else {
                System.out.println("Seats unavailable");
                return 0;
            }
        } else if (screen.equals("screen2")){
            if (getTickets2()> 0){
                System.out.println(getTickets2() + " seats available");
                return getTickets2();
            } else {
                System.out.println("Seats unavailable");
                return 0;
            }
        } else {
            if (getTickets3() > 0){
                System.out.println(getTickets3() + " seats available");
                return getTickets3();
            } else {
                System.out.println("Seats unavailable");
                return 0;
            }
        }


    }

    public void bookTickets(String screen, Integer noOfTickets) {
        List<String> tickets = new ArrayList<>();
        while (noOfTickets > 0) {
            if (checkAvailability(screen) != 0) {
                if (screen.equals("screen1")) {
                    tickets.add(screen1.get(0));
                    screen1.remove(0);
                    noOfTickets--;
                } else if (screen.equals("screen2")) {
                    tickets.add(screen2.get(0));
                    screen2.remove(0);
                    noOfTickets--;
                } else {
                    tickets.add(screen3.get(0));
                    screen3.remove(0);
                    noOfTickets--;
                }


            }
        }
        System.out.println("Tickets booked: " + tickets);

    }
}
