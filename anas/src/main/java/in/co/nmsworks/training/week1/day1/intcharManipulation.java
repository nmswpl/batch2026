package in.co.nmsworks.training.week1.day1;

import java.util.Scanner;

public class intcharManipulation{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the values:");
        int a = ip.nextInt();
        int b = ip.nextInt();
        System.out.println("Enter the char:");
        char c = ip.next().charAt(0);
        System.out.println("Enter the float value:");
        float f1 = ip.nextFloat();
        float f2 = ip.nextFloat();
        displayNum(a, b);
        addNum(a, b);
        mulNum(f1, f2);
        qrNum(a, b);
        swapNum(a, b);
        evodNum(a);
        alpcons(c);
        ascii(c);
    }
    public static void displayNum(int a, int b){
        System.out.println("Display values: " + a +","+ b);
    }

    public static void addNum(int a, int b){
        System.out.println("Add: " + a + b);
    }

    public static void mulNum(float a, float b){
        System.out.println("Multiply: " + a * b);
    }

    public static void qrNum(int a, int b){
        System.out.println("quotient:" + a / b);
        System.out.println("remainder:" + a % b);
    }

    public static void swapNum(int a, int b){
        int s;
        s = a;
        a = b;
        b = s;
        System.out.println( "Swapped values: a = "+ a + ", b = " + b);

    }
    public static void evodNum(int a){
        if(a % 2 == 0)
            System.out.println(a +" is even");
        else System.out.println(a +" is odd");
    }

    public static void alpcons(char a){
        if(a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U' || a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u')
           System.out.println(a + " is vowel");
        else
            System.out.println(a + " is consonent");
    }
    public static void ascii(char a){
        int as = (int) a;
        System.out.println("the ascii value is: " + as);
    }


}