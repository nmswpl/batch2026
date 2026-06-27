package in.co.nmsworks.training.week1.day1;
import java.util.*;
import com.google.gson.internal.bind.util.ISO8601Utils;

public class PrintInteger {
    public static void main(String[] args) {
        System.out.println("Enter the Interger:");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        System.out.println("You entered:"+no);
    }
}
