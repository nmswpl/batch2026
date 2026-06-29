package in.co.nmsworks.training.week2.weekend;

import java.util.ArrayList;

public class Calculator {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Adder adder = new Adder();
        c.performCalculation(2,5,adder);
        Multiplier multiplier = new Multiplier();
        c.performCalculation(2,5,multiplier);
        Divider divider = new Divider();
        c.performCalculation(20,5,divider);
        c.performCalculation(20,0,divider);
    }

    private void performCalculation(int a, int b, Computable computable) {
        System.out.println(computable.compute(a,b));
    }
}
