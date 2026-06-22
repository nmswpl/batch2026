package in.co.nmsworks.training.week1.day1;

import java.util.Scanner;

public class Programs {
    public static void main(String[] args) {
    
        //getNumber();
        //addTwoNumbers();
        //multiplyTwoFloatingPoints(2.5F, 10.0F);
        //getAsciiValueOfCharacter('z');
        //getQuotientAndRemainder();
        //swapTwoNumber(1.5F,2.45F);
        //isVowelOrConsonant('A');


    }

    public static void getNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        System.out.println("You entered : " + num);

    }

    public static void addTwoNumbers(){
        System.out.print("Enter two numbers : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("The Sum is: " + sum);

    }

    public static void multiplyTwoFloatingPoints(float a, float b){
        float product = a*b;
        System.out.println("The product is: " + product);

    }

    public static void getAsciiValueOfCharacter(char c){
        System.out.println("Enter a Character : " + c);
        int asciValue = c;
        System.out.println("ASCII value : " + asciValue);

    }

    public static void getQuotientAndRemainder(){
        System.out.print("Enter two numbers : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int quotient = a/b;
        System.out.println("Quotient a/b :" + quotient);
        int remainder = a%b;
        System.out.println("Remainder a%b :" + remainder);

    }

    public static void swapTwoNumber(float a, float b){
        System.out.println("--- Before swap ---");
        System.out.println("First number : " + a);
        System.out.println("Second number : " + b);

        float temp = a;
        a = b;
        b = temp;

        System.out.println("--- After swap ---");
        System.out.println("First number : " + a);
        System.out.println("Second number : " + b);
    }

    public void isEvenOrOld(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println(num +" is Even");
        }
        else{
            System.out.println(num + " is Odd");
        }
    }

    public static void isVowelOrConsonant(char c){

        if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                c =='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
            System.out.println(c + " is a Vowel");
        }
        else{
            System.out.println(c + "is a Consonant");
        }

    }

    
}
