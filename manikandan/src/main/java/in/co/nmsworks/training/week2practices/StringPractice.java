package in.co.nmsworks.training.week2practices;

public class StringPractice {
    public static void main(String[] args) {

        indexPrinting();
        lengthFinding();
        subStringFindingAtBegin();
        subStringBeginAndEnd();
        stringContains();
        stringConcatenationByJoin();
        stringEquals();
        stringIsEmpty();
        stringConcat();
        stringReplace();
        stringIgnoreCase();
        stringSplitIntoArrays();
        stringToArray();
        stringFirstOccurrence();
        stringStartingIndex();
    }

    private static void stringStartingIndex() {
        String str = "welcome to the world";
        String sub = "the";

        int index = str.indexOf(sub, 10);

        System.out.println("Index: " + index);


    }

    private static void stringFirstOccurrence() {

        String input = "programming";
        System.out.println(input.indexOf("g"));
    }

    private static void stringToArray() {
        System.out.println("Split with limit");
        String names = "Apple;Banana;Cherry";
        System.out.println();
        String[] str = names.split(";",2);
        for(String i:str){
            System.out.println(i);
        }


    }

    private static void stringSplitIntoArrays() {
        String str1 = "MANI,MADS,PAPS";
        String[] word = str1.split(",");
        for (String i : word){
            System.out.print(i);
        }
    }

    private static void stringIgnoreCase() {
        System.out.println("String Ignore Case ");
        String str1 = "MANI";
        String str2 = "MADS";
        System.out.println(str2.equalsIgnoreCase(str1)? "EQUALS":"ALWAYS EQUALS");
    }

    private static void stringReplace() {
        System.out.println("String Replace ");
        String str1 = "DHONI";
        String str2 = "MESSI";
        System.out.println(str2.replace("S","H"));
    }

    private static void stringIsEmpty() {
        System.out.println("String isEmpty check ");
        String str1 = "";
        System.out.println(str1.isEmpty()? "NULL" : "NOT NULL");
    }

    private static void stringConcat() {
        System.out.println("String Concatination : ");
        String str1  = "MANS";
        String str2 = "MADS";
        System.out.println(str2.concat(str1));
    }

    private static void stringEquals() {
        System.out.println("String Equals :");
        String str1 = "HELLO";
        String str2 = "hELLO";
        System.out.println(str1.equals(str2) ? "Same":"Not Same");
    }

    private static void stringConcatenationByJoin() {
        System.out.println("String Concatenation By Join : ");
        String input =  String.join(",","apple","banana","jackfruit");
        System.out.println(input);
    }

    private static void stringContains() {
        System.out.println("String Contains ");
        String input = "Java Programming";
        String sub = "frog";
        System.out.println(input.contains(sub) ? "Found":"Not Found");
    }

    private static void subStringBeginAndEnd() {
        System.out.println("Sub String at begin and end : ");
        String input = "Welcome to Java";
        System.out.println(input.substring(10,15));
    }

    private static void subStringFindingAtBegin() {
        System.out.println("SUb string at Beginning : ");
        String input = "Java Programming";
        System.out.println(input.substring(5));
    }

    private static void lengthFinding() {
        System.out.println("Length Finder : ");
        String name = "OpenAI";
        System.out.println(name.length());
    }

    private static void indexPrinting() {

        System.out.println("IndexPrinting : ");
        String name = "NMSWorks";
        System.out.println(name.charAt(5));
    }
}
