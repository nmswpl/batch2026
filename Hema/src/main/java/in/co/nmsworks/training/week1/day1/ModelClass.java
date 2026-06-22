package in.co.nmsworks.training.week1.day1;

import java.util.Scanner;
import java.util.*;

public class ModelClass {
    public static void main(String[] args) {
//        addInteger();
//        checkOddEven();
//        checkVowelConsonant();
//        computeQuotientRemainder();
//        findAscii();
//        multipyNumbers();
//        printInteger();
        swapNumbers();

    }

    public static void addInteger()
    {
        System.out.println("Enter two numbers:");
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("The sum is: "+c);
    }

    public static void checkOddEven()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = sc.nextInt();
        if( input % 2 == 0)
            System.out.println(input+" is even");
        else
            System.out.println(input+" is odd");
    }

    public static void checkVowelConsonant()
    {
        char ch = 'u';
        if( ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch =='U')
            System.out.println(ch+" is a Vowel");
        else
            System.out.println(ch+" is a Consonant");

    }

    public static void computeQuotientRemainder() {
        int a = 4;
        int b = 2;
        int quotient = a / b;
        int remainder = a % b;
        System.out.println("Quotient = "+quotient+"\nRemainder = "+remainder);
    }

    public static void findAscii() {
        char ch = 'A';
        System.out.println((int)ch);
    }

    public static void multipyNumbers() {
        float number1 = 2;
        float number2 = 3;
        float result = number1*number2;
        System.out.println(result);
    }

    public static void printInteger() {
        System.out.println("Enter the Interger:");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        System.out.println("You entered:"+no);
    }

    public static void swapNumbers() {
        double a = 1.2;
        double b = 2.45;

        System.out.println("--Before Swap--\nFirst Number = "+a+"\nSecond Number = "+b);
        double temp = a;
        a = b;
        b = temp;
        System.out.println("--After Swap--\nFirst Number = "+a+"\nSecond Number = "+b);
    }
}
