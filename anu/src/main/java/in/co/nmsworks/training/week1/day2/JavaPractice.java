package in.co.nmsworks.training.week1.day2;

import java.util.Scanner;

import static java.lang.Math.pow;

public class JavaPractice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the three number ");
        int[] arr=new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i]= sc.nextInt();
        }
        for(int num:arr) {
            System.out.println("array number : " + num);
        }
        largestnumber(arr);
        int num=sc.nextInt();
        checkNumber(num);
        char alp=sc.next().charAt(0);
        checkAlphabet(alp);

        int number=sc.nextInt();
        naturalNumber(number);

        int num1=sc.nextInt();
        factorialfor(num1);

        int n1=sc.nextInt();
        factorialWhile(n1);

        System.out.println("fibonnaci series : ");
        fibonnaciSeries(num1);


        int num2=sc.nextInt();
        lowercaseAlpha(num2);

        System.out.println();

        int base=2;
        int powers=3;
        powerFunction(base,powers);

        double powerbuilt=powerbuiltin(2,3);
        System.out.println("pow function is  : " + powerbuilt);

        checkprime(num1);

        int numbers=sc.nextInt();
        digitNumber(numbers);

        System.out.println("multiplication: ");
        multipliaction(n1);

        int f=sc.nextInt();
        factornumber(f);

        int a= sc.nextInt();
        int res=factrecu(a);
        System.out.println("factore recurrsion : " + res);
    }

    public static void largestnumber(int arr[]){
       int maxarr=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(maxarr<arr[i]){
                maxarr=arr[i];
            }
        }
        System.out.println("largest element : " + maxarr);
    }

    public static void checkNumber(int num){
        if(num <0 ){
            System.out.println(num + " it is negative");
        }
        else{
            System.out.println(num + " it is positive number");
        }
    }

    public static void checkAlphabet(char alp){
        int ch=(int)alp;

        if((ch >= 65 && ch <=90 ) || (ch >=97 && ch <= 122)){
            System.out.println( alp + "is alphabet ");
        }
        else{
            System.out.println(alp + "it is not alphabet");
        }
    }

    public static void naturalNumber(int number){
        int sum=0;
        for (int i = 0; i <=number; i++) {
            sum+=i;
        }
        System.out.println("sum of natural number: " + sum);
    }

    public static void factorialfor(int n){
        long fact=1;
        for (int i = 1; i <= n; i++) {
            fact=fact*i;
        }
        System.out.println("factorial for " + n + "is " + fact);
    }

    public static void factorialWhile(int n1){
        long fact=1;
        int i=1;
        while(i<=n1){
            fact=fact*i;
            i++;
        }
        System.out.println("factorial for " + n1 + "is " + fact);
    }


    public static void fibonnaciSeries(int num1){
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i < num1; i++) {
            int temp = a + b;
            System.out.print(" " + temp);
            a = b;
            b = temp;
        }
        System.out.println();
    }

    public static void lowercaseAlpha(int num2){
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
    }

    public static void powerFunction(int base,int powers){
        long re = 1;

        for (int i = 1; i <= powers; i++) {
            re *= base;
        }
        System.out.println("power function  for loop : " + re);
    }

    public static double powerbuiltin(double base,double powers){
        double re=Math.pow(base,powers);
        return re;
    }

    public static void  checkprime(int num1){
        if(num1 % 2!=0){
            System.out.println(num1 + " it is prime ");
        }
        else{
            System.out.println(num1 + " its is not prime ");
        }
    }

    public static void digitNumber(int numbers){
        int count=0;
        int temp=numbers;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        System.out.println("count of the digit : " + count);
    }

    public static void multipliaction(int n1){
        int ans;
        for (int i = 1; i <=10; i++) {
            ans=n1*i;
            System.out.println(n1 + "*" + i + "=" + ans);
        }
    }

    public static void factornumber(int f){
        for (int i = 1; i <= f; i++) {
            if(f %i==0){
                System.out.println("factorial is :  " + i );
            }
        }
    }

    public static int factrecu(int a){
        if(a==0 || a==1){
            return 1;
        }
        return a*factrecu(a-1);
    }
}
