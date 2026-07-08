package in.co.nmsworks.training.week1.day1;
import java.util.Scanner;

public class JavaTask {
    public static void main(String[] args) {
        JavaTask javaTask = new JavaTask();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for printing");
        javaTask.printNum(sc.nextInt());
        System.out.println("Enter two numbers for sum calculation");
        javaTask.addNum(sc.nextInt(), sc.nextInt());
        System.out.println("Enter two numbers for product calculation");
        System.out.println("The product is :" + javaTask.multiplyFloat(sc.nextFloat(), sc.nextFloat()));
        javaTask.printAscii('A');
        System.out.println("Enter divisor and divident");
        javaTask.computeQuotientAndRemainder(sc.nextInt(), sc.nextInt());
        System.out.println("Enter two double values to swap");
        javaTask.swapUsingTemp(sc.nextDouble(), sc.nextDouble());
        System.out.println("Enter a number to check whether odd or even :");
        javaTask.isEvenOrOdd(sc.nextInt());
        javaTask.isVowelOrConsonant('a');
    }
    public void printNum(int num){
        System.out.println("You entered :" + num);
    }
    public void addNum(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("The sum is :" + sum);
    }
    public float multiplyFloat(float firstNum, float secondNum){
        return firstNum * secondNum;

    }
    public void printAscii(char ch){
        int value = ch;
        System.out.println("ASCII VALUE of A" +  " is " + value );
    }
    public void computeQuotientAndRemainder(int num1, int num2) {
        System.out.println("Quotient : " + num1 / num2);
        System.out.println("Remainder : " + num1 % num2);
    }
    public void swapUsingTemp(double num1, double num2){
        System.out.println("Before Swapping");
        System.out.println("First Num is " + num1);
        System.out.println("Second Num is " + num2);
        double swapVariable = num1;
        num1 = num2;
        num2 = swapVariable;
        System.out.println("After Swapping");
        System.out.println("First Num is " + num1);
        System.out.println("Second Num is " + num2);
    }
    public void isEvenOrOdd(int num){
        if (num % 2 == 0){
            System.out.println(num + " is even");
        }
        else {
            System.out.println(num + " is odd");
        }
    }
    public void isVowelOrConsonant(char ch){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a Vowel");
        }
        else {
            System.out.println(ch + "is a Consonant");
        }
    }
}
