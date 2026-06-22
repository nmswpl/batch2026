package in.co.nmsworks.training.week1.day1;

import java.util.Scanner;

public class TestCase {
    public static void main(String[] args) {
        enterNumber();
        addNumbers(2,5);
        multiplyFloat(6,2);
        asciiValue();
        divideNum();
        evenOdd(7);
        swapNumbers();
        checkAlphabet();

    }

    private static void asciiValue() {
        char ch = 'A';
        int asciiValueOfChar = (int) ch;
        System.out.println("ASCII Value of "+ ch + " is " +asciiValueOfChar);

    }

    private static void checkAlphabet() {
        char alphabet = 'u';
        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' ||
                alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }

    private static void swapNumbers() {
        double firstNum = 2.3;
        double secNum = 5.3;
        System.out.println("Before swap");
        System.out.println("first number is : " +firstNum);
        System.out.println("second number is : "+secNum) ;

        double temp = firstNum;
        firstNum = secNum;
        secNum = temp;

        System.out.println("After swap");
        System.out.println("first number is : " +firstNum);
        System.out.println("second number is : "+secNum) ;

    }

    public static void evenOdd(int num) {
        if (num % 2 == 0){
            System.out.println(num+" is Even");
        }
        else{
            System.out.println(num+" is Odd");
        }
    }

    public static void divideNum() {
        int quotient = 10 / 5;
        System.out.println("Quotient = "+ quotient);
        int remainder= 10 % 5;
        System.out.println("Remainder = "+ remainder);
    }

    public static void multiplyFloat(float fNum,float sNum) {
        float product = fNum * sNum;
        System.out.println("The Product is:" + product);
    }

    public static void enterNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        System.out.println("You Entered: "+ sc.nextInt());

    }
    public static void addNumbers(int firstNum,int secondNum){
        int add=firstNum + secondNum;
        System.out.println("the sum is: " + add);
    }





}

