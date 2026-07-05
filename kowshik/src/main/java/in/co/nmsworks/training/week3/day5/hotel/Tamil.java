package in.co.nmsworks.training.week3.day5.hotel;

public class Tamil implements Language{
    @Override
    public void greetMsg(String name) {
        System.out.println("Vanakkam " + name);
    }

    @Override
    public void exitMsg(String name) {
        System.out.println("Nandri " + name);
    }
}
