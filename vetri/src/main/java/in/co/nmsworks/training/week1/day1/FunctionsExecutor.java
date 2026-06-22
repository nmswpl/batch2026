package in.co.nmsworks.training.week1.day1;

import java.util.Scanner;

public class FunctionsExecutor {

    // Scanner object for user input
    Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {

        // Uncomment any method call below to test it

        // Prints the number entered by the user
        inputPrinter();

        // Adds two integers entered by the user
        addTwoIntegers();

        // Finds product of two floating point numbers
        productOfTwoFloatingNums(3.9f, 5.2f);

        // Finds ASCII value of a character
        AsciiFinder('a');

        // Finds quotient and remainder
        quesAndRemFinder(71, 9);

        // Swaps two numbers
        swapper(1.2, 2.45);

        // Checks whether a number is odd or even
        oddEvenChecker();

        // Checks whether a character is vowel or consonant
         vowelAndConsentChecker('A');
    }

    // Method to get an integer input and print it
    public static void inputPrinter() {

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter a number");

        int input = inp.nextInt();

        System.out.println("you entered " + input);
    }

    // Method to add two integers entered by the user
    public static void addTwoIntegers() {

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter Two numbers");

        int input1 = inp.nextInt();
        int input2 = inp.nextInt();

        System.out.println("the sum is " + (input1 + input2));
    }

    // Method to find the product of two floating point numbers
    public static void productOfTwoFloatingNums(float number1, float number2) {

        System.out.println("The Product is " + (number1 + number2));
    }

    // Method to find ASCII value of a character
    public static void AsciiFinder(char text) {

        int convAsc = text;

        System.out.println("Ascii of given char is " + convAsc);
    }

    // Method to find quotient and remainder
    public static void quesAndRemFinder(int inp1, int inp2) {

        int quo = inp1 / inp2;
        int rem = inp1 % inp2;

        System.out.println("Quotient is " + quo);
        System.out.println("Reminder is " + rem);
    }

    // Method to swap two numbers
    public static void swapper(double te1, double te2) {

        System.out.println("Before Swaping");
        System.out.println("First Number = " + te1);
        System.out.println("Second Number = " + te2);

        double t = te1;
        te1 = te2;
        te2 = t;

        System.out.println("After Swaping");
        System.out.println("First Number = " + te1);
        System.out.println("Second Number = " + te2);
    }

    // Method to check whether a number is odd or even
    public static void oddEvenChecker() {

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter a number");

        int input1 = inp.nextInt();

        if (input1 % 2 == 0) {
            System.out.println(input1 + "is Even");
        } else {
            System.out.println(input1 + "is Odd");
        }
    }

    // Method to check whether a character is a vowel or consonant
    public static void vowelAndConsentChecker(char alp) {
        alp=Character.toLowerCase(alp);

        if (alp == 'a' || alp == 'e' || alp == 'i' || alp == 'o' || alp == 'u') {

            System.out.println("Vowel");

        } else {

            System.out.println("Consonet");
        }
    }
}