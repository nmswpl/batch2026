package in.co.nmsworks.training.week2.day6.library;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Computable add = new Adder();
        Computable multiply = new Multiplier();
        Computable divider = new Divider();

        calculator.performCalculation(10,2,add);
        calculator.performCalculation(10,2,multiply);
        calculator.performCalculation(10,5,divider);
        calculator.performCalculation(10,0,divider);
    }
}
