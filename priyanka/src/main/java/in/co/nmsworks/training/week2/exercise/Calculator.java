package in.co.nmsworks.training.week2.exercise;

public class Calculator {
    public static void main(String[] args) {
        Adder add = new Adder();
        calciMethod(add);

        Multiplier multiply = new Multiplier();
        calciMethod(multiply);

        Divider divide = new Divider();
        calciMethod(divide);
    }

    public static void calciMethod(Computable compute){
        compute.compute(20,20);
    }

}
