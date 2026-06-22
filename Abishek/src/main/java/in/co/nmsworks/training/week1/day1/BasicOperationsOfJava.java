package in.co.nmsworks.training.week1.day1;

import java.util.*;
public class BasicOperationsOfJava {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = in.nextInt();
        char ascii = 'a';
        printNumber(number);
        System.out.println("Addition of 10 and 20 is: "+ addTwoNumbers(10,20));
        System.out.println("Multiplication of 6 and 2 is: "+ multiplyTwoNumbers(6,2));
        findAsciiValue(ascii);
        computeQuotientAndReminder(37,6);
        swapTwoNumbers(1.2, 2.45);
        checkEvenOrOdd(6);
        checkVowelOrConstant('a');
    }
    public static void printNumber(int number) {

        System.out.println("Your given number is: "+ number);
    }
    public static int addTwoNumbers(int number1, int number2) {
          return number1+number2;
    }
    public static float multiplyTwoNumbers(float number1, float number2) {
        return number1*number2;
    }
    public static  void findAsciiValue(char ascii) {
        int value = ascii;
        System.out.println("Ascii value of "+ascii+" "+value);
    }
    public static void computeQuotientAndReminder(int number1, int number2) {
        int quotient = number1/number2;
        int reminder = number1%number2;
        System.out.println("Quotient is: "+quotient+" and reminder is: "+reminder);
    }
    public static void swapTwoNumbers(double a1, double a2) {
        double temp=0;
        temp = a1;
        a1 = a2;
        a2 = temp;
        System.out.println("After swap a1 is: "+a1+" and a2 is: "+a2);
    }
    public static void checkEvenOrOdd(int number) {
        if(number%2 == 0) {
            System.out.println(number + " is even number");
        }
        else{
            System.out.println(number+ "is odd number");
        }

    }
    public static void checkVowelOrConstant(char value) {
        if(value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u' || value == 'A' || value == 'E' || value == 'I' || value == 'O' || value == 'U') {
            System.out.println(value+" is a vowel");
        }
        else {
            System.out.println(value+" is a character");
        }
    }
}
