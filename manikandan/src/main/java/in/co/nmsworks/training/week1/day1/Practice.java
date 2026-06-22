package in.co.nmsworks.training.week1.day1;

public class Practice {
    public static void main(String[] args)
    {

        printnum(27);

        twonumadd(18,27);

        twonummultiply(18,27);

        ascii('m');

        quotientandreaminder(6,1);

        swapnumbers(18,27);

        oddoreven(27);

        vowels("m");

    }
    public static void printnum(int n) {
        System.out.println("1.ENTERED NUMBER ");

        System.out.println("You Entered "+n);

    }

    public static void twonumadd(int a, int b) {

        System.out.println("2.ADD TWO NUMBERS ");
        int add =a+b;
        System.out.println("The added number is "+ add);
        System.out.println("-----------------------");

    }
    public static void twonummultiply(float a,float b) {

        System.out.println("3.MULTIPLY WO NUMBERS ");
        float c= a*b;
        System.out.println("The multiplied number is "+ c);
        System.out.println("-----------------------");

    }

    public static void ascii(char a) {

        System.out.println("4.A4SCII VALUE ");
        int v=a;
        System.out.println("Ascii value of "+a+" is "+v);
        System.out.println("-----------------------");

    }

    public static void quotientandreaminder(int num, int d) {

        System.out.println("5.Quotient and Remainder Question ");
        int q=num/d;
        int r=num%d;
        System.out.println("Quotient is "+ q);
        System.out.println("Remainder is "+ r);
        System.out.println("-----------------------");
    }

    public static void swapnumbers(int a, int b) {

        System.out.println("6.SWAP TWO NUMBERS USING TEMP ");

        System.out.println("Before Swap ");
        System.out.println("First Number : "+a);
        System.out.println("Second Number : "+b);

        int temp=0;
        temp=a;
        a=b;
        b=temp;

        System.out.println("After Swap ");
        System.out.println("First Number : "+a);
        System.out.println("Second Number : "+b);
        System.out.println("-----------------------");

    }

    public static void oddoreven(int n) {
        System.out.println("7.FIND ODD OR EVEN ");

        if( n%2==0 ){
            System.out.println(n+" is even number ");
        }
        else{
            System.out.println(n+" is odd number ");
        }
        System.out.println("-----------------------");
    }

    public static void vowels(String a)
    {
        System.out.println("8.FIND VOWEL OR CONSONANTS ");


        char ch = 'm';
        String str = "aeiouAEIOU";
        if(str.indexOf(ch) == -1) {
            System.out.print(ch+" is a consonant");
        }
        else {
            System.out.print(ch+" is a vowel");
        }

        System.out.println("-----------------------");
    }
}
