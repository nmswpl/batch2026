package in.co.nmsworks.training.week3.day1;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        bookList();
    }

    private static void bookList() {
        BookList python = new BookList(1,"AI","Jemuna", 25000.0);
        BookList java = new BookList(2,"Java Programming","Reema Thareja",4500.0);
        BookList javaAdvanced = new BookList(3,"Java Advanced Programming","Reema Thareja",4500.0);
        BookList c = new BookList(4,"C programming","Anu",100000.0);
        BookList dbms = new BookList(5,"DataBase","Yaazhini",40000.0);

        List<BookList> bookItem = new ArrayList<>();
        bookItem.add(python);
        bookItem.add(java);
        bookItem.add(javaAdvanced);
        bookItem.add(c);
        bookItem.add(c);
        bookItem.add(dbms);

        System.out.println("List of Books : ");
        System.out.println("Size of the BookList : "+bookItem.size());
        for (BookList bookList : bookItem) {
            System.out.println(bookList);
        }

        System.out.println("Get First :"+bookItem.get(3));
        System.out.println("Is Empty : "+bookItem.isEmpty());
        System.out.println("Index of java : "+bookItem.indexOf(java));
        System.out.println("Sublist of BookList: "+bookItem.subList(1,3));
        System.out.println("Size : "+bookItem.size());
        System.out.println("Remove Object : "+bookItem.remove(c));
        System.out.println("BookList Contains javaAdvanced book or not  : "+bookItem.contains(javaAdvanced));
        System.out.println("dbms Equals of python : "+dbms.equals(python));


        //Set

        Set<BookList> setItem = new HashSet<>();
        Set<BookList> setItem2 = new HashSet<>();

        setItem.add(python);
        setItem.add(java);
        setItem.add(javaAdvanced);
        setItem.add(c);
        setItem.add(c);
        setItem.add(dbms);

        System.out.println(" ");
        System.out.println("Hash Set of Books : ");
        System.out.println("Size of the Hash Set Books : "+setItem.size());
        for (BookList bookHashList : setItem) {
            System.out.println(bookHashList);

        }
        System.out.println("Is Empty : "+setItem.isEmpty());
        System.out.println("Size : "+setItem.size());
        System.out.println("Remove Object : "+setItem.remove(c));
        System.out.println("BookList Contains javaAdvanced book or not  : "+setItem.contains(javaAdvanced));
        System.out.println("dbms Equals of python : "+dbms.equals(python));

        //Set 2
        setItem2.addAll(setItem);
        System.out.println("Set 2 of Book set");
        for (BookList book2List : setItem2) {
            System.out.println(book2List);

        }
        System.out.println("Remove all from Set 2: "+setItem.removeAll(setItem2));


        //Linked Hash Set
        Set<BookList> linkedHashSetItem = new LinkedHashSet<>();
        linkedHashSetItem.add(python);
        linkedHashSetItem.add(java);
        linkedHashSetItem.add(javaAdvanced);
        linkedHashSetItem.add(c);
        linkedHashSetItem.add(c);
        linkedHashSetItem.add(dbms);

        System.out.println(" ");
        System.out.println("Set of Books : ");
        System.out.println("Size of the BookSet : "+linkedHashSetItem.size());
        for (BookList bookSet : linkedHashSetItem) {
            System.out.println(bookSet);

        }
        System.out.println("Is Empty : "+linkedHashSetItem.isEmpty());
        System.out.println("Size : "+linkedHashSetItem.size());
        System.out.println("Remove Object : "+linkedHashSetItem.remove(c));
        System.out.println("BookList Contains javaAdvanced book or not  : "+linkedHashSetItem.contains(javaAdvanced));
        System.out.println("dbms Equals of python : "+dbms.equals(python));



    }
}
