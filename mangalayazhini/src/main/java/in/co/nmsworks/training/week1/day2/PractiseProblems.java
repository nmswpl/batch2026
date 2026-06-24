package in.co.nmsworks.training.week1.day2;

public class PractiseProblems {

//    Write a program to Find Largest Among three numbers .


    public static void main(String[] args) {

        int number = 10 ;
        PractiseProblems obj = new PractiseProblems();

        obj.findLargestOfThreeNo(10,30,20);

        obj.isPositiveNegative(-10);

        obj.isAlphabet('*');
        obj.isAlphabet('A');

        obj.sumOfNaturalNo(100);

        obj.factorialForLoop(10);

        obj.factorialWhileLoop(10);

        obj.multiplicationTable(6);

        obj.fibonacciSeries(10);

        obj.printLowerAlphabets();

        obj.countNoOfDigits(110);

        obj.powerCalculation(2,3);

        obj.isPrimeNo(29);

        obj.factorsOfInteger(60);

        obj.charFrequency("abcdeaabcc", 'c');

        obj.countCharOfDifferentTypes("This website is aw3som3.");

        int factorialResult = obj.recursiveFactorial(number);
        System.out.println("\n Recursive Factorial of " + number + "  =  " + factorialResult);

    }

    /** Find Largest Among three numbers */
    public void findLargestOfThreeNo(int num1, int num2,int num3){

        int largestNo;
        System.out.println("\nFind Largest of Three numbers: ");
        System.out.println("Numbers : " + num1 + " " + num2 + " " + num3);
        if(num1 > num2 && num1 > num3){
            largestNo =  num1;
        }
        else if(num2 > num1 && num2 > num3){
            largestNo =  num2;
        }
        else{
            largestNo =  num3;
        }
        System.out.println("The Largest no is : " + largestNo);
    }

    /** Check if a Number is Positive or Negative */
    public void isPositiveNegative(int number){
        System.out.println("\nPositive or Negative Number");
        System.out.println("Number : " + number);
        if(number > 0){
            System.out.println("The number "+ number +"is Positive");

        }
        else{
            System.out.println("The number"+ number +" is Negative");

        }
    }

    /** Check whether character is alphabet or not */
    public void isAlphabet(char character){
        System.out.println("\nFind character is alphabet or not");
        System.out.println("Character : " + character);
        int asciiValue = (int)character ;
        if((asciiValue >= 97 && asciiValue <= 122) || (asciiValue >= 65 && asciiValue <= 90)){
            System.out.println(character +" is an alphabet");
        }
        else{
            System.out.println(character +" is not an alphabet");

        }
    }

    /** Print ASCII no*/
    public void printAscii(char ch){
        System.out.println((int)ch);
    }

    /** Sum of Natural Numbers using for loop */
    public void sumOfNaturalNo(int num){
        int sum = 0 ;
        for(int i=1 ; i<=num ; i++){
            sum += i ;
        }

        System.out.println("\nThe sum of " + num + " natural numbers : " + sum);

    }

    /** Factorial using for loop*/
    public void factorialForLoop(int num){
        long result = 1 ;

        for(int i=num ; i>0 ; i--){
            result *= i;
        }

        System.out.println("\nThe Factorials of " + num + " is " + result);

    }


    /** Factorial using while loop*/
    public void factorialWhileLoop(int num){
        long result = 1 ;
        int factorialNum = num;
        while (num >1){

            result *= num;
            num--;
        }

        System.out.println("\nThe Factorials of " + factorialNum + " is " + result);

    }

    /** Multiplication table*/
    public void multiplicationTable(int factor){

        System.out.println(factor + " table : ");
        for(int i=1 ; i <= 10 ; i++ ){
            System.out.println(factor + " * " + i + " = " + (factor*i));
        }

    }

    /** Fibonacci series */
    public void fibonacciSeries(int limit){
        int i=0 ;
        int j=1 ;
        int sum ;
        int idx=0;

        System.out.println("\nFibonacci Series");
        System.out.print(" " + i);
        System.out.print(" " + j);

        for(int temp=0 ; temp < limit ; temp++){
            sum = i+j ;

            i=j ;
            j=sum;


            System.out.print(" " + sum);
        }

    }

    /** Print lower case alphabets*/
    public void printLowerAlphabets(){
        //asciiValue >= 97 && asciiValue <= 122
        System.out.println("\nLower case alphabets:");
        for(int i=0 ; i<26 ; i++){
            System.out.print(" " + (char)(i+97));
        }
    }

    /** Count the no of digits in a number*/
    public void countNoOfDigits(int number){
        int remainder ;
        int quotient ;
        int digitCount=0;

        System.out.print("\n Total no of digits in "+number);

        while(number >0){
            quotient = number/10;
            remainder = number%10;

            number = quotient;
            digitCount++;

        }
        System.out.println(" = "  + digitCount);

    }

    /** Calculate the power of a base number*/
    public void powerCalculation(int base, int power){
        // base = 2
        // power = 3
        int raisedPower = 1 ;
        for (int i = 0; i < power; i++) {
            raisedPower = raisedPower*base;
        }

        System.out.println("Power : " + raisedPower);


    }

    /** Check if number is prime or composite no*/
    public void isPrimeNo(int number){
        for (int i = 2; i < number; i++) {
            if(number %i == 0 ){
                System.out.println(number +" is composite number");
                break;
            }
        }
        System.out.println(number + " is prime no");
    }

    /** Factors of a number*/
    public void factorsOfInteger(int number){

        System.out.println("Factors : ");
        for (int i = 1; i < number; i++) {
            if(number %i == 0 ){
                System.out.print(" " + i);
            }
        }
    }

    /** Factorial using recursive method*/
    public int recursiveFactorial(int num){
        if(num == 1){
            return 1;
        }
        else{
            return num*recursiveFactorial(num-1);
        }
    }

    /** Frequency of a character in a String */
    public void charFrequency(String str,char ch){
        int count = 0 ;
        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i) == ch){
                count++;
            }
        }

        System.out.println("\nThe frequency of " + ch + " is : " + count);
    }

    /** Count the vowels, consonants, digits and spaces in a String */
    public void countCharOfDifferentTypes(String str){
        int countVowels = 0 ;
        int countConsonants = 0;
        int countDigits = 0 ;
        int countSpaces = 0 ;

        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' || str.charAt(i) == 'o'  || str.charAt(i) == 'u' ){
                countVowels++;
            }
            else{
                if(str.charAt(i) == ' '){
                    countSpaces ++;
                } else if (str.charAt(i) == '0' || str.charAt(i) == '1' || str.charAt(i) == '2' ||
                        str.charAt(i) == '3' || str.charAt(i) == '4' || str.charAt(i) == '5' ||
                        str.charAt(i) == '6' || str.charAt(i) == '7' || str.charAt(i) == '8' || str.charAt(i) == '9' ) {
                    countDigits ++;
                }
                else {
                    countConsonants ++;
                }
            }
        }

        System.out.println("\nCount of vowels, consonants, digits and spaces :  ");
        System.out.println("String : " + str);
        System.out.println("Vowel : " + countVowels);
        System.out.println("Consonant : " + countConsonants);
        System.out.println("Digits : " + countDigits);
        System.out.println("Spaces : " + countSpaces);
    }


}
