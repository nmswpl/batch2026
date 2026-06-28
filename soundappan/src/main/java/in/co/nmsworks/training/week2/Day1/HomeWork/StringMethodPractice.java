package in.co.nmsworks.training.week2.Day1.HomeWork;

public class StringMethodPractice {
    public static void indexAtString(){
        System.out.println("1.Index of the String");
        String name="NMSWorks";
        char c=name.charAt(5);
        System.out.println(c);
    }
    public static void lengthOfString(){
        System.out.println("2.Length of the String");
        String name="OpenAI";
        System.out.println(name.length());
    }
    public static void SubStringAtIndex(){
        System.out.println("3.SubString with begin Index");
        String subject="Java Programming";
        String subWord=subject.substring(5);
        System.out.println(subWord);
    }
    public static void SubStringStartAndEnd(){
        System.out.println("4.SubString with Begin and end Index");
        String word="Welcome to Java";
        String exact=word.substring(11,12);
        System.out.println(exact);
    }
    public static void equalSubString(){
        System.out.println("5.Contains SubString");
        String word="Java Programming";
        String subWord="Prog";
        System.out.println(word.contains(subWord) ? "Found" :"Not Found");
    }
    public static void joinWord(){
        System.out.println("6.Join word with , ");
        String result=String.join(",","apple","banana","cherry");
        System.out.println(result);
    }
    public static void equalCase(){
        System.out.println("7.Check two String are equal");
        String word="Hello";
        String word1="hello";
        System.out.println(word.equals(word1) ? "Equal" : "Not Equal");
    }
    public static void stringEmpty() {
        System.out.println("8.Check the String is empty or not");
        String word = "";
        System.out.println(word.isEmpty());
    }
    public static void concatString(){
        System.out.println("9.String Concat");
        String word1="Hello";
        String word2="World";
        System.out.println(word1.concat(word2));
    }
    public static void replaceCharacter(){
        System.out.println("10.String Replace Charater");
        String word ="banana";
        System.out.println(word.replace('a','o'));
    }
    public static void equalIgnoreCase(){
        System.out.println("11.Compare String Equality Ignoring Case");
        String word="Hello";
        String word1="hello";
        System.out.println(word.equalsIgnoreCase(word1) ? "Equal" : "Not Equal");
    }
    public static void splitString(){
        System.out.println("12.Split String");
        String word="one,two,three";
        String []array=word.split(",");
        for(String val:array){
            System.out.println(val);
        }
    }
public static void splitStringLimit(){
    System.out.println("13.Split The String Using limit");
        String word="apple;banana;cherry;date";
        String []array=word.split(";",3);
        for(String val:array){
            System.out.println(val);
        }
}
public static void indexOfCharacter(){
    System.out.println("14.Index of the Character");
        String word="programming";
        System.out.println(word.indexOf('g'));
}
public static void indexOfWord(){
    System.out.println("15.first occurrence of a substring using fromIndex");
        String word="welcome to the world";
        System.out.println(word.indexOf("the",10));
}
public static void stringToLowerCase(){
    System.out.println("16.String to Lowercase");
    String word="Java Programming";
    System.out.println(word.toLowerCase());
}
public static void stringToUpperCase(){
    System.out.println("17.String to Uppercase");
    String word="welcome to Java";
    System.out.println(word.toUpperCase());
}
public static void integerToValue(){
    System.out.println("18.Integer to String");
    int number=1234;
    String value=String.valueOf(number);
    System.out.println(value);
}

    public static void main(String[] args) {
        indexAtString();
        lengthOfString();
        SubStringAtIndex();
        SubStringStartAndEnd();
        equalSubString();
        joinWord();
        equalCase();
        stringEmpty();
        concatString();
        replaceCharacter();
        equalIgnoreCase();
        splitString();
        splitStringLimit();
        indexOfCharacter();
        indexOfWord();
        stringToLowerCase();
        stringToUpperCase();
        integerToValue();
    }
}
