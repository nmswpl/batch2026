package in.co.nmsworks.training.week3.day5.multiplex;

import java.util.Objects;

public class Multiplex {
    private Integer name;
    private Integer ticketCount;
    private Integer availableTicket=70;
    private Integer filled=0;

    public Multiplex(Integer name, Integer ticketCount) {
        this.name = name;
        this.ticketCount = ticketCount;
    }

    public Multiplex() {
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public Integer getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(Integer ticketCount) {
        this.ticketCount = ticketCount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Multiplex multiplex = (Multiplex) o;
        return Objects.equals(name, multiplex.name) && Objects.equals(ticketCount, multiplex.ticketCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ticketCount);
    }

    @Override
    public String toString() {
        return "Multiplex{" +
                "name=" + name +
                ", ticketCount=" + ticketCount +
                '}';
    }


    public void getTicket() {
        if (ticketCount <= availableTicket) {
            for (int i = 1; i <=ticketCount; i++) {
                int currentTicketNumber=filled+1;
                System.out.println("Ticket for:"+getName()+" "+currentTicketNumber);
                filled++;
                availableTicket--;
            }
        }
        else {
            System.out.println("Tickets not available");
        }

    }
}

