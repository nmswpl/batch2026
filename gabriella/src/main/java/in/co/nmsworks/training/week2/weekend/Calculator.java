package in.co.nmsworks.training.week2.weekend;

public class Calculator {
    public static void main(String[] args) {
        Adder adder = new Adder();
        Multiplier multiplier = new Multiplier();
        Divider divider = new Divider();

        performCalculation(50, 24, adder);
        performCalculation(3, 7, multiplier);
        performCalculation(10, 5, divider);
        performCalculation(4, 0, divider);


    }
    private static void performCalculation(int a, int b, Computable operation){
        if (operation instanceof Adder){
            System.out.println("Sum of " + a + " and " + b +" is: " + operation.compute(a, b));
        } else if (operation instanceof Multiplier){
            System.out.println("Product of " + a + " and " + b + " is: " + operation.compute(a, b));
        } else {
            if (operation.compute(a, b) == -1){
                System.err.println("Division by zero not possible");
            } else {
                System.out.println("Quotient of " + a + " and " + b + " is: " + operation.compute(a, b));
            }
        }
    }
}
