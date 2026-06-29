package in.co.nmsworks.training.week2.day5.task;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Addition : " + performCalculation(2, 3, new Adder()));;
        System.out.println("Multiplication : " + performCalculation(2, 3, new Multiplier()));;
        System.out.println("Division : " + performCalculation(20, 4, new Divider()));;
        System.out.println("Division : " + performCalculation(2, 0, new Divider()));;
    }

    private static int performCalculation(int a, int b, Computable operation) {
        return operation.compute(a, b);
    }
}
