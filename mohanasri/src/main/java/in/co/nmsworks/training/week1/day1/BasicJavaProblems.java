package in.co.nmsworks.training.week1.day1;

import java.util.Scanner;

public class BasicJavaProblems {
    public static void main(String[] args)
    {
        helloWorld();
        printInteger();
        addTwoIntegers();
        multiplyTwoFloatNum();
        findASCIIvalue();
        computeQuoAndRem();
        swapTwoNum();
        findEvenOrOdd();
        vowelOrConsonant();

    }

    public static void helloWorld() {

        System.out.println("Hello World!");
    }
    public static void printInteger(){
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        System.out.println("You entered: " + i );
    }
    public static void multiplyTwoFloatNum() {
        float a = 1;
        float b = 3;
        System.out.println("The product is: "+ a * b );
    }
    public static void findASCIIvalue() {
        char a = 'A';
        System.out.println("Value of A is " + (int) a);
    }
    public static void computeQuoAndRem(){
        float num1 = 20;
        float num2 = 3;
        float quotient = num1 / num2;
        float remainder = num1 % num2;
        System.out.println("Quotient = " + quotient + "\n Remainder = " + remainder);
    }
    public static void swapTwoNum(){
        double a = 1.2;
        double b = 2.45;
        System.out.println("Before swap \nFirst number = "+a+ "\nSecond number = "+b);
        double temp = a;
        a=b;
        b=temp;
        System.out.println("After swap \nFirst number = "+a+ "\nSecond number = "+b);
    }
    public static void findEvenOrOdd() {
        int i = 23;
        if(i % 2 == 0){
            System.out.println(i + " is Even");
        }
        else{
            System.out.println(i + " is Odd");
        }
    }
    public static void vowelOrConsonant(){
        char inp = 'B';
        if (inp == 'a' || inp == 'A' || inp == 'e' || inp == 'E' || inp == 'i' || inp == 'I' || inp == 'o' || inp == 'O' || inp == 'u' || inp == 'U' ){
            System.out.println(inp + " Is Vowel");
        }
        else{
            System.out.println(inp +" Is Consonant");
        }
    }
    public static void addTwoIntegers(){
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}
