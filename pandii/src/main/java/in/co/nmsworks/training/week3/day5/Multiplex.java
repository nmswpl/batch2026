package in.co.nmsworks.training.week3.day5;

public class Multiplex {
    int[] seats = {100,200,150};


    public void BookTicket(int screenNum,int numOfTickets)
    {

        if(screenNum>=1 && screenNum<=3)
        {
            if(numOfTickets>seats[screenNum-1])
            {
                System.out.println(seats[screenNum-1]+" number seats only available");
            }
            else {
                int available=seats[screenNum-1];
                int startSeat=available-numOfTickets+1;
                seats[screenNum-1]=available-numOfTickets;
                System.out.println(numOfTickets+" Ticket booked !!!");

                System.out.print("Booked seats : ");
                for(int i=startSeat;i<=available;i++)
                {
                    System.out.print("S"+screenNum+" "+ i +" ");
                }
                System.out.println();
            }

        }
        else {
            System.out.println("Invalid Screen There are 1,2,3 are only");
        }
    }
    public void checkAvailability(int screenNum)
    {
        if(screenNum==1) {
            System.out.println("Available seats in Screen 1 : "+seats[0]);
        } else if (screenNum==2) {
            System.out.println("Available seats in Screen 2 : "+seats[1]);
        } else if (screenNum==3) {
            System.out.println("Available seats in Screen 3 : "+seats[2]);
        } else {
            System.out.println("Invalid screen ");
        }
    }

}
