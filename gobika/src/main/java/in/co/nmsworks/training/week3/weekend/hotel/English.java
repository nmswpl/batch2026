package in.co.nmsworks.training.week3.weekend.hotel;

public class English implements GreetingLanguage{
    @Override
    public void greetingWelcomeMessage() {
        System.out.println("Welcome");
    }

    @Override
    public void greetingThankMessage() {
        System.out.println("Thank you..");
    }
}
