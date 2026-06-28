package in.co.nmsworks.training.week2.day6;

public class PatternProgramming2 {
    public static void main(String[] args) {
        PatternProgramming2 pp = new PatternProgramming2();
        pp.divideTwoNumbers(37,6);
        pp.multipyTwoFloatNumbers(3.0f,1.0f);
        pp.printMultiplesOfTheNumber(7);
        pp.printFactorialOfTheNumber(7);
        pp.findTheGreatestNumber(1,2,3);
        pp.printRightAngledTriangle(5);
        pp.printInvertesRightAngledTriangle(5);
        pp.printStarPattern(5);
        pp.alphabetPattern(5);
    }

    private void alphabetPattern(int number1) {
        Character ch = 'A';
        for (int i = 1; i <= number1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }

    }

    private void printStarPattern(int number1) {
        for (int i = 1; i <= number1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    private void printInvertesRightAngledTriangle(int number1) {
        int k = 1;
        for (int i = number1; i >0 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k+" ");
            }
            k++;
            System.out.println();
        }
    }

    private void printRightAngledTriangle(int number1) {
        for (int i = 1; i <= number1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    private void findTheGreatestNumber(int number1, int number2, int number3) {
        if(number1 > number2 && number1 > number3){
            System.out.println(number1+" is Greater");
        }
        else if(number2 > number1 && number2 > number3){
            System.out.println(number2+" is Greater");
        }
        else{
            System.out.println(number3+" is Greater");
        }
    }

    private void printFactorialOfTheNumber(int number1) {
        int fact = 1;
        for (int i = 1; i <= number1; i++) {
            fact *= i;

        }
        System.out.println("The factorial of"+number1+" is: "+fact);
    }

    private void printMultiplesOfTheNumber(int number1) {
        for (int i = 1; i <= 10; i++) {
            int answer = number1 * i;
            System.out.println(number1+" * "+i+" = "+answer);
        }
    }

    private void multipyTwoFloatNumbers(float number1, float number2) {
        float answer = number1 * number2;
        System.out.println("The answer is: "+answer);
    }

    private void divideTwoNumbers(int number1, int number2) {
        System.out.println("Quotitent of the numbers is: "+(number1 / number2));
        System.out.println("Remainder is: "+(number1 % number2));
    }
}
