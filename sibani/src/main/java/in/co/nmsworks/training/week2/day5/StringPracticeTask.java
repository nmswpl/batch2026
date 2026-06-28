package in.co.nmsworks.training.week2.day5;

import java.util.Arrays;

public class StringPracticeTask {
    public static void main(String[] args) {
        StringPracticeTask stringPracticeTask = new StringPracticeTask();
        stringPracticeTask.findCharAtIndex("NMSWorks", 5);
        stringPracticeTask.findLengthOfString("OpenAI");
        stringPracticeTask.extractSubstring("Java Programming" , 5);
        stringPracticeTask.extractSubstringWithBeginAndEndIndex("Welcome to Java", 11, 15);
        stringPracticeTask.checkSubstringInString("Java Programming", "Prog");
        stringPracticeTask.concatenateListOfStrings();
        stringPracticeTask.compareStrings("hello", "Hello");
        stringPracticeTask.checkStringIsEmpty(" ");
        stringPracticeTask.concatenateTwoString("Hello", "World");
        stringPracticeTask.replaceChar("banana",'a', 'o');
        stringPracticeTask.compareStringsIgnoringCase("hello", "HELLO");
        stringPracticeTask.splitString("one,two,three", ",");
        stringPracticeTask.splitStringWithLimit("apple;banana;cherry;date", ";", 3);
        stringPracticeTask.findFirstOcuurenceOfCharacter("programming", 'g');
        stringPracticeTask.findFirstOccurenceOfSubstring("welcome to the world", "the", 10);
        stringPracticeTask.convertToLowerCase("Java Programming");
        stringPracticeTask.convertToUpperCase("welcome to Java");
        stringPracticeTask.convertIntegerToString(1234);

    }

    private void convertIntegerToString(int i) {
        System.out.println("String value of the Integer " + i + " is : " + String.valueOf(i));
    }

    private void convertToUpperCase(String welcomeToJava) {
        System.out.println("The given string " + welcomeToJava + " to upper case is : " + welcomeToJava.toUpperCase());
    }

    private void convertToLowerCase(String javaProgramming) {
        System.out.println("The given string " + javaProgramming + " to lower case is : " + javaProgramming.toLowerCase());
    }

    private void findFirstOccurenceOfSubstring(String welcomeToTheWorld, String the, int i) {
        System.out.println("The first occurence of the substring " + the + " in the string " + welcomeToTheWorld + " from the index " + i + " is : " + welcomeToTheWorld.indexOf(the, i));
    }

    private void findFirstOcuurenceOfCharacter(String programming, char g) {
        System.out.println("The first occurence of the charcater " + g + " in the string " + programming + " is : " + programming.indexOf(g));
    }

    private void splitStringWithLimit(String s, String regex, int i) {
        String[] split = s.split(regex, i);
        System.out.println(Arrays.toString(split));
    }

    private void splitString(String s, String regex) {
        String[] split = s.split(regex);
        System.out.println(Arrays.toString(split));
    }

    private void compareStringsIgnoringCase(String hello, String hello1) {
        System.out.println("Ignoring case Sensitivity given two strings are equal : " + hello.equalsIgnoreCase(hello1));
    }

    private void replaceChar(String banana, char a, char o) {
        System.out.println("In the given string " + banana + " after replacing " + a + " with " + o + " is : " + banana.replace(a,o));
    }

    private void concatenateTwoString(String hello, String world) {
        System.out.println("After concatenating given two strings : " + hello.concat(world));
    }

    private void checkStringIsEmpty(String string) {
        if (string.isEmpty()) {
            System.out.println("Given string is empty");
        }
        else {
            System.out.println("Given String is not empty");
        }
    }

    private void compareStrings(String hello, String hello1) {
        System.out.println("Given two Strings are equal : " + hello.equals(hello1));
    }

    private void concatenateListOfStrings() {
        System.out.println(String.join(",","Apple Banna Cheery"));
    }

    private void checkSubstringInString(String javaProgramming, String prog) {
        if (javaProgramming.contains(prog)) {
            System.out.println("Given sequence Found");
        }
        else {
            System.out.println("Given sequence not found");
        }
    }

    private void extractSubstringWithBeginAndEndIndex(String welcomeToJava, int i, int j) {
        System.out.println("Extracted substring from the given string " + welcomeToJava + " from the begin index " + i + " and end index " + j + " is : " + welcomeToJava.substring(i,j));
    }

    private void extractSubstring(String javaProgramming, int i) {
        System.out.println("Extracted substring from the given string " + javaProgramming + " from the begin index " + i + " is : " + javaProgramming.substring(i));
    }

    private void findLengthOfString(String openAI) {
        System.out.println("Length of the given string " + openAI + " is : " + openAI.length());

    }

    private void findCharAtIndex(String nmsWorks, int i) {
        System.out.println("Charcater in the given string " + nmsWorks + " at the position " + i + " is : " + nmsWorks.charAt(i));
    }

}
