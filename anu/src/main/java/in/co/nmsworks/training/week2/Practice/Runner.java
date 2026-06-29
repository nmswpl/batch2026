package in.co.nmsworks.training.week2.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        computableCalculation();
        LibrarySystem();
        trainingProblem();
        patternProgram();
        stringPractice();

    }

    private static void stringPractice() {
        String name="NMSWorks";
        int index=5;
        char value=name.charAt(index);
        System.out.println("index value of an program : " + value);

        System.out.println();
        String character="OpenAI";
        System.out.println("length of an string : " + character.length());

        System.out.println();
        String javaString="Java Programming";
        String nameValue=javaString.substring(5);
        System.out.println("Substring of---------- " + nameValue);

        System.out.println();
        String javaProgram="Welcome to Java";
        String stringValue=javaProgram.substring(11,15);
        System.out.println("Substring of---------- " + stringValue);

        System.out.println();
        System.out.print("check the string contains :  ");
        if(javaString.contains("Prog")) {
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }

        System.out.println();
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        String result = String.join(", ", fruits);
        System.out.println(result);

        System.out.println();
        String str1 = "hello";
        String str2 = "Hello";
        if (str1.equals(str2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        System.out.println();
        String str = " ";
        if (str.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println("Not Empty");
        }

        System.out.println();
        String namev = "Hello";
        String namel = " World";
        System.out.println(namev.concat(namel));

        System.out.println();
        String stringReplace = "banana";
        System.out.println(str.replace('a', 'o'));

        System.out.println();
        String valueOfOne = "hello";
        String valueOfTwo = "HELLO";
        if (valueOfOne.equalsIgnoreCase(valueOfTwo)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        System.out.println();
        String stringOfSplit = "one,two,three";
        String[] parts = stringOfSplit.split(",");
        System.out.print("split of string : ");
        for (String s : parts) {
            System.out.println(s);
        }

        System.out.println();
        String stringOfLimit = "apple;banana;cherry;date";
        String[] limits = stringOfLimit.split(";", 3);
        for (String s : limits) {
            System.out.println(s);
        }

        System.out.println();
        System.out.println(javaString.indexOf('g'));

        System.out.println();
        String stringWorld = "welcome to the world";
        System.out.println("indexof an string : " + stringWorld.indexOf("the", 10));

        System.out.println();
        System.out.println("java string for lowercase : " + javaString.toLowerCase());

        System.out.println();
        System.out.println("java string for uppercase : " + str.toUpperCase());

        System.out.println();
        int valueNumber= 1234;
        String stringNumberValue = String.valueOf(valueNumber);
        System.out.println(stringNumberValue);
    }

    private static void patternProgram() {
        PatternProgram.numbericPatternOne();
        System.out.println();
        PatternProgram.numbericPatternTwo();
        System.out.println();
        PatternProgram.starPatternOne();
        System.out.println();
        PatternProgram.alphabetPattern();
    }

    private static void trainingProblem() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Prime number------------");
        TrainingExercise.printEvenNumber();

        System.out.println();

        System.out.println("Grade details------------");
        TrainingExercise.GradeMark(75);

        System.out.println();

        System.out.println("Multiple of an Array--------");
        TrainingExercise.multipleOfArray();

        System.out.println();

        TrainingExercise.printPosition(41);
        System.out.println();

        TrainingExercise.checkCharacter("Anushri");
        System.out.println();

        TrainingExercise.multiplication(17);
        System.out.println();

        System.out.print("square of an array : ");
        TrainingExercise.squareOfArray();

        System.out.println();

        System.out.print("Hundred position of an value : ");
        int number=sc.nextInt();
        TrainingExercise.printDigitHundred(number);

        System.out.println();
        System.out.println(" number Divisible By three -------");
        TrainingExercise.numberDivisbleByThree();

        System.out.println();
        System.out.println(" number Ending with Seven -------");
        TrainingExercise.numberEndingWithSeven();

        System.out.println();
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
        }
        TrainingExercise.biggestOfNumber(array);

        System.out.println();
        TrainingExercise.oddNumberOfArray(array);

        System.out.println();
        TrainingExercise.sumOfArray(array);

        System.out.println();
        String[] revarray={"anushri" ,"vijayashree" ,"archana "};
        TrainingExercise.reverseOfStringArray(revarray);

        System.out.println();
        TrainingExercise.evenNumberOfArray(array);

        System.out.println();
        System.out.println("recursive of an factorial ");
        int a=sc.nextInt();
        System.out.println("factorial of number is " + a + " : " + TrainingExercise.factrecu(a));

        System.out.println();
        System.out.print("enter the element x : ");
        int x=sc.nextInt();
        System.out.println();
        int[] value = new int[7];
        for (int i = 0; i < value.length; i++) {
            value[i]=sc.nextInt();
        }
        TrainingExercise.occurenceInArray(value,x);

        System.out.println();
        TrainingExercise.stringpalindrome("abc");

        System.out.println();
        System.out.println("check the prime number ");
        int n=sc.nextInt();
        TrainingExercise.checkPrime(n);
    }

    private static void computableCalculation(){
        Computable adder = new Adder();
        Computable multiple = new Multiplier();
        Computable divide = new Divider();

        adder.compute(2,3);
        multiple.compute(2,3);
        divide.compute(10,5);
    }
    private static void performCalculation ( int a, int b, Computable operation){
        operation.compute(a,b);
    }

    private static void LibrarySystem(){
        LibraryBook oops = new LibraryBook("Object Orientation programming","Anushri",2005,1);
        oops.checkOut();
        oops.checkOut();
        oops.checkOut();
        LibraryBook cprogramming = new LibraryBook("C Programming ", " Thayuman " ,1999,4);
        cprogramming.checkOut();
        LibraryBook operatingSystem =  new LibraryBook("Operation System " , " Vivek " ,2001,2);
        operatingSystem.checkOut();
        LibraryBook dbms = new LibraryBook( "DataBase Managemnet System " , " kavitha" ,2004 ,3);
        dbms.checkOut();
        dbms.checkOut();
        dbms.checkOut();
    }
}
