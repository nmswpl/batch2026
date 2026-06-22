package in.co.nmsworks.training.week1.day3;
import javax.crypto.spec.PSource;
import java.util.*;
public class StringManipulationPraactice {

    public static void main(String args[])
    {
        reverseString();
        checkPalindrome();
        printAllWordsInEvenLength();
        removeLeadingZero();
        printInNewLine();
        countVowelsAndConsonants();
        removeDuplicate();
        convertTitleCase();
        findLongestWord();
        stringReverse();
        removeSpace();
    }

    private static void removeSpace() {
        String content = "I am a good boy";
        String split[] = content.split(" ");
        for(int i = 0;i < split.length; i++)
        {
            System.out.print(split[i]);
        }
    }

    private static void stringReverse() {
        String Name = "India";
        int i = Name.length()-1;
        while (i >= 0)
        {
            System.out.println(Name.charAt(i));
        }
    }

    private static void findLongestWord() {
        String title = "The quick brown fox jumps over the lazy dog";
        String split[] = title.split(" ");
        int n = split.length;
        int arr[] = new int[n];
        for(int i = 0; i < split.length; i++)
        {
            arr[i] = split[i].length();
        }
        int max = 0;
        int index = 0;
        for(int i = 0;i < arr.length; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
                index = i;
            }
        }
        System.out.println( split[index] );
    }

    private static void convertTitleCase() {
        String title = "the quick brown fox jumps over the lazy dog";
        String split[] = title.split(" ");
        for(int i = 0; i < split.length; i++)
        {
            char ch = split[i].charAt(0);
            String character = String.valueOf(ch);
            System.out.print(character.toUpperCase());
            for (int j = 1;j < split[i].length(); j++)
            {
                System.out.print(split[i].charAt(j));
            }
            System.out.print(" ");
        }
    }

    private static void removeDuplicate() {
        HashSet<Character> ch = new HashSet<Character>();
        String text = "aabbcc";
        for(int i = 0;i < text.length(); i++) {
            ch.add(text.charAt(i));
        }
        for(char c:ch)
        {
            System.out.print(c);
        }
    }

    private static void countVowelsAndConsonants() {
        int vowel = 0, consonant = 0, m=0;
        String value = "Hello World";
        String upper = value.toUpperCase();
        for(int i = 0; i < upper.length(); i++) {
            char upperCase = upper.charAt(i);

            if (upperCase == 'A' || upperCase == 'E' || upperCase == 'I' || upperCase == 'O' || upperCase == 'U') {
                vowel++;
            }
            else if (Character.isLetter(upperCase)) {
                consonant++;
            }
            else {
                m=0;
            }
        }
        System.out.println("Vowels: "+vowel+ " , Consonants: "+consonant);
    }

    private static void printInNewLine() {
        String content = "The early morning sun cast a golden hue over the quiet village, where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach. ";
        String split[] = content.split("\\.");
        for (int i = 0; i < split.length; i++)
        System.out.println(split[i]);

//        System.out.println(split.length);
    }

    private static void removeLeadingZero() {
        String number = "0005640";
        int flag = 0;
        for(int i = 0; i < number.length(); i++)
        {
            char ch = number.charAt(i);
            if(ch == '0' && flag == 0)
            {
                continue;
            }
            else
            {
                flag = 1;
                System.out.print(ch);
            }
        }
    }

    private static void printAllWordsInEvenLength() {
        String content = "This is a Java Language";
        String[] split = content.split(" ");
        for(int i = 0; i < split.length; i++)
        {
            if(split[i].length() % 2 == 0)
            {
                System.out.println(split[i]);
            }
        }
    }

    private static void checkPalindrome() {
        String value = "dad";
        int i = 0, j = 0,flag=0;
        while(i < j)
        {
            if(value.charAt(i) == value.charAt(j))
                continue;
            else
                flag=1;
        }
        if(flag == 1)
        System.out.println("The word "+value+" is not a palindrome");
        else
            System.out.println("The word "+value+" is palindrome");
    }

    private static void reverseString() {
        String content = "India is my country";
        String[] split = content.split(" ");
        for(int i = split.length - 1; i >= 0; i--)
        {
            System.out.print(split[i]+" ");
        }
    }

}
