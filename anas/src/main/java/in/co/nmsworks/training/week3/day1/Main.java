package in.co.nmsworks.training.week3.day1;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        // Library System

        LibraryBook b1 = new LibraryBook(
                1,
                "Java Programming",
                "James Gosling",
                1995,
                2
        );

        LibraryBook b2 = new LibraryBook(
                2,
                "Clean Code",
                "Robert Martin",
                2008,
                0
        );

        LibraryBook b3 = new LibraryBook(
                3,
                "Java Programming",
                "James Gosling",
                1995,
                2
        );

        LibraryBook b4 = new LibraryBook(
                4,
                "Python Programming",
                "James",
                1996,
                5
        );

        List <LibraryBook> bookList = new ArrayList();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        bookList.add(b1);

        System.out.println("size of list :: " + bookList.size());

        for (LibraryBook book : bookList) {
            System.out.println(book);
        }

        System.out.println("-------------------------------------------------");


        Set <LibraryBook> bookset = new HashSet<>();
        bookset.add(b1);
        bookset.add(b2);
        bookset.add(b3);
        bookset.add(b4);
        bookset.add(b1);

        System.out.println("size of set :: " + bookset.size());

        for (LibraryBook book : bookset) {
            System.out.println(book);
        }

        System.out.println("------------------------------------------------");



      /*  System.out.println("Get element in index in the booklist::" + bookList.get(1));
//        System.out.println("element contains :: " + bookList.contains(b3));
        //bookList.remove(b1);
        System.out.println("booklist contains b1 :: " + bookList.contains(b1));
        bookList.remove(b3);
        System.out.println("booklist contains element after removing b3:: " + bookList.contains(b3));
        System.out.println("contains all in booklist:: " + bookList.containsAll(bookList));
        System.out.println("sublist of booklist :: " + bookList.subList(2,4));

        List<LibraryBook> subbook = bookList.subList(2,4);
        System.out.println("contains all of subbook in booklist :: " + bookList.containsAll(subbook));

        System.out.println("elements in booklist before clear :: ");
        for (LibraryBook book : bookList) {
            System.out.println(book);
        }
//        bookList.clear();
        System.out.println("booklist is empty :: " + bookList.isEmpty());
        bookList.retainAll(subbook);
        System.out.println("booklist after retaining subbook ::");
        System.out.println(bookList);
        System.out.println("------------------------------------------------------");
        System.out.println("size of bookset ::" + bookset.size());
        System.out.println();

//        hashset

        System.out.println("------------------------------------------------------");

        LinkedHashSet<LibraryBook> bookLinkedHashSet = new LinkedHashSet<>();
        bookLinkedHashSet.add(b3);
        bookLinkedHashSet.add(b1);
        bookLinkedHashSet.add(b2);
        bookLinkedHashSet.add(b4);
        bookLinkedHashSet.add(b2);

        System.out.println("elements in booklinkedhashset :: ");
        System.out.println(bookLinkedHashSet);

        System.out.println("elements in hashset :: ");
        System.out.println(bookset);


       */


        /*b1.display();
        b1.checkout();

        System.out.println();

        b2.display();
        b2.checkout();
        */
        mapMethod(bookList);
        linkedMapMehtod(bookList);
    }

    private static void linkedMapMehtod(List<LibraryBook> books) {

        System.out.println("--object as value in linked hashmap--");
        Map<Integer, LibraryBook> map = new LinkedHashMap<>();
        for (LibraryBook book : books) {
            map.put(book.getId(), book);
        }
        for(Map.Entry<Integer, LibraryBook> data : map.entrySet()){
            System.out.println("key : " + data.getKey() + "---value : " + data.getValue().getYear());
        }
    }



    static void mapMethod(List<LibraryBook> books){

        System.out.println("--year as a value in hashmap--");
        Map<Integer, Integer> map = new HashMap<>();

        for (LibraryBook book : books) {
            map.put(book.getId(), book.getYear());
        }
        for (Map.Entry<Integer, Integer> data : map.entrySet()){
            System.out.println("key : " + data.getKey() + "---Value : " + data.getValue());
        }
        System.out.println();

        System.out.println("--object as a value in hashmap--");

        Map<Integer, LibraryBook> objectMap = new HashMap<>();

        for (LibraryBook book : books) {
            objectMap.put(book.getId(), book);
        }

        for (Map.Entry<Integer, LibraryBook> data : objectMap.entrySet()){
            System.out.println("key : " + data.getKey() + "---value : " + data.getValue().getYear());
        }
    }
}
