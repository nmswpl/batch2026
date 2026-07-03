package in.co.nmsworks.training.week3.day5;

public class Multiplex {
    private Integer availability;

    public Multiplex() {
    }

    public Multiplex(Integer availability) {
        this.availability = availability;
    }

    public Integer getAvailability() {
        return availability;
    }

    public void setAvailability(Integer availability) {
        this.availability = availability;
    }

    public void bookTickets(int ticketCount, char ch) {
        if (ticketCount > availability) {
            System.out.println("We have only "+availability+" tickets");
            return;
        }
        Integer startFrom = 100 - availability + 1;
        availability -= ticketCount;
        System.out.println("Booked Sucessfully!!!");
        System.out.print("Seat Number :: ");
        for (int i = 0; i < ticketCount; i++) {
            System.out.print(ch+""+(startFrom + i)+" ");
        }
        System.out.println("\n");
    }

}
