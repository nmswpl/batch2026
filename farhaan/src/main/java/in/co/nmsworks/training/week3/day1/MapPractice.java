package in.co.nmsworks.training.week3.day1;

import in.co.nmsworks.training.week1.exam.Book;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {
        mapMethod();
        linkedHashMapMethod();
        mapByObject();
        linkedMapByObject();
    }

    public static void linkedMapByObject() {

        Map<Integer, Book> newObjectMap = new LinkedHashMap<>();
        System.out.println("_________________Linked Map By Object_____________________");
        newObjectMap.put(1, new Book(100, "Harry Potter", "JK Rowling", 200));
        newObjectMap.put(3, new Book(102, "Rich Dad", "Robert", 600));
        newObjectMap.put(2, new Book(101, "Hobbit", "Tolkein ", 400));
        for (Book b : newObjectMap.values()) {
            System.out.println("Id :: " + b.getId() + " ::::: Price :: " + b.getPrice());
        }
    }

    public static void mapByObject() {
        Map<Integer, Book> newObjectMap = new HashMap<>();
        System.out.println("_________________Map By Object_____________________");
        newObjectMap.put(1, new Book(100, "Harry Potter", "JK Rowling", 200));
        newObjectMap.put(2, new Book(101, "Hobbit", "Tolkein ", 400));
        newObjectMap.put(3, new Book(102, "Rich Dad", "Robert", 600));
        for (Book b : newObjectMap.values()) {
            System.out.println("Id :: " + b.getId() + " ::::: Price :: " + b.getPrice());
        }
    }

    public static void linkedHashMapMethod() {
        LinkedHashMap<Integer, Double> priceMap = new LinkedHashMap<>();
        List<Book> listBooks = new ArrayList<>();
        System.out.println("________Linked HASH MAP________________");
        listBooks.add(new Book(1, "Book1", "author1", 150));
        listBooks.add(new Book(3, "book3", "author3", 450));
        listBooks.add(new Book(2, "book4", "author4", 750));
        listBooks.add(new Book(4, "book5", "author5", 250));
        listBooks.add(new Book(2, "book2", "author2", 3000));


        for (Book b : listBooks) {
            priceMap.put(b.getId(),b.getPrice());
        }

        for (Integer key : priceMap.keySet()) {
            System.out.println("Book ID : " + key + " :::: Price : " + priceMap.get(key));
        }
        System.out.println("______________________________________");
        priceMap.put(2,3500.00);
        for (Integer key : priceMap.keySet()) {
            System.out.println("Book ID : " + key + " :::: Price : " + priceMap.get(key));
        }
    }


    public static void mapMethod() {
        Map<Integer, Double> priceMap = new HashMap<>();
        List<Book> listBooks = new ArrayList<>();
        System.out.println("________HASH MAP________________");
        listBooks.add(new Book(1, "Book1", "author1", 150));
        listBooks.add(new Book(4, "book5", "author5", 250));
        listBooks.add(new Book(2, "book2", "author2", 3000));
        listBooks.add(new Book(3, "book3", "author3", 450));
        listBooks.add(new Book(2, "book4", "author4", 750));

        for (Book b : listBooks) {
            priceMap.put(b.getId(), b.getPrice());
        }

        for (Integer key : priceMap.keySet()) {
            System.out.println("Book ID : " + key + " :::: Price : " + priceMap.get(key));
        }
    }

}