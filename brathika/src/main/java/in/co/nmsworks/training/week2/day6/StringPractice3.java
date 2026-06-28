package in.co.nmsworks.training.week2.day6;

public class StringPractice3 {
    public static void main(String[] args) {
        StringPractice3 sp = new StringPractice3();
        sp.printCharacterAtTheIndex("NMSWorkd", 5);
        sp.printLengthOfTheString("OpenAi");
        sp.printSubstringOfString("Java Programming",5);
        sp.printSubstrinWithEndIndex("Java Programming",11,15);
        sp.checkStringContainsSubstring("Java Programming","Prog");
        sp.concatenateListOfString("apple","banana", "cherry");
        sp.checkTwoStringAreEqual("hello", "Hello");
        sp.checkIfStringIsEmpty(" ");
        sp.concateStringUsingConcatFunction("Hello", "World");
        sp.replaceAllOccurenceOfTheCharacter("banana","a","o");
        sp.checkTwoAreEqualIgnoreCase("hello","HELLO");
        sp.splitStringIntoArray("one,two,three",",");
        sp.splitStringIntoArrayWithLimit("apple;banana;cherry;date",";",3);
        sp.printTheFirstOccurance("programmimg","g");
        sp.printTheFirstOccurance("welcome to the world","the",10);
        sp.convertTheStringToLowerCase("Java Programming");
        sp.converTheStringToUpperCase("welcome to Java");
        sp.convertIntegerToString(1234);
    }

    private void convertIntegerToString(int number1) {
        String answer = String.valueOf(number1);
        System.out.println(answer);
    }

    private void converTheStringToUpperCase(String string1) {
        System.out.println(string1.toUpperCase());
    }

    private void convertTheStringToLowerCase(String string1) {
        System.out.println(string1.toLowerCase());
    }

    private void printTheFirstOccurance(String string1, String ch, int startIndex) {
        System.out.println("The first occurance of "+ch+" is "+string1.indexOf(ch,startIndex));
    }

    private void printTheFirstOccurance(String string1,String ch) {
        System.out.println("The first occurance of "+ch+" is "+string1.indexOf(ch));
    }

    private void splitStringIntoArrayWithLimit(String string1, String string2, int limit) {
        String[] array = string1.split(string2,limit);
        for (String s : array) {
            System.out.print(s+" ");
        }
        System.out.println();
    }

    private void splitStringIntoArray(String string1,String string2) {
        String[] array = string1.split(string2);
        for (String s : array) {
            System.out.print(s+" ");
        }
        System.out.println();
    }

    private void checkTwoAreEqualIgnoreCase(String string1, String string2) {
        if(string1.equalsIgnoreCase(string2)) {
            System.out.println(string1+" and "+string2+" are equal");
        }
        else {
            System.out.println(string1+" and "+string2+" are not equal");
        }
    }

    private void replaceAllOccurenceOfTheCharacter(String string1, String ch1, String ch2) {
        System.out.println("String after replaced is "+string1.replaceAll(ch1 , ch2));
    }

    private void concateStringUsingConcatFunction(String string1, String string2) {
        System.out.println(string1.concat(string2));
    }

    private void checkIfStringIsEmpty(String string1) {
        if (string1.isEmpty()) {
            System.out.println("Empty");
        }
        else {
            System.out.println("Not Empty");
        }
    }

    private void checkTwoStringAreEqual(String string1, String string2) {
        if (string1.equals(string2)) {
            System.out.println(string1+" and "+string2+" are equal");
        }
        else{
            System.out.println(string1+" and "+string2+" are not equal");
        }
    }

    private void concatenateListOfString(String string1, String string2, String string3) {
        String delimiter = ", ";
        System.out.println(String.join(delimiter, string1, string2, string3));
    }

    private void checkStringContainsSubstring(String string1, String string2) {

        if (string1.contains(string2)) {
            System.out.println(string2+" Found in "+string1);
        }
        else {
            System.out.println(string2+" Not Found "+string1);
        }
    }

    private void printSubstrinWithEndIndex(String string, int startIndex, int endIndex) {
        System.out.println("The substring of the string "+string+" is: "+string.substring(startIndex,endIndex));
    }

    private void printSubstringOfString(String string, int startIndex) {
        System.out.println("The substring of the string "+string+" is: "+string.substring(startIndex));
    }

    private void printLengthOfTheString(String string) {
        System.out.println("The Length of the string"+string+" is: "+string.length());
    }

    private void printCharacterAtTheIndex(String string, int index) {
        System.out.println("The character at the position "+index+" is "+string.charAt(index));
    }
}
