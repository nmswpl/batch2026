package in.co.nmsworks.training.week1.exam;

import java.util.Arrays;
import java.util.Scanner;

public class Set1ArrayQuestions {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4, 5, 6};
        arrayMean(arr);

        System.out.println("--------------------");
        gradePrinter();

        System.out.println("--------------------");
        Book book1 = new Book(101, "Java Fundamentals", "John Doe", 200);
        Book book2 = new Book(102, "How to Cook with 3 Ingredients", "Gordon Ramsay", 599);
        Book book3 = new Book(3, "How to Say No", "Jim", 450);
        Book book4 = new Book(4, "Jungle Book", "Mowgli", 560);
        Book book5 = new Book(5, "How to Fight", "Kim Jaeju", 650);

        Book[] shelf = {book1, book2, book3, book4, book5};
        for (Book book : shelf) {
            System.out.println("ID = " + book.getId());
            System.out.println("TITLE = " + book.getTitle());
            System.out.println("AUTHOR = " + book.getAuthor());
            System.out.println("PRICE = " + book.getPrice());
            System.out.println();
        }
    }

    public static void arrayMean(int[] arr){
        float sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Mean of " + Arrays.toString(arr) + " : " + (sum / arr.length));
    }

    public static void gradePrinter(){
        System.out.println("Enter your marks : ");
        Scanner in = new Scanner(System.in);
        int marks = in.nextInt();

        System.out.println("GRADE : ");

        if(marks <= 100 && marks >= 91){
            System.out.print("S");
        } else if(marks <= 90 && marks >= 81){
            System.out.print("A");
        }else if(marks <= 80 && marks >= 71){
            System.out.print("B");
        }else if(marks <= 70 && marks >= 61){
            System.out.print("C");
        }else if(marks <= 60 && marks >= 51){
            System.out.print("D");
        }else {
            System.out.print("F");
        }
        System.out.println();
    }


}
