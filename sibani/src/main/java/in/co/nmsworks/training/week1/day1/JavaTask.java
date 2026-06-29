package in.co.nmsworks.training.week1.day1;
import java.util.Scanner;

public class JavaTask {
    public static void main(String[] args) {
        printNum();
        addNum();
        System.out.println("The product is :" + multiplyFloat(2.5F,3.5F));
        printAscii();
        computeQuotientAndRemainder(13,2);
        swapUsingTemp(1.2,2.45);
        isEvenOrOdd();
        isVowelOrConsonant('a');
    }
    public static void printNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        sc.close();
        System.out.println("You entered :" + num);
    }
    public static void addNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        int c = num1 + num2;
        System.out.println("The sum is :" + c);
    }
    public static float multiplyFloat(float firstNum, float secondNum){
        return firstNum * secondNum;

    }
    public static void printAscii(){
        int value = 'A';
        System.out.println("ASCII VALUE of A" +  " is " + value );
    }
    public static void computeQuotientAndRemainder(int num1, int num2) {
        System.out.println("Quotient : " + num1 / num2);
        System.out.println("Remainder : " + num1 % num2);
    }
    public static void swapUsingTemp(double num1, double num2){
        System.out.println("Before Swapping");
        System.out.println("First Num is " + num1);
        System.out.println("Second Num is " + num2);
        double temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping");
        System.out.println("First Num is " + num1);
        System.out.println("Second Num is " + num2);
    }
    public static void isEvenOrOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        sc.close();
        if (num % 2 == 0){
            System.out.println(num + " is even");
        }
        else {
            System.out.println(num + " is odd");
        }
    }
    public static void isVowelOrConsonant(char ch){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a Vowel");
        }
        else {
            System.out.println(ch + "is a Consonant");
        }

    }


}
