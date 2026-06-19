package in.co.nmsworks.training.week1.day1;

import java.util.Scanner;

public class BasicJavaProblems {
    public static void main(String[] args)
    {
        printInteger();
        addNumbers(10,2);
        multiplyNumbers(2.0F,9.3F);
        quotientAndRemainder(10,3);
        swap();
        findOddOrEven(10);
        findVowelOrConsonant('a');
        findAscii('A');
    }

    public static void printInteger()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        System.out.println("Entered Number is : "+n);
    }

    public static void addNumbers(int a,int b)
    {
        System.out.println("Add of 2 num : "+ (a+b));
    }

    public static void multiplyNumbers(float a,float b)
    {
        System.out.println("Mul of 2 num : "+a*b);
    }

    public static void findAscii(char ch)
    {
        int x = ch;
        System.out.println("Ascii value of "+ch+" : "+x);
    }

    public static void quotientAndRemainder(int a,int b)
    {
        System.out.println("Quotient : "+a/b);
        System.out.println("Remainder : "+a%b);
    }

    public static void swap()
    {
        double x = 2.45;
        double y = 3.45;
        System.out.println("Before Swap x= "+x);
        System.out.println("Before Swap y= "+y);
        double temp = x;
        x = y;
        y=temp;
        System.out.println("After Swap x= "+x);
        System.out.println("After swap y= "+y);

    }

    public static void findOddOrEven(int num)
    {
        if (num % 2 == 0)
        {
            System.out.println(num+" is even");
        }
        else {
            System.out.println(num+" is odd");
        }
    }

    public static void findVowelOrConsonant(char ch)
    {
        if (ch == 'a' || ch =='e'||ch=='i'||ch=='o'||ch=='u'|| ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println(ch+" is a vowel");
        }
        else {
            System.out.println(ch+" is a consonant");
        }
    }

}
