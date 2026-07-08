package in.co.nmsworks.training.week3.weekend.hotel;

public class Tamil implements GreetingLanguage{
    @Override
    public void greetingWelcomeMessage() {
        System.out.println("வரவேற்கிறோம்!");
    }

    @Override
    public void greetingThankMessage() {
        System.out.println("நன்றி!");
    }
}
