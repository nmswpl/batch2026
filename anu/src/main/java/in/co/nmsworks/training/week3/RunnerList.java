package in.co.nmsworks.training.week3;

import in.co.nmsworks.training.week1.set1.BookDetail;

import java.util.*;

public class RunnerList {
    public static void main(String[] args) {
        listOfArray();
        setOfArray();
        hashSetOfArray();
    }


    private static void listOfArray(){
        BookDetail book1 =new BookDetail(101,"Java Programming","James Gosling",450.0);
        BookDetail book2 =new BookDetail(102,"C++ Programming","Anushri",550.0);
        BookDetail book3 =new BookDetail(101,"oops Programming","Kavitha",350.0);
        BookDetail book4 =new BookDetail(103,"c Programming","Thayuman",480.0);
        BookDetail book5 =new BookDetail(104,"Python Programming","Vasanth",850.0);

        List<BookDetail> bookItem = new ArrayList<>();

        bookItem.add(book1);
        bookItem.add(book2);
        bookItem.add(book3);
        bookItem.add(book4);
        bookItem.add(book5);
        bookItem.add(book5);

        System.out.println("Book List size : " + bookItem.size());
        System.out.println();
        for (int i = 0; i < bookItem.size(); i++) {
            System.out.println(bookItem.get(i));
        }

        BookDetail newBook = new BookDetail(105, "Spring Boot", "Rod Johnson", 600.0);
        bookItem.add(2, newBook);
        System.out.println();
        System.out.println("Added new book at index 2 New size: " + bookItem.size());
        System.out.println();
        System.out.println("Item at index 0 " + "\n" + bookItem.get(0));
        System.out.println();
        System.out.println("check the equals of object : " + book1.equals(book3));
        System.out.println();
        System.out.println("check the contains: " + bookItem.contains(book1));
        System.out.println();
        System.out.println("remove the object : " + bookItem.remove(book3));
        System.out.println();
        System.out.println("sublist of an list array : " + "\n" + bookItem.subList(3,5));
        System.out.println();

    }

    private static void setOfArray(){
        BookDetail book1 =new BookDetail(101,"Java Programming","James Gosling",450.0);
        BookDetail book2 =new BookDetail(102,"C++ Programming","Anushri",550.0);
        BookDetail book3 =new BookDetail(101,"Java Programming","James Gosling",450.0);
        BookDetail book4 =new BookDetail(103,"c Programming","Thayuman",480.0);
        BookDetail book5 =new BookDetail(104,"Python Programming","Vasanth",850.0);

       Set<BookDetail> bookDetailSet=new HashSet<>();

        bookDetailSet.add(book1);
        bookDetailSet.add(book2);
        bookDetailSet.add(book5);
        bookDetailSet.add(book4);
        bookDetailSet.add(book3);
        bookDetailSet.add(book3);
        bookDetailSet.add(book3);

        System.out.println("Book List size : " + bookDetailSet.size());
        for (BookDetail bookDetail : bookDetailSet) {
            System.out.println(bookDetail);
        }

        System.out.println("check the equals of object : " + book1.equals(book3));
        System.out.println("check the contains: " + bookDetailSet.contains(book1));
        System.out.println("remove the object : " + bookDetailSet.remove(book3));

        Set<BookDetail> bookDetailSet2=new HashSet<>();
        BookDetail book8 =new BookDetail(107," Programming","tamil",490.0);
        BookDetail book9 =new BookDetail(109,"oops Programming","john",480.0);
        bookDetailSet2.add(book8);
        bookDetailSet2.add(book9);

        bookDetailSet.addAll(bookDetailSet2);
        System.out.println("Updated List: "+bookDetailSet);

        bookDetailSet.removeAll(bookDetailSet2);
        System.out.println("After invoking removeAll() method: "+bookDetailSet);
    }

    private static void hashSetOfArray() {
        BookDetail book1 =new BookDetail(101,"Java Programming","James Gosling",450.0);
        BookDetail book2 =new BookDetail(102,"C++ Programming","Anushri",550.0);
        BookDetail book3 =new BookDetail(101,"Java Programming","James Gosling",450.0);
        BookDetail book4 =new BookDetail(103,"c Programming","Thayuman",480.0);
        BookDetail book5 =new BookDetail(104,"Python Programming","Vasanth",850.0);

        LinkedHashSet<BookDetail>  bookDetailLinkedHashSet= new LinkedHashSet<>();
        bookDetailLinkedHashSet.add(book1);
        bookDetailLinkedHashSet.add(book2);
        bookDetailLinkedHashSet.add(book3);
        bookDetailLinkedHashSet.add(book4);

        Iterator<BookDetail> i = bookDetailLinkedHashSet.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("the hash of an linkedhashset  " + bookDetailLinkedHashSet);
        System.out.println(bookDetailLinkedHashSet.remove(book4));

        System.out.println("After removing the element, the hash set is: " + bookDetailLinkedHashSet);

    }

}
