package in.co.nmsworks.training.week3.day5.multiplex;

public class Ticket {
    public static void main(String[] args) {
        Multiplex m1=new Multiplex(1,5);
        m1.getTicket();
        m1.getTicket();
        m1.getTicket();
        Multiplex m2=new Multiplex(2,10);
        m2.getTicket();
    }
}
