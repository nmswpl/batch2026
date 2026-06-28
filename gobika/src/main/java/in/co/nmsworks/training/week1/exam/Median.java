package in.co.nmsworks.training.week1.exam;

import java.util.Arrays;
import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        findMedian(5);
    }

    private static void findMedian(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        System.out.println("Enter Array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        float median= 0;
        if ( n%2 == 0){
            float sum= arr[n/2] + arr [(n/2)-1];
            median= sum/2;
            System.out.println(" Median : "+ median);
        }
        else{
            median = arr[(n-1)/2];
            System.out.println(" Median : "+ median);
        }
        sc.close();
    }
}
