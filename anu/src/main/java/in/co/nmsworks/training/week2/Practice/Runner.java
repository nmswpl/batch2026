package in.co.nmsworks.training.week2.Practice;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        computableCalculation();
        LibrarySystem();
        trainingProblem();

    }

    private static void trainingProblem() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Prime number------------");
        TrainingExercise.printEvenNumber();

        System.out.println();

        System.out.println("Grade details------------");
        TrainingExercise.GradeMark(75);

        System.out.println();

        System.out.println("Multiple of an Array--------");
        TrainingExercise.multipleOfArray();

        System.out.println();

        TrainingExercise.printPosition(41);
        System.out.println();

        TrainingExercise.checkCharacter("Anushri");
        System.out.println();

        TrainingExercise.multiplication(17);
        System.out.println();

        System.out.print("square of an array : ");
        TrainingExercise.squareOfArray();

        System.out.println();

        System.out.print("Hundred position of an value : ");
        int number=sc.nextInt();
        TrainingExercise.printDigitHundred(number);

        System.out.println();
        System.out.println(" number Divisible By three -------");
        TrainingExercise.numberDivisbleByThree();

        System.out.println();
        System.out.println(" number Ending with Seven -------");
        TrainingExercise.numberEndingWithSeven();

        System.out.println();
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
        }
        TrainingExercise.biggestOfNumber(array);

        System.out.println();
        TrainingExercise.oddNumberOfArray(array);

        System.out.println();
        TrainingExercise.sumOfArray(array);

        System.out.println();
        String[] revarray={"anushri" ,"vijayashree" ,"archana "};
        TrainingExercise.reverseOfStringArray(revarray);

        System.out.println();
        TrainingExercise.evenNumberOfArray(array);

        System.out.println();
        System.out.println("recursive of an factorial ");
        int a=sc.nextInt();
        System.out.println("factorial of number is " + a + " : " + TrainingExercise.factrecu(a));

        System.out.println();
        System.out.print("enter the element x : ");
        int x=sc.nextInt();
        System.out.println();
        int[] value = new int[7];
        for (int i = 0; i < value.length; i++) {
            value[i]=sc.nextInt();
        }
        TrainingExercise.occurenceInArray(value,x);

        System.out.println();
        TrainingExercise.stringpalindrome("abc");

        System.out.println();
        System.out.println("check the prime number ");
        int n=sc.nextInt();
        TrainingExercise.checkPrime(n);
    }

    private static void computableCalculation(){
        Computable adder = new Adder();
        Computable multiple = new Multiplier();
        Computable divide = new Divider();

        adder.compute(2,3);
        multiple.compute(2,3);
        divide.compute(10,5);
    }
    private static void performCalculation ( int a, int b, Computable operation){
        operation.compute(a,b);
    }

    private static void LibrarySystem(){
        LibraryBook oops = new LibraryBook("Object Orientation programming","Anushri",2005,1);
        oops.checkOut();
        oops.checkOut();
        oops.checkOut();
        LibraryBook cprogramming = new LibraryBook("C Programming ", " Thayuman " ,1999,4);
        cprogramming.checkOut();
        LibraryBook operatingSystem =  new LibraryBook("Operation System " , " Vivek " ,2001,2);
        operatingSystem.checkOut();
        LibraryBook dbms = new LibraryBook( "DataBase Managemnet System " , " kavitha" ,2004 ,3);
        dbms.checkOut();
        dbms.checkOut();
        dbms.checkOut();
    }
}
