package in.co.nmsworks.training.week2.day6.library;

public class Calculator {
    public void performCalculation(int a, int b, Computable operation){
        int result = operation.compute(a,b);
        System.out.println("Result = " + result);
    }
}
