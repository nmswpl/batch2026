package in.co.nmsworks.training.week1.day1;

import java.util.Scanner;

public class BasicOperations {
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        printInteger();
        addTwoNumbers();
        multiplyFloats(1.2, 1.2);
        findAsciiValue('a');
        checkVowel();
        findQuotientAndRemainder(30,12);
        checkOddOrEven();
        swapTwoNumbers(1.2,2.45);
    }

    public static void printInteger(){

        System.out.println("Enter a number : ");
        int num = in.nextInt();

        System.out.println("You Entered : " + num);

    }

    public static void addTwoNumbers(){
        System.out.println("Enter two numbers : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println("The sum is : " + (num1 + num2));
    }

    public static void multiplyFloats(double num1, double num2){
        System.out.println("The product is : " + num1 * num2);
    }

    public static void findAsciiValue(char ch){
        System.out.println(ch + " in ASCII : " + (int)ch);
    }

    public static void findQuotientAndRemainder(int numerator, int denominator){
        int quotient = numerator / denominator;
        int remainder = numerator % denominator;
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }

    public static void swapTwoNumbers(double first, double second){
        System.out.println("--Before Swap--");
        System.out.println("First num : " + first);
        System.out.println("Second num : " + second);

        double temp = first;
        first = second;
        second = temp;

        System.out.println("--After Swap--");
        System.out.println("First num : " + first);
        System.out.println("Second num : " + second);
    }

    public static void checkOddOrEven(){
        System.out.println("Enter a number : ");
        int num = in.nextInt();
        if(num % 2 == 0){
            System.out.println(num + " is even");
        }else{
            System.out.println(num + " is odd");
        }
    }

    public static void checkVowel(){
        System.out.println("Enter a char : ");
        char ch = in.nextLine().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch + " is a vowel");
        }else{
            System.out.println(ch + " is a consonant");
        }
    }
}
