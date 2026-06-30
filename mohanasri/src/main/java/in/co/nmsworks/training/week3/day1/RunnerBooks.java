package in.co.nmsworks.training.week3.day1;

import in.co.nmsworks.training.week1.exam.Books;

import java.util.*;

public class RunnerBooks {
    public static void main(String[] args) {

        in.co.nmsworks.training.week1.exam.Books book1 = new in.co.nmsworks.training.week1.exam.Books(101, "Java Programming", "James Gosling", 450.0);
        in.co.nmsworks.training.week1.exam.Books book2 = new in.co.nmsworks.training.week1.exam.Books(102, "C Programming", "Henry", 200.0);
        in.co.nmsworks.training.week1.exam.Books book3 = new in.co.nmsworks.training.week1.exam.Books(103, "C++ Programming", "James", 500.0);
        in.co.nmsworks.training.week1.exam.Books book4 = new in.co.nmsworks.training.week1.exam.Books(104, "Python Programming", "Gosling", 550.0);
        in.co.nmsworks.training.week1.exam.Books book5 = new in.co.nmsworks.training.week1.exam.Books(105, "Programming languages", "Mona", 650.0);

       List<Books> listOfBooks = listexamples(book1, book2, book3, book4, book5);
        mapExamples();
        linkedMapEg();

        setExamples(book1, book2, book3, book4, book5, listOfBooks);
//        hashsetEg(listOfBooks, book1);



    }



    private static void linkedMapEg() {
        Map<Integer, Integer> lMap = new LinkedHashMap<>();
        lMap.put(101, 450);
        lMap.put(102, 350);
        lMap.put(103, 750);
        lMap.put(104, 900);
        lMap.put(105, 120);

        lMap.containsKey(101);
        System.out.println(lMap.getOrDefault(106, 89));
        System.out.println(lMap);
    }

    private static void hashsetEg(List<in.co.nmsworks.training.week1.exam.Books> listOfBooks, in.co.nmsworks.training.week1.exam.Books book1) {
        System.out.println("linked hash set");
        Set<in.co.nmsworks.training.week1.exam.Books> linked = new LinkedHashSet<>(5);
        linked.addAll(listOfBooks);
        System.out.println(linked);
        System.out.println(linked.remove(book1));
    }

    private static void setExamples(in.co.nmsworks.training.week1.exam.Books book1, in.co.nmsworks.training.week1.exam.Books book2, in.co.nmsworks.training.week1.exam.Books book3, in.co.nmsworks.training.week1.exam.Books book4, in.co.nmsworks.training.week1.exam.Books book5, List<in.co.nmsworks.training.week1.exam.Books> listOfBooks) {
        Set<in.co.nmsworks.training.week1.exam.Books> setOfBooks = new HashSet<>(5);
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

    private static List<in.co.nmsworks.training.week1.exam.Books> listexamples(in.co.nmsworks.training.week1.exam.Books book1, in.co.nmsworks.training.week1.exam.Books book2, in.co.nmsworks.training.week1.exam.Books book3, in.co.nmsworks.training.week1.exam.Books book4, in.co.nmsworks.training.week1.exam.Books book5) {
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
        Map<Integer, String> idToName = new HashMap<>();
        idToName.put(1, "Priyanka");
        idToName.put(2, "Mohanasri");
        idToName.put(3, "Gabrella");
//        map.put(104, 900);
//        map.put(105, 120);
//        map.put(103, 750);

        for (Integer m : idToName.keySet()) {
            System.out.println( m +  "  : " + idToName.get(m));

        }
        System.out.println(idToName);
    }


}
