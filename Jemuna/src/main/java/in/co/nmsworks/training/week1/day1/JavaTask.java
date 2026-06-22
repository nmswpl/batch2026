package in.co.nmsworks.training.week1.day1;
import java.util.Scanner;

public class JavaTask {
    public static void main(String[] args)
    {
       taskOne();
       taskTwo();
       taskThree();
       taskFour();
       taskFive();
       taskSix();
       taskSeven();
       taskEight();

    }
    public static void taskOne()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = scanner.nextInt();
        System.out.println("You entered: " + a);
    }

    public static void taskTwo()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Two number: ");
        int a = scanner.nextInt();
        int b= scanner.nextInt();
        int c;
        c=a+b;
        System.out.println("The sum is:"+c);
    }

    public static void taskThree(){
        float a=1;
        float b=3;
        float c=a*b;
        System.out.println("The product is "+c);

    }
    public static void taskFour(){
        int a=36;
        int b=6;
        System.out.println("Quotient = "+ a/b);
        System.out.println("Remainder = "+ a%b);

    }

    public static void taskFive() {
        char value = 'A';
        int as = (int) value;
        System.out.println("Ascii of A is: " + as);
    }


    public static void taskSix(){
        double a=1.2;
        double b=2.45;
        System.out.println("Before Swapping");
        System.out.println("The value of a: "+a);
        System.out.println("The value of b: "+b);
        double c;
        c=a;
        a=b;
        b=c;
        System.out.println("After Swapping");
                System.out.println("The value of a: "+a);
        System.out.println("The value of b: "+b);

    }

    public static void taskSeven(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = scanner.nextInt();
        if (a%2==0){
            System.out.println(a+" is even");
        }
        else {
            System.out.println(a+ " is odd");
        }

        scanner.close();
    }

    public static void taskEight()
    {
        char a='a';
        if (a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U'){
            System.out.println(a+" is a vowel");
        }
        else{
            System.out.println(a+" is a consonant");
        }
    }

}
