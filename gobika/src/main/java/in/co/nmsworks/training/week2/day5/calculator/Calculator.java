package in.co.nmsworks.training.week2.day5.calculator;

public class Calculator {
    public static void main(String[] args) {
        Adder adder = new Adder();
        Multiplier multiplier = new Multiplier();
        Divider divider = new Divider();

        performCalculation( 400, 10, adder);
    }

    private static void performCalculation(int a, int b, Computable computable) {

        String calculator;
        if (computable instanceof Adder){
            calculator = "Added";
        } else if (computable instanceof Multiplier) {
            calculator = "Multiplied";
        }
        else {
            calculator = "Divided";
        }

        int compute = computable.compute(a, b);
        System.out.println("Computed "+ calculator +" value is : "+compute);
    }

}
