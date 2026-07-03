package in.co.nmsworks.training.week1.exam;
import java.util.*;

import static sun.security.pkcs11.wrapper.Functions.getId;

public class JavaTest {
    public static void main(String[] args) {
//        System.out.println("Mean of the Array : " + meanOfArray());
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the mark :");
//        int mark = sc.nextInt();
//        findGrade(mark);
//        sc.close();

        Book bk1 = new Book(205,"Java Programming","James Gosling",250.0F);
        Book bk2 = new Book(206,"Python Programming","James",350.0F);
        Book bk3 = new Book(207,"C Programming","Zhang",450.0F);
        Book bk4 = new Book(208,"Intro to Java","Gosling",550.0F);
        Book bk5 = new Book(209,"Harry potter","J K Rowling",650.0F);
//        bk1.printBookDetails(bk1);
//        bk2.printBookDetails(bk2);
//        bk3.printBookDetails(bk3);
//        bk4.printBookDetails(bk4);
//        bk1.printBookDetails(bk5);


        List<Book> bookList = new ArrayList<>();
        bookList.add(bk1);
        bookList.add(bk2);
        bookList.add(bk3);
        bookList.add(bk4);
        bookList.add(bk5);
        System.out.println("Size of Book List : " + bookList.size());
        System.out.println("List of Array Elements");
        for (Book book : bookList) {
            System.out.println(book);
        }

        System.out.println("Element at 0th position " + bookList.get(0));
        System.out.println("book contains bk3 : " + bookList.contains(bk3));
        System.out.println("Index of bk5 is : " + bookList.indexOf(bk5));
        System.out.println("Is List Empty : " + bookList.isEmpty());
        System.out.println(bookList.remove(2));
        System.out.println("After removing : " + bookList.size());
        bookList.add(bk5);
        System.out.println("bk5 last index : " + bookList.lastIndexOf(bk5));
        System.out.println("After adding : " + bookList.size());
        System.out.println("bk5 removed : " + bookList.remove(bk5));
        System.out.println("After removing : " + bookList.size());
        System.out.println("Sub List of List : " + bookList.subList(0,3));
        System.out.println("Setting book " + bookList.set(2, bk1));
        for (Book book : bookList) {
            System.out.println(book);
        }
        System.out.println("Contains All : " + bookList.containsAll(bookList.subList(0,3)));
        System.out.println("Equal  : " + bookList.equals(bookList.subList(0,4)));
//        bookList.clear();
//        System.out.println("Size of Book List : " + bookList.size());
        System.out.println();



//        Set<Book> bookSet = new HashSet<>();
//        bookSet.add(bk1);
//        bookSet.add(bk2);
//        bookSet.add(bk3);
//        bookSet.add(bk4);
//        bookSet.add(bk5);
//        System.out.println("Size of Book Set : " + bookSet.size());
//        System.out.println("Set of Book Elemnents");
//        for (Book book : bookSet) {
//            System.out.println(book);
//        }
//        System.out.println(bookSet.remove(bk5));
//        System.out.println("Contains bk5 " + bookSet.contains(bk5));
//        bookSet.add(bk5);
//        System.out.println("Contains bk5 " + bookSet.contains(bk5));
//        System.out.println("Is Empty : " + bookSet.isEmpty());

        System.out.println();

        Set<Book> bookSet1 = new LinkedHashSet<>();
        bookSet1.add(bk1);
        bookSet1.add(bk2);
        bookSet1.add(bk3);
        bookSet1.add(bk4);
        bookSet1.add(bk5);
        System.out.println("Size of Book Set : " + bookSet1.size());
        System.out.println("Set of Book Elemnents");
        for (Book book : bookSet1) {
            System.out.println(book);
        }
        System.out.println("Equal  : " + bookSet1.equals(bookList.subList(0,4)));
        System.out.println();


        MapPractice(bk1, bk2, bk3, bk4, bk5);

    }

    private static void MapPractice(Book bk1, Book bk2, Book bk3, Book bk4, Book bk5) {
        Map<Integer,Book> bookMap = new HashMap<>();
        bookMap.put(bk2.getId(), bk2);
        System.out.println(bookMap.put(bk1.getId(), bk1));
        bookMap.put(bk3.getId(), bk3);
        bookMap.put(bk4.getId(), bk4);
        bookMap.put(bk5.getId(), bk5);

        System.out.println("Size of Map : " + bookMap.size());
        System.out.println("Contains Key" + bookMap.containsKey(207));

        System.out.println(bookMap.entrySet());
        System.out.println("Key Set : " + bookMap.keySet());
        System.out.println("Values Set : " + bookMap.values());
        System.out.println("Contains key : " + bookMap.containsKey(207));
        System.out.println("Contains Value : " + bookMap.containsValue(bk2));
        System.out.println("Put If Absent : " + bookMap.putIfAbsent(205,bk3));
        System.out.println("Replace : " + bookMap.replace(207, bk4));
        for(Map.Entry<Integer, Book> entry : bookMap.entrySet()) {
            System.out.println( "Key : "+ entry.getKey() + " " + " Value : " + entry.getValue());
        }
        System.out.println();

    }

    public static float meanOfArray(){
        int[] arr = {1, 2, 3, 4, 5};
        float sum=0;
        for (int i=0; i<arr.length;i++){
            sum += arr[i];
        }
        float mean = sum / arr.length;
        return mean;
    }
    public static void findGrade(int mark){
        if (mark > 100 || mark < 0) {
            System.out.println("Invalid Mark");
        }
        if (mark > 90){
            System.out.println("Grade is : S" );
        }
        else if (mark > 80){
            System.out.println("Grade is : A" );
        }
        else if (mark > 70){
            System.out.println("Grade is : B" );
        }
        else if (mark > 60){
            System.out.println("Grade is : C" );
        }
        else if (mark > 50){
            System.out.println("Grade is : D" );
        }
        else {
            System.out.println("Grade is : F" );
        }
    }
}
