package in.co.nmsworks.training.week2.day1;

public class StringPractice {
    public static void main(String[] args) {
        stringreverse();
        isPalindrome();
        isEvenLength();
        removeZeroes();
        newParagraph();
        isVowels();
        removeDuplicates();
        toCapitalize();
        longestword();
        reverseBruteforce();
        removespaces();
    }

    private static void stringreverse() {
        String orginal ="India is my country ";
        //String b = a.reverse;
        String [] word = orginal.split(" ");
        StringBuilder output=new StringBuilder();

        for(int i = word.length-1;i>=0;i--)
        {
            output.append(word[i]);

            if(i>0){
                output.append(" ");
            }
            System.out.println(output);
        }

    }

    public static void isPalindrome() {

        String original="DAD";
        String out="";

        for(int i=original.length()-1;i>=0;i--)
        {
            out+=original.charAt(i);

        }
        if(original.equalsIgnoreCase(out)) {
            System.out.println(original+" Is a palindrome");
        }
        else{
            System.out.println(original+" Is not a palaindrome");
        }

    }
    public static void isEvenLength()
    {
        String orginal="This is a java language";
        String [] words= orginal.split(" ");

        for(String word:words)
        {
            if(word.length()%2 == 0)
            {
                System.out.println(word);
            }
        }

    }
    public static void removeZeroes(){
        String original="000001827";
        int a= Integer.parseInt(original);
        System.out.println(a);
    }

    public static void newParagraph()
    {
        String input="The early morning sun cast a golden hue over the quiet village, where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach.";
        String [] output = input.split("(?<=[.!?])\\s+");
        for(String i:output){
           System.out.println(i);

        }
    }

    public static void isVowels()
    {

                String input = "Hello World";

                int vowels = 0;
                int consonants = 0;

                String lowerInput = input.toLowerCase();

                for (int i = 0; i < lowerInput.length(); i++) {
                    char ch = lowerInput.charAt(i);


                    if (ch >= 'a' && ch <= 'z') {


                        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                            vowels++;
                        } else {

                            consonants++;
                        }
                    }
                }

                System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
            }

            public static void removeDuplicates()
            {
                String input= "aaabbbccc";

                String output="";
                String [] word= output.split(" ");
                for(int i=0;i<input.length();i++)
                {
                    char curr = input.charAt(i);

                    if(output.indexOf(curr) == -1)
                    {
                        output+=curr;
                    }

                }
                System.out.println(output);
            }

            public static void toCapitalize()
            {
                String str="The quick brwon fox runs over the lazy dog";
                StringBuilder res = new StringBuilder();

                for(int i=0;i<str.length();i++)
                {
                    char curr = str.charAt(i);

                    if(i==0 || str.charAt(i- 1) == ' ')
                    {
                        res.append(Character.toUpperCase(curr));
                    }
                    else{
                        res.append(Character.toLowerCase(curr));
                    }

                }

                System.out.println(res.toString());
            }

            public static void longestword()
            {
                String input = "The Quick Brwon Fox Runs Over The Lazy Dog";
                String[] str = input.split(" ");
                String longest="";

                for(int i=0;i<str.length;i++){
                    String curr = str[i];
                    if (curr.length() > longest.length()) {
                        longest = curr;
                    }
                }

                System.out.println("Output "+longest);

            }

            public static void reverseBruteforce()
            {
                String orginal ="India is my country ";
                //String b = a.reverse;
                String [] word = orginal.split(" ");
                StringBuilder output=new StringBuilder();

                for(int i = word.length-1;i>=0;i--)
                {
                    output.append(word[i]);

                    if(i>0){
                        output.append(" ");
                    }
                    System.out.println(output);
                }
            }

            public static void removespaces()
            {
                String str=" hi";
                String out=str.trim();
                System.out.println(out);
            }



}






