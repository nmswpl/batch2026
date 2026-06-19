package in.co.nmsworks.training.week1.day2;
//import java.util.*;
public class PracticeSession {
    public static void main(String[] args) {
        largestNumber(11,4,9);
        positiveOrNegative(9);
        checkAlphabetOrNot('*');
        sumOfNaturalNumbers(3);
        factorialUsingForLoop(5);
        factorialUsingWhileLoop(4);
        tables(2);
        fibonacci(5);
        lowercaseAlphabets();
        countDigits(5672);
        powerUsingLoop(2,3);
        powerUsingMethod(2,3);
        primeNUber(20);
        factors(6);
        factUsingRecursion(5);
        freq("Hello",'l');
    }

    public static void largestNumber(int number1, int number2, int number3){
        if((number1 > number2) && (number1 > number3) ){
            System.out.println(number1+" is largest number");
        }
        else if (number2 > number3 ) {
            System.out.println(number2 + " is largest number");
        }
        else{
            System.out.println(number3+" is largest number");
        }
    }

    public static void positiveOrNegative(int number){
        if(number>0){
            System.out.println("number is positive");
        } else if (number < 0 ) {
            System.out.println("number is negative");
        }
        else{
            System.out.println("number is zero");
        }
    }

    public static void checkAlphabetOrNot(char ch){
        if(Character.isAlphabetic(ch)){
            System.out.println("it is an alphabet");
        }
        else{
            System.out.println("it is not an alphabet");
        }
    }

    public static void sumOfNaturalNumbers(int number){
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum+=i;
        }
        System.out.println("sum of "+number +" numbers = "+sum);
    }

    public static void factorialUsingForLoop(int number){
        int fact=1;
        for (int i = 1; i <= number; i++) {
            fact=fact*i;
        }
        System.out.println("Factorial of "+number +" is "+fact);
    }

    public static void factorialUsingWhileLoop(int number){
        int fact=1;
        int i=1;
        while(i<=number){
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of "+number +" is "+fact);
    }

    public static void tables(int number){
        for(int i=1; i<=10; i++){
            System.out.println(number + "*" + i + "=" + number * i );
        }
    }

    public static void fibonacci(int number){
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.println(firstTerm);
        System.out.println(secondTerm);
        for (int i = 2; i < number; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.println(nextTerm);
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }
    }

    public static void lowercaseAlphabets(){
        char start = 'a';
        for (int i = 0; i < 26; i++) {
            System.out.println(start++);
        }
    }

    public static void countDigits(int number){
        int count = 0;
        int temp = number;
        while (number > 0){
            temp = temp % 10;
            count++;
            number = number / 10;
        }
        System.out.println("Count of Digits: "+ count);
    }

    public static void powerUsingLoop(int base, int power){
        int result = 1;
        for( int i = 0; i < power; i++){
            result *= base;
        }
        System.out.println(result);
    }

    public static void powerUsingMethod(double base, double power){
        double answer = Math.pow(base, power);
        System.out.println(answer);
    }

    public static void primeNUber(int number){
        boolean isPrime = true;
        for (int i = 2; i < number / 2 ; i++) {
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }
    }

    public static void factors(int number){
        if(number > 0){
            System.out.println("Factors of "+ number + ":");
            for (int i = 1; i <= number; i++) {
                if(number % i == 0){
                    System.out.println(i);
                }
            }
        }
        else{
            System.out.println("Negative number");
        }
    }

    public static int factorial(int num){

        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);

    }

    public static void factUsingRecursion(int number){
        int result = factorial(number);
        System.out.println(result);
    }

    public static void freq(String sent, char character){
        char[] ch = sent.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == character){
                count++;
            }
        }
        System.out.println(count);
    }


}
