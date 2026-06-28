package in.co.nmsworks.training.week2practices;

public class Calculator {
    public void performCalculation(int a, int b, Computable operation) {
        int result = operation.compute(a, b);
        System.out.println("Result = " + result);
    }
}
