package in.co.nmsworks.training.week3.day5.hotel;

public class English implements Language{
    @Override
    public void greetMsg(String name) {
        System.out.println("Welcome " + name + "! Nice to meet you.");
    }

    @Override
    public void exitMsg(String name) {
        System.out.println("Thank you for visiting " + name + ". Visit Again!");
    }
}
