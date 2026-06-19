package in.co.nmsworks.training.week1.day1;

import java.util.*;

public class JavaBasicOperations {

    public static void main(String[] args) {
        printNumber();
        add();
        multiply(2.1f,7.3f);
        findAsciValue();
        findQuotientAndRemainder(21,8);
        swapFunction(16,2);
        checkOddOrEven(48);
        checkVowelOrConsonant();
    }

    public static void printNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("You entered: "+number);
    }

    public static void add(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = scanner.nextInt(), num2 = scanner.nextInt();
        System.out.println("The Sum is : "+(num1+num2));
    }

    public static void multiply(float num1, float num2){
        System.out.println("The Product is : "+(num1*num2));
    }

    public static void findAsciValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Character : ");
        char input = scanner.next().charAt(0);
        System.out.println("Asci Value of "+input+" is "+((int)input));
    }

    public static void findQuotientAndRemainder(int num1,int num2){
        System.out.println("Quotient = "+(num1/num2));
        System.out.println("Remainder = "+(num1%num2));
    }

    public static void swapFunction(int num1,int num2){
        System.out.println("--Before Swap--");
        System.out.println("First Number : "+num1);
        System.out.println("Second Number : "+num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("--After Swap--");
        System.out.println("First Number : "+num1);
        System.out.println("Second Number : "+num2);
    }

    public static void checkOddOrEven(int number){
        if ( number % 2 == 0)
            System.out.println("Given number is Even number");
        else
            System.out.println("Given number is Odd number");
    }

    public static void checkVowelOrConsonant(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Character : ");
        char ch = scanner.next().charAt(0);
        if ( ch >= 'a' && ch <= 'z')
            ch -= 32;

        if ( ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
            System.out.println("Given Character is Vowel!");
        else
            System.out.println("Given Character is Consonant!");
    }
}
