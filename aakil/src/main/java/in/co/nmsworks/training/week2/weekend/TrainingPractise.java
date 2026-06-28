package in.co.nmsworks.training.week2.weekend;

import java.util.Arrays;

public class TrainingPractise {
    public static void main(String[] args) {
        evenSeriesInRange(601, 700);
        printGrade(17);
        int[] array1 = {2, 4, 1};
        int[] array2 = {3, 2, 5};
        multiplyArrays(array1, array2);
        System.out.println("SEARCH :: " + linearSearch(array1, 3));
        checkVowel('A');
        squareOfArrayElements(array1);
        hundredthPosition(2345);
        divisibleByThree(300, 400);
        numbersEndingWithSeven(200, 500);
        countOdds(array1);
        sumOfElements(array1);
        String[] strings = {"One", "Two", "Three"};
        reverseArray(strings);
        countEvens(array1);
        System.out.println("MAX IN ARRAY :: " + Arrays.stream(array1).max().getAsInt());
        System.out.println("FACTORIAL :: " + factorial(5));
        int[] array3 = {1,2, 3, 4,1,3,2,5,6};
        int target = 3;
        System.out.println("FREQUENCY :: " + getCount(array3, target));
        isPalindrome("Malayalam");
        checkPrime(41);
    }

    private static void checkPrime(int n) {
        if (n <= 1){
            System.out.println("Not a Prime");
            return;
        }
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0){
                System.out.println("Not a Prime");
                return;
            }
        }
        System.out.println("Prime");
    }

    private static void isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                System.out.println("NOT PALINDROME");
                return;
            }
            left++;
            right--;
        }
        System.out.println("PALINDROME");;
    }

    private static long getCount(int[] array, int target) {
        return Arrays.stream(array).filter(n -> n == target).count();
    }

    private static int factorial(int num) {
        if (num <= 1) return 1;
        return num * factorial(num - 1);
    }

    private static void countEvens(int[] array) {
        int count = 0;
        for (int i : array) {
            if(i % 2 == 0) count++;
        }
        System.out.println("EVENS :: " + count);
    }

    private static void reverseArray(String[] array) {
        int left = 0;
        int right = array.length - 1;

        while(left < right){
            String temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    private static void sumOfElements(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println("SUM :: " + sum);
    }

    private static void countOdds(int[] array) {
        int count = 0;
        for (int i : array) {
            if(i % 2 == 1) count++;
        }
        System.out.println("ODDS :: " + count);
    }

    private static void numbersEndingWithSeven(int begin, int end) {
        while (begin < end){
            if(begin % 10 == 7) break;
            begin++;
        }

        System.out.print("ENDING WITH 7'S :: ");
        for (int i = begin; i < end; i += 10) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void divisibleByThree(int begin, int end) {
        System.out.print("MULTIPLES :: ");
        begin = (begin % 3 == 0) ? begin + 3 : begin + begin % 3;
        for (int i = begin; i < end; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void hundredthPosition(int num) {
        int hundredthPlace = num / 100;
        if (hundredthPlace > 10){
            hundredthPlace %= 10;
        }
        String[] numNames = {"Zero" , "One", "Two" , "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        System.out.println(numNames[hundredthPlace]);
    }

    private static void squareOfArrayElements(int[] array) {
        System.out.print("SQUARES :: ");
        for (int i : array) {
            System.out.print(i * i + " ");
        }
        System.out.println();
    }

    private static void checkVowel(char ch) {
        if("aeiouAEIOU".indexOf(ch) != -1)
            System.out.println(ch + " :: VOWEL");
        else
            System.out.println(ch + ":: CONSONANT");
    }

    private static void multiplyArrays(int[] array1, int[] array2) {
        System.out.print("ARRAY PRODUCT :: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] * array2[i] + " ");
        }
        System.out.println();
    }

    private static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static void printGrade(int mark) {
        if(mark > 100){
            System.out.println("\nInvalid Marks");
            return;
        }
        System.out.print("\nGRADE :: ");
        if(mark > 90)
            System.out.println("S");
        else if (mark > 80)
            System.out.println("A");
        else if (mark > 70)
            System.out.println("B");
        else if (mark > 60)
            System.out.println("C");
        else if (mark > 50)
            System.out.println("D");
        else
            System.out.println("F");
    }

    private static void evenSeriesInRange(int begin, int end) {
        begin = (begin % 2 == 0) ? begin : ++begin;
        for (int i = begin; i <= end; i += 2) {
            System.out.print(i + " ");
        }
    }
}
