package in.co.nmsworks.training.week1.day2;

public class Practice {

    public static void main(String[] args)
    {
       LargestAmongThree(9,18,27);

       PositiveOrNegative(27);

       isalphabet("m");

       naturalnumbers();

       factorial(5);

       multiplicationtable(5);

       fibonacii(10);

       lowercase();

       countdigits(1827);

       powerbusingforloop(2,3);

       powerofnumusingpow(2,3);

       isprime(27);

       factors(60);

       recursion(5);

    }

    public static void LargestAmongThree(int a, int b, int c) {

        if(a > b && a > c)
        {
            System.out.println(a+"is largest number");
        }
        else if(b > a && b > c)
        {
            System.out.println(b+"is largest number");
        }
        else{
            System.out.println(c+" is largest");
        }

    }

    public static void PositiveOrNegative(int n) {
        if(n < 0)

        {
            System.out.println(n+ "is a negative number");
        }
        else{

            System.out.println(n+" is a positive number");

        }
    }

    public static void isalphabet(String m) {


        String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        if( alpha.indexOf(m) == -1)
        {

          System.out.println(m+"is not an alphabet ");

        }

        else{

            System.out.println(m+" is an alphabet");

        }

    }

    public static void naturalnumbers() {

        int sum=0;
        int n=100;
        for(int i=0;i<=n;i++){
            sum+=i;
        }

        System.out.println("The sum of "+n+" is "+sum);
    }

    public static void factorial(int n) {

        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }

    public static void multiplicationtable(int n) {

        int tot=1;
        System.out.println("The multiplication table of "+n+" is ");

        for(int i=1;i<=10;i++)
        {
            //tot*=i;
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
    public static void fibonacii(int n) {

        int one=0;
        int two=1;
        System.out.println("Fibonocii series is ");
        for( int i=1;i<=n;i++ ){

           System.out.print(one+" ");
           int next=one+two;
           one=two;
           two=next;

       }
       System.out.println();

    }

    public static void lowercase() {

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
    }

    public static void countdigits(int num) {

        num=1234;
        boolean iscount=false;
        System.out.println();
        if (num == 0) {
            iscount=false;
        }

        int count = 0;
        while (num > 0) {
            iscount=true;
            num /= 10;
            count++;
        }
        if(iscount){
            System.out.println(count);
        }
    }

    public static void powerbusingforloop(int a,int b) {

         a=2;
         b=3;
         int res=1;
         for(int i=1;i<=b;i++)
         {
            res*=a;

         }
        System.out.println(res);
    }

    public static void powerofnumusingpow(int a, int b) {
        a=2;
        b=3;
        System.out.println("Answer "+Math.pow(a,b));
    }

    public static void isprime(int n) {
        boolean isprime=true;
        if( n<=1 )
        {
            isprime= false;
        }
        else if( n==2 )
        {
            isprime=true;
        }
        else if( n%2==0 )
        {
            isprime=false;
        }
        for( int i=3;i<Math.sqrt(n);i+=2 )
        {
            if( n%i==0 )
            {
                isprime=false;
                break;
            }

        }

        if(isprime)
        {
            System.out.println(n+" is a prime number ");
        }
        else{
            System.out.println(n+" is not a prime number");
        }

    }

    public static void factors(int a)
    {
        a=60;
        System.out.println("Factors of "+a+" is ");
        for( int i=1;i<=a;i++ )
        {
            if( a%i==0 )
            {
                System.out.print(i+" ");

            }
        }
    }

    public static int recursion( int n) {
        if( n==0 || n==1 ){
            return 0;
        }

        return n * recursion (n-1);

    }
}

