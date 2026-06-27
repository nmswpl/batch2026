package in.co.nmsworks.training.week2.day5.calculator;

public class Divider implements Computable{
    @Override
    public int compute(int a, int b) {
        if (b != 0){
            return a / b;
        }
        else {
            return 0;
        }
    }
}
