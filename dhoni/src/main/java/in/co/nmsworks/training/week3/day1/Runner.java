package in.co.nmsworks.training.week3.day1;

import in.co.nmsworks.training.week1.exam.Book;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Book book1 = new Book(1,"Java Programming","James",450);
        Book book2 = new Book(2,"C Programming"," Robert",250);
        Book book3 = new Book(3,"Javascript Programming","Joshua",350);
        Book book4 = new Book(4,"Python Programming","Martin",550);
        Book book5 = new Book(5,"Java Programming","Brian",350);
        Book book6 = new Book(6,"Type Script Programming","Rayan",350);

        //listMethods(book1, book2, book3, book4, book5, book6);
        //setMethods(book1, book2, book3, book4, book5, book6);
        mapMethods(book1, book2, book3, book4, book5, book6);
    }

    private static void mapMethods(Book book1, Book book2, Book book3, Book book4, Book book5, Book book6){

        Map<Integer,Integer> map = new HashMap<>();

        map.put(book2.getBookId(),(int) book2.getPrice());
        map.put(book1.getBookId(),(int) book1.getPrice());
        map.put(book3.getBookId(),(int) book3.getPrice());
        map.put(book5.getBookId(),(int) book5.getPrice());
        map.put(book4.getBookId(),(int) book4.getPrice());

        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            System.out.println("book id : " + m.getKey() + " book price : " + m.getValue());
        }

        System.out.println("Linked hash map");

        Map<Integer,Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put(book5.getBookId(),(int) book5.getPrice());
        linkedMap.put(book1.getBookId(),(int) book1.getPrice());
        linkedMap.put(book2.getBookId(),(int) book2.getPrice());
        linkedMap.put(book3.getBookId(),(int) book3.getPrice());
        linkedMap.put(book4.getBookId(),(int) book4.getPrice());

        for(Map.Entry<Integer,Integer> m : linkedMap.entrySet()){
            System.out.println("book id : " + m.getKey() + " book price : " + m.getValue());
        }

        Map<Integer,Book> mapBook = new LinkedHashMap<>();
        mapBook.put(book1.getBookId(),book1);
        mapBook.put(book2.getBookId(),book2);
        mapBook.put(book3.getBookId(),book3);
        mapBook.put(book4.getBookId(),book4);
        mapBook.put(book5.getBookId(),book5);

        for(Map.Entry<Integer,Book> m : mapBook.entrySet()){
            System.out.println("book id : " + m.getKey() + " book price : " + m.getValue().getPrice());
        }

    }


    private static void setMethods(Book book1, Book book2, Book book3, Book book4, Book book5, Book book6) {
        Set<Book> set = new HashSet<>();
        set.add(book1);
        set.add(book2);
        set.add(book3);
        set.add(book4);
        set.add(book5);

        System.out.println("Elements in set : ");
        for (Book book : set){
            System.out.println(book);
        }

        System.out.println("Set methods : ");
        System.out.println("Set size : " + set.size());
        System.out.println("Set contains book6 : " + set.contains(book6));
        System.out.println("Set remove book1 :" + set.remove(book1));

        System.out.println("LinkedHash Set");
        Set<Book> linkedSet = new LinkedHashSet<>();

        linkedSet.add(book1);
        linkedSet.add(book2);
        linkedSet.add(book3);
        linkedSet.add(book4);
        linkedSet.add(book5);


        for(Book book : linkedSet){
            System.out.println(book);
        }

        System.out.println("contains book1 : "+ linkedSet.contains(book1));
        System.out.println("remove book5 : " + linkedSet.remove(book5));
        System.out.println(linkedSet);
        System.out.println(" Is empty : " + linkedSet.isEmpty());
    }

    private static void listMethods(Book book1, Book book2, Book book3, Book book4, Book book5, Book book6) {
        List<Book> list = new ArrayList<>();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);
        list.add(book5);
        list.add(book5);

        List<Book> list2 = new ArrayList<>();
        list2.add(book1);
        list2.add(book2);
        list2.add(book3);
        List<Book> list3 = new ArrayList<>();

        System.out.println("size of list : " +list.size());
        for(Book book : list) {
            System.out.println(book);
        }

        System.out.println(" list index book3  "+ list.indexOf(book3));
        System.out.println(" list is empty" + list.isEmpty());
        System.out.println(" book3 == book1 " + book3.equals(book1));
        System.out.println(" book6 contains : " + list.contains(book6));
        System.out.println(" remove book1 : " + list.remove(book1));
        System.out.println(" remove index 2 : " + list.remove(2));

        System.out.println("add list1 and list2 in list3 : ");
        System.out.println(list3.addAll(list));
        System.out.println(list3);
        System.out.println(list3.addAll(list2));
        System.out.println(list3);
        list.clear();
        System.out.println(" list after cleared : " + list);
    }
}
