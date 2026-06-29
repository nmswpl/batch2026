package in.co.nmsworks.training.week2.Practice;

public class Calculator {
    public static void performCalculation ( int a, int b, Computable operation){
        operation.compute(a,b);
    }
}
