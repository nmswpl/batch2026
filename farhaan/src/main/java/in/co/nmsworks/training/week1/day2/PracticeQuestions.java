package in.co.nmsworks.training.week1.day2;

import java.util.Scanner;

public class PracticeQuestions {
    public static void main(String[] args) {
//        largestAmongThree(45,30,48);
//        checkPostiveOrNegative(54);
//        checkAlphabetOrNot('8');
//        sumOfNaturalNumbers();
//        findFactorialUsingForLoop(5);
//        findFactorialUsingWhileLoop(6);
//        printMultiplicationTable(7);
//        printFibonacciSeries(10);
//        printLowercaseAlphabet();
//        countingDigitsOfInteger();
//        calculatingPower();
//        powerUsingFunction();
//        checkPrimeNumber();
//        findFactors();
        long result = findFactorialUsingRecursion(6);
        System.out.println("The factorial is : " + result);

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

    public static void checkPostiveOrNegative(int number) {
        if (number > 0) {
            System.out.println(number + " is Positive");
        } else {
            System.out.println(number + " is Negative");
        }
    }

    public static void checkAlphabetOrNot(char checkAlphabet) {
        if (Character.isAlphabetic(checkAlphabet)) {
            System.out.println(checkAlphabet + " is an Alphabet");
        } else {
            System.out.println(checkAlphabet + " is not an Alphabet");
        }
    }

    public static void sumOfNaturalNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }

    public static void findFactorialUsingForLoop(int number) {
        int sumOfProducts = 1;
        for (int i = 1; i <= number; i++) {
            sumOfProducts *= i;
        }
        System.out.println("Factorial of " + number + " is " + sumOfProducts);
    }

    public static void findFactorialUsingWhileLoop(int number) {
        int sumOfProducts = 1, i = 1;
        while (i <= number) {
            sumOfProducts *= i;
            i++;
        }
        System.out.println("Factorial of " + number + " is " + sumOfProducts);
    }

    public static void printMultiplicationTable(int numberToBeMultiplied) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numberToBeMultiplied + " * " + i + " = " + (numberToBeMultiplied * i));
        }
    }

    public static void printFibonacciSeries(int number) {
        int firstNumber = 0, secondNumber = 1, nextNumber = 0;
        System.out.println("Fibonacci series of " + number + " terms :");
        for (int i = 1; i <= number; ++i) {
            System.out.print(firstNumber + " , ");
            nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }

    public static void printLowercaseAlphabet() {
        System.out.println();
        char alphabet;
        for (alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            System.out.print(alphabet + " ");
        }
    }

    public static void countingDigitsOfInteger() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = sc.nextInt();
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        System.out.println("The No. of Digits: " + count);
    }

    public static void calculatingPower() {
        long baseNumber, power;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base Number :");
        baseNumber = sc.nextLong();
        System.out.println("Enter the Power : ");
        power = sc.nextLong();
        for (int i = 1; i < power; i++) {
            baseNumber *= baseNumber;
        }
        System.out.println("Answer = " + baseNumber);
    }

    public static void powerUsingFunction() {
        long baseNumber, power;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base Number :");
        baseNumber = sc.nextLong();
        System.out.println("Enter the Power : ");
        power = sc.nextLong();
        System.out.println("Answer = " + Math.pow(baseNumber, power));
    }

    public static void checkPrimeNumber() {
        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;
        System.out.println("Enter a Number: ");
        int number = sc.nextInt();
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is a prime number");
        }
    }

    public static void findFactors(){
        int number = 60;
        System.out.print("The Factors of " + number + " are : ");
        for (int i = 1; i <= number ; i++) {
            if(number % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static long findFactorialUsingRecursion(long num){
        if(num <= 1){
            return 1;
        }
        else{
            return num*findFactorialUsingRecursion(num - 1);
        }
    }
}
