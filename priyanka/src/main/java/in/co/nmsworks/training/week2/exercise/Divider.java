package in.co.nmsworks.training.week2.exercise;

public class Divider implements Computable{
    @Override
    public void compute(int a, int b) {
        if(b == 0){
            System.out.println("Zero division error..");
            return;
        }
        else{
            System.out.println("Divide: " + (a/b));

        }
    }
}
