package in.co.nmsworks.training.week3.day5;

public class GreetEnglish implements GreetGuest {

    @Override
    public void welcome() {
        System.out.println("Welcome to our Hotel!");
    }

    @Override
    public void thankYou() {
        System.out.println("Thank You! Visit Again.");
    }
}