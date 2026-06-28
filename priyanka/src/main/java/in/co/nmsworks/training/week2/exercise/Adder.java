package in.co.nmsworks.training.week2.exercise;

public class Adder implements Computable {
    @Override
    public void compute(int a, int b) {
        System.out.println("Add: " + (a+b));
    }
}
