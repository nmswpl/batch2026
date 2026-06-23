package in.co.nmsworks.training.week2.day1;

public class StringDemo {
    public static void main(String[] args) {
        checkPalindrome();
        reverseWords();
        wordsWithEvenLength();
        removeLeadingZeros();
        printSentenceInNewLine();

        removeDuplicate();
        countOfVowelsAndConsonants();
        reverseString();
        removeSpaces();
        longestWord();

        toTitleCase();


    }

    private static void toTitleCase() {
        String input = "the quick brown fox jumps over the lazy dog";
        String res = "";
        String[] temp = input.split(" ");

        for (String s : temp) {
            res = res + s.substring(0,1).toUpperCase();
            res = res + s.substring(1);
            res = res + " ";
        }

        System.out.println(res.trim());
    }

    private static void longestWord() {
        String input = "The quick brown fox jumps over the lazy dog";
        String[] temp = input.split(" ");
        String longestWord = "";

        for (String s : temp) {
            if(longestWord.length() <= s.length())
                longestWord = s;

        }
        System.out.println("Longest Word: "+longestWord);
    }

    public static void removeDuplicate() {
        String str = "aabbcc";
        String res = "";

        String[] temp = str.split("");
        for (String s : temp) {
            if(!res.contains(s))
                res = res + s;
        }

        System.out.println(res);
    }

    public static void removeSpaces() {
        String s = "Hi Hema B R ";

        System.out.println("After removing spaces: "+ s.replace(" ",""));
    }

    public static void reverseString() {
        String s = "Hello";
        String result = "";

        String[] temp = s.split("");

        for (int i = temp.length-1; i >= 0 ; i--) {
            result = result+temp[i];
        }

        System.out.println(result);

    }

    public static void countOfVowelsAndConsonants() {
        String s = "Hello World";
        int vowel = 0;
        int consonant = 0;

        String[] arr = s.split("");
        for (String string : arr) {
            if("aeiouAEIOU".contains(string))
                vowel++;
            else if("bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ".contains(string))
                consonant++;


        }

        System.out.println("Vowels : "+vowel);
        System.out.println("Consonants : "+consonant);
    }

    public static void printSentenceInNewLine() {
        String input = "The early morning sun cast a golden hue over the quiet village, where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach.";
        String[] result = input.split("\\.");
        for (String s : result) {
            System.out.println(s);
//            System.out.println("Hi");

        }
    }

    public static void removeLeadingZeros() {
        String s = "0005640";
        String result = "";
        int i;
        for ( i = 0; i < s.length(); i++) {
            if(s.charAt(i)!='0')
            {
                break;
            }
        }

        System.out.println(s.substring(i));

    }

    public static void wordsWithEvenLength() {
        String str = "Hello This is java language";
        String[] res = str.split(" ");
        for (String string : res) {
            if( string.length() % 2 == 0 )
                System.out.println(string);
        }

    }

    public static void checkPalindrome() {
        String str = "madam";

        for (int i = 0, j = str.length()-1; i <= j; i++) {
            if(str.charAt(i) != str.charAt(j))
            {
                System.out.println("Not Palindrome");
                return;
            }
            j--;
        }
        System.out.println("Palindrome");
    }

    public static void reverseWords() {
        String str = "India is my country";

        int i,j;
        String result = "";

        for (i = str.length()-1, j = i; i >= 0 ; i--) {
            if(str.charAt(i)==' ')
            {
                result = result + str.substring(i+1,j+1) + " ";
                j = i-1;
            }
        }
        result = result + str.substring(i+1,j+1);
        System.out.println(result);

    }
}
