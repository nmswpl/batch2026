package in.co.nmsworks.training.week1.day2;

public class LoopOperationOfJava {
    public static void main(String args[])
    {
        largestNumber(3,1,2);
        checkNumber(-2);
        checkAlphapet('a');
        sumOfNaturalNumbers(100);
        factorialUsingFor(10);
        factorialUsingWhile(5);
        multiplicationTool(5);
        fibannociSeries(10);
        printAlphapet();
        countNumOfDigits(1543);
        powerOfNumberUsingFor(2,3);
        powerOfNumberUsingFunction(2,3);
        checkPrime(29);
        factorsOfPositiveInt(60);
        factorialUsingRecursion(6);

    }
    public static void largestNumber(int number1, int number2, int number3) {
        if(number1 > number2 && number1 > number3) {
            System.out.println(number1 +" is greater than "+number2+" and "+number3+".");
        }
        else if(number2 > number1 && number2 > number3) {
            System.out.println(number2 +" is greater than "+number1+" and "+number3+".");
        }
        else {
            System.out.println(number3 +" is greater than "+number1+" and "+number2+".");
        }
    }

    public static void checkNumber(int number) {
      if(number > 0) {
          System.out.println(number+" is positive");
      }
      else {
          System.out.println(number+" is negative");
      }
    }

    public static void checkAlphapet(char text) {
        if(Character.isLetter(text)) {
            System.out.println(text+" is an alphapet");
        }
        else {
            System.out.println(text+" is not an alphapet");
        }
    }
    public static void sumOfNaturalNumbers(int number) {
        int sum=0;
        for(int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("The sum of natural numbers upto "+number+" is "+sum);
    }
    public static void factorialUsingFor(int number){
        int factorial=1;
        for(int i = 1; i <= number; i++){
            factorial*=i;
        }
        System.out.println("Factorial of the "+ number +" is "+factorial);
    }
    public static void factorialUsingWhile(int number) {
        int factorial =1;
        int i=1;
        while( i <= number) {
            factorial*=i;
            i++;
        }
        System.out.println("Factorial of the "+ number +" is "+factorial);
    }
    public static void multiplicationTool(int number) {
        for(int i = 1; i <= 10; i++)
        {
            int product = i*number;
            System.out.println(number + "*" + i + "=" + product);
        }
    }
    public static void fibannociSeries(int number) {
        int next;
        int prev = 0;
        int cur = 1;
        int sum=prev+cur;
        System.out.print(prev+" "+cur+" "+cur+" ");

        for(int i = 3 ; i < number; i++) {
            prev = cur;
            cur = sum;
            sum = prev+cur;
            System.out.print(sum+" ");
        }
        System.out.println();
    }
    public static void printAlphapet(){
        for(char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch+" ");
        }
        System.out.println();
    }
    public static void countNumOfDigits(int number)
    {
        int count=0;
        while(number > 0) {
            number = number/10;
            count++;
        }
        System.out.println("The digit of the "+number+" is "+count );
    }
    public static void powerOfNumberUsingFor(int number, int power) {
        int result = 1;
        for(int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println("The power of the "+number+" and "+power+" is "+result);
    }
    public static void powerOfNumberUsingFunction(int number, int power) {
        System.out.println("The power of the "+number+" and "+power+" is "+Math.pow(number,power));
    }
    public static void checkPrime(int number) {
        int count=0;
        for(int i = 1; i < Math.sqrt(number); i++) {

            if(number%i == 0) {
                count++;
            }
        }
        if(count > 1) System.out.println("The number "+number+" is prime.");
        else System.out.println("The number "+number+" is not prime");
    }
    public static void factorsOfPositiveInt(int number) {
        for(int i = 1; i <= number; i++) {
            if(number%i == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void factorialUsingRecursion(int number) {
        int result = helper(number);
        System.out.println(result+" is a factorial");
    }
    public static int helper(int number) {
        if(number == 1 || number == 0) {
            return number;
        }
        return number*helper(number-1);
    }
}
