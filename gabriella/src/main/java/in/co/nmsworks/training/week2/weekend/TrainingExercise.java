package in.co.nmsworks.training.week2.weekend;
import java.util.Arrays;

public class TrainingExercise {
    public static void main(String[] args) {
        printEven();
        System.out.println(" ");

        int marks = 89;
        if (printGrade(marks) == 'X'){
            System.out.println("Invalid marks");
        } else {
            System.out.println("Grade for " + marks + " marks: " + printGrade(marks));
        }
        int[] arr1 = {2, 4, 1};
        int[] arr2 = {3, 5, 7};
        System.out.println("Multiplied result: " + Arrays.toString(multiplyArray(arr1, arr2)));

        int[] arr = {7, 15, 41};
        int searchElement1 = 41;
        int searchElement2 = 5;
        System.out.println("Index of " + searchElement1 + ": " + printPosition(arr, searchElement1));
        System.out.println("Index of " + searchElement2 + ": " + printPosition(arr, searchElement2));

        char ch = 'H';
        if (checkVowel(ch)) System.out.println(ch + " is a vowel");
        else System.out.println(ch + " is a consonant");

        printMultiplicationTable();

        int[] arr3 = {2, 4, 3, 5};
        System.out.println("Square of elements in array: " + Arrays.toString(squareElements(arr3)));

        int threeDigitNumber = 542;
        System.out.println("Digit at hundredth position: " + printHundredth(threeDigitNumber));

        printNumbersDivisibleByThree();

        printNumbersEndingWithSeven();

        int num1 = 24; int num2 = 37; int num3 = 42;
        System.out.println("Greatest among " + num1 + ", " + num2 + " and " + num3 + " is: " + printGreatestOfThree(num1, num2, num3));

        int[] numArray1 = {32, 43, 4, 15};
        System.out.println("No of odd elements in array " + Arrays.toString(numArray1) + " is: " + noOfOddElements(numArray1));

        int[] numArray2 = {1, 2, 3};
        System.out.println("Sum of elements in array " + Arrays.toString(numArray2) + " is: " + sumOfElements(numArray2));

        String[] strArray = {"First", "Second", "Third"};
        System.out.println("Reversed array: " + Arrays.toString(reverseStringArray(strArray)));

        int[] arr4 = {1, 2, 3, 4, 5, 6};
        System.out.println("No.of even elements in array " + Arrays.toString(arr4) + " is: " + countEvenElements(arr4));

        int factorialNum = 5;
        System.out.println(factorialNum + " factorial: " + findFactorial(factorialNum));

        int[] numArray3 = {12, 3, 20, 14};
        System.out.println("Largest element in array " + Arrays.toString(numArray3) + " is: " + findLargestInArray(numArray3));

        int[] numArray4 = {1, 2, 3, 2, 2, 3};
        int num4 = 2;
        System.out.println("No.of times " + num4 + " occurs in array " + Arrays.toString(numArray4) + " is: " + printNoOfOccurences(numArray4, num4));

        String word1 = "Level";
        String word2 = "abc";
        if (checkPalindrome(word1)) System.out.println(word1 + " is a palindrome");
        else System.out.println(word1 + " is not a palindrome");
        if (checkPalindrome(word2)) System.out.println(word2 + " is a palindrome");
        else System.out.println(word2 + " is not a palindrome");

        int num5 = 7; int num6 = 10;
        if (checkPrime(num5)) System.out.println(num5 + " is prime");
        else System.out.println(num5 + " is not prime");
        if (checkPrime(num6)) System.out.println(num6 + " is prime");
        else System.out.println(num6 + " is not prime");
    }

    // 1. Print even numbers between 601 and 700 in descending order
    private static void printEven(){
        System.out.println("Even numbers between 601 and 700 in descending order:");
        for (int i = 700; i > 600; i--){
            if (i%2==0){
                System.out.print(i + ", ");
            }
        }
    }

