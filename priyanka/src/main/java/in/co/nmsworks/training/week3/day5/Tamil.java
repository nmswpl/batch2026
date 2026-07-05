package in.co.nmsworks.training.week3.day5;

public class Tamil implements Language {

    @Override
    public void welcome(String name) {
        System.out.println("Vanakkam " + name + "!");
    }

    @Override
    public void goodbye(String name) {
        System.out.println("Nandri " + name + ". Meendum varuga!");
    }
}
