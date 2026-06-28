package in.co.nmsworks.training.week2.weekend;

public class Calculator {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        performCalculation(a, b, new Adder());
        performCalculation(a, b, new Multiplier());
        performCalculation(a, b, new Divider());
    }

    private static void performCalculation(int a, int b, Computable operation) {
        System.out.println("Result for " + operation + " is :: " +  operation.compute(a, b));
    }
}
