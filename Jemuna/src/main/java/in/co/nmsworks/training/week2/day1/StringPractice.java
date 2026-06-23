package in.co.nmsworks.training.week2.day1;
import java.lang.String;
import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
        vowelConsonantCount();
        reverseString();
        palindrome();
        printStringWithEvenLength();
        printTheSentenceReversely();
        printParaNewLine();
        removeAllSpaces();
        longestWordInSentence();
        capitalizeFirstWord();
        removeLeadingZero();
        removeDuplicate();
        frequencyOfCharacter();
        countOfVowelsConsonantsDigitSpace();


    }

    private static void countOfVowelsConsonantsDigitSpace() {
        int vowels=0;
        int consonant=0;
        int digit=0;
        int space=0;
        String str="This website is aw3som3.";
        System.out.println("Count Of Vowels Consonants Digits and Space");
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            char A=Character.toLowerCase(a);
            if (A >= 'a' && A <= 'z') {
                if (A == 'a' || A == 'e' || A == 'i' || A == 'o' || A == 'u') {
                    vowels += 1;
                } else {
                    consonant += 1;
                }
            }
            else if(a>='0' && a<='9'){
                digit+=1;
            }

            else if(a==' '){
                space+=1;
            }

        }
        System.out.println("Vowel = "+vowels);
        System.out.println("Consonants = "+consonant);
        System.out.println("Digit = "+digit);
        System.out.println("Space = "+space);


    }

    private static void frequencyOfCharacter() {
        String s="This website is awesome.";
        System.out.println("Printing the frequency Of Character");
        char search='e';
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch==search){
                count+=1;
            }
        }
        System.out.println("The frequency of e: "+ count);

    }

    private static void removeLeadingZero() {
        String str = "0005640";
        System.out.println("Remove Leading Space");
        int i=0;
        while(i<str.length() && str.charAt(i) == '0'){
            i++;
        }
        System.out.println("The string after removing the leading zeros: "+str.substring(i));
    }

    private static void removeDuplicate(){
        System.out.println("Remove Duplicates from the string");
        String str = "aabbcc";
        String result = "";
        for (int i = 0; i < str.length() ; i++) {
            char ch=str.charAt(i);
            if(result.indexOf(ch) == -1){
                result += ch;
            }
        }
        System.out.println("After removing duplicates: " + result);

    }


    private static void capitalizeFirstWord() {
        System.out.println("Capitalize the first word");
        String s="the quick brown fox jumps over the lazy dog";
        String[] newStr= s.split(" ");
        for(String i: newStr){
            String a = i.substring(0, 1).toUpperCase() + i.substring(1);
        }
    }

    private static void longestWordInSentence() {
        System.out.println("Longest word in the Sentence");
        String s="The quick brown fox jumps over the lazy dog";
        String[] newStr= s.split(" ");
        String newRes="";
        for(String i: newStr){
          if (i.length()>newRes.length()){
            newRes=i;

          }
        }
        System.out.println("The Longest Word: "+newRes);

    }

    private static void removeAllSpaces() {
        System.out.println("Remove All spaces from the string ");
        String a = " Jemuna is a Software Developer";
        String newStr = "";
        for (int i = 0; i < a.length(); i++) {
            char currentChar = a.charAt(i);
            if (currentChar != ' ') {
                newStr += currentChar;
            }
        }

        System.out.println(newStr);
    }



    private static void printParaNewLine() {
        System.out.println("Printing the paragraph in new line");
        String s="The early morning sun cast a golden hue over the quiet village, where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach.";
        String[] newStr= s.split("\\.");
        for (int i = 0; i<newStr.length; i++) {
            System.out.println(newStr[i]);
        }

    }


    private static void printTheSentenceReversely() {
        String s = "India is my country";
        String[] newStr= s.split(" ");
        String reversedSen="";
        for (int i = newStr.length-1; i>=0; i--) {
            reversedSen=reversedSen+newStr[i]+" ";
        }
        System.out.println(reversedSen);

    }

    private static void printStringWithEvenLength() {
        String s = "This is a java language";
        System.out.println("Printing String with Even length");
        String[] newStr= s.split(" ");
        System.out.println(Arrays.toString(newStr));
        int a= newStr.length;
        for (int i = 0; i < newStr.length; i++) {
            if(newStr[i].length()%2==0){
                System.out.println(newStr[i]);
            }
        }

    }

    private static void palindrome() {
        String a = "dad";
        String newCreateStr="";
        for (int i = a.length() - 1; i >= 0; i--) {
            char b = a.charAt(i);
            newCreateStr = newCreateStr+b;
        }
        if(a.equals(newCreateStr)){
            System.out.printf("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }

    private static void reverseString() {
        String a = "Dad";
        String newCreateStr="";
        for (int i = a.length() - 1; i >= 0; i--) {
            char b = a.charAt(i);
            newCreateStr = newCreateStr+b;
        }
        System.out.println("The reverse String :" + newCreateStr);

    }

    private static void vowelConsonantCount() {
        int vowels=0;
        int consonant=0;
        System.out.println("Count of vowels and Consonant");
        String str="Hello World";
        String lowerCaseStr=str.toLowerCase();
        for (int i = 0; i < lowerCaseStr.length(); i++) {
            char a = lowerCaseStr.charAt(i);
            if (a >= 'a' && a <= 'z') {
                if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                    vowels += 1;
                } else {
                    consonant += 1;
                }
            }
        }
        System.out.println("Vowel = "+vowels);
        System.out.println("Consonants = "+consonant);
    }



}
