package in.co.nmsworks.training.week2.weekendpractice;

import java.util.Arrays;

public class TrainingExercise {
    public static void main(String[] args) {
        printEvenNumbers(600, 700);
        printGradeOfMarks(76);
        int[] firstArray = {1, 3, 5};
        int[] secondArray = {2, 4, 6};
        printArrayElementsMultiplied(firstArray, secondArray);
        int[] thirdArray = {20, 36, 49};
        System.out.println("The element is found at :: " + printArrayElementIndex(thirdArray, 39));
        findingVowelOrConsonant('d');
        printMultiplicationTable(17);
        findSquareElement(thirdArray);
        findHundrethPlace(3709);
        printNumbersDivisible(200, 300, 3);
        printNumbersEndingWith(200, 500, 6);
        largestAmongThree(18, 18, 35);
        printCountOfOddElements(new int[] {24, 12, 31, 43});
        findSumOfArrayElements(new int[] {22, 5, 61});
        printReversedArray(new String[] {"a", "b","c"});
        printCountOfEvenElements(new int[] {24, 12, 31, 43});
        System.out.println("The factorial of the number is :: " + findFactorialUsingRecursion(5));
        printLargestElement(new int[] {24, 12, 31, 11});
        printElementsOccurence(new int[] {1, 2, 3, 1, 1, 2, 1, 4}, 1);
        checkingPalindrome("level");
        checkPrimeNumber(27);
    }

    public static void checkPrimeNumber(int number) {
        boolean isPrime = true;
        if(number <= 1){
            System.out.println("The given number is not a prime number");
            return;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
    public static void checkingPalindrome(String inputString) {
        String stringLowerCase = inputString.toLowerCase();
        String reverseString = "";
        for (int i = stringLowerCase.length() - 1; i >= 0 ; i--) {
            reverseString = reverseString + stringLowerCase.charAt(i);
        }
        if(reverseString.equals(inputString)){
            System.out.println("The String " + inputString + " is a Palindrome");
        }
        else{
            System.out.println("The String " + inputString + " is not a Palindrome");
        }
    }

    private static void printElementsOccurence(int[] arr, int digit) {
        int count = 0;
        for (int i : arr){
            if(i == digit){
                count++;
            }
        }
        System.out.println("The No of Occurences are :: " + count);
    }

    private static void printLargestElement(int[] arr) {
        System.out.println("The Max Element is :: " + Arrays.stream(arr).max().getAsInt());
    }

    public static long findFactorialUsingRecursion(long num){
        if(num <= 1){
            return 1;
        }
        else{
            return num*findFactorialUsingRecursion(num - 1);
        }
    }

    private static void printCountOfEvenElements(int[] arr) {
        int count = 0;
        for (int i : arr){
            if(i % 2 == 0){
                count++;
            }
        }
        System.out.println("The No of Even Elements are :: " + count);
    }

    private static void printReversedArray(String[] arr) {
        int left = 0;
        int right = arr.length - 1;
        String temp = "";
        System.out.println("The Reversed Array is :: ");
        while(left<right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for (String s : arr){
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static void findSumOfArrayElements(int[] arr) {
        int sum =0;
        for (int i : arr){
            sum = sum + i;
        }
        System.out.println("The Sum of Elements of the Array :: " + sum);
    }

    private static void printCountOfOddElements(int[] arr) {
        int count = 0;
        for (int i : arr){
            if(i % 2 == 1){
                count++;
            }
        }
        System.out.println("The No of Odd Elements are :: " + count);
    }

    public static void largestAmongThree(int first, int second, int third) {
        if (first > second && first > third) {
            System.out.println(first + " is largest");
        } else if (second > first && second > third) {
            System.out.println(second + " is Largest");
        } else {
            System.out.println(third + " is Largest");
        }
    }

    private static void printNumbersEndingWith(int begin, int end, int digit) {
        System.out.println("The Numbers Ending with " + digit + " are :: ");
        for (int i = begin; i <= end; i++) {
            if (i % 10 == digit){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static void printNumbersDivisible(int begin, int end, int denominator) {
        System.out.print("The Numbers Divisible by " + denominator + " are :: ");
        for (int i = begin; i <= end; i++) {
            if (i % denominator == 0 ){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static void findHundrethPlace(int number) {
        if (number < 100 || number > 999) {
            System.out.println("The Given Number is Not A Three Digit Number");
            System.out.println();
        }
        else {
            number = number / 100;
            String[] nums = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
            System.out.println("The Hundredth Position of the number is :: " + nums[number]);
            System.out.println();
        }
    }

    private static void findSquareElement(int[] arr) {
        System.out.print("The Square Elements are :: ");
        for (int i : arr){
            System.out.print(i * i + " ");
        }
        System.out.println();
    }

    private static void printMultiplicationTable(int number) {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(number + " X " + i + " = " + number*i);
        }
    }

    private static void findingVowelOrConsonant(Character alphabet) {
        if("aeiouAEIOU".indexOf(alphabet) != -1){
            System.out.println("The Given Character is Vowel");
        }
        else {
            System.out.println("The Given Character is Consonant");
        }
    }

    private static int printArrayElementIndex(int[] arr3, int element) {
        for (int i = 0; i < arr3.length; i++) {
            if(arr3[i] == element){
                return i;
            }
        }
        return -1;
    }

    private static void printArrayElementsMultiplied(int[] arr1, int[] arr2) {
        System.out.print("Output :: " );
        for (int i = 0; i < arr1.length; i++) {
            System.out.print( arr1[i] * arr2[i] + " ");
        }
    }

    private static void printGradeOfMarks(int marks) {
        if(marks > 100){
            System.out.println("Invalid Marks");
            return;
        }
        if(marks > 90){
            System.out.println("S Grade");
        }
        else if (marks <= 90 && marks > 80) {
            System.out.println("A Grade");
        }
        else if (marks <=80 && marks > 70){
            System.out.println("B Grade");
        }
        else if (marks <= 70 && marks > 60) {
            System.out.println("C Grade");
        }
        else if (marks <= 60 && marks > 50) {
            System.out.println("D Grade");
        }
        else{
            System.out.println("F Grade");
        }
    }

    private static void printEvenNumbers(int startNum, int endNum) {
        for (int i = endNum; i > startNum ; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
