package in.co.nmsworks.training.week1.day2;

import java.util.Scanner;
public class JavaTaskTwo {

    public static void main(String[] args) {
        taskNine();
        taskTen();
        taskEleven();
        taskTwelve();
        taskThirteen();
        taskFourteen();
        taskFifteen();
        taskSixteen();
        taskSeventeen();
        taskEighteen();
        taskNineteen();
        taskTwenty();
        taskTwentyOne();
        int a = 6;
        long result = taskTwentyThree(a);
        System.out.println("The result of 6" + result);
    }



    public static void taskNine(){
            int a=10;
            int b=20;
            int c=30;
            if (a>b && a>c){
                System.out.println("A is greatest number");
            }
            else if(b>a && b>c){
                System.out.println("A is greatest number");
            }
            else {
            System.out.println("C is greatest number");
            }
    }

    public static void taskTen(){
        int a=-1;
        if (a>0){
            System.out.println("The entered number is positive");
        }
        else if(a==0){
            System.out.println("The entered number is zero");
        }
        else{
            System.out.println("The entered number is negative");
        }
    }

    public static void taskEleven(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        System.out.println("You entered: " + ch);
        if(Character.isLetter(ch)){
            System.out.println(ch+" is a Alphabet");
        }
        else{
            System.out.println(ch+" is not a Alphabet");
        }

    }

    public static void taskTwelve(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a= scanner.nextInt();
        int sum=0;
        for(int i=1;i<=100;i++){
            sum+=i;
        }
        System.out.println("Sum= "+sum);


    }

    public static void taskThirteen(){
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Enter the Number: ");
        int a =scanner.nextInt();
        long factorial=1;
        for(int i=1;i<=a;i++){
            factorial=factorial*i;
        }
        System.out.println("The factorial of "+a+" is "+ factorial);
    }

    public static void taskFourteen(){
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Enter the Number: ");
        int a =scanner.nextInt();
        long factorial=1;
        int i=1;
        while(i<=a){
            factorial=factorial*i;
            i++;
        }
        System.out.println("The factorial of "+a+" is "+ factorial);

    }

    public static void taskFifteen(){
        for(int i=1;i<=10;i++){
            System.out.println("5 * "+i+" ="+5*i );

        }
    }

    public static void taskSixteen(){
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Enter the Number: ");
        int n =scanner.nextInt();
        int a=0,b=1;
        System.out.println("The Fibonacci series till 10 terms:");
        for(int i=0;i<n;i++){
            System.out.println(a+ " ");
            int next;
            next=a+b;
            a=b;
            b=next;
        }
    }

    public static void taskSeventeen(){
        for(char ch = 'a'; ch <= 'z'; ++ch) {
            System.out.print(ch + " ");
        }
    }

    public static void taskEighteen(){
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Enter the Number: ");
        int n =scanner.nextInt();
        int sum=0;
        while(n!=0){
            int lastDigit=n%10;
            sum+=lastDigit;
            n=n/10;
        }
        System.out.println("The sum of Digits is"+sum);
    }

    public static void taskNineteen(){
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Base= ");
        int base =scanner.nextInt();
        System.out.printf("Power= ");
        int power =scanner.nextInt();
        int cal=1;
        for(int i=1;i<=power;i++){
            cal=base*i;
        }
        System.out.println("Answer = "+ cal);
    }

    public static void taskTwenty(){
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Base= ");
        int base =scanner.nextInt();
        System.out.printf("Power= ");
        int power =scanner.nextInt();
        System.out.println("Answer = "+ Math.pow(base,power));

    }

    public static void taskTwentyOne(){
        boolean isPrime = true;
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Enter the number= ");
        int num =scanner.nextInt();
        scanner.close();
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }



    public static long taskTwentyThree(int a){
        if(a == 0 || a == 1){
            return 1;
        }
        return a * taskTwentyThree(a - 1);
    }



}


