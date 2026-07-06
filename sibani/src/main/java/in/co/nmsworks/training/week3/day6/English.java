package in.co.nmsworks.training.week3.day6;

public class English implements Language {

    @Override
    public void checkInMessage(String name) {
        System.out.println("Dear" + name + "...Welcome to our hotel...Enjoy your stay...");
    }

    @Override
    public void checkOutMessage(String name) {
        System.out.println("Thanks for staying dear "+name+" ...Please come again...Enjoy your day...");
    }
}
