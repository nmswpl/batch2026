package in.co.nmsworks.training.week2.practice;

import java.sql.SQLOutput;

public class StringMethodPractice {
    public static void main(String[] args) {
        characterOfIndex();
        lengthOfString();
        substringFromBegin();
        substringFromBeginAndEndIndex();
        containsSubstring();
        checkStringsAreEqual();
        checkStringsAreEqualIgnoreCase();
        checkStringIsEmpty();
        stringConcat();
        replaceChar();
        changeLowerCase();
        changeUpperCase();
        integerToString();
        stringToSplitArray();
        firstOccurenceOfCharacter();
        firstOccurenceOfCharacterAfterBeginIndex();


    }

    private static void firstOccurenceOfCharacterAfterBeginIndex() {
        String s="welcome to the world";
        System.out.println(s.indexOf("the",10));
    }

    private static void firstOccurenceOfCharacter() {
        String str="Programming";
        System.out.println(str.indexOf('g'));
    }

    private static void stringToSplitArray() {
        String s="one,two,three";
        String [] sArr=s.split(",");
        for (int i = 0; i < sArr.length; i++) {
            System.out.print(sArr[i]+" ");
        }
        System.out.println();
    }

    private static void integerToString() {
        int num=1234;
        String s=String.valueOf(num);
        System.out.println(s);
    }

    private static void changeUpperCase() {
        String s2="welcome to java";
        System.out.println(s2.toUpperCase());
    }

    private static void changeLowerCase() {
        String s1="Java Programming";
        System.out.println(s1.toLowerCase());
    }

    private static void replaceChar() {
        String str="Banana";
        System.out.println(str.replace('a','o'));
    }

    private static void stringConcat() {
        String s1="Hello";
        String s2=" World";
        System.out.println(s1.concat(s2));
    }

    private static void checkStringIsEmpty() {
        String s1=" ";
        if(s1.isEmpty())
        {
            System.out.println("String is empty");
        }
        else {
            System.out.println("Not empty");
        }
    }

    private static void checkStringsAreEqualIgnoreCase() {
        String s1="Hello";
        String s2="hello";
        if(s1.equalsIgnoreCase(s2))
        {
            System.out.println("Equal");
        }
        else {
            System.out.println("not equal");
        }
    }

    private static void checkStringsAreEqual() {
        String s1="Hello";
        String s2="hello";
        if(s1.equals(s2))
        {
            System.out.println("Equal");
        }
        else {
            System.out.println("not equal");
        }
    }

    private static void containsSubstring() {
        String s4="Java Programming";
        if(s4.contains("Prog"))
        {
            System.out.println("Given Substring Found");
        }
        else {
            System.out.println("Not Found");
        }
    }

    private static void substringFromBeginAndEndIndex() {
        String s3="Welcome to Java";
        System.out.println("Substring of "+s3+" from begin index 11 and end index 15: "+s3.substring(11,15));
    }

    private static void substringFromBegin() {
        String s2="Java Programming";
        System.out.println("Substring of "+s2+" from begin index 5: "+s2.substring(5));
    }

    private static void lengthOfString() {
        String s1="OpenAI";
        System.out.println("Length of the String: "+s1+" "+s1.length());
    }

    private static void characterOfIndex() {
        String s="NMSWorks";
        System.out.println("Character at index 5:  "+s+" "+s.charAt(5));
    }
}
