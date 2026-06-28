package in.co.nmsworks.training.week2.practice;

public class Multiplier implements Computable{
    @Override
    public void compute(int a, int b) {
        System.out.println("Multiplication of "+a+" * "+b+" "+(a*b));
    }
}
