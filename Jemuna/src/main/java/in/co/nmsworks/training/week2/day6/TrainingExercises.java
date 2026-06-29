package in.co.nmsworks.training.week2.day6;

import java.util.Arrays;

public class TrainingExercises {
    public static void main(String[] args) {
        printEvenNumBetweenRange();
        calculateGrade();
        arrayMultiplication();
        int result = searchingAnElementInArray();
        System.out.println(result);
        vowelConsant();
        multiplicationTable();
        squareOfArray();
        hundrerdPosition();
        divisibleByThree();
        endingWithSeven();
        biggestOfThreeNumber(12,24,5);
        biggestOfThreeNumber(18,18,35);
        countOfOddElementsInArray();
        sumOfArrayElements();
        reverseTheArray();
        System.out.println(" ");
        evenNumberCount();
        result=factorial(5);
        System.out.println("Factorial : "+result);
        largestElementInArray();
        noOfOccurranceInArray();
        System.out.print("'level' is a ");
        palindromeOrNot("level");
        System.out.print("'abc' is a ");
        palindromeOrNot("abc");
        primeNumber(7);
        primeNumber(10);
    }

    private static int factorial(int number) {
        if (number<=1){
            return 1;
        }
        return number*factorial(number-1);
    }

    private static void primeNumber(int number) {
        boolean result = true;
        for (int i = 2; i < number; i++) {
            if(number%i==0){
                result = false;
                break;
            }
        }
        if (result == false) {
            System.out.println(number + " is a not a Prime number");
        } else {
            System.out.println(number + " is a Prime number");
        }

    }

    private static void palindromeOrNot(String str) {
        String result ="";
        for (int i = str.length()-1; i >=0; i--) {
            result = result+str.charAt(i);
        }
        if(str.equals(result)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }

    private static void noOfOccurranceInArray() {
        int[] arr = {1, 2, 3, 2, 2, 3};
        int x = 2;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                count+=1;
            }
        }
        System.out.println(x+ " occurs "+count+" times in the array");
    }

    private static void largestElementInArray() {
        int[] arr = {12, 3, 20, 14};
        int maxElement = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxElement){
                maxElement = arr[i];
            }
        }
        System.out.println("Largest element in the array is "+maxElement);

    }

    private static void evenNumberCount() {
        int[] arr={2,3,4,5,6};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                count+=1;
            }
        }
        System.out.println("Even Elements : "+count);
    }

    private static void reverseTheArray() {
        char[] arr= {'a','b','c'} ;
        System.out.print("Reverse the Array: ");
        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i]+" ");

        }
    }

    private static void sumOfArrayElements() {
        int[] arr={1,2,3};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("Sum of Array Elements: "+ sum);
    }

    private static void countOfOddElementsInArray() {
        int[] arr={32,43,4,15};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                count+=1;
            }
        }
        System.out.println("Odd Elements : "+count);
    }

    private static void biggestOfThreeNumber(int num1, int num2, int num3) {
        System.out.println("The greatest of the 3 numbers: ");
        if(num1>=num2 && num1>=num3){
            System.out.println("Output: "+num1);

        }
        else if(num2>=num1 && num2>=num3){
            System.out.println("Output: "+num2);

        }
        else{
            System.out.println("Output: "+num3);

        }
    }

    private static void endingWithSeven() {
        System.out.print("Print all the numbers Ending with 7 : ");
        for (int i = 200; i <=500; i++) {
            if(i%10==7){
                System.out.print(i+" ");
            }
        }
        System.out.println(" ");
    }

    private static void divisibleByThree() {
        System.out.print("All number divisible by 3 between 300 and 400 :");
        for (int i = 300; i <=400 ; i++) {
            if(i%3==0){
                System.out.print(i+" ");
            }
        }
        System.out.println(" ");
    }

    private static void hundrerdPosition() {
        int input = 542;
        int hundrerd = input/100;
        System.out.print("The hundrerdth position of "+input+" is : ");
        if(hundrerd == 1){
            System.out.println("One");
        }
        else if(hundrerd==2){
            System.out.println("Two");
        }
        else if(hundrerd==3){
            System.out.println("Three");
        }
        else if(hundrerd==4){
            System.out.println("Four");
        }
        else if(hundrerd==5){
            System.out.println("Five");
        }
        else if(hundrerd==6){
            System.out.println("Six");
        }
        else if(hundrerd==7){
            System.out.println("Seven");
        }
        else if(hundrerd==8){
            System.out.println("Eight");
        }
        else if(hundrerd==9){
            System.out.println("Nine");
        }
        else{
            System.out.println("Zero");
        }
        System.out.println("");
    }

    private static void squareOfArray() {
        int[] arr1 = {2, 4, 3, 5};
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i]=arr1[i]*arr1[i];
        }
        System.out.print("The sqaure of an array : ");
        for (int i : result) {
            System.out.print(i+" ");

        }
        System.out.println(" ");
    }

    private static void multiplicationTable() {
        System.out.println("Multiplication Table : 17");
        for (int i = 1; i <=10; i++) {
            System.out.println(i+" X 17 = "+(i*17));
        }
    }

    private static void vowelConsant() {
        char input = 'A';
        if(input=='A' || input=='E' || input=='I' || input=='O' || input=='U' || input=='a' || input=='e' || input=='i' || input=='o' || input=='u' ){
            System.out.println(input+ " is a Vowel");
        }
        else{
            System.out.println(input+ " is a Consonant");
        }
    }

    private static int searchingAnElementInArray() {
        int[] arr={7,15,41};
        int searchElement = 49;
        System.out.print("Output : ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==searchElement){
                return i;
            }
        }
        return -1;
    }

    private static void arrayMultiplication() {
        int[] arr1={2,4,1};
        int[] arr2={3,5,7};
        int[] result= new int[arr2.length];
        for (int i = 0; i <arr1.length ; i++) {
            result[i]=arr1[i]*arr2[i];
        }
        System.out.println("Multiply two elements of same size "+ Arrays.toString(result));
    }

    private static void calculateGrade() {
        int mark = 99;
        System.out.print("The grade for the mark "+mark+" : ");
        if (mark>=91 && mark<=100){
            System.out.println("S");
        }
        else if (mark>=81 && mark<=90 ) {
            System.out.println("A");
        }
        else if (mark>=71 && mark<=80 ) {
            System.out.println("B");
        }
        else if (mark>=61 && mark<=70) {
            System.out.println("C");
        }
        else if (mark>=51 && mark<=60 ) {
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }

    private static void printEvenNumBetweenRange() {
        System.out.print("All the Even numbers between 601 and 700 : ");
        for (int i = 601; i <=700; i++) {
            if(i%2==0){
                System.out.print(i);
            }
        }
        System.out.println("");
    }
}
