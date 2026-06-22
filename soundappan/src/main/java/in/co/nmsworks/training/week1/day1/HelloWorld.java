package in.co.nmsworks.training.week1.day1;
import java.util.*;
public class HelloWorld {
public static void printOneNumber(){
    Scanner scan =new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int first=scan.nextInt();
    System.out.println("The Entered number is : "+first);
}
public static void printOfTwoNumber(){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter Two numbers :");
    int first=scan.nextInt();
    int second=scan.nextInt();
    int sum=first+second;
    System.out.println("The sum of two numbers is : "+sum);
}
public static void printOfTwoMultiply(){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter two number to multiply");
    float first=scan.nextFloat();
    float second =scan.nextFloat();
    float multi=first*second;
    System.out.println(multi);
}
public static void characterToAsci(){
    Scanner scan =new Scanner(System.in);
    System.out.println("Enter the character to find the asci value for that");
    char character='c';
    int v=character;
    System.out.println(v);
}
public static void printQuotientRemainder() {
    Scanner scan = new Scanner(System.in);
    int a=10;
    int b=4;
    int quotient=a/b;
    int reminder=a%b;
    System.out.println("Quoitent : " + quotient);
    System.out.println("Remainder : " + reminder);
}
public static void swapOfTwoNumber(){
    int first=10;
    int second=12;
    System.out.println("--Before Swap--");
    System.out.println(first);
    System.out.println(second);
    int temp=first;
    first=second;
    second=temp;
    System.out.println(first);
    System.out.println(second);
}
public static void oddOrEven(){
    int num=14;
    if(num%2==0) {
        System.out.println("Number is even");
    }
    else{
        System.out.println("Number is odd");
    }
}
public static void vowelOrConsonant(){
    char c='a';
    if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||c=='A' ||c=='E' || c=='I' ||c=='O' || c=='U'){
        System.out.println("vowel");
    }
    else{
        System.out.println("Consonant");
    }
}
    public static void main (String []args){
        System.out.println("Hello World");
  printOneNumber();
  printOfTwoNumber();
  printOfTwoMultiply();
  characterToAsci();
  printQuotientRemainder();
  swapOfTwoNumber();
  oddOrEven();
  vowelOrConsonant();

    }
}
