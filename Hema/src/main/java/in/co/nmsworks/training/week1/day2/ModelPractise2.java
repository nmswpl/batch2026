package in.co.nmsworks.training.week1.day2;

import java.util.*;

public class ModelPractise2 {

    static Scanner sc;

    public static void main(String[] args) {

//        largestThreeNumbers(1,2,3);
//        positiveOrNegative(-2);
//        isAlphabet('a');
//        sumOfNumbers();
//        findFactorialUsingForLoop(10);
//        findFactorialUsingWhileLoop(5);
//        mulitplicationTable(5);
//        fibonnacci(3);
//        lowerCaseAlphabet();
//        countNoOfDigits();
//        power();
//        built_in_Power();
//        checkPrime();
//        findFactors(60);
        int fact = factorialUsingRecursion(5);
        System.out.println(fact);

    }

    public static int factorialUsingRecursion(int n) {

        if(n==0 || n==1)
            return 1;

        return n * factorialUsingRecursion(n - 1);
    }

    public static void findFactors(int num) {
        if(num<0)
            System.out.println("Not positive");
        else
        {
            System.out.print("Factors of "+ num +" are: 1, ");
            for (int i = 2; i <= num/2; i++)
            {
                if(num%i == 0)
                    System.out.print(i+ ", ");
            }
            System.out.print(num);
        }

    }
    public static void checkPrime() {
        sc = new Scanner((System.in));
        System.out.println("Enter a Number:");
        int n =sc.nextInt();
        int temp = n;
        int factor = 0;
        for (int i = 2; i <= n/2; i++) {
            if(( n % i ) == 0 )
            {
                factor++;
                System.out.println(n+" is not Prime Number");
                break;
            }
        }

        if(factor==0)
            System.out.println(n+" is Prime Number");
    }

    public static void built_in_Power() {
        sc = new Scanner(System.in);
        System.out.println("Enter Base Number: ");
        double base = sc.nextDouble();

        System.out.println("Enter Power:");
        double power = sc.nextDouble();

        double res = Math.pow(base,power);
        System.out.println("Answer = "+ res);

    }

    public static void power() {
        sc = new Scanner(System.in);
        System.out.println("Enter Base Number: ");
        int base = sc.nextInt();

        System.out.println("Enter Power:");
        int power = sc.nextInt();
        int res=base;
        for(int i=1; i<power; i++)
            res = res * base;

        System.out.println("Answer = "+ res);
    }

    public static void countNoOfDigits() {
        sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int lastDigit = n % 10;
        int count = 0;

        while(lastDigit!=0)
        {
            n = n / 10;
            count++;
            lastDigit = n % 10;
        }
        System.out.println("Number of Digits: "+count);
    }

    public static void lowerCaseAlphabet() {
        char ch = 'a';

        for (int i = 0; i < 26; i++) {
            System.out.print((char)(ch+i)+" ");
        }
    }

    public static void fibonnacci(int n) {
        System.out.println("Fionnacci Series till "+n+" terms:");

        if( n == 1)
        {
            System.out.println("0");
        }
        else if( n == 2)
        {
            System.out.println("0, 1");
        }
        else
        {
            int a = 0;
            int b = 1;
            System.out.print("0, 1, ");

            for(int j = 2; j < n; j++)
            {
                int c = a + b;
                System.out.print(c+", ");
                a = b;
                b = c;
            }
        }

    }

    public static void mulitplicationTable(int a) {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(a+" * "+i+" = "+(a*i));
        }

    }

    public static void findFactorialUsingWhileLoop(int num) {
        int factorial = 1;
        int temp = num;
        while(temp!=1)
        {
            factorial = factorial * temp;
            temp--;
        }

        System.out.println("Factorial of "+num+" is: "+factorial);

    }

    public static void findFactorialUsingForLoop(int num) {
        int factorial = 1;
        for (int i = num; i > 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of "+num + " is:"+ factorial);
    }

    public static void sumOfNumbers() {
        sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum = sum + i;
        }
        System.out.println("Sum = "+ sum);
    }

    public static void isAlphabet(char ch)
    {
        if(ch == 'a' || ch == 'b' || ch == 'c' || ch == 'd' || ch == 'e' || ch == 'f' || ch == 'g' || ch == 'h' || ch == 'i' || ch == 'j' || ch == 'k' || ch == 'l' || ch == 'm' || ch == 'n' || ch == 'o' || ch == 'p' || ch == 'q' || ch == 'r' || ch == 's' || ch == 't' || ch == 'u' || ch == 'v' || ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z')
        {
            System.out.println(ch+ " is alphabet");

        }
        else
            System.out.println(ch+ " is not an alphabet");

    }


    public static void positiveOrNegative(int a)
    {
        if(a > 0)
            System.out.println(a + " is positive");
        else
            System.out.println(a+" is negative");
    }


    public static void largestThreeNumbers(int a,int b,int c)
    {
        if(a>b)
        {
            if(a > c)
                System.out.println(a+" is greatest");
            else
                System.out.println(b+" is greatest");
        }
        else
        {
            System.out.println(c+" is greatest");
        }
    }

}
