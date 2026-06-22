package in.co.nmsworks.training.week1.day2;

import java.util.Scanner;

public class JavaMethods{
    public static void main(String[] args) {
       largest();
       posOrNeg();
       checkAlphabet();
       factorial();
       factorialWhileLoop();
       table();
       countDigit();
       printAlphabetes();
       fibonacci();
       sumOfNaturalNumbers();
       power();
       mathPower();
       boolean ans=prime();
       System.out.println("is prime Number : "+ans);
       factorsOfNumbers();
       int result=factorialRecurrsion(4);
       System.out.println(result);

    }
    public static void largest(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1 :");
        int num1=scanner.nextInt();
        System.out.println("Enter number2 :");
        int num2=scanner.nextInt();
        System.out.println("Enter number3 :");
        int num3=scanner.nextInt();
        if( num1 > num2 ){
            if( num1 > num3 ){
                System.out.println("largest Number : " + num1);
            }
        }else{
            if( num2 > num3 ){
                System.out.println("largest Number : " + num2);
            }else{
                System.out.println(" largest Number : " + num3);
            }
        }

    } public static void posOrNeg(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1 :");
        int number = scanner.nextInt();
        if ( number < 0 ){
            System.out.println("The number is negative");
        }else {
            System.out.println("The number is positive ");
        }

    }
    public static void checkAlphabet (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a  Alphabet :");
        char ch=scanner.next().charAt(0);
        if ( ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            System.out.println(ch+" is an Alphabet");
        }else {
            System.out.println(ch + " is not  an Alphabet");
        }

    }
    public static void factorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int number=scanner.nextInt();
        int fact=1;

        for ( int i = 1; i <= number ;i++){
            fact = fact * i;
        }
        System.out.println("Factorial of "+ number +" is "+ fact);
    }
    public static void factorialWhileLoop(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int number=scanner.nextInt();
        int fact = 1;
        int i = 1;
        while ( i <= number ){
            fact = fact * i;
            i++;

        }
        System.out.println("Factorial of "+ number +" = "+ fact);
    }
    public static  void table(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int number=scanner.nextInt();
        for ( int i = 1;i <= 10; i++ ) {
            System.out.println(number + " * "+ i+" = "+ number * i);
        }
    }
    public static void countDigit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int number=scanner.nextInt();
        int count=0;
        while( number > 0 ){
            count ++;
            number = number / 10;
        }
        System.out.println("Number of digits :"+ count);

    }
    public static void printAlphabetes(){
        char ch='a';
        for ( int i=0;i <= 25; i++ ) {
            System.out.print((char)( i + ch));
        }
    }
    public static void fibonacci(){
        int a=0,b=1;
        System.out.println("Fibonnacci series till 10 terms :");
        for ( int i = 1; i <= 10; i++){
            System.out.print(a);
            int c = a + b;
            a = b;
            b = c;

        }
    }
    public static void sumOfNaturalNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int number=scanner.nextInt();
        int sum = 0;
        for ( int i = 1;i <= number ; i++ ) {
            sum += i;
        }
        System.out.println("sum =" + sum);
    }
    public static void power(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  a base number :");
        int base=scanner.nextInt();
        System.out.println(" Enter a Power Number :");
        int power=scanner.nextInt();
        int mul = 1;
        for ( int i = 1 ; i <= power ; i++){
            mul *= base;


        }
        System.out.println("Answer = " + mul);
    }
    public static void mathPower(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  a base number :");
        double base=scanner.nextInt();
        System.out.println(" Enter a Power Number :");
        double power=scanner.nextInt();
        double ans= Math.pow(base,power);
        System.out.println("Answer = " + ans);
    }
    public static boolean prime(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int number=scanner.nextInt();

        for ( int i = 1;i * i <= number ; i++ ) {
           if ( number == 1 ){
               return  false;
           }

            if ( number % 2 == 0 ){
                return false;
            }

        }return true;
    }
    public static int factorialRecurrsion( int number ){

        if ( number ==  0 || number == 1 ) {
            return number;
        }
        return number * factorialRecurrsion(number-1);
    }
    public static void factorsOfNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int number=scanner.nextInt();
        System.out.print("Factors of "+number +" are :");
        for ( int i=1 ; i <= number ; i++ ) {
            if ( number % i == 0) {
                System.out.print( i +" ");
            }
        }
    }
}
