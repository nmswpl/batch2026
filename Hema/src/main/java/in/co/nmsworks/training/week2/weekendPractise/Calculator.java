package in.co.nmsworks.training.week2.weekendPractise;

public class Calculator {
    private static void performCalculation(int a, int b, Computable operation)
    {
        int result = operation.compute(a,b);
        System.out.println(result);
    }

    public static void main(String[] args) {

        performCalculation(2,3,new Adder());
        performCalculation(2,3,new Multiplier());
        performCalculation(2,3,new Divider());

    }
}
