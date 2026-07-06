package in.co.nmsworks.training.week3.day1;

import in.co.nmsworks.training.week1.exam.Book;

import java.util.*;

public class BookRunner {
    public static void main(String[] args) {
        hashset();
        list();
        linkedSet();

    }

    private static void linkedSet() {
        System.out.println("________________________LINKED HASH SET__________________________");
        Set<Book> linkedSetBooks = new LinkedHashSet<>();

        linkedSetBooks.add( new Book(1,"Book1","author1", 150));
        linkedSetBooks.add( new Book(2,"book2","author2", 3000));
        linkedSetBooks.add( new Book(3,"book3","author3", 450));
        linkedSetBooks.add( new Book(2,"book4","author4", 750));
        linkedSetBooks.add( new Book(4,"book5","author5", 250));


        for (Book book : linkedSetBooks){
            System.out.println(book);
        }
        System.out.println();
    }

    private static void list() {
        List<Book> listBooks= new ArrayList<>();
        System.out.println("_____________________ LIST ______________________________");
        listBooks.add( new Book(1,"Book1","author1", 150));
        listBooks.add( new Book(4,"book5","author5", 250));
        listBooks.add( new Book(2,"book2","author2", 3000));
        listBooks.add( new Book(3,"book3","author3", 450));
        listBooks.add( new Book(2,"book4","author4", 750));

        for (Book book : listBooks){
            System.out.println(book);
        }

        System.out.println("LIST Size :: " + listBooks.size());

        System.out.println("ADD :: " + listBooks.add(new Book(5,"Book 6","author6",4000)));

        System.out.println("Remove :: " + listBooks.remove(new Book(5,"Book 6","author6",4000)));

        System.out.println("CONTAINS :: " + listBooks.contains(new Book(5,"Book 6","author6",4000)));

        System.out.println("Index Of :: " + listBooks.indexOf(new Book(4,"book5","author5", 250)));

        System.out.println("SET Method :: " + listBooks.set(0, new Book(7,"Book 7","author7",30000)));

        System.out.println("GET Method :: " + listBooks.get(0));

        System.out.println("Is Empty :: " + listBooks.isEmpty());

        System.out.println("Sublist :: " + listBooks.subList(0,3));

        listBooks.clear();
        for (Book book : listBooks){
            System.out.println(book);
        }
        System.out.println();
    }

    private static void hashset() {
        System.out.println("_____________________ SET __________________________________");
        Set<Book> setBooks = new HashSet<>();

        setBooks.add( new Book(1,"Book1","author1", 150));
        setBooks.add( new Book(4,"book5","author5", 250));
        setBooks.add( new Book(2,"book2","author2", 3000));
        setBooks.add( new Book(3,"book3","author3", 450));
        setBooks.add( new Book(2,"book4","author4", 750));

        for (Book book : setBooks){
            System.out.println(book);
        }
        System.out.println("SET Size :: " + setBooks.size());

        System.out.println("ADD :: " + setBooks.add(new Book(5,"Book 6","author6",4000)));

        System.out.println("Remove :: " + setBooks.remove(new Book(5,"Book 6","author6",4000)));

        System.out.println("CONTAINS :: " + setBooks.contains(new Book(5,"Book 6","author6",4000)));

        System.out.println("Is Empty :: " + setBooks.isEmpty());


        setBooks.clear();
    }
}
