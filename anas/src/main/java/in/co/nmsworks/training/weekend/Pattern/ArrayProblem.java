package in.co.nmsworks.training.weekend.Pattern;

public class ArrayProblem {

    public static void main(String[] args) {

        evenDescending();
        grade();
        multiplyArrays();
        searchElement();
        vowelOrConsonant();
        multiplicationTable();
        squareElements();
        hundredPositionWord();
        divisibleBy3();
        endingWith7();
        biggestOfThree();
        countOddElements();
        sumArray();
        reverseStringArray();
        countEvenElements();
        factorial();
        largestElement();
        countOccurrence();
        palindrome();
        primeCheck();
    }


    // 1. Even numbers between 601 and 700 descending
    static void evenDescending() {
        for(int i=700;i>=601;i--) {
            if(i%2==0)
                System.out.println(i);
        }
    }


    // 2. Grade for mark
    static void grade() {
        int mark = 85;

        if(mark>=91 && mark<=100)
            System.out.println("S");
        else if(mark>=81)
            System.out.println("A");
        else if(mark>=71)
            System.out.println("B");
        else if(mark>=61)
            System.out.println("C");
        else if(mark>=51)
            System.out.println("D");
        else
            System.out.println("F");
    }


    // 3. Multiply two arrays
    static void multiplyArrays() {
        int a[]={2,4,1};
        int b[]={3,5,7};

        for(int i=0;i<a.length;i++)
            System.out.println(a[i]*b[i]);
    }


    // 4. Position of element
    static void searchElement() {
        int arr[]={7,15,41};
        int search=41;
        int pos=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==search)
                pos=i;
        }

        System.out.println(pos);
    }


    // 5. Vowel or consonant
    static void vowelOrConsonant() {
        char ch='a';

        if("aeiouAEIOU".contains(""+ch))
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }


    // 6. Table of 17
    static void multiplicationTable() {
        for(int i=1;i<=10;i++)
            System.out.println("17 x "+i+" = "+(17*i));
    }


    // 7. Square of array elements
    static void squareElements() {
        int arr[]={2,4,3,5};

        for(int x:arr)
            System.out.println(x*x);
    }


    // 8. Hundred position in words
    static void hundredPositionWord() {
        int n=542;
        int h=n/100;

        String words[]={"Zero","One","Two","Three","Four",
                "Five","Six","Seven","Eight","Nine"};

        System.out.println(words[h]);
    }


    // 9. Numbers divisible by 3 between 300 and 400
    static void divisibleBy3() {
        for(int i=301;i<400;i++){
            if(i%3==0)
                System.out.println(i);
        }
    }


    // 10. Numbers ending with 7
    static void endingWith7() {
        for(int i=200;i<=500;i++){
            if(i%10==7)
                System.out.println(i);
        }
    }


    // 11. Biggest of 3 numbers
    static void biggestOfThree() {
        int a=12,b=24,c=5;

        int max=Math.max(a,Math.max(b,c));

        System.out.println(max);
    }


    // 12. Count odd elements
    static void countOddElements() {
        int arr[]={32,43,4,15};
        int count=0;

        for(int x:arr){
            if(x%2!=0)
                count++;
        }

        System.out.println(count);
    }


    // 13. Sum of array
    static void sumArray() {
        int arr[]={1,2,3};
        int sum=0;

        for(int x:arr)
            sum+=x;

        System.out.println(sum);
    }


    // 14. Reverse string array
    static void reverseStringArray() {
        String arr[]={"a","b","c"};

        for(int i=arr.length-1;i>=0;i--)
            System.out.println(arr[i]);
    }


    // 15. Count even elements
    static void countEvenElements() {
        int arr[]={2,3,4,5,6};
        int count=0;

        for(int x:arr){
            if(x%2==0)
                count++;
        }

        System.out.println(count);
    }


    // 16. Factorial using recursion
    static void factorial() {
        int n=5;

        System.out.println(fact(n));
    }

    static int fact(int n){
        if(n==1)
            return 1;

        return n*fact(n-1);
    }


    // 17. Largest element
    static void largestElement() {
        int arr[]={12,3,20,14};

        int max=arr[0];

        for(int x:arr){
            if(x>max)
                max=x;
        }

        System.out.println(max);
    }


    // 18. Count occurrence
    static void countOccurrence() {
        int arr[]={1,2,3,2,2,3};
        int x=2;
        int count=0;

        for(int i:arr){
            if(i==x)
                count++;
        }

        System.out.println(count);
    }


    // 19. Palindrome check
    static void palindrome() {
        String str="level";

        String rev="";

        for(int i=str.length()-1;i>=0;i--)
            rev+=str.charAt(i);

        if(str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }


    // 20. Prime check
    static void primeCheck() {
        int x=7;
        boolean prime=true;

        for(int i=2;i<x;i++){
            if(x%i==0)
                prime=false;
        }

        if(prime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
