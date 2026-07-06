package in.co.nmsworks.training.week1.exam;

import java.util.*;

public class BookRunner {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Java Programming", "James Gosling", 450);
        Book b2 = new Book(102, "HTML", "Tim Berners Lee", 489);
        Book b3 = new Book(103, "Java", "James ", 458);
        Book b4 = new Book(104, "Java Programming", "James Gosling", 450);
        Book b5 = new Book(105, "Java Programming", "James Gosling", 450);

//        b1.display();
//        b2.display();
//        b3.display();
//        b4.display();
//        b5.display();
        System.out.println("List .....");
        List<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);   // maintain the inserted order
        bookList.add(b5);
        bookList.add(b3);   // allow duplicates
        System.out.println("Using get Method : "+bookList.get(2));
        System.out.println("Using Contains Method :: "+bookList.contains(b3));
        System.out.println("Using IndexOf method :: "+bookList.indexOf(b4));
        System.out.println("Check the list is empty :: " + bookList.isEmpty());
        System.out.println("Last Index of the Object :: " +bookList.lastIndexOf(b3));
        System.out.println("Sublist : "+bookList.subList(1,3));
//        System.out.println("Set object "+bookList.set(2,b4));
        System.out.println("Remove from a list : "+ bookList.remove(b4));


        System.out.println(bookList.size());
        System.out.println(bookList);
        for (Book book : bookList) {
            System.out.println(book);
        }

        Iterator<Book> iterator = bookList.iterator();
        while ( iterator.hasNext()){
            Book value = iterator.next();
            System.out.println("Values : "+value);
        }

        System.out.println("Set.....");
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(b1);
        bookSet.add(b2);
        bookSet.add(b3);
        bookSet.add(b4);   //can't maintain the inserted order
        bookSet.add(b5);
        bookSet.add(b4);   // can't allow duplicates

        System.out.println("Set size :: "+bookSet.size());
        System.out.println("Check the set is empty : "+ bookSet.isEmpty());
        System.out.println("Get Method in Set : " + bookSet.contains(b3));
        System.out.println("Remove object : "+bookSet.remove(b3));
        System.out.println("Equal  : "+ bookSet.equals(bookList.subList(1,2)));
//        bookSet.clear();
//        System.out.println("Set size :: "+bookSet.size());
        System.out.println(bookSet.retainAll(bookSet));

        for (Book book : bookSet) {
            System.out.println(book);
        }


        System.out.println("Linked Hash Set : ");
        Set<Book> bookLinkedHashSet = new LinkedHashSet<>();
        bookLinkedHashSet.add(b1);
        bookLinkedHashSet.add(b2);
        bookLinkedHashSet.add(b3);
        bookLinkedHashSet.add(b4);   // maintain the inserted order
        bookLinkedHashSet.add(b5);
        bookLinkedHashSet.add(b4);

        for (Book book : bookLinkedHashSet) {
            System.out.println(book);
        }

        System.out.println("Size : "+ bookLinkedHashSet.size());
        System.out.println("Equals : "+bookLinkedHashSet.equals(bookLinkedHashSet));
        System.out.println("Check is Empty : "+ bookLinkedHashSet.isEmpty());
        System.out.println("Remove Object : "+ bookLinkedHashSet.remove(b3));


        System.out.println("Map....");

        Map<Integer,Book> bookPriceMap = new HashMap<>();
        bookPriceMap.put(b1.getId(),b1);
        bookPriceMap.put(b2.getId(),b2);
        bookPriceMap.put(b3.getId(),b3);
        bookPriceMap.put(b4.getId(),b4);
        bookPriceMap.put(b5.getId(),b5);

        System.out.println("Get price of the book "+bookPriceMap.get(101));
        System.out.println(bookPriceMap.entrySet());
        System.out.println("Size of the Map  : "+bookPriceMap.size());
        System.out.println("Contain Key : "+ bookPriceMap.containsKey(105));
        System.out.println(" Contains Value : "+ bookPriceMap.containsValue(b1));
        System.out.println(" Key set : "+ bookPriceMap.keySet());
        System.out.println("Values "+ bookPriceMap.values());
        System.out.println("Add if absent "+ bookPriceMap.putIfAbsent(106,b2));
        System.out.println("Replace value "+ bookPriceMap.replace(106, b4));
        System.out.println("Remove "+ bookPriceMap.remove(106));
        System.out.println("Is Empty : "+bookPriceMap.isEmpty());
        for (Map.Entry<Integer,Book>  entry : bookPriceMap.entrySet()){
            System.out.println("Key : "+entry.getKey()+ "  ::  Value : "+ entry.getValue());
        }


    }
}
