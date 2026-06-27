package in.co.nmsworks.training.week1.day1;
import java.util.*;
public class CheckOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = sc.nextInt();
        if( input % 2 == 0)
            System.out.println(input+" is even");
        else
            System.out.println(input+" is odd");
    }
}
