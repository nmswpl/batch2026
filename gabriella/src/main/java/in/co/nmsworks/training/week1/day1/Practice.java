package in.co.nmsworks.training.week1.day1;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args){
        printNum();
        int addRes = addNums(10,20);
        System.out.println("sum of the two numbers is: " + addRes);
        float mulRes = multiplyNums(30.32f, 45.33f);
        System.out.println("Product of the two numbers is: " + mulRes);
        int ascii = findAscii('A');
        System.out.println("The ASCII value is: " + ascii);
        divideNums(10,4);
        swapNums(54, 72);
        checkEvenOdd(20);
        checkEvenOdd(23);
        checkVowelCons('A');
        checkVowelCons('c');
    }

    // 1. Print number from user input
    public static void printNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        System.out.println("Number entered is: " + number);
        scanner.close();

    }

    // 2. Add two numbers
    public static int addNums(int firstNum, int secondNum){
        int res;
        res = firstNum + secondNum;
        return res;
    }

    // 3. Multiply two numbers
    public static float multiplyNums(float firstNum, float secondNum){
        float prod;
        prod = firstNum * secondNum;
        return prod;
    }

    // 4. Find ASCII value
    public static int findAscii(char ch){
        int ascii;
        ascii = ch;
        return ascii;
    }

    // 5. Divide two floating point numbers
    public static void divideNums(int firstNum, int secondNum){
        int quo = firstNum / secondNum;
        int rem = firstNum % secondNum;
        System.out.println("Quotient: " + quo);
        System.out.println("Remainder: " + rem);
    }

    // 6. Swap two numbers using temp
    public static void swapNums(int firstNum, int secondNum){
        System.out.println("Before swapping: a = " + firstNum + " b = " + secondNum);
        int temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;
        System.out.println("After swapping: a = " + firstNum + " b = " + secondNum);
    }

    // 7. Check if an integer is even or odd
    public static void checkEvenOdd(int num){
        if (num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }

    // 8. Check if a character is a vowel or consonant
    public static void checkVowelCons(char ch){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u' || ch == 'A' || ch == 'E' || ch =='I' || ch == 'O' || ch == 'U'){
            System.out.println(ch + " is a vowel");
        } else {
            System.out.println(ch + " is a consonant");
        }
    }
}