    // 2. Print grade for given marks
    private static char printGrade(int marks){
       if (marks > 100){
           return 'X';
       } else {
           if (marks > 90){
               return 'S';
           } else if (marks > 80){
               return 'A';
           } else if (marks > 70){
               return 'B';
           } else if (marks > 60) {
               return 'C';
           } else if (marks > 50){
               return 'D';
           } else {
               return 'F';
           }
       }
    }

    // 3. Multiply two arrays element-by-element
    private static int[] multiplyArray(int[] arr1, int[] arr2){
        int[] outputArray = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            outputArray[i] = arr1[i] * arr2[i];
        }
        return outputArray;
    }

    // 4. Print position of element in array
    private static int printPosition(int[] arr, int searchElement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                return i;
            }
        }
        return -1;
    }

    // 5. Check vowel or consonant
    private static boolean checkVowel(char ch){
        return ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u';
    }

    // 6. Print multiplication table of 17 upto 10 numbers
    private static void printMultiplicationTable(){
        for (int i = 1; i <= 10; i++){
            System.out.println("17 x " + i + " = " + (17*i));
        }
    }

    // 7. Print square of elements in array
    private static int[] squareElements(int[] arr){
        int[] squaredArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            squaredArray[i] = arr[i]*arr[i];
        }
        return squaredArray;
    }

    // 8. Print hundredth position value in words
    private static String printHundredth(int num){
        while (num > 9){
            num /= 10;
        }
        String[] inWords = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        return inWords[num];
    }

    // 9. Print all numbers divisible by 3 greater than 300 and less than 400.
    private static void printNumbersDivisibleByThree(){
        System.out.println("Numbers between 300 and 400 divisible by 3:");
        for (int i = 301; i < 400; i++){
            if (i % 3 == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println(" ");
    }

    // 10. Print all numbers between 200 and 500 ending with 7
    private static void printNumbersEndingWithSeven() {
        System.out.println("Numbers between 200 and 500 ending with 7:");
        for (int i = 201; i < 500; i++) {
            if (i % 10 == 7) {
                System.out.print(i + ", ");
            }
        }
        System.out.println(" ");
    }

    // 11. Print greatest of three numbers
    private static int printGreatestOfThree(int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3){
            return num1;
        } else if (num2 > num1 && num2 > num3){
            return num2;
        } else {
            return num3;
        }
    }

    // 12. Print number of odd elements in array
    private static int noOfOddElements(int[] arr){
        int counter = 0;
        for (int i : arr) {
            if (i % 2 == 0) counter++;
        }
        return counter;
    }

    // 13. Sum of elements in array
    private static int sumOfElements(int[] arr){
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    // 14. Reverse array of string
    private static String[] reverseStringArray(String[] arr){
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++; right--;
        }
        return  arr;

    }

    // 15. Count and print even elements in integer array
    private static int countEvenElements(int[] arr){
        int counter = 0;
        for (int i : arr) {
            if (i % 2 == 0) counter++;
        }
        return counter;
    }

    // 16. Find factorial using recursion
    private static int findFactorial(int num){
        if (num == 1) return 1;
        return num * findFactorial(num-1);
    }

    // 17. Largest element in array
    private static int findLargestInArray(int[] arr){
        int largest = arr[0];
        for (int i : arr) {
            if (i > largest) largest = i;
        }
        return largest;
    }

    // 18. Find number of occurences of an element in an array
    private static int printNoOfOccurences(int[] arr, int num){
        int occurences = 0;
        for (int i : arr) {
            if (i == num) occurences++;
        }
        return occurences;
    }

    // 19. Check if string is palindrome or not
    private static boolean checkPalindrome(String word){
        int left = 0; int right = word.length() - 1;
        while(left < right){
            if (word.toLowerCase().charAt(left) != word.toLowerCase().charAt(right)) return false;
            left ++; right--;
        }
        return true;
    }

    // 20. Check whether an integer is prime or not
    private static boolean checkPrime(int num){
        for (int i = 2; i < num; i++){
            if (num % i == 0) return false;
        }
        return true;
    }
}
