package in.co.nmsworks.training.week3.day5;

public class Screen {

    private int available_Tickets = 100;
    private int ticket_Price = 150;
    private int ticket_Number = 1;

    public int getTicket_Number() {
        return ticket_Number;
    }

    public void setTicket_Number(int ticket_Number) {
        this.ticket_Number = ticket_Number;
    }

    public Screen() {
    }

    public Screen(int available_Tickets, int ticket_Price) {
        this.available_Tickets = available_Tickets;
        this.ticket_Price = ticket_Price;

    }

    public int getAvailable_Tickets() {
        return available_Tickets;
    }

    public void setAvailable_Tickets(int available_Tickets) {
        this.available_Tickets = available_Tickets;
    }

    public int getTicket_Price() {
        return ticket_Price;
    }

    public void setTicket_Price(int ticket_Price) {
        this.ticket_Price = ticket_Price;
    }
}
