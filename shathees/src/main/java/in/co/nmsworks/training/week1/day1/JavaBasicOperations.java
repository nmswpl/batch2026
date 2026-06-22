package in.co.nmsworks.training.week1.day1;
import java.util.*;
public class JavaBasicOperations
{
    public static void main(String[] args) {
       getNumber();
       addNumbers();
       multiply();
       findAscii();
       quotientRemainder();
       swap();
       checkOddOrEven();
       checkVowelOrConsonant();
    }

    public static void getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a no : ");
        int number = scanner.nextInt();
        System.out.println("you entered : " + number);
    }

    public static void addNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two numbers : ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int sum = number1 + number2;
        System.out.println("The sum is : " + sum);
    }

    public static void multiply() {
        float number1 = 1.0f,number2 = 3.0f;
        float mul = (number1) * (number2);
        System.out.println("The Product is : "+ mul );
    }

    public static void quotientRemainder(){
        int number1 =37 ,number2 = 6;
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        System.out.println("Quotient = "+ quotient );
        System.out.println("Remainder = "+ remainder );

    }

    public static void swap(){
        double firstNumber=1.2,secondNumber=2.45;
        System.out.println("--- Before Swap ---");
        System.out.println("first Number = " + firstNumber);
        System.out.println("second Number = " + secondNumber);
        double temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;
        System.out.println("--- After Swap ---");
        System.out.println("first Number = "+ firstNumber);
        System.out.println("second Number = "+ secondNumber);
    }

    public static void  checkOddOrEven(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a number : ");
        int number=scanner.nextInt();
        if(( number & 1 ) == 0){
            System.out.println( number + " is even" );
        }else{
            System.out.println( number +" is odd ");
        }
    }

    public static void checkVowelOrConsonant() {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.nextLine().charAt(0);
        if ( ch>='A' && ch <='Z') {
            ch=(char)(ch+32);
        }
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("The character is vowel");
        }else{
                System.out.println("The character is consonant");
            }


    }

    public static void findAscii(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Character :");
        char ch=scanner.next().charAt(0);
        System.out.println(" Ascii value of character is : "+ (int)ch );
    }
}
