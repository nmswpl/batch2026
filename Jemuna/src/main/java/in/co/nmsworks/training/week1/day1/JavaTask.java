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
        int number = scanner.nextInt();
        System.out.println("You entered: " + number);
        scanner.close();
    }

    public static void taskTwo()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Two number: ");
        int number1 = scanner.nextInt();
        int number2= scanner.nextInt();
        int result =number1+number2;
        System.out.println("The sum is:"+result);
        scanner.close();
    }

    public static void taskThree(){
        float number1=1;
        float number2=3;
        float result=number1*number2;
        System.out.println("The product is "+result);

    }
    public static void taskFour(){
        int number1=36;
        int number2=6;
        System.out.println("Quotient = "+ number1/number2);
        System.out.println("Remainder = "+ number1%number2);

    }

    public static void taskFive() {
        char value = 'A';
        int as = (int) value;
        System.out.println("Ascii of A is: " + as);
    }


    public static void taskSix(){
        double number1=1.2;
        double number2 =2.45;
        System.out.println("Before Swapping");
        System.out.println("The value of a: "+number1);
        System.out.println("The value of b: "+number2);
        double temp;
        temp=number1;
        number1=number2;
        number2=temp;
        System.out.println("After Swapping");
        System.out.println("The value of a: "+number1);
        System.out.println("The value of b: "+number2);

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

    public static void taskEight(){
        char ch='a';
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        {
            System.out.println(ch+" is a vowel");
        }
        else
        {
            System.out.println(ch+" is a consonant");
        }
    }

}
