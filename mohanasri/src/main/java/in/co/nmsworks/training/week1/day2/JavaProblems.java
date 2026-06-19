package in.co.nmsworks.training.week1.day2;

public class JavaProblems {
    public static void main(String[] args) {
        findLargestNum();
        findPositiveOrNegative();
        checkAlphabet();
        sumNatNums();
        findFactorial();
        findFactorialUsingWhile();
        multiplyTable();
        fibonacciSeries();
        printLowercaseAlphabets();
        countDigits();
        findPowerOfNumber();
        findUsingPowFunc();
        findPrimeOrNot();
        findingFactors();
        recursionFactorial();
    }
    public static void findLargestNum(){
        int num1 = 57;
        int num2 = 45;
        int num3 = 34;
         if (num1 == num2 && num2 == num3){
             System.out.println("All are equal values" );
         }
         else if ( num1 > num2 && num1 > num3 ){
             System.out.println(num1 + " is larger");
         }
         else if (num2 > num3){
             System.out.println(num2 + " is larger");
         }
         else{
             System.out.println(num3 +"is larger");
         }
    }

    public static void findPositiveOrNegative(){
        int number1 = -3;
        if(number1 == 0){
            System.out.println("Neither + or - ");
        }
        else if( number1 > 0){
            System.out.println("number is positive");
            }
        else{
            System.out.println("Number is negative");
        }
    }
    public static void checkAlphabet(){
        char ch = '#';
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }

    }
    public static void sumNatNums(){
        int n = 100;
        int sum = 0;
        for (int i = 0; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("sum: " + sum);
    }
    public static void findFactorial(){
        long fact = 1;
        long num = 5;
        for(int i = 1; i <= num; i++){
            fact *= i;

        }
        System.out.println("Factorial: " + fact);
    }
    public static void findFactorialUsingWhile(){
        long fact1 = 1;
        int num = 5;
        int i = 1;
        while (i <= num){

            fact1 *= i;
             i++;
        }
        System.out.println("Factorial: " + fact1);
    }
    public static void multiplyTable(){
        int table = 5;
        for (int i = 1; i <= 10; i++){
            System.out.println(table + "*" + i + "=" + table*i );
        }
    }

    public static void fibonacciSeries() {
        int n = 10, a = 0, b = 1;
        for (int i = 1; i <= n; i++){
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
    public static void printLowercaseAlphabets(){
        for(char ch = 'a'; ch <= 'z'; ch++){
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    public static void countDigits(){
        int count = 0;
        int num = 1543;
        while(num != 0){
            num = num / 10;
            count++ ;
        }
        System.out.println("Number of digits: " + count);
    }
    public static void findPowerOfNumber(){
        int base = 2, power = 3, answer = 1;
        for(int i =1; i <= power; i++){
            answer *= base;
        }
        System.out.println("Answer: "+ answer);
    }
    public static void findUsingPowFunc(){
        int base = 2, power = 3;
        double answer = Math.pow(base, power);
        System.out.println("Answer: "+ answer);
    }
    public static void findPrimeOrNot(){
        int flag = 0;
        int num = 29;
        for (int i = 2; i < num / 2; i++){
            if(num % i == 0){
                flag = 1;
                break;
            }

        }
    if (flag == 0){
        System.out.println("Is prime");
    }
    else{
        System.out.println("Not a prime");
    }
    }
    public static void findingFactors() {
        int n = 60;
        for (int i = 1; i <= n; i++){
            if( n % i == 0){
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }
    public static void recursionFactorial(){

        System.out.println("Factorial: "+ recursionFactorial(5));
    }
    static int recursionFactorial(int n){
        if (n == 0){
            return 1;
        }
        else{
            return n*recursionFactorial(n - 1);
        }
    }
}
