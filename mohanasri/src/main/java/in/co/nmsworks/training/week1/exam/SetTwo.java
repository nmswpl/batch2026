package in.co.nmsworks.training.week1.exam;

import java.util.Arrays;

public class SetTwo {
    public static void main(String[] args) {
        findMedian();
        hundredthNum();
    }


    public static void hundredthNum(){

            int number = 456;
            int hundredsDigit = number / 100;
            String[] words = {
                    "Zero", "One", "Two", "Three", "Four",
                    "Five", "Six", "Seven", "Eight", "Nine"
            };
            if (hundredsDigit >= 0 && hundredsDigit <= 9) {
                System.out.println(words[hundredsDigit]);
            }
        }



    public static void findMedian() {
        int[] arr = {1, 2, 3, 4, 5};
        if (arr == null || arr.length == 0) {
            System.out.println(0);
        }
        int n = arr.length;
        int mid = n / 2;
        if (n % 2 != 0) {
            System.out.println( "Median : " + arr[mid]);
        }
        else {
            System.out.println("Median : " + (arr[mid - 1] + arr[mid]) / 2.0);
        }
    }


}





