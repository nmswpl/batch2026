package in.co.nmsworks.training.week2.day5;

import java.util.Arrays;

import static java.lang.Math.sqrt;

public class TrainingExcercise {
    public static void main(String[] args) {
        TrainingExcercise trainingExcercise = new TrainingExcercise();
        trainingExcercise.printEvenNumbersDescOrder(700,601);
        trainingExcercise.printGrade(70);
        int[] arr1 = {2,4,1};
        int[] arr2 = {3,5,7};
        trainingExcercise.multiplyTwoArray(arr1, arr2);
        trainingExcercise.printPositionOfElement(new int[]{7, 15, 41}, 41);
        trainingExcercise.checkVowelOrConsonant('Z');
        trainingExcercise.multiplicationTable(17);
        trainingExcercise.squareOfArrayElements(new int[]{2, 4, 3,5});
        trainingExcercise.printHundredthPosition(542);
        trainingExcercise.numberDivisibleByThree(400, 301);
        trainingExcercise.numbersEndingWithSeven(200, 500);
        trainingExcercise.findBiggestNum(18,18,35);
        trainingExcercise.printNumberOfOdd(new int[]{32, 43, 4, 15});
        trainingExcercise.sumOfElemtsInArray(new int[] {1, 2, 3});
        trainingExcercise.reverseArray(new char[]{'a','b','c'});
        trainingExcercise.printNumberOfEven(new int[]{2, 3, 4, 5, 6});
        System.out.println("Factorial using recursion is : " + trainingExcercise.fact(5));
        trainingExcercise.largestElementInArray(new int[]{12, 3, 20, 14});
        System.out.println("Output occurence : " + trainingExcercise.checkoccurence(new int[]{1, 2, 3, 2, 2, 3}, 2));
        System.out.println(" Given string is a palindrome : " + trainingExcercise.isPallindrome("level"));
        System.out.println(" Is Prime :" + trainingExcercise.isPrime(7));

    }

    private int checkoccurence(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    private boolean isPallindrome(String str1) {
        String str2 = "";
        for (int i = str1.length()-1; i>=0 ; i--) {
            str2 += str1.charAt(i);
        }
        if (str2.equals(str1)) {
            return true;
        }
        else {
            return false;
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1){
            return false;
        }
        for (int i = 2; i < sqrt(num) ; i++) {
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    private void largestElementInArray(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest Element in the array is : " + largest);
    }

    private void reverseArray(char[] arr) {
        char[] reversedArray = new char[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            reversedArray[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(reversedArray));
    }

    private int fact(int num) {
        if(num == 0 || num ==1){
            return 1;
        }
        else{
            return num * fact(num -1);
        }

    }

    private void printNumberOfEven(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0){
                count ++;
            }
        }
        System.out.println("Number of Even Numbers : " + count);
    }

    private void sumOfElemtsInArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum of Elements in an Array is : " + sum);
    }

    private void printNumberOfOdd(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0){
                count ++;
            }
        }
        System.out.println("Number of Odd Numbers : " + count);
    }

    private void findBiggestNum(int num, int num1, int num2) {
        if (num > num1 && num > num2) {
            System.out.println("Output : " + num);
        }
        else if (num1 > num && num1 > num2) {
            System.out.println("Output : " + num1);
        }
        else {
            System.out.println("Output : " + num2);
        }
    }

    private void numbersEndingWithSeven(int num, int num1) {
        System.out.println("Numbers ending with 7 between " + num + " and" + num1 + " are :");
        for (int i = num + 1; i < num1; i++) {
            if ( i % 10 == 7) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private void numberDivisibleByThree(int num, int num1) {
        System.out.println("Numbers divisible by 3 between " + num1 + " and " + num + " are : ");
        for (int i = num1; i <= num ; i++) {
            if ( i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private void printHundredthPosition(int num) {
        System.out.println();
        if (num <99  || num >1000){
            System.out.println("Invalid Output");
        }
        else {
            int digit = num /100;
            String[] values = {"Zero","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
            System.out.println("Hundredth Position of  " + num + " is : " + values[digit]);
        }
    }

    private void squareOfArrayElements(int[] arr) {
        int[] arr2 = new int[arr.length];
        System.out.println("Sqaure Array elements");
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i] * arr[i];
            System.out.print(arr2[i] + " ");
        }

    }

    private void multiplicationTable(int num) {
        System.out.println("Multiplication Table of " + num);
        for (int i= 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }

    private void checkVowelOrConsonant(char ch) {
        switch (ch) {
            case 'a':
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' :
                System.out.println("Given char " + ch + " is a vowel");
                break;
            default:
                System.out.println("Given char " + ch + " is a consonant");
        }
    }

    private void printPositionOfElement(int[] arr, int searchElement) {
        System.out.println();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                System.out.println("Position of " + searchElement + " is : " + i);
                count = 1;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Element not found with position " + " - 1 ");
        }
    }

    private void multiplyTwoArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length];
        System.out.println("Product Array elements");
        if (arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                arr3[i] = arr1[i] * arr2[i];
                System.out.print(arr3[i] + " ");
            }
        }
        else {
            System.out.println("Enter arrays of similar length");
        }
    }

    private void printGrade(int mark) {
        System.out.println();
        if (mark > 100 || mark < 0) {
            System.out.println("Invalid Mark");
        }
        if (mark > 90){
            System.out.println("Grade is : S" );
        }
        else if (mark > 80){
            System.out.println("Grade is : A" );
        }
        else if (mark > 70){
            System.out.println("Grade is : B" );
        }
        else if (mark > 60){
            System.out.println("Grade is : C" );
        }
        else if (mark > 50){
            System.out.println("Grade is : D" );
        }
        else {
            System.out.println("Grade is : F" );
        }
    }

    private void printEvenNumbersDescOrder(int num, int num1) {
        System.out.println("Even numbers between " + num + " and " + num1 + " in descending order are : ");
        for (int i = num; i >= num1 ; i--) {
            if ( i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
