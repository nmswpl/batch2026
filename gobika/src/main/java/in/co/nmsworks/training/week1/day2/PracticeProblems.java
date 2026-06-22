package in.co.nmsworks.training.week1.day2;

import java.util.Scanner;

public class PracticeProblems {
    public static void main(String[] args) {
        largestNumber();
        positiveOrNegative();
        alphabetCheck();
        sumOfNumbers();
        factorialUsingFor();
        factorialUsingWhile();
        multiplicationTable();
        fibonacci();
        lowerCaseAlphabet();
        powerOfANumber();
        powerFunction();
        primeOrNot();
        factorsOfANumber();
        countDigits();
        System.out.println("Factorial using Recursion : " +factorialRecursion(5));
//        frequencyOfACharacter();


    }

//    private static void frequencyOfACharacter() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a String : ");
//        String s = sc.nextLine();
//    }

    private static void lowerCaseAlphabet() {
        System.out.println();
        for (char i = 'a'; i < 'z'; i++) {
            System.out.print(i + " ");
        }
    }

    private static int factorialRecursion(int num) {
        if (num ==0 || num ==1){
            return 1;
        }
        else {
            return num * factorialRecursion(num-1);
        }

    }

    private static void countDigits() {
        int num = 1543;
        int count = 0;
        while (num >0){
            count++;
            num = num /10;
        }
        System.out.println();
        System.out.println("Count Digits : " + count);
    }

    private static void factorsOfANumber() {
        int number = 60;
        System.out.println("Factors of "+ number);
        for (int i = 1; i <= number ; i++) {
            if ( number % i == 0){
                System.out.print(" "+i );
            }

        }

    }

    private static void primeOrNot() {
        int number = 37;
        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if ( number % i == 0){
                System.out.println("Not a Prime");
                break;
            }
            else{
                System.out.println("Prime Number");
                break;
            }

        }
    }

    private static void powerFunction() {
        int baseNumber = 2;
        int power= 3;
        double answer=Math.pow(baseNumber,power);
        System.out.println("Power using pow function :" + answer);
    }

    private static void powerOfANumber() {
        int baseNumber = 2;
        int power= 3;
        int answer=1;
        for (int i = 0; i < power; i++) {
            answer *= baseNumber;

        }
        System.out.println();
        System.out.println("Power is " + answer);
    }


    private static void fibonacci() {
        int n = 10;
        int fNum = 0;
        int sNum = 1;
        int fibonacciNum = 0;
        System.out.print("Fibonacci of "+ n + " is "+ fNum + " " +sNum);
        for (int i = 0; i < n; i++) {
            fibonacciNum = fNum + sNum;
            fNum = sNum;
            sNum = fibonacciNum;
            System.out.print(" " +fibonacciNum + " ");
        }

    }

    private static void multiplicationTable() {
        int table = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(table +" * " + i + " = "+ table*i);
        }
    }

    private static void factorialUsingFor() {
        int num = 5;
        int factFor = 1;
        for (int i = 1; i <= num ; i++) {
            factFor *= i;
        }
        System.out.println("Factorial of "+ num + " is " + factFor);
    }

    private static void factorialUsingWhile() {
        int num = 10;
        int fact = 1;
        int j = 1;
        while (j <= num ){
            fact *= j;
            j++;
        }
        System.out.println("Factorial of "+ num + " is " + fact);
    }

    private static void sumOfNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to sum of N numbers : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+= i;
        }
        System.out.println("Sum = "+ sum);
    }

    private static void alphabetCheck() {
        char ch = '*';

        if (Character.isAlphabetic(ch)){
            System.out.println(ch + " is an alphabet");
        }
        else {
            System.out.println(ch + " is not an alphabet");
        }
    }

    private static void positiveOrNegative() {
        int num = -64;
        if ( num < 0 ){
            System.out.println("Negative Number");
        }
        else{
            System.out.println("Positive Number");
        }
    }

    private static void largestNumber() {
        int fNum = 34;
        int sNum = 59;
        int tNum = 20;
        if (fNum > sNum){
            if(fNum > tNum){
                System.out.println("First number is larger");
            }
            else
                System.out.println("Third number is larger");
        }
        else{
            System.out.println("Second number is largest");

        }
    }


}
