package in.co.nmsworks.training.week1.day2;
import java.util.*;
import java.util.Scanner;
public class DayTwoPractice {

public static void largestOfThree(){
    Scanner scan =new Scanner(System.in);
    int first=scan.nextInt();
    int second=scan.nextInt();
    int third=scan.nextInt();
    if(first>second && first>third){
        System.out.println("The Largest Number is First :"+first);
    } else if (second>first && second>third) {
        System.out.println("The Largest Number is Two :"+second);
    }
    else{
        System.out.println("The Largest Number is Third :"+third);
    }
}
public static void PositiveOrNegative(){
    Scanner scan=new Scanner(System.in);
    int number=scan.nextInt();
    if(number>0){
        System.out.println("The number is positive number");
    }
    else{
        System.out.println("The number is negative number");
    }
}
public static void checkAlphabet(){
    Scanner scan =new Scanner(System.in);
    char character=scan.next().charAt(0);
    String Alphabet="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    if(Alphabet.indexOf(character)!=-1){
        System.out.println(character+" is a alphabet");
    }
    else{
        System.out.println(character+"is not a alphabet");
    }
}
public static void sumOfNaturalNumber(){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int number=scan.nextInt();
    int sum=0;
    for(int i=0;i<number;i++){
        sum+=i;
    }
    System.out.println("The sum of N natural numbers is :"+sum);
}
public static void factorialOfNumber(){
    Scanner scan =new Scanner(System.in);
    System.out.println("Enter The Number to find the Factorial: ");
    int value=scan.nextInt();
    long fact=1;
    for(int i=1;i<value;i++){
        fact*=i;
    }
    System.out.println(fact);
}
public static void factorialOfTheGivenNumber(){
    Scanner scan=new Scanner(System.in);
    int number=scan.nextInt();
    System.out.println("The Factorial Of given Number is : "+fact(number));
}
    public static int fact(int number){
        int fac=1;
        for(int i=1;i<number;i++) {
            fac *= i;
        }
        return fac;
    }

public static void MultiplicationTable(){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter The Number To Find the Multiply");
    int number=scan.nextInt();
    int multiply=1;
    for(int i=1;i<=10;i++){
        multiply=i*number;
        System.out.println(number +" * " +i+"="+ multiply);
        multiply=1;
    }
}
public static  void fibonacciSeries(){
int a=0;
int b=1;
for(int i=1;i<10;i++){
    int c=a+b;
    a=b;
    b=c;
    System.out.println(b);
}
}
public static void CharaterOfLower(){
    for(char c='a';c<='z';c++){
        System.out.print(c+" ");
    }
}
public static void countNumberOfDigits(){
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int count=0;
    while(n!=0){
        n/=10;
        count++;
    }
    System.out.println("The Number Of Digits Is : " +count);
}
public static void powerOfNumber(){
    Scanner scan =new Scanner(System.in);
    System.out.println("Enter The value to find the Power Of the Number :");
    int val= scan.nextInt();;
    System.out.println("Enter The Power :");
    int val2=scan.nextInt();
    int val3=1;
    for(int i=0;i<val2;i++){
        val3*=val;
    }
    System.out.println("The Power Of The Number is"+val3);
}
public static void powerUsingFunction(){
    Scanner scan =new Scanner(System.in);
    System.out.println("Enter The value to find the Power Of the Number :");
    double val= scan.nextInt();;
    System.out.println("Enter The Power :");
    double val2=scan.nextInt();
    double val3=Math.pow(val,val2);
    System.out.println(val3);
}
public static void checkTheNumberIsPrime(){
    Scanner scan=new Scanner(System.in);
    System.out.println("Check The Number is Prime Or Not");
    int n=scan.nextInt();
    boolean isprime=true;
    if(n<1){
        System.out.println("Number is Not Prime");
    }
    for(int i=3;i<Math.sqrt(n);i++){
        if(i%n==0) {
            isprime = false;
            break;
        }
    }
    if(isprime){
        System.out.println("The Number Is A Prime Number");
    }
    else{
        System.out.println("The Number is not a prime Number");
    }
}
public static void FactOfGivenNumber(){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter The Number For the Fact");
    int val=scan.nextInt();
    System.out.println("The Factorial Of number "+val);
    for(int i=1;i<=val;i++){
        if(val%i==0){
            System.out.print(i+" ");
        }
    }
}
public static int recursionNumber(int num){
    if(num==0 || num==1){
        return 1;
    }
    return num*recursionNumber(num -1);
}
    public static void main (String [] args){
       largestOfThree();
       PositiveOrNegative();
       checkAlphabet();
       sumOfNaturalNumber();
       factorialOfNumber();
       MultiplicationTable();
       CharaterOfLower();
       countNumberOfDigits();
       powerOfNumber();
       powerUsingFunction();
       checkTheNumberIsPrime();
       FactOfGivenNumber();
       factorialOfTheGivenNumber();
       fibonacciSeries();
       recursionNumber(7);
    }
}

