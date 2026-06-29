package in.co.nmsworks.training.week2.day6;

import java.util.*;

public class LibraryBookRunner {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook(1, "Java Programming", "Author1", 2016, 50);
        LibraryBook book2 = new LibraryBook(2, "C Programming", "Author2", 2016, 50);
        LibraryBook book3 = new LibraryBook(3, "Computer Networks", "Author3", 2008, 40);
        LibraryBook book4 = new LibraryBook(4, "Operating System", "Author4", 2010, 2);
        LibraryBook book5 = new LibraryBook(5,"DBMS", "Author5", 2005, 5);
        LibraryBook book6 = new LibraryBook(6,"TOC", "Author6", 2015, 45);
        LibraryBook book7 = new LibraryBook(7,"Compiler Design", "Author7", 2005, 40);
        LibraryBook book8 = new LibraryBook(8,"Data Structures", "Author8", 2015, 60);


        LibraryBook[] bookArray = {book1, book2, book4, book5 , book3,book1, book2};

        LibraryBookRunner bookRunner = new LibraryBookRunner();
        bookRunner.addBooksIntoArrayList(bookArray);
        bookRunner.addBooksIntoLinkedArrayList(bookArray);
        bookRunner.addBooksIntoHashSet(bookArray);
        bookRunner.addBooksIntoLinkedHashSet(bookArray);
        bookRunner.addBooksIntoMap(bookArray);
        bookRunner.addBooksIntoLinkedMap(bookArray);


    }

    public void addBooksIntoMap(LibraryBook[] bookArr){

        Map<Integer, String> booksMap = new HashMap<>();

        for (int i = 0; i < bookArr.length; i++) {
            booksMap.put(bookArr[i].getId(), bookArr[i].getTitle());
        }

        System.out.println("\nList of Books in Map : ");
        for(Integer id : booksMap.keySet()){
            System.out.println(booksMap.get(id));
        }


    }

    public void addBooksIntoLinkedMap(LibraryBook[] bookArr){

        Map<Integer, String> booksLinkedMap = new LinkedHashMap<>();

        for (int i = 0; i < bookArr.length; i++) {
            booksLinkedMap.put(bookArr[i].getId(), bookArr[i].getTitle());
        }

        System.out.println("\nList of Books in LinkedHashMap : ");
        for(Integer id : booksLinkedMap.keySet()){
            System.out.println(booksLinkedMap.get(id));
        }


    }

    public void addBooksIntoArrayList(LibraryBook[] bookArr){

        List<LibraryBook> bookList = new ArrayList<LibraryBook>();

        for (int i = 0; i < bookArr.length; i++) {
            bookList.add(bookArr[i]);
        }

        System.out.println("\nList of Books in ArrayList : ");
        System.out.println("Size of bookList : " + bookList.size());
        for (LibraryBook libraryBook : bookList) {
            System.out.println(libraryBook);
        }


    }

    public void addBooksIntoLinkedArrayList(LibraryBook[] bookArr){

        List<LibraryBook> bookLinkedList = new LinkedList<>();

        for (int i = 0; i < bookArr.length; i++) {
            bookLinkedList.add(bookArr[i]);
        }

        System.out.println("\nList of Books in LinkedList : ");
        System.out.println("Size of bookList : " + bookLinkedList.size());
        for (LibraryBook libraryBook : bookLinkedList) {
            System.out.println(libraryBook);
        }


    }


    public void addBooksIntoHashSet(LibraryBook[] bookArr){

        Set<LibraryBook> bookSet = new HashSet<LibraryBook>();

        for (int i = 0; i < bookArr.length; i++) {
            bookSet.add(bookArr[i]);
        }

        System.out.println("\nList of Books in HashSet : ");
        System.out.println("Size of bookSet : " + bookSet.size());
        for (LibraryBook libraryBook : bookSet) {
            System.out.println(libraryBook);
        }

    }


    public void addBooksIntoLinkedHashSet(LibraryBook[] bookArr){

        Set<LibraryBook> bookLinkedSet = new LinkedHashSet<>();

        for (int i = 0; i < bookArr.length; i++) {
            bookLinkedSet.add(bookArr[i]);
        }

        System.out.println("\nList of Books in LinkedHashSet : ");
        System.out.println("Size of bookLinkedSet : " + bookLinkedSet.size());
        for (LibraryBook libraryBook : bookLinkedSet) {
            System.out.println(libraryBook);
        }

    }


}
