package in.co.nmsworks.training.week3.day6.automatedReceptionist;

public class English implements Language{
    @Override
    public void welcome(String name) {
        System.out.println("Hello " + name + ", welcome to our hotel!");
    }

    @Override
    public void goodbye(String name) {
        System.out.println("Thank you " + name + ", have a great day ahead!");
    }
}
