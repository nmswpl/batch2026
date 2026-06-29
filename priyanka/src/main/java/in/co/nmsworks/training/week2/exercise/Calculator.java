package in.co.nmsworks.training.week2.exercise;

public class Calculator {
    public static void main(String[] args) {
        Adder add = new Adder();
        performCalculation(10,20,add);

        Multiplier multiply = new Multiplier();
        performCalculation(10,20,multiply);

        Divider divide = new Divider();
        performCalculation(10,5,divide);
    }

    public static void performCalculation(int a, int b, Computable compute){
        compute.compute(a,b);
    }

}
