package in.co.nmsworks.training.week2.day1;

public class StringManipulation {
    public static void main(String [] args)
    {
        reverseWords("India is my country");
        checkPalindrome("moo");
        separateSentence("The early morning sun cast a golden hue. over the quiet village. where the scent of blooming jasmine mingled with the crisp, cool air. ");
        removeLeadingZeros("0000345");
        printEvenWords("This is a java language");
        removeSpaces("This is a java language");
        wordFirstCapital("the quick brown fox jumps over the lazy dog");
        countVowelConsonants("Hello World");
        longestWord("The quick brown fox jumps over the lazy do");
          removeDuplicates("aabdbccdd");
    }

    public static void reverseWords(String s1)
    {
        String str[]=s1.split("``.");

        for (int i = str.length-1; i >= 0; i--) {
            System.out.println(str[i]+" ");
        }
        System.out.println();
    }

    public static void checkPalindrome(String s1)
    {
        String rev="";
        for(int i=s1.length()-1;i>=0;i--)
        {
            rev = rev + s1.charAt(i);
        }
        if(!s1.equals(rev)){
            System.out.println("Not a palindrome");
        }
        else {
            System.out.println("Palindrome");
        }
    }

    public static void printEvenWords(String a1)
    {
        String str[]=a1.split("\\.");
        for (int i = 0 ; i < str.length;i++)
        {
            if(str[i].length() % 2 == 0)
            {
                System.out.println(str[i]);
            }
        }
    }

    public static void removeLeadingZeros(String s3)
    {
        int i=0;
        while (i < s3.length()-1 && s3.charAt(i) == '0')
        {

            i++;
        }
        System.out.println(s3.substring(i));

    }
    public static void separateSentence(String s4)
    {
        String sentence[] = s4.split("\\.");
        for (String s : sentence) {
            System.out.println(s);
        }
        System.out.println();
    }
    public static void countVowelConsonants(String s5)
    {
        String str=s5.toLowerCase();
        int vowels=0;
        int consonants=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='a'||str.charAt(i)>='z')
            {

                if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
                {
                    vowels++;
                }
                else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels : "+vowels+" Consonants : "+consonants);

    }

    public static void removeSpaces(String s6)
    {
        String newStr=s6.replace(" ","");
        System.out.println(newStr);
    }

    public static void removeDuplicates(String str)
    {

        int freq[]=new int[256];
        for (char c : str.toCharArray()) {
            if(freq[c]==0)
            {
                System.out.print(c);
            }
            freq[c]++;
        }


    }



    public static void wordFirstCapital(String s7)
    {
        String[] str = s7.split(" ");

        for (int i = 0; i < str.length; i++) {

            String result = Character.toUpperCase(str[i].charAt(0))+ str[i].substring(1);

            System.out.print(result +" ");
        }
    }

    public static void longestWord(String s8)
    {
        String [] str=s8.split(" ");
        int maxlength=0;
        String maxStr="";
        for (String s : str) {
            if (maxlength <= s.length()) {
                maxlength = s.length();
                maxStr = s;
            }
        }
        System.out.println(maxStr);
    }

}
