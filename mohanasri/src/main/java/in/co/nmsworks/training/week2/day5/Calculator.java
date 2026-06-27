package in.co.nmsworks.training.week2.day5;

public class Calculator {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Computable add = new Adder();
        Computable mul = new Multiplier();
        Computable div = new Divider();
        calc.performCalculation(2,4,add);
        calc.performCalculation(2 ,4,mul);
        calc.performCalculation(4,2,div);
        calc.performCalculation(4,0,div);

    }
    void performCalculation(int a, int b, Computable operation){
            System.out.println(operation.compute(a,b));
        }
    }

