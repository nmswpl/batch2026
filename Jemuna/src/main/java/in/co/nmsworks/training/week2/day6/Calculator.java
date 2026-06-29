package in.co.nmsworks.training.week2.day6;

public class Calculator {
    public void performCalculation(int a, int b, Computable operation) {
        operation.compute(a, b);
    }
}
