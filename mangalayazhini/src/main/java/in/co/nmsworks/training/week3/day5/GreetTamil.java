package in.co.nmsworks.training.week3.day5;

public class GreetTamil implements GreetGuest {

    @Override
    public void welcome() {
        System.out.println("Welcome in Tamil");
    }

    @Override
    public void thankYou() {
        System.out.println("Thank You in Tamil");
    }
}