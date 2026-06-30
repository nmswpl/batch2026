package in.co.nmsworks.training.weekend.Calculator;


public class CalculatorRunner {

    public static void main(String[] args) {

        // Calculator using interface

        Calculator calc = new Calculator();


        Computable add = new Adder();
        Computable multiply = new Multiplier();
        Computable divide = new Divider();


        calc.performCalculation(10, 5, add);

        calc.performCalculation(10, 5, multiply);

        calc.performCalculation(10, 5, divide);

        calc.performCalculation(10, 0, divide);


    }
}
