package in.co.nmsworks.training.week1.day2;

import java.util.Scanner;

public class Day2Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        checkGreaterNumber(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Enter a number to check positive or negative");
        numberIsPositiveOrNegative(sc.nextInt());
        System.out.println("Enter a character to check it is a alphabet or not");
        checkForAlphabet(sc.next().charAt(0));
        System.out.println("Enter a number to find sum of n numbers");
        sumOfNumbers(sc.nextInt());
        System.out.println("Enter a number to find factorial using for loop");
        factorialUsingForLoop(sc.nextInt());
        System.out.println("Enter a number to find factorial using while loop");
        factorialUsingWhileLoop(sc.nextInt());
        System.out.println("Enter a number to print multiplacation table");
        printMultiplicationTable(sc.nextInt());
        System.out.println("Enter a number to print Fibanocci series");
        printFibonacciSeries(sc.nextInt());
        printLowerCaseAlphabet();
        System.out.println("Enter a number to find the number of digits");
        countNoOfDigits(sc.nextInt());
        System.out.println("Enter base values and power value to find power");
        findPowerOfNumber(sc.nextInt(), sc.nextInt());
        System.out.println("Enter base values and power value to find the power using power function");
        findPowerNumberUsingPowFunction(sc.nextInt(), sc.nextInt());
        System.out.println("Enter a number to check it is prime or not");
        checkForPrimeNumber(sc.nextInt());
        System.out.println("Enter a number to print factors of positive integers");
        factorsOfPositiveInteger(sc.nextInt());
        System.out.println("Enter a number");
        int number1 = sc.nextInt();
        long answer = factorialUsingRecursion(number1);
        System.out.println("The factorial is "+answer);
        sc.close();
    }

    public static void checkGreaterNumber(int number1, int number2, int number3){
        if(number1 > number2 && number1 > number3){
            System.out.println(number1+" is Greater");
        }
        else if(number2 > number1 && number2 > number3){
            System.out.println(number2+" is Greater");
        }
        else{
            System.out.println(number3+" is Greater");
        }
    }

    public  static void numberIsPositiveOrNegative(int number1){

        if(number1 > 0){
            System.out.println(number1+" is Positive");
        }
        else if(number1 < 0){
            System.out.println(number1+" is Negative");

        }
        else{
            System.out.println(number1+" is Zero");
        }
    }
    public static void  checkForAlphabet(char ch){
        ch = Character.toUpperCase(ch);
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println(ch+" is a Alphabet");
        }
        else{
            System.out.println(ch+" is not a Alphabet");
        }
    }
    public static void sumOfNumbers(int number1){
        System.out.println("Enter a numbers");
        int sum = 0;
        for (int i = 0; i <= number1; i++) {
            sum += i;
        }
        System.out.println("Sum of n numbers is: "+sum);
    }
    public static void factorialUsingForLoop(int number1){
        int fact = 1;
        for (int i = 1; i <= number1; i++) {
            fact *= i;

        }
        System.out.println("The factorial of"+number1+" is: "+fact);
    }
    public static void factorialUsingWhileLoop(int number1){

        int fact = 1;
        int i = 1;
        while(i <= number1){
            fact *= i;
            i++;
        }
        System.out.println("The factorial of "+number1+" is: "+fact);
    }
    public static void printMultiplicationTable(int number1){
        for(int i = 1;i <= 10; i++){
            int product = i * number1;
            System.out.println(number1+" * "+i+" = "+product);
        }
    }
    public static void printFibonacciSeries(int number1){
        int first = 0;
        int second = 1;
        System.out.println("Fibanocci of "+number1+" are: ");
        System.out.print(first+" "+second+" ");
        for (int i = 2; i < number1; i++) {
            int sum = first + second;
            first = second;
            second = sum;
            System.out.print(sum+" ");
        }
        System.out.println();
    }
    public static void printLowerCaseAlphabet(){
        for (char i = 'a'; i < 'z'; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void countNoOfDigits(int number1){
        int temporaryNumber = number1;
        int count = 0;
        while(number1 > 0){
            count++;
            number1 /= 10;
        }
        System.out.println("Number of digits in "+temporaryNumber+" is "+count);
    }
    public static void findPowerOfNumber(int base, int power){
        int answer = 1;
        for (int i = 0; i < power; i++) {
            answer *= base;
        }
        System.out.println("Answer = "+answer);
    }
    public static void findPowerNumberUsingPowFunction(int base, int power){
        int answer = (int)Math.pow(base, power);
        System.out.println("Answer = "+answer);
    }
    public static void checkForPrimeNumber(int number1){
        boolean isPrime = true;
        if(number1 < 2){
            isPrime = false;
        }
        for(int i = 2; i < number1 / 2; i++){
            if(number1 % i == 0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println("Number "+number1+" is Prime");
        }
        else{
            System.out.println("Number "+number1+" is not prime");
        }
    }
    public static void factorsOfPositiveInteger(int number1){
        System.out.print("Factors of "+number1+" are: ");
        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }
    public static long factorialUsingRecursion(int number1){

        if(number1 == 0 || number1 ==1){
            return 1;
        }
        return number1 * factorialUsingRecursion(number1 - 1);
    }

}
