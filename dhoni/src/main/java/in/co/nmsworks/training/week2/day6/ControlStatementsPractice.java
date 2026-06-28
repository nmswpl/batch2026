package in.co.nmsworks.training.week2.day6;

public class ControlStatementsPractice {
    public static void main(String[] args) {
        //printEvenNumbers(601,700);
        //printGrade(70);
        //multiplyTwoArrays( new int[] {2,4,1} , new int[] {3,5,7});
        //int index = findPosition(new int[] {7,15,41},2);
        //System.out.println(index);
        //isVowelOrConsonant('a');
        //printTable(17);
        //printSquares(new int[]{2,4,3,5});
        //printHundredPosition(777);
        //printDivisibleByThree(301,400);
        //printNumberEndWithSeven(200,500);
        //findLargestOfThree(18, 18, 35);
        //countOddElements(new int[] {32, 43, 4, 15});
        //findSum(new int[] {1, 2, 3});
        //reverseArrayOfString(new String[] {"a", "b", "c"});
        //countEvenElements(new int[] {2, 3, 4, 5, 6});
        //int factorial = factorial(5);
        //System.out.println("Factorial " + factorial);
        //findLargestElement(new int[]{12, 3, 20, 14});
        //countOccurrence(new int[] {1, 2, 3, 2, 2, 3}, 2);
        //checkPalindrome(new String("abc"));
        checkPrime(10);
    }

    private static void checkPrime(int n) {
        if (n <= 1) {
            System.out.println("Not Prime");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i < n; i++) {   // Brute force
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }
    }

    private static void checkPalindrome(String word) {
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        if (word.equals(reverse)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is Not Palindrome");
        }
    }

    private static void countOccurrence(int[] arr, int x) {
        int count = 0;
        for (int k : arr){
            if(k == x) count++;
        }
        System.out.println("Occurrence of " + x + " = " + count);
    }

    private static void findLargestElement(int[] numbers) {
        int maxValue = Integer.MIN_VALUE;
        for(int number  : numbers){
            if(number > maxValue){
                maxValue = number;
            }
        }
        System.out.println("Largest Element = " + maxValue);
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;   // Base case
        }
        return n * factorial(n - 1);   // Recursive call
    }

    private static void countEvenElements(int[] numbers) {
        int count = 0;
        for(int number : numbers){
            if (number % 2 == 0) count++;
        }
        System.out.println("Even elements = " + count);

    }

    private static void reverseArrayOfString(String[] arr) {
        int start = 0;
        int end = arr.length -1;

        while (start < end){
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.print("Reversed Array: ");
        for (String str : arr) {
            System.out.print(str + " ");
        }
    }

    private static void findSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers){
            sum = sum + number;
        }
        System.out.println("Sum = " + sum);
    }

    private static void countOddElements(int[] numbers) {
        int count = 0;
        for(int number : numbers){
            if (number % 2 != 0) count++;
        }
        System.out.println("Odd elements = " + count);
    }

    private static void findLargestOfThree(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println("Biggest Number: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Biggest Number: " + b);
        } else {
            System.out.println("Biggest Number: " + c);
        }
    }

    private static void printNumberEndWithSeven(int start, int end) {
        for (int i = start; i < end; i++) {
            if (i % 10 == 7){
                System.out.println(i);
            }
        }
    }

    private static void printDivisibleByThree(int start, int end) {
        for (int i = start; i < end; i++) {
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }

    private static void printHundredPosition(int number) {
        if (number < 100 || number > 999) {
            System.out.println("Invalid Input");
            return;
        }

        int digit = number / 100;

        switch (digit) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
        }
    }

    private static void printSquares(int[] numbers) {
        for (int number : numbers){
            System.out.print((int) Math.pow(number, 2) + " ");
        }
    }

    private static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + i*n);
        }
    }

    private static void isVowelOrConsonant(char letter) {
        if (letter >= 'a' && letter <= 'z') {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println(letter + " is a Vowel");
            } else {
                System.out.println(letter + " is a Consonant");
            }
        } else {
            System.out.println("Invalid Character");
        }
    }

    private static int findPosition(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    private static void multiplyTwoArrays(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length){
            System.out.println("Invalid Array length");
            return;
        }
        for (int i = 0; i < arr1.length ; i++) {
            System.out.print(arr1[i] * arr2[i] + " ");
        }
        System.out.println();
    }

    private static void printGrade(int mark){
        if (mark >= 91 && mark <= 100) {
            System.out.println("Grade: S");
        } else if (mark >= 81 && mark <= 90) {
            System.out.println("Grade: A");
        } else if (mark >= 71 && mark <= 80) {
            System.out.println("Grade: B");
        } else if (mark >= 61 && mark <= 70) {
            System.out.println("Grade: C");
        } else if (mark >= 51 && mark <= 60) {
            System.out.println("Grade: D");
        } else if (mark >= 0 && mark <= 50) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Invalid Mark");
        }
    }

    private static void printEvenNumbers(int start, int end) {
        for (int i = end; i >= start; i--) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }



}
