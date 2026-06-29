package in.co.nmsworks.training.week2.day6;

public class StringPrograms {
    public static void main(String[] args) {

        StringPrograms obj = new StringPrograms();

        String companyName = "NMSWorks";
        System.out.println("Character at specified index of given string " + companyName +" is ::" +companyName.charAt(5));

        String str1 = "OpenAI";
        String str2 = "Java Programming";
        String str3 = "Welcome to Java";

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Length of the given string " + str1 + " is :: "+str1.length());

        System.out.println("Substring of the given string " + str2+  " is :: " + str2.substring(5) );

        System.out.println("Substring of the given string " + str3+  " is :: " + str3.substring(11,15) );

        obj.checkIfSubstringPresent(str2, "Prog");

        obj.stringToListArray("apple,banana,cherry,grapes");

        obj.concatListOfStrings(days);

        obj.compareStrings("Hello", "hello");

        obj.compareStrings("Java", "Java");

        obj.checkIsStringEmpty(" ");

        obj.concateTwoStrings("Hello", "World");

        obj.replaceStringWithChar("Java",'o');

        obj.checkTwoStringsEquality("hello","HELLO");

        obj.findIndexOfChar("Programming",'g');

        obj.findIndexOfSubstring("Programming","mm");

        obj.convertToLowerCase("HELLO");

        obj.stringTOInteger("1234");


    }

    public void stringTOInteger(String number) {
        System.out.println("Integer : " + Integer.valueOf("1234"));
    }

    public void convertToUpperCase(String str) {
        System.out.println("Upper Case String " + str + " is : " + str.toUpperCase());
    }

    public void convertToLowerCase(String str) {
        System.out.println("Lower Case String " + str + " is : " + str.toUpperCase());
    }

    public void findIndexOfSubstring(String str, String s) {
        System.out.println("Index of substring in "+ str + " is " + str.indexOf(s));
    }

    public void findIndexOfChar(String str, char ch) {
        System.out.println("Index of character in "+ str + " is " + str.indexOf(ch));
    }

    public void checkTwoStringsEquality(String str1, String str2) {
        System.out.println("Checking Strings equality : " + str1.toLowerCase().equals(str2.toLowerCase()));
    }

    public void replaceStringWithChar(String str, char ch) {
        System.out.println("Replaced String : "+str.replace('a', 'o'));

    }

    public void checkIfSubstringPresent(String str, String substring) {
        if(str.contains(substring)){
            System.out.println("String : " +str +" and substring : " + substring +" is Found");
        }
        else{
            System.out.println("String : " +str +" and substring : " + substring +" is not Found");
        }

    }

    public void stringToListArray(String str) {

        String[] strArr = str.split(",");

        System.out.print("List of String : ");

        for(String s: strArr) {

            System.out.print(s + " ");

        }

        System.out.println();

    }

    public void concatListOfStrings(String strArr[]) {

        String concatenatedStr = String.join(",", strArr);

        System.out.println("String : " + concatenatedStr);

    }

    public void compareStrings(String str1, String str2) {

        if(str1.equals(str2)) {

            System.out.println("\"" + str1 + "\""+ " and " + "\""+ str2 + "\""+ " are equal");

        }

        else {

            System.out.println("\"" + str1 + "\""+ " and " + "\""+ str2 + "\""+ " are not equal");

        }

    }

    public void checkIsStringEmpty(String str) {

        if(str.isEmpty()) {
            System.out.println("\"" + str + "\""+ " is empty");
        }
        else {
            System.out.println("\"" + str + "\""+ " is not empty");
        }

    }

    public void concateTwoStrings(String str1, String str2) {

        System.out.println("Concatenated String : "+str1.concat(str2));

    }


}

