package in.co.nmsworks.training.week2.day6;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Adder add = new Adder();
        Multiplier multiply = new Multiplier();
        Divider divide = new Divider();
        calculator.performCalculation(5,10,add);
        calculator.performCalculation(50,10,divide);
        calculator.performCalculation(5,10,multiply);

    }
}
