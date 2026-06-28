package in.co.nmsworks.training.week2.weekendpractice;

public class Calculator {
    public static void main(String[] args) {
        performCalculation(10,5,new Adder());
        performCalculation(10,5,new Multiplier());
        performCalculation(10,2,new Divider());

    }
    public static void performCalculation(int a,int b,Computable operation){
        System.out.println("The " + operation + " of the two numbers is :: " + operation.compute(a,b));
    }
}
