package in.co.nmsworks.training.week2.weekendPractise;

public class Exercise2 {
    public static void main(String[] args) {
        printEvenNumbers();
        printGrade(8);
        multiplyArray(new int[]{2,4,1}, new int[]{3,5,7});
        printPosition(new int[]{7, 15, 41},1);
        checkVowelOrConsonant('Z');
        multiplicationTable(17);
        squareOfArray(new int[]{2,3,5,9});
        printHundredth(565);
        divisileByThree(399,400);
        endingWith7(200,500);
        biggestOfThree(12, 24, 5);
        printOdd(new int[]{32, 43, 4, 15, 63});
        sumOfElements(new int[]{ 1, 2, 3 });
        reverse(new String[]{"a","b","c"});
        countEven(new int[]{2, 3, 4, 5, 6});
        System.out.println(factorial(5));
        largest(new int[]{12, 3, 20, 14});
        occurence(new int[]{1, 2, 3, 2, 2, 3},2);
        isPalindrome("one");
        isPrime(572);
    }

    private static void isPrime(int number) {
        if(number < 1)
        {
            System.out.println("Not positive integer!");
            return;
        }
        if(number == 1 ){
            System.out.println("Not Prime");
            return;
        }

        for (int i = 2; i <= number/2; i++) {
            if(number % i == 0)
            {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");

    }

    private static void isPalindrome(String string) {

        for (int i = 0, j=string.length()-1; i < j; i++,j--) {
            if( string.charAt(i) != string.charAt(j))
            {
                System.out.println("Not Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }

    private static void occurence(int[] array, int element) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if( array[i] == element )
                count++;
        }
        System.out.println(count);
    }

    private static void largest(int[] array) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if( largest < array[i])
                largest = array[i];
        }
        System.out.println("Largest Element = "+largest);
    }

    private static int factorial(int number) {
        if(number == 1 || number == 0)
            return 1;
        return number * factorial( number - 1);
    }

    private static void countEven(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if( array[i]%2 == 0)
                count++;
        }
        System.out.println("Even Elements Count= "+ count);
    }

    private static void reverse(String[] strArray) {
        for (int i = strArray.length-1; i >= 0; i--) {
            System.out.print(strArray[i]+ " ");
        }
        System.out.println();
    }


    private static void sumOfElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum of array: "+ sum);
    }

    private static void printOdd(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if( array[i] % 2 != 0 )
                System.out.print(array[i]+ " ");
        }
        System.out.println();
    }

    private static void biggestOfThree(int number1, int number2, int number3) {
        if( number1 < number2) {

            if (number2 < number3)
                System.out.println(number3);
            else
                System.out.println(number2);
        }
        else
            System.out.println(number1);
    }

    private static void endingWith7(int start, int end) {
        for (int i = start; i <= end ; i++) {
            int endDigit = i % 10;
            if( endDigit == 7)
                System.out.print(i+ " ");

        }
        System.out.println();
    }

    private static void divisileByThree(int start, int end) {
        for (int i = start; i < end; i++) {
            if( i % 3 == 0)
                System.out.print(i+ " ");
        }
        System.out.println();
    }

    private static void printHundredth(int number) {
        if(number < 100 || number > 999)
        {
            System.out.println("Not a 3-digit nummber");
            return;
        }

        int hundred = number / 100;
        switch (hundred)
        {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            default:
                System.out.println("Nine");
        }
    }

    private static void squareOfArray(int[] array) {
        int[] result = new int[array.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = array[i] * array[i];
        }

        System.out.print("{ ");
        for (int i : result) {
            System.out.print(i+" ");
        }
        System.out.print("}\n");
    }

    private static void multiplicationTable(int number) {
        for (int i = 1; i < 11 ; i++) {
            System.out.println( number +" x "+ i +" = "+ number*i);
        }
    }

    private static void checkVowelOrConsonant(char character) {
        String vowel = "AEIOU";
        String consonant = "BCDFGHJKLMNPQRSTVWXYZ";

        if( vowel.contains( String.valueOf(character).toUpperCase() ))
            System.out.println("Vowel");
        else if ( consonant.contains( String.valueOf( character ).toUpperCase() )) {
            System.out.println("Consonant");
        }
        else
            System.out.println("Pls provide a alphabet!");
    }

    private static void printPosition(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if(array[i]==element) {
                System.out.println("Position: " + i);
                return;
            }
        }

        System.out.println("-1");
    }

    private static void multiplyArray(int[] array1, int[] array2) {
        if(array1.length != array2.length)
        {
            System.out.println("Arrays don't have same length!!!");
            return;
        }

        int[] result = new int[array1.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = array1[i] * array2[i];
        }
        System.out.print("{");
        for (int i : result) {
            System.out.print(i+" ");
        }
        System.out.print("}");
        System.out.println();
    }

    private static void printGrade(int mark) {
        if(mark>100 || mark<0)
            System.out.println("Invalid Mark!");
        else
        {
            if( mark > 90 )
                System.out.println("S");
            else if ( mark > 80 ) {
                System.out.println("A");
            } else if ( mark > 70 ) {
                System.out.println("B");
            } else if ( mark > 60 ) {
                System.out.println("C");
            } else if ( mark > 50 ) {
                System.out.println("D");
            }
            else
                System.out.println("F");
        }
    }

    private static void printEvenNumbers() {
        for (int i = 700; i > 601 ; i-=2) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
