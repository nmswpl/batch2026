package in.co.nmsworks.training.week3.day4;

public class MultiplexerRunner {
    public static void main(String[] args) {
        MultiplexerRunner multiplexerObj = new MultiplexerRunner();
        Multiplexer multiplexer1 = new Multiplexer("Theater 1","Movie A",170.55, 10);


        multiplexer1.checkAvailableSeats();
        multiplexer1.bookTickets(3);
        multiplexer1.bookTickets(2);
        multiplexer1.bookTickets(1);
        multiplexer1.bookTickets(4);

        Multiplexer multiplexer2 = new Multiplexer("Theater 2","Movie B",200.0, 5);

        multiplexer2.checkAvailableSeats();
        multiplexer2.bookTickets(3);
        multiplexer2.bookTickets(2);
        multiplexer2.bookTickets(1);
        multiplexer2.bookTickets(4);


    }

}
