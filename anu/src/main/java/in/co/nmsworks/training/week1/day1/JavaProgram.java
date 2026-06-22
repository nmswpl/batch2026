package in.co.nmsworks.training.week1.day1;
import java.util.Scanner;

public class JavaProgram {
    static int c;
    static float d;
    static int quo;
    static int rem;

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("enter the number :" );
        int n = num.nextInt();

        System.out.println("you enter : " + n);

        int num1 = num.nextInt();
        int num2 = num.nextInt();
        int addition = addNumber(num1, num2);
        System.out.println("enter the number two number " + num1 + "and" + num2 + ":" + addition);

        float num3 = num.nextInt();
        float num4 = num.nextInt();
        float multiple = multiNumber(num3, num4);
        System.out.println("enter the number multi number " + num1 + "and" + num2 + ":" + multiple);

        computeqr(num1,num2);

        System.out.println("check the number is prime or not ");
        checkNumber(num1);

        System.out.println("before swapp : "+num1 +"and " + num2 );
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After swapp : "+num1 +"and " + num2 );

        char ch= 'a';
        asciivalue(ch);

        char ex='a';
        alphabetwords(ex);



    }

    public static int addNumber(int num1,int num2){
        c=num1+num2;
        return c;
    }

    public static float multiNumber(float num3,float num4){
        d=num3*num4;
        return d;

    }

    public static void computeqr(int num1,int num2) {
        quo= num1 / num2;
        rem= num1 % num2;
        System.out.println("Quotient : " + quo + "remainder : "+rem);
    }

    public static  void checkNumber (int num1){
        if (num1 %2==0){
            System.out.println("it's even number is  " + num1 );
        }
        else{
            System.out.println("it's is odd number is " + num1 );
        }
    }


    public static void asciivalue (char ch ){
        int as=(int) ch ;
        if((as >=65 && as<=90) || (as >=97 && as <=122)){
            System.out.println("alphabet : " + as );
        }
    }

    public static void alphabetwords(char ex){
        if(ex== 'a' || ex == 'e' || ex == 'i' || ex == 'o' || ex == 'u' )
            System.out.println(ex+ " is vowel");
        else
            System.out.println(ex+ " is consonant");
    }
}
