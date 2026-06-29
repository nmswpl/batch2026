package in.co.nmsworks.training.week3;

import in.co.nmsworks.training.week1.exam.Book;

import java.util.*;

public class Runner {

    public static void main(String[] args) {
        Book book1 = new Book(1,"Harry Potter", "J K Rowling", 430);
        Book book2 = new Book(1,"Harry Potter", "J K Rowling", 430);
        Book book3 = new Book(2,"Attack on Titan", "Hajime Isaiyama", 1150);
        Book book4 = new Book(3,"Alice in wonderland", "Alice", 340);
        Book book5 = new Book(4,"Java Programming","James Goshling", 450);

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book5);

        listImplementation(bookList, book5, book4, book1);

        setImplementation(book1, book2, book3, book4, book5);

        linkedHashSetImplementation(book1, book2, book3, book4, book5);

        hashMapImplementation(bookList);

        linkedHashMapImplementation(bookList);



    }

    private static void listImplementation(List<Book> bookList, Book book5, Book book4, Book book1) {
        System.out.println("BookList");
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i));
        }

        System.out.println(bookList.size());
        System.out.println(bookList.get(1));
        System.out.println(bookList.contains(book5));
        System.out.println(bookList.containsAll(bookList));
        System.out.println(bookList.isEmpty());
        System.out.println(bookList.indexOf(book4));
        System.out.println(bookList.remove(book1));
        System.out.println(bookList.set(4, book1));
        System.out.println(bookList);
        System.out.println(bookList.toArray());
        System.out.println(bookList.subList(2,4));
        bookList.clear();
        System.out.println(bookList.isEmpty());
    }

    private static void setImplementation(Book book1, Book book2, Book book3, Book book4, Book book5) {
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        bookSet.add(book5);


        System.out.println("BookSet : ");
        for (Book book : bookSet) {
            System.out.println(book);
        }

        System.out.println(bookSet.size());
//
//
//        System.out.println(bookSet.contains(book5));
//        System.out.println(bookSet.containsAll(bookList));
//        System.out.println(bookSet.isEmpty());
//        System.out.println(bookSet.getClass());
//        System.out.println(bookSet.remove(book1));
//        System.out.println(bookSet);
//        System.out.println(bookSet.toArray());
//        bookList.clear();
//        System.out.println(bookSet.isEmpty());
//        System.out.println(bookSet.removeAll(bookSet));
//        System.out.println(bookSet.isEmpty());
//
    }

    private static void linkedHashSetImplementation(Book book1, Book book2, Book book3, Book book4, Book book5) {
        Set<Book> bookSet1 = new LinkedHashSet<>();
//        bookSet1.addAll(bookList);
        bookSet1.add(book1);
        bookSet1.add(book2);
        bookSet1.add(book3);
        bookSet1.add(book4);
        bookSet1.add(book5);

        bookSet1.add(book5);
        System.out.println("Linked HashSet : ");
        for (Book book : bookSet1) {
            System.out.println(book);
        }
    }

    private static void hashMapImplementation(List<Book> bookList) {
        Map<Integer,Float> map = new HashMap<>();

        for (Book book : bookList) {
            map.put(book.getId(),book.getPrice());
        }

//        for (Book book : bookList) {
//            System.out.println(map.get(book.getId()));
//        }                                                             //Accessing using List

        for (Integer i : map.keySet()) {
            System.out.println("Key : "+i+", Value (Price) : "+map.get(i));

        }

        System.out.println(map.values());




    }

    private static void linkedHashMapImplementation(List<Book> bookList) {
        Map<Integer,Book> linkMap = new LinkedHashMap<>();

        for (Book book : bookList) {
            linkMap.put(book.getId(), book);
        }
        for (Integer i : linkMap.keySet()) {
            System.out.println("Key : "+i+" - Title : "+linkMap.get(i).getTitle());
        }
    }


}
