package in.co.nmsworks.training.week1.day1;

import java.util.Scanner;

public class Day1Practice {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        printHelloWorld();
        printInteger();

        addInteger();
        divideTwoNumbers();
        findEvenOrOdd();
        findAscii();
        productOFTwoNumber();
        swapTwoNumber();

        checkVowelOrConsonant();
    }

    public static void printHelloWorld(){

        System.out.println("Hello World");
    }

    public static void printInteger(){
        System.out.println("Enter a number: ");
        int number1 = sc.nextInt();
        System.out.println("You entered: "+number1);
    }
    public static void addInteger(){
        System.out.println("Enter two numbers");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("The sum is: "+sum);
    }
    public static void divideTwoNumbers(){
        int firstNumber1 = 13;
        int secondNumber1 = 2;
        int quotient = firstNumber1 / secondNumber1;
        int remainder = firstNumber1 % secondNumber1;
        System.out.println("Quotient: "+quotient);
        System.out.println("Remainder: "+remainder);
    }
    public static void findEvenOrOdd(){
        System.out.println("Enter a number: ");
        int number1 = sc.nextInt();
        if (number1 % 2 == 0){
            System.out.println(number1+" is even");
        }
        else{
            System.out.println(number1+" is odd");
        }
    }
    public static void findAscii(){
        char ch = 'B';
        System.out.println("ASCII value is : "+(int)ch);
    }
    public static void productOFTwoNumber(){
        float firstNumber = 3;
        float secondNumber = 1;
        float multiply = firstNumber * secondNumber;
        System.out.println("The product is: "+multiply);
    }
    public static void swapTwoNumber(){
        double firstNumber = 1.2;
        double secondNumber = 2.45;
        System.out.println("--Before swap--");
        System.out.println("First Number = "+firstNumber);
        System.out.println("Second Number = "+secondNumber);
        double temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;
        System.out.println("--After swap--");
        System.out.println("First Number = "+firstNumber);
        System.out.println("Second Number = "+secondNumber);
    }
    public static void checkVowelOrConsonant(){
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        sc.close();
        ch = Character.toUpperCase(ch);
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println(ch+" is a vowel.");
        }
        else{
            System.out.println(ch+" is not a vowel.");
        }
    }


}
