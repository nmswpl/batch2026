package in.co.nmsworks.training.week1.day2;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        System.out.println("The number is:"+n);
        add();
        multiply();
        quotiendAndRemainder();
        swapValue();
        evenOrOdd();
        vowelOrConsonant();
        largest();
        positiveOrNegative();
        sumOfNumbers();
        factorial();
        fact();
        multiplyTable();
        fibonacci();
        alpha();
        countInteger();
        powerOfNumber();
        findPrime();
        findFactor();
        checkAlpha();
        int res=recursion(5);
        System.out.println("The factorial using recursion is: "+res);
        }
    public static void add(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("The sum is:"+(n+m));
    }
    public static void multiply(){
        float a=2.0f;
        float b=3.0f;
        System.out.println("The product is:"+(a*b));
    }
    public static void quotiendAndRemainder(){
        int a=20;
        int b=3;
        System.out.println("Quotient:"+(a/b));
        System.out.println("Remainder:"+(a%b));
    }
    public static void swapValue(){
        int a=10;
        int b=20;
        System.out.println("--Before Swap--");
        System.out.println("First number:"+a);
        System.out.println("Second number:"+b);
        int temp=a;
        a=b;

        System.out.println("--After Swap--");
        System.out.println("First number:"+a);
        System.out.println("Second number:"+b);
    }
    public static void evenOrOdd(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to find even or odd:");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println(n+"is even");
        }
        else{
            System.out.println(n+"is odd");
        }
    }

    public static void vowelOrConsonant(){
        char a='a';
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
            System.out.println(a+" is vowel");
        }
        else{
            System.out.println(a+" is consonant");
        }
    }
    public static void largest(){
        int a=10;
        int b=20;
        int c=30;
        if(a>b && a>c){
            System.out.println(a+"is largest number");
        }
        else if(b>a && b>c ){
            System.out.println(b+" is largest number");
        }
        else{
            System.out.println(c+" is largest number");
        }
    }
    public static void positiveOrNegative(){
        int a=-10;
        if(a<0){
            System.out.println(a+" is negative");
        }
        else{
            System.out.println(a+" is positive");
        }
    }
   public static void sumOfNumbers(){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter number to find sum of first N natural numbers:");
        int n=sc.nextInt();
        int res=0;
        for(int i=0;i<=n;i++){
          res+=i;
        }
       System.out.println("Sum: "+res);
   }

   public static void factorial(){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter number to find factorial");
       int n=sc.nextInt();
       int res=1;
       for(int i=n;i>0;i--){
           res*=i;

       }
       System.out.println("Factorial of "+n+"is: "+res);
   }
   public static void fact(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number to find factorial");
       int n=sc.nextInt();
       int res=1;
       int i=n;
       while (i > 0) {

           res*=i;
           i--;
       }
       System.out.println("Factorial of "+n+"is :"+res);
   }
   public static void multiplyTable(){
        for(int i=1;i<=10;i++){
            System.out.println("5 * "+i+" ="+(5*i));
        }
   }
   public static void fibonacci(){
       System.out.println("Fibonacci Series till 10 terms:");
       int a=0;
       int b=1;
       System.out.print(a+","+b+",");
       for(int i=0;i<8;i++){
           int c=a+b;
           a=b;b=c;
           System.out.print(c+",");
       }

   }
    public static void alpha(){
int a=97;
for(int i=0;i<26;i++){
    char c=(char)a;
    System.out.print(c+" ");
    a++;
}
    }
    public static void countInteger(){
        System.out.println("Enter number to count digits:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            int res=n%10;
            n/=10;
            count++;
        }
        System.out.println("No of Digits:"+count);
    }
    public static void powerOfNumber(){
        System.out.println("Enter base number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter Power");
        int m=sc.nextInt();
        int res=1;
        for(int i=0;i<m;i++){
            res*=n;
        }
        System.out.println("Answer: "+res);
    }
    public static void findPrime(){
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;
        for(;i<=n;i++){
            if( i!=n && n%i==0){
                System.out.println(n+"is not a prime number");
                break;
            }


        }
        if(i==n+1){
            System.out.println(n+"is a prime number");
        }

    }
    public static void findFactor(){
        System.out.println("Factors of 60 are: ");
        for(int i=1;i<=60;i++){
            if(60%i==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void checkAlpha(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Alphabet:");
       char ch=sc.next().charAt(0);
       int b=(int )ch;
       int c=b-97;
       int d=b-65;
if(c>=0 && c<=25)
       {
            System.out.println(ch +" is Alphabet");
        }
else if(d>=0&&d<=25){
    System.out.println(ch +" is Alphabet");
}

        else{
            System.out.println(ch +" is not Alphabet");
        }
    }

    public static int recursion(int n ){

        if(n==0 || n==1){
            return n;
        }
        else{
            return n*recursion(n-1);
        }


    }

}
