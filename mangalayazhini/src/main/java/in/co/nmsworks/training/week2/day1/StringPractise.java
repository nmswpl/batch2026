package in.co.nmsworks.training.week2.day1;

import jdk.nashorn.internal.parser.JSONParser;

import java.sql.SQLOutput;

public class StringPractise {
    public static void main(String[] args) {


        String paragraph = "The early morning sun cast a golden hue over the quiet village, where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach. ";
        StringPractise obj = new StringPractise();
        obj.reverseWordsOfSentence("India is my country");
        obj.reverseWordsOfSentence("I am from Tamil Nadu");

        obj.checkPalindromeOrNot("dad");
        obj.checkPalindromeOrNot("father");

        obj.printWordsWithEvenLength("This is a java programming class");
        obj.printWordsWithEvenLength("I am from Tamil Nadu");

        obj.countVowelsAndConsonants("Hello World");

        obj.removesLeadingZeros("000056780");

        obj.printSentenceInNewline(paragraph);

        obj.removeDuplicateChars("abcaabb");

        obj.captilizeFirstLetter("this is java class");

        obj.findLongestWord("This is a java programming class");

        obj.reverseWordUsingLoop("java");

        obj.removeSpaces("Java is OOP langauge.");





    }


    /** Reverse the words in a sentence */
    void reverseWordsOfSentence(String str) {
        String reversedStr  = "";

        String[] words = str.split(" ");
        //  System.out.println(words.length);
        for (int i = words.length-1; i >= 0; i--) {
            //  System.out.println(words[i]);

            reversedStr = reversedStr  +  words[i] + " ";
        }

        System.out.println("\nReversing a String : ");
        System.out.println("Original String : " + str);
        System.out.println("Reversed String : " + reversedStr);
    }

    /** Reverse a Word */
    String reverseWord(String word){
        String reversedWord = "";
        for (int i = word.length()-1; i >=0 ; i--) {
            reversedWord += word.charAt(i);
        }

        System.out.println("\nReversing a Word :");
        System.out.println("Original Word : "+word);
        System.out.println("Reversed Word : " + reversedWord);
        return reversedWord;
    }

    /** Checking weather a palindrome or not */
    void checkPalindromeOrNot(String str){
        String reversedStr = reverseWord(str);

        System.out.println("\nChecking whether a word is palindrome or not");
        System.out.print("String : " + str + " ::");
        if(str.equals(reversedStr)) {

            System.out.println("The String is a Palindrome");
        }
        else{
            System.out.println("The String is not a Palindrome");
        }
    }

    /** Print the words with even length */
    void printWordsWithEvenLength(String str){
        String[] words = str.split(" ");

        System.out.println("\nPrinting the words with even length");
        System.out.println("Original sentence : "+str);
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() %2 == 0){
                System.out.println(words[i]);
            }

        }

    }


    /** Count the vowels and consonant */
    void countVowelsAndConsonants(String str){
        int vowelCount= 0 ;
        int consonantCount = 0 ;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                vowelCount++;
            }
            else if(str.charAt(i) == ' ' || str.charAt(i) == '*' ) {

            }
            else{
                consonantCount++;
            }
        }
        System.out.println("\nCount of vowels and consonants in a String");
        System.out.println("vowel : " + vowelCount);
        System.out.println("consonant : " + consonantCount);
    }

    /** Removes the leading 0 in a String */

    void removesLeadingZeros(String str)
    {
        int i = 0  ;
        while( i < str.length() && str.charAt(i) == '0'){
            i++;
        }

        String correctedStr = str.substring(i);
        System.out.println("\nRemoving leading zeros");
        System.out.println("Original String : " + str);
        System.out.println("Leading zeros removed : " + correctedStr);
    }

    void printSentenceInNewline(String passage){
        String[] line = passage.split("\\.");
        System.out.println("\nPrinting passage line by line : \n");
        for (int i = 0; i < line.length ; i++) {
            System.out.println(line[i]);
        }
    }


    void removeDuplicateChars(String str){
        String uniqueStr = "";
        char ch ;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if(uniqueStr.indexOf(ch) == -1) {
                uniqueStr += ch;
            }
        }
        System.out.println("\nOriginal String : " + str);
        System.out.println("Duplicates removed String : "+uniqueStr);
    }


    void captilizeFirstLetter(String sentence){
        String[] words = sentence.split(" ");
        String str = "";
        for(String s : words ){
            str +=  " " + Character.toUpperCase(s.charAt(0)) + s.substring(1);
        }

        System.out.println("\nOriginal String : " + sentence);
        System.out.println("First character captilized  : " + str);
    }

    void findLongestWord(String sentence){
        String[] words = sentence.split(" ");
        int maxLength = words[0].length();
        int maxIdx = 0 ;
        int len ;
        for (int i = 0; i < words.length; i++) {
            len = words[i].length();
            if(len > maxLength){
                maxLength = len ;
                maxIdx = i;
            }
        }

        System.out.println("\nLongest word in a sentence");
        System.out.println("Sentence : "+sentence);
        System.out.println("The longest word is  : " + words[maxIdx]);
    }


    void reverseWordUsingLoop(String str){
        String reversedString = "";
        for(int i=str.length()-1 ; i >=0 ; i--){
            reversedString += str.charAt(i) ;
        }
        System.out.println("\nReversing a String : ");
        System.out.println("Original String : " + str);
        System.out.println("Reversed String : " + reversedString);
    }


    void removeSpaces(String str){
        System.out.println("\nRemoves spaces in the String :");
        System.out.println("Original String : " + str);
        System.out.println("Spaces removed String : "+ str.replace(" ", ""));
    }




}
