package in.co.nmsworks.training.week2.Practice;

public class TrainingExercise {
    public static int[] arr1 = { 2, 4, 1};
    public static int[] arr2 = { 3, 5, 7};
    public static int[] arr3 = new int[arr1.length];
    public static int[] arr = {7, 15, 41};

    protected static void printEvenNumber() {
        for (int i = 700; i > 601; i -= 2) {
            System.out.print(i +" ");
        }
    }

    protected static void GradeMark(int mark) {
        if(mark > 100){
            System.out.println("Invalid Mark");
        }
        else{
            if(mark >90){
                System.out.println("Grade : " + "S");
            }
            else if(mark >80 && mark <=90){
                System.out.println("Grade : " + "A");
            }
            else if(mark >70 && mark <= 80){
                System.out.println("Grade : " + "B");
            }
            else if(mark >60 && mark <= 70){
                System.out.println("Grade : " + "C");
            }
            else if(mark >50 && mark <= 60){
                System.out.println("Grade : " + "D");
            }else{
                System.out.println("Grade : " + "F");
            }
        }
    }

    protected static void multipleOfArray(){
        if(arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                    arr3[i]=arr1[i]*arr2[i];
            }
            System.out.println("Multiplication of two array : ");
            for (int i = 0; i < arr3.length; i++) {
                System.out.print(arr3[i] + " ");
            }
        }
        else{
            System.out.println("Array Size are in equals..");
        }
    }

    protected static void printPosition(int element){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element){
                index=i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Element position in array is: " + index);
        } else {
            System.out.println("Element not found in array: " + index);
        }
    }

    protected static void checkCharacter(String name){
        name=name.toLowerCase() ;
        char charcter;
        for (int i = 0; i < name.length(); i++) {
            charcter=name.charAt(i);
            if(charcter == 'a' || charcter == 'e' || charcter == 'i' || charcter == 'o' || charcter == 'u'){
                System.out.println("its vowels : " + charcter);
            }
            else {
                System.out.println("its Consonant :  " + charcter);
            }
        }
    }

    protected static void multiplication(int number){
        for (int i = 1; i <=10; i++) {
            System.out.println(number +" * "  + i + " = " + number*i);
        }
    }

    protected static void squareOfArray(){
        int[] arr = { 2, 4, 3, 5 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]*arr[i] + " ");
        }
    }

    protected static void printDigitHundred(int number){
        String[] position={"zero" , "One" ,"Two" , "Three" ,"Four" ,"Five" , "Six" , "Seven" ,"Eight" , "Nine" , "Ten"};
        while(number > 10){
            number=number/10;
        }
        System.out.println(position[number]);
    }

    protected static void numberDivisbleByThree(){
        for (int i = 303; i < 400; i += 3) {
            System.out.print(i + " ");
        }
    }

    protected static void numberEndingWithSeven(){
        for (int i = 200; i < 500; i++) {
            if(i % 10 == 7){
                System.out.print(i + " ");
            }
        }
    }

    protected static void biggestOfNumber(int[] array){
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]){
                max=array[i];
            }
        }
        System.out.println("maximum Element of an array  : " + max);
    }

    protected static void oddNumberOfArray(int[] array){
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 !=0){
                count++;
            }
        }
        System.out.println("Odd number of an array : " + count);
    }

    protected static void sumOfArray(int[] array){
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        System.out.println("sum of an array  : " + sum);
    }
    
    protected static void reverseOfStringArray(String[] revarray){
        for (int i = revarray.length - 1; i >= 0; i--) {
            System.out.print(revarray[i] + " ");
        }
    }

    protected static void evenNumberOfArray(int[] array){
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 ==0){
                count++;
            }
        }
        System.out.println("even number of an array : " + count);
    }

    protected static int factrecu(int a){
        if(a==0 || a==1){
            return 1;
        }
        return a*factrecu(a-1);
    }

    protected static void occurenceInArray(int[] value,int x){
        int count=0;
        for (int i = 0; i < value.length; i++) {
            if(x==value[i]){
                count++;
            }
        }
        System.out.println("occurence of element in array : " + count);
    }

    protected static void stringpalindrome(String words) {
        int start = 0;
        int end = words.length() - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (words.charAt(start) != words.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.println(words + " is a palindrome");
        } else {
            System.out.println(words + " is not a palindrome");
        }
    }

    protected static void checkPrime(int n){
        if( n % 2 != 0){
            System.out.println("it is prime ");
        }
        else{
            System.out.println("it is not prime ");
        }
    }
}
