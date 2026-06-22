package in.co.nmsworks.training.week1.day2;
import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class JavaTask {
    public static void main(String[] args) {
        checkGreater(2, 3, 4);
        isPositiveOrNegative();
        isAlphabet('a');
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number :");
        int num = sc.nextInt();
        System.out.println( "Sum of " + num + " natural numbers is :" + sumOfNaturalNumbers(num));
        findFactorial();
        findFactorialUsingWhile();
        multiplicationTable(5);
        fibonacciSeries(10);
        countInteger();
        findPower();
        findPowerUsingPow();
        System.out.println("Enter a natural number :");
        int number = sc.nextInt();
        System.out.println( number +  " is prime :" + isPrime(number));
        System.out.println("Enter a number :");
        int num1 = sc.nextInt();
        findFactors(num1);
        System.out.println("Enter a number :");
        int n1 = sc.nextInt();
        System.out.println("Factorial using recursion is : " + fact(n1));
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
    public static void isPositiveOrNegative(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
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
    public static void findFactorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number :");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is : " + fact);
    }
    public static void findFactorialUsingWhile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number :");
        int num = sc.nextInt();
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
    public static void countInteger() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number :");
        int num = sc.nextInt();
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
    public static void findPower() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base number :");
        int base = sc.nextInt();
        System.out.println("Enter power :");
        int power = sc.nextInt();
        int ans =1;
        for (int i = 1; i <= power ; i++) {
             ans *= base;
        }
        System.out.println("Answer :" + ans);
    }
    public static void findPowerUsingPow() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base number :");
        int base = sc.nextInt();
        System.out.println("Enter power :");
        int power = sc.nextInt();
        System.out.println("Answer :" + pow(2,3));
    }
    public static boolean isPrime(int num) {
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
    public static void findFactors(int num1){
        System.out.println("Factors of " + num1 + " are :");
        for (int i = 1; i < num1; i++) {
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
