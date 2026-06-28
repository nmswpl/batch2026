package in.co.nmsworks.training.week2.exercise;

public class Multiplier implements Computable{
    @Override
    public void compute(int a, int b) {
        System.out.println("Multiply: " + (a*b));
    }
}
