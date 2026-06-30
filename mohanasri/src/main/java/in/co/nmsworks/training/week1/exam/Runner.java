package in.co.nmsworks.training.week1.exam;
import java.util.*;

public class Runner {

    public static void main(String[] args) {

        Books book1 = new Books(101, "Java Programming", "James Gosling", 450.0);
        Books book2 = new Books(102, "C Programming", "Henry", 200.0);
        Books book3 = new Books(103, "C++ Programming", "James", 500.0);
        Books book4 = new Books(104, "Python Programming", "Gosling", 550.0);
        Books book5 = new Books(105, "Programming languages", "Mona", 650.0);

//        List<Books> listOfBooks = listexamples(book1, book2, book3, book4, book5);
        mapExamples();
        linkedMapEg();

//        setExamples(book1, book2, book3, book4, book5, listOfBooks);
//        hashsetEg(listOfBooks, book1);



    }

    private static void linkedMapEg() {
        Map<Integer, Integer> lMap = new LinkedHashMap<>();
        lMap.put(101, 450);
        lMap.put(102, 350);
        lMap.put(103, 750);
        lMap.put(104, 900);
        lMap.put(105, 120);
        System.out.println(lMap);
    }

    private static void hashsetEg(List<Books> listOfBooks, Books book1) {
        System.out.println("linked hash set");
        Set<Books> linked = new LinkedHashSet<>(5);
        linked.addAll(listOfBooks);
        System.out.println(linked);
        System.out.println(linked.remove(book1));
    }

    private static void setExamples(Books book1, Books book2, Books book3, Books book4, Books book5, List<Books> listOfBooks) {
        Set<Books> setOfBooks = new HashSet<>(5);
        setOfBooks.add(book1);
        setOfBooks.add(book2);
        setOfBooks.add(book3);
        setOfBooks.add(book4);
        setOfBooks.add(book5);
        System.out.println("set");
        System.out.println(setOfBooks.size());
        System.out.println(setOfBooks);
        System.out.println(setOfBooks.remove(book1));
        System.out.println(setOfBooks.addAll(listOfBooks));
    }

    private static List<Books> listexamples(Books book1, Books book2, Books book3, Books book4, Books book5) {
        List<Books> listOfBooks = new ArrayList<>(7);
        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
        listOfBooks.add(book4);
        listOfBooks.add(book5);





            System.out.println("list");
            System.out.println(listOfBooks);
            for (int i = 0; i < listOfBooks.size(); i++) {
                System.out.println(listOfBooks.get(i));
            }
            System.out.println("Contains book1 : "+ listOfBooks.contains(book1));
            System.out.println("book2 equals book1 : "+book2.equals(book1));
            System.out.println("Index of book5 "+listOfBooks.indexOf(book5));
            System.out.println(listOfBooks.set(3,book5));
            System.out.println("Index of book5 after set at 3 : "+listOfBooks.indexOf(book5));
            System.out.println("Removing book5 : "+listOfBooks.remove(book5));
            System.out.println(book5);
            System.out.println("Getting 3 index object"+listOfBooks.get(3));
            System.out.println("Sub list from 0 to 4 "+listOfBooks.subList(0,4));
            System.out.println(listOfBooks.indexOf(book1));
            System.out.println(listOfBooks.indexOf(book2));
            System.out.println(listOfBooks.indexOf(book3));
            System.out.println(listOfBooks.indexOf(book4));
            System.out.println(listOfBooks.indexOf(book5));
            System.out.println("Is empty ? "+listOfBooks.isEmpty());
            System.out.println("removing index 0"+listOfBooks.remove(0));
            System.out.println("removing index 1"+listOfBooks.remove(1));
            System.out.println(listOfBooks);
//            System.out.println("removing index 2"+listOfBooks.remove(2));
//            System.out.println("removing index 3"+listOfBooks.remove(3));

            System.out.println("Is empty ? "+ listOfBooks.isEmpty());
        return listOfBooks;
    }

    private static void mapExamples() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(101, 450);
        map.put(102, 350);
        map.put(104, 900);
        map.put(104, 900);
        map.put(105, 120);
        map.put(103, 750);
        for (Integer m : map.keySet()) {
            System.out.println( m +  "  : " +map.get(m));

        }
        System.out.println(map);
    }


}


//            Books book2 = new Books();
//            Books book3 = new Books();
//            Books book4 = new Books();
//            Books book5 = new Books();
//            book2.setId(102);
//            book2.setTitle("C Programming");
//            book2.setAuthor("Henry");
//            book2.setPrice(204.0);
//
//            book3.setId(102);
//            book3.setTitle("C ++Programming");
//            book3.setAuthor("James");
//            book3.setPrice(230.0);
//
//            book4.setId(102);
//            book4.setTitle("Python Programming");
//            book4.setAuthor("Wilson");
//            book4.setPrice(220.0);
//
//            book5.setId(102);
//            book5.setTitle("Programming Languages");
//            book5.setAuthor("HMoona");
//            book5.setPrice(245.0);
//
//
//            System.out.println("--- Book Details ---");
//            System.out.println("ID: " + book1.getId());
//            System.out.println("Title: " + book1.getTitle());
//            System.out.println("Author: " + book1.getAuthor());
//            System.out.println("Price: rs. " + book1.getPrice());
//
//
//            System.out.println("ID: " + book2.getId());
//            System.out.println("Title: " + book2.getTitle());
//            System.out.println("Author: " + book2.getAuthor());
//            System.out.println("Price: rs. " + book2.getPrice());
//
//
//            System.out.println("ID: " + book3.getId());
//            System.out.println("Title: " + book3.getTitle());
//            System.out.println("Author: " + book3.getAuthor());
//            System.out.println("Price: rs. " + book3.getPrice());
//
//
//            System.out.println("ID: " + book4.getId());
//            System.out.println("Title: " + book4.getTitle());
//            System.out.println("Author: " + book4.getAuthor());
//            System.out.println("Price: rs. " + book4.getPrice());
//
//
//            System.out.println("ID: " + book5.getId());
//            System.out.println("Title: " + book5.getTitle());
//            System.out.println("Author: " + book5.getAuthor());
//            System.out.println("Price: rs. " + book5.getPrice());
//







