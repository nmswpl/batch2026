package in.co.nmsworks.training.week3.day4;

/// Implement a Multiplex (with min 3 screens) and with some methods
//	1. Book Ticket (Ticket Number should be printed)
//	2. Check Availability


public class Multiplexer
{
    String screenName;
    Integer availableSeatCount ;
    Integer filledCount = 0;
    String movie ;
    Double ticketCost ;

    public Multiplexer(String screenName, String movie, Double ticketCost, Integer availableSeatCount) {
        this.screenName = screenName;
        this.availableSeatCount = availableSeatCount;
        this.movie = movie;
        this.ticketCost = ticketCost;
    }

    public void checkAvailableSeats(){
        System.out.println("The total available seats are :: " + availableSeatCount);
    }

    public void bookTickets(Integer noOfSeats){

        if(availableSeatCount < noOfSeats){
            System.out.print("No seats availabe in " + screenName);
        }
        else{
            System.out.print("Seat No : ");
            for (int i = filledCount; i < noOfSeats + filledCount; i++) {
                System.out.print(i + " ");
            }




            filledCount += noOfSeats;
            availableSeatCount = availableSeatCount - noOfSeats;

            System.out.println("\nfilled : " + filledCount);
            System.out.println("available : " + availableSeatCount);
            System.out.println("\nSeat No for " +movie+" booked are : ");
        }

    }
}




