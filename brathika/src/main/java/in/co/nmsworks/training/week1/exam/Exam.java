package in.co.nmsworks.training.week1.exam;

import java.util.*;

public class Exam {

    public static void main(String[] args) {
//        findMeanOfTheArray();
        Book book1 = new Book(1, "Java Programing", "James Gosling", 450.0);
        Book book2 = new Book(2, "R D Sharma", "Sharma", 700.0);
        Book book3 = new Book(3, "Pythom Programmin", "James Gosling", 500.0);
        Book book4 = new Book(4, "English Dictionary", "Oxfard University", 500.0);
        Book book5 = new Book(5, "C++ Programming", "James Gosling", 350.0);
//        book1.printValues();
//        book2.printValues();
//        book3.printValues();
//        book4.printValues();
//        book5.printValues();
//        printGrade(79);

//        List<Book> list = new ArrayList<>();
//        list.add(book1);
//        list.add(book2);
//        list.add(book3);
//        list.add(book4);
//        list.add(book5);
//        System.out.println("List");
//        System.out.println("Size of List: "+list.size());
////         System.out.println(list);
//        for (Book book : list) {
//            System.out.println(book);
//        }
//        System.out.println("Index of 3rd position "+list.get(3));
//        System.out.println("List contains "+list.contains(book1));
//        System.out.println("List Index "+list.indexOf(book2));
//        System.out.println("Is Empty "+list.isEmpty());
//        System.out.println("Last index: "+list.lastIndexOf(book4));
//        System.out.println("Sub List: "+list.subList(2,4));
        Set<Book> bookset = new HashSet<>();

        bookset.add(book1);
        bookset.add(book2);
        bookset.add(book3);
        bookset.add(book4);
        bookset.add(book4);
        System.out.println("Set");
        System.out.println("Size of the Set: "+bookset.size());
        System.out.println(bookset);
        for (Book book : bookset) {
            System.out.println(book);
        }

        System.out.println("List contains "+bookset.contains(book1));
        System.out.println("Is Empty "+bookset.isEmpty());
        Set<Book> bookset1 = new LinkedHashSet<>();
        bookset1.add(book1);
        bookset1.add(book2);
        bookset1.add(book3);
        bookset1.add(book4);
        bookset1.add(book5);
        bookset1.add(book1);

        for (Book book : bookset1) {
            System.out.println(book);
        }
        System.out.println(bookset1);
        System.out.println("Size of set "+bookset1.size());
        System.out.println("Contains "+bookset1.contains(book1));
        System.out.println("Equals "+bookset1.equals(bookset));
        HashMap<Integer, Double> map = new HashMap<>();
        map.put(book1.getBookId(),book1.getPrice());
        map.put(book2.getBookId(),book2.getPrice());
        map.put(book3.getBookId(),book3.getPrice());
        map.put(book4.getBookId(),book4.getPrice());
        map.put(book5.getBookId(),book5.getPrice());
        for(Map.Entry<Integer, Double> entry : map.entrySet()) {
            System.out.println("Id "+entry.getKey()+" price "+ entry.getValue());
        }
        System.out.println("Size Of Map "+map.size());
        System.out.println("Check for empty "+map.isEmpty());
        System.out.println(map.get(1));
        System.out.println("Equals "+map.equals(book1));
        System.out.println("Contains key "+map.containsKey(2));
        System.out.println(map.putIfAbsent(7,500.0));
        System.out.println(map);
        System.out.println(map.replace(2,200.0));
        System.out.println(map);
        Map<Integer, String> trainee = new HashMap<>();
        trainee.put(7,"Yaazhini");
        trainee.put(8,"Brathika");
        trainee.put(9,"Gobika");
        trainee.put(0,"Sanjeev");
        System.out.println(trainee.put(0,"Gokul"));

        System.out.println(trainee.get(25));
        trainee.put(25,null);
        System.out.println(trainee.get(25));
        System.out.println( trainee.entrySet());

        for (Map.Entry<Integer, String> integerStringEntry : trainee.entrySet()) {

        }
    }

    public static void findMeanOfTheArray(){
        int[] arr = {1, 2, 3, 4, 5, 6};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        int mean = sum / arr.length;
        System.out.println("Mean of the array is: "+mean);
    }

    public static void printGrade(int number1){

        if (number1 > 100) {
            System.out.println("Mark is invald");
        } else if (number1 >= 91 ) {
            System.out.println("Your grade is S");
        } else if (number1 >= 81 ){
            System.out.println("Your grade is A");
        } else if (number1 >= 71 ) {
            System.out.println("Your grade is B");
        } else if (number1 >= 61 ) {
            System.out.println("Your grade is C");
        } else if (number1 >= 51 ) {
            System.out.println("Your grade is D");
        }else {
            System.out.println("Your grade is F");
        }



    }
}
