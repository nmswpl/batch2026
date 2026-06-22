package in.co.nmsworks.training.week1.day1;

import java.util.Scanner;

public class PracticeQuestions {
    public static void main(String[] args) {
        getAndPrintNumber();
        getTwoNumberAndAdd();
        multiplyTwoFloatNumbers();
        findAsciiValue();
        swapWithTemporary();
        checkOddOrEven();
        findQuotientAndRemainder();
        checkVowelOrConsonant();
    }

    public static void getAndPrintNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int num1 = sc.nextInt();
        System.out.println("You Entered : " + num1);
    }

    public static void getTwoNumberAndAdd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The Sum is: " + (num1+num2));
    }

    public static void multiplyTwoFloatNumbers() {
        float num1 = 3;
        float num2 = 1;
        System.out.println("The Product is: " + (num1*num2));
    }

    public static void findAsciiValue() {
        char character = 'C';
        int typeCastedNumber = (int) character;
        System.out.println("The ASCII Value of " + character + " is " + typeCastedNumber);

    }

    public static void findQuotientAndRemainder() {
        int firstNumber = 10;
        int secondNumber = 3;
        int quotient = firstNumber/secondNumber;
        int remainder = firstNumber%secondNumber;
        System.out.println("The Quotient is: " + quotient);
        System.out.println("The Remainder is: " + remainder);
    }

    public static void swapWithTemporary() {
        double firstNumber = 1.2;
        double secondNumber = 2.45;
        double temporaryNumber;
        System.out.println("--Before Swap--");
        System.out.println("First Number : " + firstNumber);
        System.out.println("Second Number : " + secondNumber);

        temporaryNumber = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temporaryNumber;

        System.out.println("--After Swap--");
        System.out.println("First Number : " + firstNumber);
        System.out.println("Second Number : " + secondNumber);
    }

    public static void checkOddOrEven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to check odd or even : ");
        int numberToCheck = sc.nextInt();
        if(numberToCheck % 2 ==0){
            System.out.println(numberToCheck + " is Even");
        }
        else {
            System.out.println(numberToCheck + " is Odd");
        }
    }

    public static void checkVowelOrConsonant() {
        char character = 'c';
        if(character == 'A' || character == 'E' || character == 'I' || character == 'O' ||character ==  'U' || character == 'a' || character == 'e' || character == 'i' || character == 'o' ||character ==  'u'){
            System.out.println("The Character" + character + " is Vowel");
        }
        else{
            System.out.println("The Character " + character + " is Consonant");
        }
    }
}
