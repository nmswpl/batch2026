package in.co.nmsworks.training.week1.day2;
import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class JavaTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers to check which is greater : ");
        checkGreater(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Enter a number to check whether it is positive or negative : ");
        isPositiveOrNegative(sc.nextInt());
        isAlphabet('a');
        System.out.println("Enter a natural number :");
        int num = sc.nextInt();
        System.out.println( "Sum of " + num + " natural numbers is :" + sumOfNaturalNumbers(num));
        System.out.println("Enter a number to chk factorial : ");
        findFactorial(sc.nextInt());
        System.out.println("Enter a number to chk factorial : ");
        findFactorialUsingWhile(sc.nextInt());
        multiplicationTable(5);
        fibonacciSeries(10);
        System.out.println();
        System.out.println("Enter a number to count no of digits : ");
        countInteger(sc.nextInt());
        System.out.println("Enter base and power to check power value : ");
        findPower(sc.nextInt(), sc.nextInt());
        System.out.println("Enter base and power to check power value : ");
        findPowerUsingPow(sc.nextInt(), sc.nextInt());
        System.out.println("Enter a natural number :");
        int number = sc.nextInt();
        System.out.println( number +  " is prime :" + isPrime(number));
        System.out.println("Enter a number :");
        findFactors(sc.nextInt());
        System.out.println();
        printAlphabet();
        System.out.println("Enter a number :");
        System.out.println("Factorial using recursion is : " + fact(sc.nextInt()));
        sc.close();
    }
    public static void checkGreater(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a + " is greater among three numbers");
        } else if (b > a && b > c) {
            System.out.println(b + " is greater among three numbers");
        } else {
            System.out.println(c + " is greater among three numbers");
        }
    }
    public static void isPositiveOrNegative(int num){
        if (num >= 0) {
            System.out.println( num + " is positive");
        }
        else {
            System.out.println( num + " is negative");
        }

    }
    public static void isAlphabet(char ch){
        if (!Character.isAlphabetic(ch)){
            System.out.println(ch + " is not an Alphabet");
        }
        else {
            System.out.println(ch + " is an Alphabet");
        }
    }
    public static int sumOfNaturalNumbers(int num) {
        int sum = 0;
        for (int i =1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
    public static void findFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is : " + fact);
    }
    public static void findFactorialUsingWhile(int num) {
        int fact = 1 , i =1;
        while ( i <= num) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial of " + num + " using while loop is : " + fact);
    }
    public static void multiplicationTable(int num){
        System.out.println("Multiplication Table of " + num);
        for (int i= 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
    public static void fibonacciSeries(int num) {
        System.out.println("Fibonacci Series of : " + num);
        int a =0, b=1;
        for (int i = 0; i < num; i++) {
            System.out.print(a + " ");
            int c = a +b;
            a = b;
            b = c;
        }
    }
    public static void printAlphabet() {
        for (char ch = 'a'; ch<= 'z' ; ch++) {
            System.out.println(ch);
        }
    }
    public static void countInteger(int num) {
        int count = 0;
        if(num == 0){
            count = 1;
        }
        else {
            while(num != 0) {
                num /= 10;
                count++;
            }
        }
        System.out.println("No of digits is :"  + count);
    }
    public static void findPower(int base, int power) {
        int ans =1;
        for (int i = 1; i <= power ; i++) {
             ans *= base;
        }
        System.out.println("Answer :" + ans);
    }
    public static void findPowerUsingPow(int base, int power) {

        System.out.println("Answer :" + pow(base,power));

    }
    public static boolean isPrime(int num) {
        if (num <= 1){
           return false;
        }
        for (int i = 2; i <= Math.sqrt(num) ; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void findFactors(int num1){
        System.out.println("Factors of " + num1 + " are :");
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static int fact(int num) {
        if(num == 0 || num ==1){
            return 1;
        }
        else{
            return num * fact(num -1);
        }
    }
}
