package in.co.nmsworks.training.week1.exam;

import java.util.Scanner;

public class Set1Exam {
    Scanner scanner;
    public static void main(String[] args) {
        Set1Exam ss = new Set1Exam();
        ss.findMean();
        Book[] books = ss.setPrintBooksInformation();
        ss.printBookInformation(books);
        ss.printGrade();
    }


    public void findMean() {
        scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numArray = new int[n];
        for (int i = 0; i < n; i++) {
            numArray[i] = scanner.nextInt();
        }
        double sum = 0;
        for ( int num : numArray ){
            sum += num;
        }
        System.out.println("Mean = "+(sum/n));
    }

    public Book[] setPrintBooksInformation() {
        scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) {
            int id = scanner.nextInt();
            String title = scanner.nextLine();
            String author = scanner.nextLine();
            double price = scanner.nextDouble();
            books[i] = new Book(id, title, author, price);
        }
        return books;
    }

    public void printBookInformation(Book[] books){
        System.out.println("These are the Books available in our shop!!");
        for (Book book : books) {
            System.out.println("ID = " + book.getId());
            System.out.println("Title = " + book.getTitle());
            System.out.println("Author = " + book.getAuthor());
            System.out.println("Price = " + book.getPrice());
            System.out.println("------------------------------------------");
        }
    }
    
    public void printGrade() {
        System.out.println("Enter your Mark!!");
        int mark = scanner.nextInt();
        if ( mark > 90 )
            System.out.println("Grade = S");
        else if ( mark > 80 )
            System.out.println("Grade = A");
        else if ( mark > 70 )
            System.out.println("Grade = B");
        else if ( mark > 60 )
            System.out.println("Grade = C");
        else if ( mark > 50 )
            System.out.println("Grade = D");
        else
            System.out.println("Grade = F");
    }
}
