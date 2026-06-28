package in.co.nmsworks.training.week2.weekendpractice;

public class JavaBasicPrograms {
    public static void main(String[] args) {
        findQuocientRemainder(37,6);
        multiplyTwoFloatingNumbers(3.0,1.0);
        multipliesOfSeven(7);
        int number = 5;
        int factorial=findFactorial(number);
        System.out.println("Factorial of "+number+"  is "+factorial);
        findLargestAmongThreeNumbers(10,20,30);
        int noOfRow = 9;
        pattern(noOfRow);
        System.out.println("-------");
        starPattern(noOfRow);
        System.out.println("-------");
        alphabetPattern(noOfRow);
        System.out.println("-------");
        numberPattern(noOfRow);
    }

    private static void numberPattern(int noOfRow) {
        int number = 1;int star = noOfRow;
        for (int i = 0; i < noOfRow; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print(number);

            }
            System.out.println();
            star --;
            number ++;
        }
    }

    private static void alphabetPattern(int noOfRow) {
        int star = 1; char ch = 'A';
        for (int i = 0; i <noOfRow ; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print(ch);
            }
            System.out.println();
            ch ++;
            star ++;

        }

    }

    private static void starPattern(int noOfRow) {
        int star = 1;
        for (int i = 0; i <noOfRow ; i++) {

            for (int j = 0; j < star; j++) {
                System.out.print("*");

            }
            System.out.println();

            star++;

        }

    }

    private static void pattern(int noOfRow) {
       int star = 1;
        for (int i = 0; i <noOfRow ; i++) {
            int number = 1;
            for (int j = 0; j < star; j++) {
                System.out.print(number);
                number++;
            }
            System.out.println();

            star++;

        }
    }

    private static void findLargestAmongThreeNumbers(int a, int b, int c) {
        if (a >= b && a>= c){
            System.out.println("largestNumber is : "+a);
        } else if (b >= a && b >= c) {
            System.out.println("largestNumber is : "+b);
        }else {
            System.out.println("largestNumber is : "+c);
        }
    }

    private static int findFactorial(int number) {
        if (number == 0 || number == 1){
            return number;
        }
        return number*findFactorial(number-1);

    }

    private static void multipliesOfSeven(int number) {
        for (int i = 1; i <11 ; i++) {
            System.out.println(number+"*"+i+"="+number*i);

        }

    }

    private static void multiplyTwoFloatingNumbers(double firstNumber, double secondNumber) {
        double multiply = firstNumber * secondNumber;
        System.out.println("multiplication answer : "+multiply);
    }


    private static void findQuocientRemainder(int numerator,
                                              int denominator) {
        int quocient = numerator / denominator;
        int remainder = numerator % denominator;
        System.out.println("Quocient : "+quocient);
        System.out.println("Remainder : "+remainder);
    }

}
