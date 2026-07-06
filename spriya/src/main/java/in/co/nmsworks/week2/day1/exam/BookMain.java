package in.co.nmsworks.week2.day1.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;



public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setId(101);
        b1.setTitle("Java Programming");
        b1.setAuthor("James Gosling");
        b1.setPrice(450.0);

        Book b2 = new Book();
        b2.setId(102);
        b2.setTitle("Computer");
        b2.setAuthor("Charles Babbage");
        b2.setPrice(550.0);

        Book b3 = new Book();
        b3.setId(103);
        b3.setTitle("The Silent Patient");
        b3.setAuthor("Alicia Berenson");
        b3.setPrice(600.0);

        Book b4 = new Book();
        b4.setId(104);
        b4.setTitle("Ikigai");
        b4.setAuthor("Japanese author");
        b4.setPrice(900.0);

        Book b5 = new Book();
        b5.setId(105);
        b5.setTitle("America");
        b5.setAuthor("Avengers");
        b5.setPrice(950.0);

//        System.out.println(b1.getID());
//        System.out.println(b1.getTitle());
//        System.out.println(b1.getAuthor());
//        System.out.println(b1.getPrice());

        List<Book> list = new ArrayList<>();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);
        list.add(b5);
//        System.out.println("---LIST---");
//        System.out.println(" ");
//        // System.out.println(list.toString());
//
//        for (Book book : list) {
//            System.out.println(book);
//        }
//
//        System.out.println("The size of list is:" + list.size());
//        System.out.println("Contains method:" + list.contains(b1));
//        System.out.println("Set method:" + list.set(0, b5));
//        System.out.println("Get Method: "+list.get(5));
//        System.out.println("The size of list is:" + list.size());
//        System.out.println("List set :"+list.set(0, b5));
//        System.out.println("List index of method : "+ list.indexOf(b2));
//        for (Book book : list) {
//            System.out.println(book);
//        }
//
//
//        System.out.println("List Last Index method :"+list.lastIndexOf(b5));
//        System.out.println("List index of method :"+list.indexOf(b5));
//        System.out.println("List remove method : "+list.remove(b5));
//        System.out.println("List last Index method :"+list.lastIndexOf(b5));
//        System.out.println("List Index of method :"+list.indexOf(b5));
//        System.out.println("List remove metod :"+list.remove(0));
//
//
//        System.out.println("---SET---");
//        Set<Book> set = new HashSet<>();
//        set.add(b1);
//        set.add(b2);
//        set.add(b3);
//        set.add(b4);
//        set.add(b5);
//        set.add(b2);
//        System.out.println(set.toString());
//        System.out.println("The size of set is:" + set.size());
//        for (Book book : set) {
//            System.out.println(book);
//        }
//
//        System.out.println("Contains method:" + set.contains(b1));
//        System.out.println("Empty method:" + set.isEmpty());
//        System.out.println("Set Remove method"+set.remove(b2));
//        System.out.println("Set HashCode method : "+set.hashCode());
//       // System.out.println(set.);
//
//        for (Book book : set) {
//            System.out.println(book);
//        }
//        Book[] arr = new Book[set.size()];
//        set.toArray();
//        for (int i = 0; i < set.size(); i++) {
//            System.out.println(set);
//        }

//        Set<Book> set1=new LinkedHashSet<>();
//        set1.add(b1);
//        set1.add(b2);
//        set1.add(b3);
//        set1.add(b4);
//        set1.add(b5);
//        set1.add(b2);
//        System.out.println("---LINKED HASH SET---");
//        System.out.println();
//
//        for (Book book : set1) {
//            System.out.println(book);
//        }
//        System.out.println("Remove method : "+set1.remove(b1));
//        for (Book book : set1) {
//            System.out.println(book);
//        }


        Map<Integer,Book> map=new HashMap<>();
//       map.put(101,b1);
//       map.put(102,b2);
//       map.put(103,b3);
//       map.put(104,b4);
//       map.put(105,b5);

        for (Book book : list) {
            map.put(book.getID(),book);
        }


       for(Map.Entry<Integer,Book> entry:map.entrySet()){
           System.out.println(entry.getKey() +" , "+entry.getValue().getAuthor());
       }


        System.out.println(map.get(101));









    }
}
