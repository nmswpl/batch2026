package in.co.nmsworks.training.week2.day6;

public class Adder implements Computable{

    @Override
    public int compute(int a, int b) {
        int sum = a+b;
        System.out.println(a + " + " + b + " = " + sum);
        return sum;
    }
}
