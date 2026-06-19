package in.co.nmsworks.training.week1.day2;

public class JavaOperations {

    public static void main(String[] args){

        largestAmong3numbers(3,5,9);
        checkPositiveOrNegative(0);
        checkAlphabet('%');
        sumOfNNaturalNumbers(100);
        findFactorialFor(5);
        findFactorialWhile(4);
        multiplicationTable(7);
        fibonacci();
        printLowerCase();
        countDigits(145300);
        powerOfNumber(3,4);
        powerUsingDefault(2.0,3.0);
        checkPrime(17);
        findFactors(60);
        System.out.println("factorial is "+findFactorialUsingRecursion(5));
    }
    public static void largestAmong3numbers(int a,int b,int c)
    {
        if(a > b && a > c)
        {
            System.out.println(a+" is the largest number");
        }
        else if(b > a && b > c)
        {
            System.out.println(b+" is the largest number");
        }
        else
        {
            System.out.println(c+" is the largest number");
        }
    }
    public static void checkPositiveOrNegative(int num)
    {
        if(num > 0)
        {
            System.out.println(num+" is a positive number");
        }
        else if(num < 0)
        {
            System.out.println(num+" is a negative number");
        }
        else
        {
            System.out.println("Number is 0");
        }
    }
    public static void checkAlphabet(char ch)
    {
        if((ch >= 'A' && ch <= 'Z')||(ch >= 'a' &&ch <= 'z'))
        {
            System.out.println(ch+" is an Alphabet");
        }
        else
        {
            System.out.println(ch+" is not an Alphabet");
        }
    }

    public static void sumOfNNaturalNumbers(int n)
    {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("sum of N natural number is "+sum);
    }
    public static void findFactorialFor(int n)
    {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
    public static void findFactorialWhile(int n)
    {
        int fact = 1;
        int num = n;
        while(num > 0)
        {
            fact *= num;
            num--;
        }
        System.out.println("Factorial of "+n+" using while loop is "+fact);
    }

    public static void multiplicationTable(int n)
    {
        for(int i = 1;i <= 10;i++)
        {
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }

    public static void fibonacci()
    {
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        for (int i = 2; i <= 10; i++) {
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        System.out.println();
    }
    public static void printLowerCase()
    {
        for(char ch = 'a';ch <= 'z';ch++)
        {
            System.out.print(ch+" ");
        }
        System.out.println();
    }
    public static void countDigits(int num)
    {
        int n = num;
        int count = 0;
        while (n > 0)
        {
            n=n/10;
            count++;
        }
        System.out.println("Digits in "+num+" is "+count);
    }
    public static void powerOfNumber(int n,int pow)
    {
        int power = 1;
        for (int i = 0; i < pow; i++) {
            power *= n;
        }
        System.out.println("Power of "+n+" is "+power);
    }
    public static void powerUsingDefault(double n,double pow)
    {
        double power = Math.pow(n,pow);
    }
    public static void checkPrime(int number)
    {
        int count = 0;
        for(int i = 2;i <= (number/2);i++)
        {
            if((number) % i == 0)
            {
                count++;
            }
        }
        if(count == 0)
        {
            System.out.println(number+" is a prime number");
        }
        else
        {
            System.out.println(number+" is not a prime number");
        }
    }
    public static void findFactors(int num)
    {
        System.out.println("Factors of num is ");
        for(int i = 1;i <= num; i++)
        {
            if(num % i == 0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();

    }
    public static int findFactorialUsingRecursion(int num)
    {
        if(num <= 1)
        {
            return 1;
        }
        return num*findFactorialUsingRecursion(num-1);
    }
}
