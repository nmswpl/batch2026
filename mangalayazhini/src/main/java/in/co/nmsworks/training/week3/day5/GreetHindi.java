package in.co.nmsworks.training.week3.day5;

public class GreetHindi implements GreetGuest {

    @Override
    public void welcome() {
        System.out.println("Welcome in Hindi");
    }

    @Override
    public void thankYou() {
        System.out.println("Thank You in Hindi");
    }
}