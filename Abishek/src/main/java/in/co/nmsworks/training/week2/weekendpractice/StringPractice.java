package in.co.nmsworks.training.week2.weekendpractice;

import java.util.ArrayList;
import java.util.List;

public class StringPractice {
    public static void main(String[] args) {
        StringPractice sp = new StringPractice();
        sp.getCharacterByIndex("NMSWorks",5);
        sp.printLengthOfTheString("OpenAI");
        sp.printSubstring("Java Programming",5);
        sp.printSubstring("Welcome to Java",11,15);
        sp.printContainsSubStringInTheString("Java Programming","Prog");
        sp.concateStringsFromList();
        sp.checkTwoStringEqual("Hello","hello");
        sp.checkStringIsEmpty("");
        sp.checkStringIsEmpty(" ");
        sp.addTwoString("Hello"," World");
        sp.replaceSpecificCharInTheString("banana",'a','o');
        sp.checkIgnoreCaseTwoStringEqual("Hello","hello");
        sp.splitStringBasedOnDelimeter("one,two,three",",");
        sp.splitStringBasedOnDelimeter("apple;banana;cherry;date",";",3);
        sp.printFirstOcuurenceOfACharacterInString("Programming",'g');
        sp.printFirstOcuurenceOfSubStringInString("welcome to the world","the",10);
        sp.convertStringToLowerCase("Java Programming");
        sp.convertStringToUpperCase("Welcome to Java");
        sp.convertIntegerToString(1234);
    }

    private void convertIntegerToString(int number) {
        String answer = String.valueOf(number);
        System.out.println(answer);
    }

    private void convertStringToUpperCase(String word) {
        System.out.println(word.toUpperCase());
    }

    private void convertStringToLowerCase(String word) {
        System.out.println(word.toLowerCase());
    }

    private void printFirstOcuurenceOfSubStringInString(String word, String key, int stIndex) {
        System.out.println(word.indexOf(key,stIndex));
    }

    private void printFirstOcuurenceOfACharacterInString(String s, char ch) {
        System.out.println(s.indexOf(ch));
    }

    private void splitStringBasedOnDelimeter(String s, String delimiter, int limit) {
        String sArray[] = s.split(delimiter,limit);
        for (String str : sArray) {
            System.out.print(str+" ");
        }
        System.out.println();
    }

    private void splitStringBasedOnDelimeter(String s, String delimiter) {
        String[] sArray = s.split(delimiter);
        for (String str : sArray) {
            System.out.print(str+" ");
        }
        System.out.println();
    }

    private void checkIgnoreCaseTwoStringEqual(String word1, String word2) {
        if (word1.equalsIgnoreCase(word2)) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }
    }

    private void replaceSpecificCharInTheString(String str, char current, char replace) {
        String answer = str.replace(current,replace);
        System.out.println(answer);
    }

    private void addTwoString(String str1, String str2) {
        String answer = str1.concat(str2);
        System.out.println(answer);
    }

    private void checkStringIsEmpty(String word) {
        if (word.isEmpty())
            System.out.println("String is Empty");
        else
            System.out.println("String is not Empty");
    }

    private void checkTwoStringEqual(String word1, String word2) {
        if (word1.equals(word2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }

    private void concateStringsFromList() {
        List<String> fruits = new ArrayList<>(3);
        fruits.add(0, "apple");
        fruits.add(1, "banana");
        fruits.add(2, "chery");
        String answer = String.join(",",fruits);
        System.out.println(answer);
    }

    private void printContainsSubStringInTheString(String word, String key) {
        if (word.contains(key))
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }

    private void printSubstring(String word, int startIndex, int endIndex) {
        System.out.println(word.substring(startIndex,endIndex));
    }

    private void printSubstring(String word, int startIndex) {
        System.out.println(word.substring(startIndex));
    }

    private void printLengthOfTheString(String word) {
        System.out.println("Length of "+word+" :: "+word.length());
    }

    private void getCharacterByIndex(String word, int ind) {
        System.out.println(word.charAt(ind));
    }
}