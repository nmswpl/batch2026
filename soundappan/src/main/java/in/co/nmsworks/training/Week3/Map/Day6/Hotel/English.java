package in.co.nmsworks.training.Week3.Map.Day6.Hotel;

public class English implements Language{

    @Override
    public void welcome(String name) {
        System.out.println("Welcome");
    }

    @Override
    public void goodBye(String name) {
        System.out.println("GoodBye");

    }
}
