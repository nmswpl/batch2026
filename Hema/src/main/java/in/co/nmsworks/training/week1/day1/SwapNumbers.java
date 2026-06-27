package in.co.nmsworks.training.week1.day1;

public class SwapNumbers {
    public static void main(String[] args) {
        double a = 1.2;
        double b = 2.45;

        System.out.println("--Before Swap--\nFirst Number = "+a+"\nSecond Number = "+b);
        double temp = a;
        a = b;
        b = temp;
        System.out.println("--After Swap--\nFirst Number = "+a+"\nSecond Number = "+b);
    }
}
