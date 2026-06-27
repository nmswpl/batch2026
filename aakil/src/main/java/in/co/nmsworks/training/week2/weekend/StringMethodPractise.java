package in.co.nmsworks.training.week2.weekend;

import java.util.ArrayList;
import java.util.List;

public class StringMethodPractise {
    public static void main(String[] args) {
        charAtIndex("NMSWorks", 5);
        lenOfString("OpenAI");
        printSubstring("Java Programming", 5);
        printSubstring("Welcome to Java", 11, 15);
        checkForSubstring("Java Programming", "Prog");
        checkStringEquality("hello", "Hello");
        isStringEmpty(" ");

        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("cherry");
        joinStrings(fruits, ", ");

        concatStrings("Hello", "World");
        replaceAllOccurances("banana", "a", "o");
        checkStringEqualityIgnoresCase("hello", "HELLO");
        splitAndPrint("one,two,three", ",");
        splitAndPrint("apple;banana;cherry;date", ";", 3);
        indexOfChar("programming", 'g');
        checkForSubstring("welcome to the world", "the", 10);
        printLowerCase("Java Programming");
        printUpperCase("welcome to java");
        intToString(1234);
    }

    private static void intToString(int n) {
        String value = String.valueOf(n);
        System.out.println(value);
    }

    private static void printUpperCase(String input) {
        System.out.println(input.toUpperCase());
    }

    private static void printLowerCase(String input) {
        System.out.println(input.toLowerCase());
    }

    private static void checkForSubstring(String s, String substring, int beginIndex) {
        System.out.println(s.indexOf(substring, beginIndex));
    }

    private static void indexOfChar(String s, char ch) {
        System.out.println(s.indexOf(ch));
    }

    private static void splitAndPrint(String s, String delimeter, int limit) {
        for (String string : s.split(delimeter, limit)) {
            System.out.println(string);
        }
    }

    private static void splitAndPrint(String s, String delimeter) {
        String[] stringList = s.split(",");
        for (String string : stringList) {
            System.out.println(string);
        }
    }

    private static void checkStringEqualityIgnoresCase(String s1, String s2) {
        System.out.println((s1.equalsIgnoreCase(s2)) ? "Equals" : "Not Equals");
    }

    private static void replaceAllOccurances(String txt, String oldChar, String newChar) {
        System.out.println(txt.replace(oldChar, newChar));
    }

    private static void concatStrings(String s1, String s2) {
        System.out.println(s1.concat(s2));
    }

    private static void isStringEmpty(String s) {
        System.out.println((s.isEmpty()) ? "Empty" : "Not Empty");
    }

    private static void checkStringEquality(String string1, String string2) {
        System.out.println("IS EQUAL :: " + string1.equals(string2));
    }

    private static void checkForSubstring(String s, String substring) {
        System.out.println((s.contains(substring)) ? "Found" : "Not Found");
    }

    private static void printSubstring(String s, int begin, int end) {
        System.out.println(s.substring(begin,end));
    }

    private static void joinStrings(List<String> stringList, String delimiter) {
        String result = String.join(delimiter,stringList);
        System.out.println(result);
    }

    private static void printSubstring(String s, int index) {
        System.out.println();
    }

    private static void lenOfString(String s) {
        System.out.println(s.length());
    }

    private static void charAtIndex(String s, int index) {
        System.out.println(s.charAt(index));
    }
}
