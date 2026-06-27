package in.co.nmsworks.training.week2.Practice;

public class Multiplier implements Computable{
    @Override
    public void compute(int a, int b) {
        System.out.println("Multiplier of " +a +"and " + b + "is: " + (a*b));
    }
}
