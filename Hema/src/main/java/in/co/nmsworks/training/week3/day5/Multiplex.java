package in.co.nmsworks.training.week3.day5;

public class Multiplex {
    private Screen screen1 = new Screen("A",5);
    private Screen screen2 = new Screen("B",3);
    private Screen screen3 = new Screen("C",2);


    Screen getScreen(String screenName)
    {
        if(screenName.equals(screen1.getName()))
        {
            return screen1;
        }
        else if(screenName.equals(screen2.getName())) {
            return screen2;
        }
        else {
            return screen3;
        }
    }

    public void bookTicket(Screen screen, Integer noOfTickets)
    {

        if(checkAvailability(screen)) {
            if (screen.getRemainingTickets() >= noOfTickets) {
                int bookedTickets = screen.getBookedTickets() + noOfTickets;
                int remainingTickets = screen.getRemainingTickets() - noOfTickets;

                System.out.print("Tickets ");
                for (int i = screen.getBookedTickets()+1; i <=  screen.getBookedTickets()+noOfTickets ; i++) {
                    System.out.print(screen.getName()+i+", ");
                }

                System.out.println("are booked!!!");


                screen.setBookedTickets(bookedTickets);
                screen.setRemainingTickets(remainingTickets);

            }
            else {
                System.out.println("No of Tickets are exceeding remaining Tickets!");
                System.out.println("Only "+screen.getRemainingTickets()+" tickets are available.");
            }
        }
        else {
            System.out.println("Screen "+screen.getName()+" is full!");
        }
    }

    public boolean checkAvailability(Screen screen)
    {
        if( screen.getRemainingTickets() == 0 )
        {
//            System.out.println("Full");
            return false;
        }
        else
        {
//            System.out.println("Available");
            return true;
        }
    }
}
