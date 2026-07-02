package in.co.nmsworks.training.week2.weekend;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Runner runner = new Runner();
//        manageLibraryBooks();
        List<LibraryBook> books = new ArrayList<>();
        String[] names = {"Java","Javascript","Java","Python","Cpp"};
        int id;
        for (int i = 0; i < names.length; i++) {
            id = i+1;
            books.add(new LibraryBook(id,names[i],"John",String.valueOf(i+2007),10+i));
        }
//        books.add(books.get(0));
//        System.out.println("-------------List LibraryBooks----------------");
//        for (LibraryBook book : books) {
//            System.out.println(book);
//        }
//        List<LibraryBook> lb =  new ArrayList<>();
//        lb.add(books.get(0));
//        books.removeAll(lb);
//        System.out.println("-------------List LibraryBooks----------------");
//        for (LibraryBook book : books) {
//            System.out.println(book);
//        }
//        Set<LibraryBook> bookSet = new HashSet<>();
//////        for (LibraryBook book : books) {
//////            bookSet.add(book);
//////        }
//        bookSet.addAll(books);
//        System.out.println("-------------Set LibraryBooks----------------");
//        for (LibraryBook book : bookSet) {
//            System.out.println(book);
//        }
//        System.out.println("----------------------------------------List Methods----------------------------------------");
//        System.out.println(books.contains(books.get(0)));
//        System.out.println(books.addAll(bookSet));
//        System.out.println(books.containsAll(bookSet));
//        System.out.println(books.indexOf(books.get(5)));
//        System.out.println(books.isEmpty());
//        System.out.println(books.lastIndexOf(books.get(0)));
//        System.out.println(books.remove(0));
//        System.out.println("-------------List LibraryBooks----------------");
//        for (LibraryBook book : books) {
//            System.out.println(book);
//        }
//        System.out.println("----------------------------------------Set Methods----------------------------------------");
//        System.out.println(bookSet.contains(books.get(0)));
//        System.out.println(bookSet.addAll(bookSet));
//        System.out.println(bookSet.containsAll(books));
//        System.out.println(bookSet.isEmpty());
//        System.out.println("-----------------------------------Linked Hashset---------------------------");
//        Set<LibraryBook> slb = new LinkedHashSet<>();
//        slb.addAll(books);
//        for (LibraryBook libraryBook : slb) {
//            System.out.println(libraryBook);
//        }
        manageBooksInMap(books);
    }

    private static void manageBooksInMap(List<LibraryBook> books) {
        Map<Integer,String> bookMap = new HashMap<>();
        for (LibraryBook book : books) {
            bookMap.put(book.getId(),book.getPublicationYear());
        }
        bookMap.put(6,"2012");
        System.out.println("HashMap");
        for (Integer key : bookMap.keySet())
        {
            System.out.println(key+" "+bookMap.get(key));
        }
        Map<Integer,String> bookmp = new LinkedHashMap<>();
        System.out.println("Linked HashMap");
        for (LibraryBook book : books) {
            bookmp.put(book.getId(),book.getPublicationYear());
        }
        bookmp.put(6,"2012");
        for (Integer key : bookmp.keySet())
        {
            System.out.println(key+" "+bookmp.get(key));
        }
    }

    private static void manageLibraryBooks() {
        LibraryBook book1 = new LibraryBook(1,"Java","John","2007",10);
        book1.checkout(12);
        System.out.println(book1);
        book1.checkout(7);
        System.out.println(book1);
    }
}
