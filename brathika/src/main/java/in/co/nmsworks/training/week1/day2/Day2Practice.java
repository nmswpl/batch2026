package in.co.nmsworks.training.week1.day2;

import java.util.Scanner;

public class Day2Practice {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        checkGreaterNumber();
        numberIsPositiveOrNegative();
        checkForAlphabet();
        sumOfNumbers();
        factorialUsingForLoop();
        factorialUsingWhileLoop();
        printMultiplicationTable();
        printFibanocciSeries();
        printLowerCaseAlphabet();
        countNoOfDigits();
        findPowerOfNumber();
        findPowerNumberUsingPowFunction();
        checkForPrimeNumber();
        factorsOfPositiveInteger();
        System.out.println("Enter a number");
        int number1 = sc.nextInt();
        long answer = factorialUsingRecursion(number1);
        System.out.println("The factorial is "+answer);
    }

    public static void checkGreaterNumber(){
        System.out.println("Enter three numbers");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
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

    public  static void numberIsPositiveOrNegative(){
        System.out.println("Enter a number");
        int number1 = sc.nextInt();
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
    public static void  checkForAlphabet(){
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        ch = Character.toUpperCase(ch);
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println(ch+" is a Alphabet");
        }
        else{
            System.out.println(ch+" is not a Alphabet");
        }
    }
    public static void sumOfNumbers(){
        System.out.println("Enter a numbers");
        int number1 = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= number1; i++) {
            sum += i;
        }
        System.out.println("Sum of n numbers is: "+sum);
    }
    public static void factorialUsingForLoop(){
        System.out.println("Enter a numbers");
        int number1 = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= number1; i++) {
            fact *= i;

        }
        System.out.println("The factorial of"+number1+" is: "+fact);
    }
    public static void factorialUsingWhileLoop(){
        System.out.println("Enter a number");
        int number1 = sc.nextInt();
        int fact = 1;
        int i = 1;
        while(i <= number1){
            fact *= i;
            i++;
        }
        System.out.println("The factorial of "+number1+" is: "+fact);
    }
    public static void printMultiplicationTable(){
        System.out.println("Enter a number");
        int number1 = sc.nextInt();
        for(int i = 1;i <= number1; i++){
            int product = i * number1;
            System.out.println(number1+" * "+i+" = "+product);
        }
    }
    public static void printFibanocciSeries(){
        System.out.println("Enter a number");
        int number1 = sc.nextInt();
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
    public static void countNoOfDigits(){
        int number1 = 12949;
        int temp = number1;
        int count = 0;
        while(number1 > 0){
            count++;
            number1 /= 10;
        }
        System.out.println("Number of digits in "+temp+" is "+count);
    }
    public static void findPowerOfNumber(){
        System.out.println("Enter the base value");
        int base = sc.nextInt();
        System.out.println("Enter the power value");
        int power = sc.nextInt();
        int answer = 1;
        for (int i = 0; i < power; i++) {
            answer *= base;
        }
        System.out.println("Answer = "+answer);
    }
    public static void findPowerNumberUsingPowFunction(){
        System.out.println("Enter the base value");
        int base = sc.nextInt();
        System.out.println("Enter the power value");
        int power = sc.nextInt();
        int answer = (int)Math.pow(base, power);
        System.out.println("Answer = "+answer);
    }
    public static void checkForPrimeNumber(){
        System.out.println("Enter a number");
        int number1 = sc.nextInt();
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
    public static void factorsOfPositiveInteger(){
        System.out.println("Enter a number");
        int number1 = sc.nextInt();
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
