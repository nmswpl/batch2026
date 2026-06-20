package in.co.nmsworks.training.test;

import java.util.Scanner;

public class JavaPractice {
    public static void main(String[] args) {

        //findLargestAmongThreeNumbers(3,5,7);
        //isPositiveOrNegative(10);
        //isAlphabet('1');
        //findSumOfNaturalNumbers();
//        findFactorialUsingForLoop();
//        findFactorialUsingWhileLoop();
//        generateMultiplicationTable(5);
//        displayFibonacciSeries(10);

//        printLowerCaseAlphabet();
        //countNumberOfDigits(123434);
//        findPowerOfNumberUsingForLoop();
//        findPowerOfNumber();
//        System.out.println( "Factorial using Recursion : " + findFactorialUsingRecursion(6));
//        findFactors(60);
        checkPrimeNumberOrNot(27);
    }

    private static void findLargestAmongThreeNumbers(int firstNum, int secondNum, int thirdNum){
        int largest = 0;

        if(firstNum > secondNum && firstNum > thirdNum){
            largest = firstNum;
        }else if(secondNum > firstNum && secondNum > thirdNum){
            largest = secondNum;
        } else {
            largest = thirdNum;
        }

        System.out.println("Largest : " + largest);
    }

    private static void isPositiveOrNegative(int input){
        if(input >= 0){
            System.out.println(input +  " is Positive");
        }else{
            System.out.println(input + " is Negative");
        }
    }

    private static void isAlphabet(char input){
        if((input >= 'A' && input <= 'Z') || (input >= 'a' && input <= 'z')){
            System.out.println(input + " is an Alphabet.");
        }else{
            System.out.println(input + " is not an Alphabet.");
        }
    }

    private static void findSumOfNaturalNumbers(){
        System.out.println("Enter a Number : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int sum = 0;

        for(int i=1; i<=input; i++){
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }

    private static void findFactorialUsingForLoop(){
        System.out.println("Enter a Number : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        long factorial = 1;

        for(int i = 1; i <= input; i++){
            factorial *= i;
        }

        System.out.println("Factorial : " + factorial);
    }

    private static void findFactorialUsingWhileLoop(){
        System.out.println("Enter a Number : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        long factorial = 1;

        while (input > 1){
            factorial *= input;
            input--;
        }

        System.out.println("Factorial : " + factorial);
    }

    private static void generateMultiplicationTable(int input){

        for(int i = 1; i <= 10; i++){
            System.out.println(input + " * " + i + " = " + (input*i));
        }
    }

    private static void displayFibonacciSeries(int n){
        int a = 0;
        int b = 1;

        System.out.print(a + " , " + b + " , ");

        for(int i = 0; i < n-2; i++){
            int fibVal = a+b;
            a = b;
            b = fibVal;

            System.out.print(fibVal + " , ");
        }
    }

    private static void printLowerCaseAlphabet(){
        for(char c = 'a'; c <= 'z'; c++){
            System.out.print(c + " ");
        }
    }

    private static void countNumberOfDigits(int input){
        int count = 0;
        while (input > 0){
            input = input/10;
            count++;
        }

        System.out.println("Count of Digits : " + count);
    }

    private static void findPowerOfNumberUsingForLoop(){
        System.out.println("Enter a Base Number : ");
        Scanner scanner = new Scanner(System.in);
        int baseNum = scanner.nextInt();

        System.out.println("Enter power : ");
        int power = scanner.nextInt();

        int result = 1;
        for(int i = 0; i < power; i++){
            result *= baseNum;
        }

        System.out.println("Answer : " + result);
    }

    private static void findPowerOfNumber(){
        System.out.println("Enter a Base Number : ");
        Scanner scanner = new Scanner(System.in);
        int baseNum = scanner.nextInt();

        System.out.println("Enter power : ");
        int power = scanner.nextInt();

        int result = (int) Math.pow(baseNum, power);
        System.out.println("Answer : " + result);
    }

    private static int findFactorialUsingRecursion(int input){

        if(input == 1){
            return 1;
        }

        return input * findFactorialUsingRecursion(input-1);
    }

    private static void checkPrimeNumberOrNot(int input){
        if(input <= 1){
            System.out.println(input + " is not a Prime Number");
        }

        if(isPrimeNumber(input)){
            System.out.println(input + " is a Prime Number");
        }else{
            System.out.println(input + " is not a Prime Number");
        }
    }

    private static boolean isPrimeNumber(int input){
        for (int i = 2; i < input; i++) {
            if(input % i == 0){
                return false;
            }
        }
        return true;
    }

    private static void findFactors(int input){
        System.out.println("Factors of " + input + " are ");
        for(int i = 1; i <= input; i++){
            if(input % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}