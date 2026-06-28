package in.co.nmsworks.training.week2.weekendpractice;

import java.util.ArrayList;
import java.util.List;

public class StringMethodPractice {
    public static void main(String[] args) {

        printCharIndex("NMSWorks",5);
        printSringLength("OpenAI");
        printSubstringWithBeginIndex("Java Programming",5);
        printSubstringWithBothIndex("Welcome to Java",11,15);
        checkSubstringPresentOrNot("Java Programming","Prog");
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        joiningListArray(fruits);
        checkEqualStrings("hello" , "Hello");
        checkStringEmptyOrNot(" ");
        concatenatingStrings("Hello","World");
        replacingWordInString("Banana",'o');
        checkEqualStringsIgnoringCase("hello","HELLO");
        splitingString("One,Two,Three",",");
        splitingStringWithLimit("apple;banana;cherry;date",";",3);
        printFirstOccurence("Programming",'g');
        printFirstOccurenceOfSubstring("welcome to the world","the", 10);
        printLowercaseOfString("Java Programming");
        printUppercaseOfString("welcome to Java");
        printValueOfString(1234);

    }

    private static void printValueOfString(Integer number) {
        String converted = String.valueOf(number);
        System.out.println(converted);
    }

    private static void printUppercaseOfString(String inputString) {
        System.out.println("The Uppercase of the String is :: " + inputString.toUpperCase());
    }

    private static void printLowercaseOfString(String inputString) {
        System.out.println("The Lowercase of the String is :: " + inputString.toLowerCase());
    }

    private static void printFirstOccurenceOfSubstring(String inputString, String substring, Integer index) {
        System.out.println("The Index of the Substring is :: " + inputString.indexOf(substring,index));
    }

    private static void printFirstOccurence(String inputString, Character letter) {
        System.out.println("The Index of the First Occurence of " + letter + " in " + inputString + " is :: " + inputString.indexOf(letter));
    }

    private static void splitingStringWithLimit(String inputString, String delimter ,Integer limit) {
        String[] words = inputString.split(delimter,3);
        for (String word : words){
            System.out.println(word);
        }
    }

    private static void splitingString(String inputString, String delimiter) {
        String[] words = inputString.split(delimiter);
        for (String word : words){
            System.out.println(word);
        }
    }




    private static void checkEqualStringsIgnoringCase(String firstString, String secondString) {
        System.out.println(firstString.equalsIgnoreCase(secondString) ? "The Strings are Equal ignoring case" : " The Strings are Not Equal ignoring case");
    }

    private static void replacingWordInString(String inputString, char replacingWord) {
        System.out.println("The Replaced String is :: " + inputString.replace('a','o'));
    }

    private static void concatenatingStrings(String firstString, String secondString) {
        System.out.println("The Concatenated String is :: " + firstString.concat(secondString));
    }

    private static void checkStringEmptyOrNot(String inputString) {
        System.out.println(inputString.isEmpty() ? "The Given String is Empty" : "The Given String is not Empty");
    }

    private static void checkEqualStrings(String firstString, String secondString) {
        System.out.println("The Equality of the Two Given Strings is :: " + firstString.equals(secondString));
    }

    private static void joiningListArray(List<String> inputList) {
        System.out.println(String.join("," , inputList));
    }


    private static void checkSubstringPresentOrNot(String inputString, String substring) {
        if(inputString.contains("Prog")){
            System.out.println("Found");
        }
        else {
            System.out.println("Not Found");
        }
    }

    private static void printSubstringWithBothIndex(String inputString, int beginIndex, int endIndex) {
        System.out.println("The Substring after extracting is :: " + inputString.substring(beginIndex,endIndex));
    }

    private static void printSubstringWithBeginIndex(String inputString, Integer beginIndex) {
        System.out.println("The substring begin in index " + beginIndex  + " is :: " + inputString.substring(beginIndex));
    }

    private static void printSringLength(String inputString) {
        System.out.println("The length of the given string :" + inputString + " is :: " + inputString.length());
    }

    private static void printCharIndex(String inputString,Integer index) {
        System.out.println("The Index no: " + index + " of the given string is :: " + inputString.charAt(index));
    }

}
