package in.co.nmsworks.training.week3.day5;

public class English implements Language {

    @Override
    public void welcome(String name) {
        System.out.println("Welcome " + name + "!");
    }

    @Override
    public void goodbye(String name) {
        System.out.println("Thank you " + name + ". Have a nice day!");
    }
}
