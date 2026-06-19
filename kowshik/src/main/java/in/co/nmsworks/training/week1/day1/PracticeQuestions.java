package in.co.nmsworks.training.week1.day1;

import java.util.Scanner;

public class PracticeQuestions {
    public static void main(String[] args) {
        printNumber();
        //addTwoNumbers();
        //multiplyTwoNumbers(3.5f, 2.5f);
        //findQuotientAndReminder(25, 4);
        //swapNumbers(1.2, 2.45);
        //isOddOrEven();
        //isVowelOrConsonant('E');
        //findAsciiValue('a');
    }

    public static void printNumber(){
        System.out.println("Enter a Number : ");
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        System.out.println("You Entered : " + input);
    }

    public static void addTwoNumbers(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first Number : ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter Second Number : ");
        int secondNumber = scanner.nextInt();

        System.out.println("The Sum is : " + (firstNumber + secondNumber));
    }

    public static void multiplyTwoNumbers(float firstNumber, float secondNumber){
        System.out.println("The Product is : " + (firstNumber * secondNumber));
    }

    public static void findQuotientAndReminder(int firstNumber, int secondNumber){
        int quotient = (firstNumber/secondNumber);
        System.out.println("Quotient : " + quotient);

        int reminder = (firstNumber % secondNumber);
        System.out.println("Reminder : " + reminder);
    }

    public static void swapNumbers(double firstNumber, double secondNumber){
        System.out.println("--- Before Swap ---");
        System.out.println("First Number : " + firstNumber);
        System.out.println("SecondNumber : " + secondNumber);

        double temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("--- After Swap ---");
        System.out.println("First Number : " + firstNumber);
        System.out.println("SecondNumber : " + secondNumber);
    }

    public static void isOddOrEven(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number : " );
        int input = scanner.nextInt();

        if(input % 2 == 0){
            System.out.println(input + " is even");
        }
        else{
            System.out.println(input + " is odd");
        }
    }

    public static void isVowelOrConsonant(char input){
        if((input == 'a') || (input == 'e') || (input == 'i') || (input == 'o') || (input == 'u')
            || (input == 'A') || (input == 'E') || (input == 'I') || (input == 'O') || (input == 'U')){
            System.out.println(input + " is vowel");
        }
        else{
            System.out.println(input + " is consonant");
        }
    }

    public static void findAsciiValue(char input){
        int ascii = input;
        System.out.println("ASCII Value of " + input + " is " + ascii);
    }
}
