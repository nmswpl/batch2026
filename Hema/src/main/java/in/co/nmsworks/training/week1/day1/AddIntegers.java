package in.co.nmsworks.training.week1.day1;
import java.util.*;

public class AddIntegers {
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("The sum is: "+c);
    }
}
