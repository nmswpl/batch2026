package in.co.nmsworks.training.week2.day1;

public class StringManipulation {
    public static void main(String[] args) {
        reverseString();
        checkPalindrome();
        printEvenLength();
        leadingZero();
        vowelsAndConsonants();
        printSentenceInNewLine();
        removeDuplicates();
        toTitleCase();
        longestWord();
        reverseStringWithOutBuildIn();
        removeSpaces();
    }

    private static void removeSpaces() {
        String s = "This is java language";
        String strWithoutSpace = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' '){
                strWithoutSpace += s.charAt(i);
            }
        }
        System.out.println("String without Spaces : " + strWithoutSpace);
    }

    private static void reverseStringWithOutBuildIn() {
        String s = "This is java language";
        String rev = "";
        for (int i = s.length()-1; i >= 0 ; i--) {
            rev += s.charAt(i);
        }
        System.out.println("Reverse a String without Build In method : " +rev);
    }

    private static void longestWord() {
        String str = "The quick brown fox jumps over the lazy dog";
        String[] myStrArr = str.split(" ");
        int maxIndex = 0;
        for (int i = 1; i < myStrArr.length; i++) {
            if (myStrArr[i].length() >= myStrArr[i-1].length() && myStrArr[i].length() >= myStrArr[maxIndex].length() ){
                maxIndex = i;
            }

        }
        System.out.println("Longest Word : "+myStrArr[maxIndex]);


    }

    private static void toTitleCase() {
        String str = "the quick brown fox jumps over the lazy dog";
        String[] myStrArr = str.split(" ");
        String newStr = " ";
        for (int i = 0; i < myStrArr.length; i++) {
            for (int j = 0; j < myStrArr[i].length(); j++) {
                char ch = myStrArr[i].charAt(j);
                if (j == 0){
                    newStr += String.valueOf(ch).toUpperCase();
                }
                else {
                    newStr += String.valueOf(ch);
                }
            }
            newStr += " ";
        }
        System.out.println("Convert to title case : "+newStr);

    }

    private static void removeDuplicates() {
        String str = "aabbcc";
        String withOutDuplicates = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (withOutDuplicates.contains(String.valueOf(ch))){
                continue;
            }
            else {
                withOutDuplicates += ch;
            }
        }
        System.out.println("Removing Duplicates : "+withOutDuplicates);
    }

    private static void leadingZero() {
        String str = "0005640";
        String withOutZero = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0'){
                withOutZero += str.substring(i);
                break;
            }
        }
        System.out.println("Without Zero : "+withOutZero);


    }

    private static void printSentenceInNewLine() {
        String para = "The early morning sun cast a golden hue over the quiet village, where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach.";
        String[] sentence = para.split("\\.");
        for (String s : sentence) {
            System.out.println(s);

        }
    }

    private static void vowelsAndConsonants() {
        String str = "Hello World";
        int vowels= 0;
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch =='I' || ch == 'O' || ch == 'U'){
                vowels ++;
            }
            else if (ch == ' ') {
                continue;
            }
            else {
                consonants ++;
            }

        }
        System.out.println("Vowels = "+vowels);
        System.out.println("Consonants = "+consonants);
    }

    private static void printEvenLength() {
        String s = "This is java language";
        String[] myStr = s.split(" ");
        for (int i = 0; i < myStr.length; i++) {
            if(myStr[i].length() % 2 == 0){
                System.out.println("The Even length Strings are : "+myStr[i]);
            }


        }
    }

    private static void checkPalindrome() {
        String str = "madam";
        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            reverse += ch;

        }
        if(str.equals(reverse)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }

    private static void reverseString() {
        String str = "India is my Country";
        String reverse = "";
        String[] myStrArray = str.split(" ");

        for (int i = myStrArray.length-1; i >= 0; i--) {

            for (int j = 0; j < myStrArray[i].length(); j++) {
                char ch = myStrArray[i].charAt(j);
                reverse += ch;
            }
            reverse += " ";

        }
        System.out.println("Reverse a String : "+reverse);
    }
}

