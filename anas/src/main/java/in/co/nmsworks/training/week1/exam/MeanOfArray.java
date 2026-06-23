package in.co.nmsworks.training.week1.exam;

import java.util.Scanner;

public class MeanOfArray {
    public static void main(String[] args) {

        int sum = 0;
        System.out.println("enter length of the array:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("enter the elements:");
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            arr[i] = b;
        }
        for (int i = 0; i < a; i++) {
            sum += arr[i];
        }
        int l = arr.length;
        int mean = sum / a ;
        System.out.println("mean of the array: " + mean);
    }
}
