package in.co.nmsworks.training.week2.exercise;

public class StringMethodPractice {
    public static void main(String[] args) {
        charAtMethod("NMSWorks",5);
        lengthOfString("OpenAI");
        substringMethod("Java Programming",5);
        substringWithStartAndEndIndex("Welcome to java",11,15);
        containsMethod("Java Programming");
        joinMethod();
        equalsMethod("hello","Hello");
        isEmptyMethod(" ");
        concatMethod("Hello", " World");
        replaceMethod("banana",'a','o');
        equalsIgnoreCaseMethod("HELLO","hello");
        splitMethod("one,two,three");
        splitMethodWithLimit("apple;banana;cherry;date",3);
        indexOfMethod("programming",'g');
        indexOfSubstringMethod("Welcome to the world","the");
        toLowerCaseMethod("Java Programming");
        toUpperCaseMethod("welcome to Java");
        valueOfMethod(1234);
    }

    public static void valueOfMethod(int number) {
        System.out.println(String.valueOf(number));
    }

    public static void toUpperCaseMethod(String input) {
        System.out.println("Uppercase: " + input.toUpperCase());
    }

    public static void toLowerCaseMethod(String input) {
        System.out.println("Lowercase: " + input.toLowerCase());
    }


    public static void indexOfSubstringMethod(String input, String string) {
        System.out.println("Index of " + string + " in " + input + " is: " + input.indexOf("the",10));
    }

    public static void indexOfMethod(String input, char character) {
        System.out.println("Index of " + character + " in " + input + " is: " + input.indexOf(character));
    }

    public static void splitMethodWithLimit(String input, int limit) {
        String[] array = input.split(";",3);
        for (String s : array) {
            System.out.println(s);

        }
    }

    public static void splitMethod(String input) {
        String[] array =  input.split(",");
        for (String s : array) {
            System.out.println(s);
        }
    }

    public static void equalsIgnoreCaseMethod(String string1, String string2) {
        if(string1.equalsIgnoreCase(string2)){
            System.out.println("Both strings are same");
        }
        else{
            System.out.println("Both strings are not same");
        }
    }

    public static void replaceMethod(String input, char original, char replace) {
        System.out.println(input.replace(original,replace));
    }

    public static void concatMethod(String string1, String string2) {
        String concatenated = string1.concat(string2);
        System.out.println(concatenated);
    }

    public static void isEmptyMethod(String input) {
        if(input.isEmpty()){
            System.out.println("The string is empty");
        }
        else{
            System.out.println("The string is not empty");
        }
    }

    public static void equalsMethod(String string1, String string2) {
        if(string1.equals(string2)){
            System.out.println("Both strings are same");
        }
        else{
            System.out.println("Both strings are not same");
        }
    }

    public static void joinMethod() {
        String[] arr = {"apple","banana","cherry"};
        String result = String.join(",",arr);
        System.out.println(result);

    }

    public static void containsMethod(String input) {

        if(input.contains("Prog")){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }

    public static void substringWithStartAndEndIndex(String input, int start, int end) {
        System.out.println(input.substring(start,end));
    }

    public static void substringMethod(String input, int startIndex) {
        System.out.println(input.substring(startIndex));
    }

    public static void lengthOfString(String input) {
        System.out.println("The length of " + input + " is: " + input.length());
    }

    public static void charAtMethod(String input, int index) {
        System.out.println("The " + index + " character at " + input + " is: " + input.charAt(index));
    }
}
