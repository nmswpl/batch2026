package in.co.nmsworks.training.week2.Practice;

public class Adder implements Computable{
    @Override
    public void compute(int a, int b) {
        System.out.println("Addition of " +a +"and " + b + "is: " + (a+b));
    }
}
