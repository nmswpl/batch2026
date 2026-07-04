//package in.co.nmsworks.training.week3.day5;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Multiplex {
//
//    List<Integer> screen1 = new ArrayList<>(50);
//    List<Integer> screen2 = new ArrayList<>(50);
//    List<Integer> screen3 = new ArrayList<>(50);
//
//    void bookTickets(Integer ticketCount, Integer screenNo) {
//        System.out.println(screen1.size());
//        int noOfTicketsSold1 = 0;
//        int noOfTicketsSold2 = 0;
//        int noOfTicketsSold3 = 0;
//        switch (screenNo) {
//            case 1:
//                if (checkAvailability(screen1, noOfTicketsSold1, ticketCount)) {
//                    System.out.println("if");
//                    for (int i = 0; i < ticketCount; i++) {
//                        noOfTicketsSold1++;
//                        screen1.add(i);
//                    }
//                    System.out.println("Tickets booked : " + "A" + noOfTicketsSold1);
//
//                } else {
//                    System.out.println("Ticket unavailable");
//                }break;
//
//boolean checkAvailability(List<Integer> screenNo, int noTicketsSold, int tickets){
//            int remaining = screenNo.size() - noTicketsSold;
//            if (tickets <= remaining){
//                return true;
//            }
//            else {
//                return false;
//            }
//
//        }


//            case 2:
//                if (checkAvailability(screen2, noOfTicketsSold2, ticketCount)) {
//                    for (int i = 1; i <= ticketCount; i++) {
//                        noOfTicketsSold2++;
//                        screen2.add(i);
//                    }
//                    System.out.println("Tickets booked : " + "A" + noOfTicketsSold2);
//
//                } else {
//                    System.out.println("Ticket unavailable");
//                }break;
//
//            case 3:
//                if (checkAvailability(screen3, noOfTicketsSold3, ticketCount)) {
//                    for (int i = 1; i <= ticketCount; i++) {
//                        noOfTicketsSold3++;
//                        screen2.add(i);
//                    }
//                    System.out.println("Tickets booked : " + "A" + noOfTicketsSold3);

//                } else {
//                    System.out.println("Ticket unavailable");
//                }break;
//
//
//
//        }
//    }
//
//
//
//}
package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class Multiplex {
    private static final int MAX_CAPACITY = 50;

    private  List<Integer> screen1 = new ArrayList<>();
    private List<Integer> screen2 = new ArrayList<>();
    private List<Integer> screen3 = new ArrayList<>();

    public void bookTickets(Integer ticketCount, Integer screenNo) {
        switch (screenNo) {
            case 1:
                processBooking(screen1, ticketCount, "A");
                break;
            case 2:
                processBooking(screen2, ticketCount, "B");
                break;
            case 3:
                processBooking(screen3, ticketCount, "C");
                break;
            default:
                System.out.println("Invalid Screen Number");
        }
    }

    public void processBooking(List<Integer> screen, int ticketCount, String prefix) {
        if (checkAvailability(screen, ticketCount)) {
            List<String> bookedTickets = new ArrayList<>();
            for (int i = 0; i < ticketCount; i++) {
                int nextTicketNo = screen.size() + 1;
                screen.add(nextTicketNo);
                bookedTickets.add(prefix + nextTicketNo);
            }
            System.out.println("Tickets booked : " + bookedTickets);
        } else {
            System.out.println("Ticket unavailable. Only " + (MAX_CAPACITY - screen.size()) + " seats left.");
        }
    }

    public boolean checkAvailability(List<Integer> screen, int tickets) {
        System.out.println(MAX_CAPACITY - screen.size());
        return tickets <= (MAX_CAPACITY - screen.size());
    }

    public void showAvailability(List<Integer> screen) {
        System.out.println(MAX_CAPACITY - screen.size());

    }

}

