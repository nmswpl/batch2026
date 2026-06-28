package in.co.nmsworks.training.week1.exam;

import java.util.Scanner;

public class Exam {

    public static void main(String[] args) {
        findMeanOfTheArray();
        Book book1 = new Book(1, "Java Programing", "James Gosling", 450.0);
        Book book2 = new Book(2, "R D Sharma", "Sharma", 700.0);
        Book book3 = new Book(3, "Pythom Programmin", "James Gosling", 500.0);
        Book book4 = new Book(4, "English Dictionary", "Oxfard University", 500.0);
        Book book5 = new Book(5, "C++ Programming", "James Gosling", 350.0);
        book1.printValues();
        book2.printValues();
        book3.printValues();
        book4.printValues();
        book5.printValues();
        printGrade(79);
    }

    public static void findMeanOfTheArray(){
        int[] arr = {1, 2, 3, 4, 5, 6};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        int mean = sum / arr.length;
        System.out.println("Mean of the array is: "+mean);
    }

    public static void printGrade(int number1){

        if (number1 > 100) {
            System.out.println("Mark is invald");
        } else if (number1 >= 91 ) {
            System.out.println("Your grade is S");
        } else if (number1 >= 81 ){
            System.out.println("Your grade is A");
        } else if (number1 >= 71 ) {
            System.out.println("Your grade is B");
        } else if (number1 >= 61 ) {
            System.out.println("Your grade is C");
        } else if (number1 >= 51 ) {
            System.out.println("Your grade is D");
        }else {
            System.out.println("Your grade is F");
        }



    }
}
