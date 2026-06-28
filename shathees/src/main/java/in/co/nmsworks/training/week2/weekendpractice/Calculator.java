package in.co.nmsworks.training.week2.weekendpractice;

import java.util.concurrent.Callable;

public class Calculator {
    
    public static void main(String[] args) {
     Computable add = new Adder();
     Computable mul = new Multiplier();
     Computable div = new Divider();
     performCalculations(add,10,20);
     performCalculations(mul,10,20);
     performCalculations(div,10,0);
    }

    public static void performCalculations(Computable computable,int a,int b){
        System.out.println("The "+computable+"operation result : "+computable.compute(a,b));

    }

}
