package in.co.nmsworks.training.week2.practice;

public class CalcRunner {
    public static void main(String[] args) {
        Adder add=new Adder();
        Multiplier mul=new Multiplier();
        Divider div=new Divider();
        performCalc(10,15,add);
        performCalc(10,15,mul);
        performCalc(100,15,div);
    }
    static void performCalc(int a, int b, Computable computable)
    {
        computable.compute(a,b);
    }
}
