package in.co.nmsworks.training.week1.exam;
import java.util.*;
public class TestSet2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = 6;
//        System.out.println("Enter the size of array: ");
        int[] array = {1,2,3,4,5,6};
//        for (int i = 0; i < n; i++) {
//            System.out.println("Enter value of array index " + i + ": ");
//            array[i] = in.nextInt();
//        }
        checkMedian(n,array);
        disblayAttriputes(201,"Samsung","Galaxy s24",79999.00);
        System.out.println("Enter the number: ");
        int value = in.nextInt();
        printValueInWords(value);
    }

    public static void checkMedian(int number,int array[]) {
        if (number % 2 == 0) {
            int median = number / 2;
            float sum = array[median] + array[median-1];
            System.out.println("Median of array is: " + sum / 2);
        }
        else {
            int median = number / 2;
            System.out.println("Median of narray is: " + array[median]);
        }
    }

    public static void disblayAttriputes(int id,String brand,String model,double price){
        Mobile m1 = new Mobile(id, brand, model, price);
        System.out.println("ID = "+m1.getId());
        System.out.println("Brand = "+m1.getBrand());
        System.out.println("Model = "+m1.getModel());
        System.out.println("Price = "+m1.getPrice());
    }

    public static void printValueInWords(int number) {
        String[] arr = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        int count = 0;
        while(number > 0) {
            if(count == 2) break;

            number = number/10;

            count++;
        }
        if(count == 2) {
            number = number % 10;
            System.out.println(arr[number - 1]);
        }
        else{
            System.out.println("No vlue");
        }
    }
}
