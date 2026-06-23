package in.co.nmsworks.training.week1.exam.set2;

import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int[] arr = {12, 8, 15, 10, 20};

        Arrays.sort(arr);

        int n = arr.length;

        if (n % 2 == 0) {
            double median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
            System.out.println("Median = " + median);
        } else {
            System.out.println("Median = " + arr[n / 2]);
        }
    }
}