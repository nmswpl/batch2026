package in.co.nmsworks.training.week1.day2;

import java.util.Scanner;

public class LoopFunctions {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        largeinThree();
        posnegNum();
        alphaCheck();
        sumNatural();
        factNumForLoop();
        factNumWhileLoop();
        mulTable();
        fibanocci();
        lowerAlpha();
        numDigits();
        powMul();
        checkPrime();
        factorNum();


    }


    public static void largeinThree(){
        System.out.println("Largest among three:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int l;
        if (a > b && a > c){
            l = a;
        }
        else if (b > a && b > c) {
            l = b;
        }
        else{
            l = c;
        }
        System.out.println("largest among three: " + l);
    }


    public static void posnegNum(){
        System.out.println("Num is positive or negative:");
        int a = sc.nextInt();
        if (a >= 0){
            System.out.println( a +" is positive number");
        }
        else{
            System.out.println(a + "is negative number");
        }
    }


    public static void alphaCheck(){
        System.out.println("alphabet or not:");
        char a = sc.next().charAt(0);
        int as = (int) a;
        if ( as >= 65 && as <=90 || as >= 97 && as <= 122 ){
            System.out.println("it is alphabet");
        }
        else{
            System.out.println("not an alphabet");
        }
    }

    public static void sumNatural(){
        System.out.println("enter the limit for sum of natural numbers:");
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }

    public static void factNumForLoop(){
        System.out.println("enter value for factorial using for:");
        int a =sc.nextInt();
        int fact = 1;
        for (int i = a; i > 0 ; i--) {
            fact *= i;
        }
        System.out.println("factorial is: " + fact);
    }

    public static void factNumWhileLoop(){
        System.out.println("enter value for factorial using while:");
        int a =sc.nextInt();
        int fact = 1;
        int i = a;
        while (i > 0) {
            fact *= i;
            i--;
        }
        System.out.println("factorial is: " + fact);
    }

    public static void fibanocci(){
        int a = 0;
        int b = 1;
        System.out.println("enter the limit for fibanocci:");
        int f = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        int c;
        for (int i = 2; i < f; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }

    public static void mulTable(){
        System.out.println("enter the value for table:");
        int a = sc.nextInt();
        System.out.println("enter the limit: ");
        int b = sc.nextInt();
        for (int i = 1; i <= b ; i++) {
            System.out.println(a + "*" + i + "=" + (a*b));
        }
    }

    public static void lowerAlpha(){
        System.out.println("printing lower alphabets:");
        for (int i = 97; i < 122; i++) {
            char c = (char)i;
            System.out.println(c);
        }
    }

    public static void numDigits(){
        System.out.println("enter element to find no of digits:");
        int a = sc.nextInt();
        int  c = 0;
        while(a > 0){
            a /= 10;
            c++;
        }
        System.out.println("no.of digits: " + c);
    }

    public static void powMul(){
        System.out.println("enter the base:");
        int a = sc.nextInt();
        System.out.println("enter the power:");
        int b = sc.nextInt();
        int mul = 1;
        for (int i = 0; i < b; i++) {
            mul *= a;
        }
        System.out.println("power multiply: " + mul) ;
    }

    public static boolean isPrime(int a){
        if (a <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(a); i += 2) {
            if (a % i == 0){
                return false;
            }
            else{
                return true;
            }
        }
        return false;

    }

    public static void checkPrime(){
        System.out.printf("enter value to find prime:");
        int a = sc.nextInt();
        if (isPrime(a)){
            System.out.println("is prime");
        }
        else{
            System.out.println("not prime");
        }
    }

    public static void factorNum(){
        System.out.println("enter num to find factors:");
        int a = sc.nextInt();
        System.out.println("the factors are: ");
        for (int i = 1; i <= a / 2; i++) {
            if (a % i  == 0){
                System.out.println(i);
            }
        }
        System.out.println(a);
    }

}
