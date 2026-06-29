package in.co.nmsworks.training.week2.day5.task;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        LibraryBook hp = new LibraryBook(1, "Harry Potter", "Author name", 2000, 1);
        LibraryBook ps = new LibraryBook(2, "Ponniyin Selvan", "Kalki", 2000, 3);

//        hp.checkout();
//        hp.checkout();
//        ps.checkout();

//        LibraryBook ej = new LibraryBook(1, "Effective Java", "Robert", 1997, 5);
        LibraryBook dsa = new LibraryBook(3, "DSA", "Author name", 1997, 5);
        LibraryBook sd = new LibraryBook(4, "System Design", "Author name", 1997, 5);

        List<LibraryBook> books = new ArrayList<>();
        books.add(hp);
        books.add(ps);
//        books.add(ej);
        books.add(dsa);
        books.add(sd);
//        books.add(hp);
//        books.add(ps);
//        books.add(ej);
//        books.add(dsa);
//        books.add(sd);

//        System.out.println("List size : " + books.size());

//        for (LibraryBook book : books) {
//            System.out.println(book);
//        }

        Set<LibraryBook> bookSet = new HashSet<>();
        bookSet.add(hp);
        bookSet.add(ps);
//        bookSet.add(ej);
        bookSet.add(dsa);
        bookSet.add(dsa);
        bookSet.add(sd);
        bookSet.add(sd);
//        bookSet.add(ej);
        bookSet.add(hp);

//        System.out.println("Hashset:");
//        System.out.println("Set size : " + bookSet.size());
//        for(LibraryBook book : bookSet) {
//            System.out.println(book);
//        }

//        System.out.println("Get method : " + books.get(1));
//        System.out.println("contains check before remove : " + books.contains(ps));
//        books.remove(ps);
//        System.out.println("contains check after remove : " + books.contains(ps));
//        System.out.println("list : " + books);
//        System.out.println("Index of sd before remove : " + books.indexOf(sd));
//        books.remove(1);
//        System.out.println("list : " + books);
//        System.out.println("Index of sd after remove : " + books.indexOf(sd));;

        List<LibraryBook> subList = books.subList(2, 4);
//        System.out.println("Sublist");
//        subList.forEach(System.out::println);

//        System.out.println("Contains all : " + books.containsAll(subList));
//
//        System.out.println("Before clear : " + books.isEmpty());
//        books.clear();
//        System.out.println("After clear : " + books.isEmpty());
//
//        System.out.println("Sublist : " + subList);
//        subList.clear();
//        System.out.println("Books size before retain all : " + books.size());
//        System.out.println("Retain all : " + books.retainAll(subList));;
//        System.out.println(books);
//        System.out.println("Books size after retain all : " + books.size());

//        System.out.println("size : " + bookSet.size());

//        System.out.println(bookSet);
//        bookSet.addAll(subList);
//        System.out.println(bookSet);

//        bookSet.retainAll(subList);

//        bookSet.removeAll()


//        System.out.println("Linked Hashset : ");
        Set<LibraryBook> libraryBooks = new LinkedHashSet<>();
        libraryBooks.add(ps);
        libraryBooks.add(hp);
//        libraryBooks.add(ej);
//        libraryBooks.add(ej);
        libraryBooks.add(sd);
        libraryBooks.add(sd);
        libraryBooks.add(dsa);

//        for (LibraryBook book : libraryBooks) {
//            System.out.println(book);
//        }

        //id - price

        mapPractice(books);
    }

    private static void mapPractice(List<LibraryBook> books) {

        System.out.println("List : " + books);

        Map<Integer, LibraryBook> map = new HashMap<>();

//        for (LibraryBook book : books) {
        for (int i = books.size()-1; i >= 0; i--) {
//            map.put(book.getId(), book);
            map.put(books.get(i).getId(), books.get(i));
        }

        System.out.println("HASHMAP:");
//        System.out.println("Id with Publication Year : ");
//        for (Map.Entry<Integer, LibraryBook> data : map.entrySet()) {
//            System.out.println("Id : " + data.getKey() + " || Publication Year : " + data.getValue().getPublicationYear());
//        }

        System.out.println("Id with Title : ");
        for (Map.Entry<Integer, LibraryBook> data : map.entrySet()) {
            System.out.println("Id : " + data.getKey() + " || Title : " + data.getValue().getTitle());
        }

        System.out.println("LINKED HASHMAP : ");
        Map<Integer, LibraryBook> linkedHashmap = new LinkedHashMap<>();

        for (LibraryBook book : books) {
            linkedHashmap.put(book.getId(), book);
        }

        System.out.println("Id with Title : ");
        for (Map.Entry<Integer, LibraryBook> data : linkedHashmap.entrySet()) {
            System.out.println("Id : " + data.getKey() + " || Title : " + data.getValue().getTitle());
        }

    }


}
