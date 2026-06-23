package in.co.nmsworks.training.week2.day1;

import java.util.Arrays;

public class StringManipulation {
    public static void main(String[] args) {
        reverseSentence();
        findPalindrome();
        evenLengthString();
        newLineSentence();
        countOfVowelsConsonants();
        removeSpace();
        longWordInSentence();
        reverseString();
        changeTitleCase();
        replaceLeadingZero();
        removeDuplicate();

    }

    private static void removeDuplicate() {
        String str = "aabbcc";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (result.indexOf(ch)==-1){
                result = result + ch ;
            }
        }
        System.out.println("After removal of duplicates :"+result);
    }

    private static void replaceLeadingZero() {
        String input = "000540";
        System.out.println("input :: " + input);
        while(input.length() > 0 && input.charAt(0) == '0'){
            input = input.substring(1);
        }
        System.out.println("output :: " + input);
    }

    private static void changeTitleCase() {
        String input = "the quick brown fox jumps over the lazy dog";
        String[] str;
        String ch;
        String str1="";
        str = input.split(" ");
        for(String i : str){
            ch = i.substring(0,1).toUpperCase();
            String sec=i.substring(1).toLowerCase();
            str1 = str1 + ch + sec+ " ";
        }
        System.out.println("Title case "+str1);
    }

    private static void reverseString() {
            String input = "happy";
            String output = "";
            System.out.println("input: " + input);
            System.out.println("output : ");
            for (int i = 0; i < input.length(); i++) {
                output = input.charAt(i) + output;
            }
        System.out.println("the reveesed string is :: " + output);
    }

    private static void longWordInSentence() {
        String input = "The quick brown fox jumps over the lazy dog";
        System.out.println("input :: " + input);
        String[] str;
        str = input.split(" ");
        int max = 0;
        int index = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() >= max){
                max = str[i].length();
                index = i;
            }
        }
        System.out.println("longest word:: " + str[index]);

    }

    private static void removeSpace() {
        String input = "sanjeev is a trainer";
        System.out.println("input :: " + input);
        input.replace(" ","");
        System.out.println("output for removed spaces:: " + input);
    }

    private static void countOfVowelsConsonants() {
        String input = "hello world";
        input.replace(" ","");
        int countVowel = 0;
        int countConsonant = 0;
        char a;
        System.out.println("input : " + input);
        for (int i = 0; i < input.length(); i++) {
            a = input.charAt(i);
            if(a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U' || a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u')
                countVowel ++;
            else
                countConsonant ++;

        }
        System.out.println("vowels :: " + countVowel);
        System.out.println("consonants :: " + countConsonant);

    }

    private static void newLineSentence() {
        String input = " The early morning sun cast a golden hue over the quiet village, where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach.";
        String[] str;
        System.out.println("input : " + input);
        str = input.split("\\.");
        System.out.println("output:");
        for (String i : str ) {
            System.out.println(Arrays.toString(str));
        }

    }

    private static void evenLengthString() {
        String str = "Anas is a good boy";
        System.out.println("input: " + str);
        String[] a;
        a = str.split(" ");
        System.out.println("output for even length string:: ");
        for (String i : a) {
            if ( i.length() % 2 == 0 ){
                System.out.println(i);
            }
        }
    }

    private static void findPalindrome() {
        String input = "dad";
        String output = "";
        System.out.println("input: " + input);
        System.out.println("output : ");
        for (int i = 0; i < input.length(); i++) {
            output = input.charAt(i) + output;
        }
        if (input.equals(output)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }

    private static void reverseSentence() {
        String input = "India is my country";
        String[] str;
        System.out.println("input :: " + input);
        str = input.split(" ");
        System.out.println("output for reversed sentence :: ");
        for (int i = str.length - 1; i >= 0; i--) {
            System.out.print(str[i] + " ");

        }
    }




}
