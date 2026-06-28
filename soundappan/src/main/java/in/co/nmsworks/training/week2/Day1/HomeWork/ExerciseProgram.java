package in.co.nmsworks.training.week2.Day1.HomeWork;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExerciseProgram {
    public static void evenNumber(int a,int b){
        System.out.println("1.Even Number From "+a+" to "+b);
        for(int i=a;i<b;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void markToGrade(int n){
        System.out.println("2.Mark to Grade");
        if(n>=91  && n<=100){
            System.out.println("S");
        } else if (n>=81 && n<=90){
            System.out.println("A");
        } else if (n>=71 && n<=80){
            System.out.println("B");
        } else if (n>=61 && n<=70){
            System.out.println("C");
        } else if (n>=51 && n<=60){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
    public static void multipleOfArray(int[] arr,int[] arr1){
        System.out.println("3.Multiple of Array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]*arr1[i]+" ");
        }
        System.out.println();
    }
    public static void searchElementInArray(int []arr) {
        System.out.println("4.Search Element In The Array");
        int value = 41;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 41) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }
    public static void vowelOrConsonant(char c){
        System.out.println("5.VowelOrConsonant");
        String vowel="aeiouAEIOU";
        String consonant="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        if(consonant.indexOf(c)==-1){
            System.out.println("Not an Alphabet");
        }
        else if(vowel.indexOf(c)!=-1){
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }
    }
public static void multiplicationTable(int a,int b){
    System.out.println("6.Multiplication Table");
        for(int i=1;i<=b;i++){
            System.out.println(a+" x "+i+" = "+(a*i));
        }
}
public static void squareOfElement(int []arr) {
    System.out.println("7.Print Square of the element");
    for (int i = 0; i < arr.length; i++) {
        System.out.print((arr[i] * arr[i]) + " ");
    }
    System.out.println();
}

public static void hundredOfDigit(int n){
    System.out.println("8.Hundred Position Value");
        int val=n/100;
        String []value={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        System.out.println(value[val]);
}
public static void divisibleByThree(){
    System.out.println("9.Divisible By Three");
        for(int i=300;i<400;i++) {
            if (i % 3 == 0) {
                System.out.print(i+" ");
            }
        }
    System.out.println();
    }
    public static void printNumberEndingWithSeven() {
        System.out.println("10.print all numbers between 200 and 500 ending with 7.");
        for (int i = 200; i < 500; i++) {
            if (i % 10 == 7) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
public static void biggestOfThreeNumber(int a,int b,int c){
    System.out.println("11.A program to print the biggest of the 3 numbers");
        if(a>b && a>c){
            System.out.println(a);
        }
        else if(b>a && b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }

}
public static void oddCount(int []arr) {
    System.out.println("12. print number of odd elements.");
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 1) {
            count++;
        }
    }
        System.out.println("Odd elements" + count);
    }

    public static void sumOfArray(int []arr){
        System.out.println("13.sum of the elements of the array");
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
    public static void reverseAnArray(int [] arr){
        System.out.println("14.Reverse the array and print");
     int start=0;
     int end=arr.length-1;
     while (start<end){
         int temp=arr[start];
         arr[start]=arr[end];
         arr[end]=temp;
         start++;
         end--;
     }
     System.out.println(Arrays.toString(arr));
    }
    public static void evenCount(int []arr) {
        System.out.println("15. print number of Even elements.");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Even elements" + count);
    }
public static void recursionFact(int n) {
    System.out.println("16.Recursion to find and print the factorial of a number");
    int result = fact(n);
    System.out.println(result);
}

public static int fact(int n){
            if(n==0 || n==1){
                return 1;
            }
            return n*fact(n-1);
    }
    public static void findLargestElement(int [] arr){
        System.out.println("17.Find The Largest Element in the Array");
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    public static void numberOccurrence(int[] arr, int x){
        System.out.println("18.print no of occurance of x in the array");
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int n:arr){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> ent: map.entrySet()){
            if(ent.getKey()==x){
                System.out.println(ent.getValue());
                return;
            }
        }
    }
    public static void palindromeOfString(String str) {
        System.out.println("19.Check If the String is Palindrome Or Not");
        boolean isPalindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
    public static void checkTheNumberIsPrime(int n){
        System.out.println("20.Check The Number is Prime Or Not");
        boolean isprime=true;
        if(n<1){
            System.out.println("Number is Not Prime");
        }
        for(int i=3;i<Math.sqrt(n);i++){
            if(i%n==0) {
                isprime = false;
                break;
            }
        }
        if(isprime){
            System.out.println("The Number Is A Prime Number");
        }
        else{
            System.out.println("The Number is not a prime Number");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr={2,4,1};
        int  [] arr1={3,5,7};
        int [] element={7,15,41};
        int [] arr2={2, 4, 3, 5};
        int []odd={32, 43, 4, 15};
        int []sum={1,2,3};
        int []count={1, 2, 3, 2, 2, 3};
        evenNumber(601,700);
        markToGrade(61);
        multipleOfArray(arr,arr1);
        searchElementInArray(element);
        vowelOrConsonant('a');
        multiplicationTable(17,10);
        squareOfElement(arr2);
        hundredOfDigit(542);
        divisibleByThree();
        printNumberEndingWithSeven();
        biggestOfThreeNumber(12,24,5);
        oddCount(odd);

        sumOfArray(sum);
        reverseAnArray(arr);
        evenCount(arr);
        recursionFact(7);
        findLargestElement(arr);
        numberOccurrence(count,2);
        palindromeOfString("level");
        checkTheNumberIsPrime(7);
    }
}
