package in.co.nmsworks.training.week1.day1;

import java.util.Scanner;

public class JavaPractice {
    public static void main(String[] args) {
        printInteger();
        add();
        multiply();
        ascii();
        quotientRemainder();
        swap();
        evenOdd();
        vowelConsonant();
    }

    public static void printInteger() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number=sc.nextInt();
        System.out.println("You entered:"+number);
    }

    public static void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int sum = number1 + number2;
        System.out.println("The sum is : "+ sum);
    }

    public static void multiply(){
        float number1 = 3;
        float number2 = 2;
        float product=number1* number2;
        System.out.println("The product is : "+ product);
    }

    public static void ascii(){
        char c= 'b';
        int ascii = c;
        System.out.println("The ASCII VALUE of "+ c+" is : "+ascii);
    }

    public static void quotientRemainder(){
        int number1 = 10;
        int number2= 3;
        System.out.println("Quotient: "+ number1 / number2);
        System.out.println("Remainder: "+ number1 % number2);
    }

    public static void swap(){
        int number1 = 10;
        int number2 = 20;
        int temp;
        System.out.println("Before swap....");
        System.out.println("number1 = "+number1+" number2 = "+number2);
        temp=number1;
        number1  = number2;
        number2 = temp;
        System.out.println("After swap....");
        System.out.println("number1 = "+number1+" number2 = "+number2);
    }

    public static void evenOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }

    public static void vowelConsonant(){
        char ch = 'a';

        if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'|| ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println("It is vowel");
        }
        else{
            System.out.println("It is consonant");
        }


    }

}
