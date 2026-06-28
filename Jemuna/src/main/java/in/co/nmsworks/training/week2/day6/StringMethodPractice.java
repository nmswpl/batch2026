package in.co.nmsworks.training.week2.day6;

import java.util.Arrays;

public class StringMethodPractice {
    public static void main(String[] args) {
        charAtIndex();
        lengthOfTheString();
        substringOfStringwithBeginIndex();
        substringOfString();
        checkUsingContains();
        concatenateStringUsingJoins();
        comparingString();
        checkForEmptyString();
        stringConcatenation();
        replaceCharOfString();
        compareStringIgnoreCase();
        splitStringUsingDelimiters();
        substringOfStringWithLimit();
        findIndexOfString();
        printStartEndIndexOfString();
        lowerCaseOfString();
        upperCaseOfString();
        intToStringConversion();


    }

    private static void intToStringConversion() {
        int input = 1234;
        System.out.println("The String for 1234 is : "+ String.valueOf(input));
    }

    private static void upperCaseOfString() {
        String input =  "welcome to Java";
        System.out.println("The uppercase of '"+input+"' is : "+input.toUpperCase());
    }

    private static void lowerCaseOfString() {
        String input = "Java Programming";
        System.out.println("The lowercase of '"+input+"' is : "+input.toLowerCase());
    }

    private static void printStartEndIndexOfString() {
        String string = "welcome to the world";
        String substring = "the";
        System.out.println("Index of the substring '"+substring+"' at the String '"+string+"' is "+string.indexOf(substring,10));

    }

    private static void findIndexOfString() {
        String input =  "programming";
        System.out.println("Index of 'g' at 'programming' is : "+ input.indexOf('g'));

    }

    private static void substringOfStringWithLimit() {
        String input = "apple;banana;cherry;date" ;
        String[] result = input.split(";",3);
        System.out.println("Substring of the String: "+input+" is :"+Arrays.toString(result));
    }

    private static void splitStringUsingDelimiters() {
        String input = "one,two,three";
        System.out.println("Before Splitting : "+input);
        System.out.println("After Splitting : " + Arrays.toString(input.split(",")));
    }

    private static void compareStringIgnoreCase() {
        String a = "Hello";
        String b = "hello";
        System.out.println("Strings Hello and hello are equal by Ignoring case : "+a.equalsIgnoreCase(b));

    }

    private static void replaceCharOfString() {
        String input = "banana";
        String result = input.replace('a','o');
        System.out.println("Replacing the 'a' with 'o' in the string "+input+" gives "+result );
    }

    private static void stringConcatenation() {
        String a = "Hello";
        String b = "World";
        System.out.println("Concatenation of "+ a + "and "+ b+ "is "+a.concat(b));
    }

    private static void checkForEmptyString() {
        String input = " ";
        boolean result = input.isEmpty();
        System.out.print("The given String is : ");
        if(result){
            System.out.println("Empty");
        }
        else{
            System.out.println("Not Empty");
        }
    }

    private static void comparingString() {
        String a = "Hello";
        String b = "hello";
        System.out.println("Strings Hello and hello are equal : "+a.equals(b));
    }

    private static void concatenateStringUsingJoins() {
        System.out.println("Concatenating the string using delimiter");
        System.out.println(String.join(",","apple","banana","cherry"));
    }

    private static void checkUsingContains() {
        System.out.println("Finding whether Java Programming contains Prog or not");
        String input =  "Java Programming";
        boolean target = input.contains("Prog");
        if(target){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }

    private static void substringOfString() {
        String input =  "Welcome to Java" ;
        System.out.println("The substring of "+input+ " is "+input.substring(11,15));
    }

    private static void substringOfStringwithBeginIndex(){
        String input =  "Java Programming";
        System.out.println("The substring of "+input+ " is "+input.substring(5));
    }

    private static void lengthOfTheString() {
        String input = "OpenAI";
        System.out.println("Length of the String "+input+" is "+input.length());
    }

    private static void charAtIndex() {
        String input = "NMSWorks";
        System.out.println("The character at the index 5 is: "+ input.charAt(5));
    }
}
