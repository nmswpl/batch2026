package in.co.nmsworks.training.week1.day1;
import java.util.Scanner;

public class PractiseProblems {

    public static void main(String[] args) {
        getOneNumber();
        addTwoNumbers();
        multiplyTwoNumbers(1.5,2.0);
        findAsciiValue('a');
        calculateQuotientAndRemainder(37,6);
        swapTwoNumbers(1.2, 2.45);
        checkOddOrEven();
        checkVowelOrConsonant('z');

    }

    public static void getOneNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Getting one number from user");
        System.out.println("Enter one number: ");
        int number = scan.nextInt();
        System.out.println("You entered :  " + number);

    }


    public static void addTwoNumbers(){

        Scanner scan = new Scanner(System.in);
        System.out.println("\nAddition of two numbers: ");
        System.out.println("Enter first number: ");
        int number1 = scan.nextInt();

        System.out.println("Enter second number: ");
        int number2 = scan.nextInt();

        int sum =  number1 + number2;
        System.out.println("The sum is  " + sum);

    }


    public static void multiplyTwoNumbers(double num1 , double num2){
        System.out.println("\nMultiplication of two numbers: ");
        System.out.println("The product is :" + num1*num2);
    }


    public static void calculateQuotientAndRemainder(float dividend, float divisor){
        float quotient = dividend / divisor;
        float remainder = dividend % divisor;
        System.out.println("\nDivision of two numbers: ");
        System.out.println("Quotient : " + quotient);
        System.out.println("Remainder : " + remainder);
    }


    public static void swapTwoNumbers(double num1, double num2){
        double temp;
        System.out.println("\nSwapping of two numbers: ");
        System.out.println("Before Swap");
        System.out.println("First Number : " + num1);
        System.out.println("Second Number : " + num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swap");
        System.out.println("First Number : " + num1);
        System.out.println("Second Number : " + num2);

    }

    public static void checkOddOrEven(){

        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter a number to check odd or even: ");
        int number = scan.nextInt();
        if(number % 2 == 0){
            System.out.println(number + " is even");
        }
        else{
            System.out.println(number + " is odd");
        }
    }


    public static void checkVowelOrConsonant(char alphabet){
        System.out.println("\nChecking whether an alphabet is vowel or consonant");
        if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' ||
                alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U'){
            System.out.println("The alphabet " + alphabet +" is vowel");
        }
        else{
            System.out.println("The alphabet " + alphabet +" is consonant");
        }
    }

    public static void findAsciiValue(char character){
        int asciiValue = (int)character;
        System.out.println("\nFinding ASCII Value of a Character");
        System.out.println("The ASCII value of " + character + " is " + asciiValue);
    }
}



