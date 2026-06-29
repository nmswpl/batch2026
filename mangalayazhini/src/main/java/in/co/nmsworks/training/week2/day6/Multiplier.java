package in.co.nmsworks.training.week2.day6;

public class Multiplier implements Computable{

    @Override
    public int compute(int a, int b) {
        int multipliedValue = a*b;
        System.out.println(a + " x " + b + " = " + multipliedValue);
        return multipliedValue;
    }
}
