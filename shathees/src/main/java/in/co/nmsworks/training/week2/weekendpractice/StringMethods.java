package in.co.nmsworks.training.week2.weekendpractice;

import java.util.*;

public class StringMethods {
    public static void main(String[] args) {
        findCharacterAtIndex("NMSWorks",5);
        findLength("openAI");
        extractString("Java Programming");
        printSubstringBegWithEndIndex("Welcome to Java");
        checkStringContains("Java Programming","Prog");
        List<String>fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        stringConcatenation(fruits);
        compareStrings("hello","Hello");
        checkStringIsEmpty(" ");
        stringConcatenation("Hello","world");
        replacesAllSpecificCharcters("banana",'a','o');
        compareStringsWithCaseInsencitive("hello","Hello");
        String input = "one,two,three";
        splitArray(input);
        String inputValue = "apple;banana;cherry;date";
        splitArrayWithLimit(inputValue);
        findFirstOccurance("programming",'g');
        findIndexOfSubstringFromSpecificIndex("welcome to the world",10,"the");
        convertToLowercase("Java Programming");
        convertToUpperCase("welcome to Java");
        convertIntegerToString(1234);

    }

    private static void convertIntegerToString(int number) {
        String converted = String.valueOf(number);
        System.out.println(converted);
    }

    private static  void convertToUpperCase(String input) {
        System.out.println(input.toUpperCase());
    }

    private static void convertToLowercase(String input) {
        System.out.println(input.toLowerCase());
    }

    private static void findIndexOfSubstringFromSpecificIndex(String input, int index,String substring) {
        System.out.println(input.indexOf(substring,index));
    }

    private static void findFirstOccurance(String input, char g) {
        System.out.println(input.indexOf(g));
    }

    private static void splitArrayWithLimit(String inputValue) {
        String[] fruits = inputValue.split(";",3);
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);

        }
    }

    private static void splitArray(String input) {
        String[] numbers = input.split(",");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
    }

    private static void compareStringsWithCaseInsencitive(String firstString, String secondString) {
        if (firstString.equalsIgnoreCase(secondString)){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }
    }

    private static void replacesAllSpecificCharcters(String stringInput, char firstCharcter, char secondCharcter) {
        System.out.print(stringInput.replace(firstCharcter,secondCharcter));
    }

    private static void stringConcatenation(String firstString, String secondString) {
        System.out.println(firstString.concat(secondString));
    }

    private static void checkStringIsEmpty(String input) {
        if (input.isEmpty()){
            System.out.println("Empty");
        }else {
            System.out.println("Not Empty");
        }
    }

    private static void compareStrings(String input1, String input2) {
        if (input1.equals(input2)){
            System.out.println("both are equal");
        }else {
            System.out.println("not equal");
        }
    }

    private static void stringConcatenation(List<String> fruits) {
        System.out.println(String.join(",",fruits));
    }


    public static void checkStringContains(String input1, String input2) {
        if (input1.contains(input2)){
            System.out.println("found");
        }else {
            System.out.println("Not found");
        }
    }

    public static void printSubstringBegWithEndIndex(String inputString) {
        System.out.println(inputString.substring(11,15));
    }

    public static void extractString(String inputString) {
        System.out.println("The Substring : "+inputString.substring(5));
    }

    public static void findLength(String inputString) {
        System.out.println("The length of string : "+inputString.length());
    }

    public static void findCharacterAtIndex(String inputString, int index) {
        System.out.println("The index No : "+index+" of the give string charcter : "+inputString.charAt(index));
    }
}
