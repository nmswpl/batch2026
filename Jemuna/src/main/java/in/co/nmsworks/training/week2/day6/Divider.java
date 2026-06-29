package in.co.nmsworks.training.week2.day6;

public class Divider implements Computable {
    public void compute(int a, int b) {
        if(b==0){
            System.out.println("Division by zero error");
        }
        else{
            float result = (float)a / (float)b;
            System.out.println("The Division of a and b is : "+result);
        }

    }
}
