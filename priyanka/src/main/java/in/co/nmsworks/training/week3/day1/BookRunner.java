package in.co.nmsworks.training.week3.day1;

import in.co.nmsworks.training.week1.exam.Book;

import java.util.*;

public class BookRunner {
    public static void main(String[] args) {
        Book b1 = new Book(1,"Java","Abc",20);
        Book b2 = new Book(2,"Python","Abc",30);
        Book b3 = new Book(3,"Junglebook","Abc",40);
        Book b4 = new Book(4,"blues","Abc",50);
        Book b5 = new Book(5,"coloo","Abc",60);
        Book b6 = new Book(6,"Hello","poi",70);
        Book b7 = new Book(7,"lol","loiy",80);

        List<String> fruits = new ArrayList<>();
        fruits.add("Aplle");
        fruits.add("banana");
        fruits.add("pineapple");
        System.out.println(fruits.get(2));

        List<Book> list = new ArrayList<Book>();
        System.out.println(list.isEmpty());
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);
        list.add(b3);
        list.add(0,b5);
        System.out.println(list.get(0).toString());
        System.out.println(list.size());
        System.out.println(list.contains(b4));
        System.out.println(list.indexOf(b3));
        System.out.println(list.isEmpty());
        System.out.println("sublist: " + list.subList(3,5));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.set(2,b4);
        System.out.println(list.contains(b2));
        System.out.println(list.remove(b5));
        list.remove(5);
        list.set(1,b2);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Set<Book> set = new LinkedHashSet<>();
        set.add(b1);
        set.add(b2);
        set.add(b3);
        set.add(b4);
        set.add(b5);
        set.add(b2);
        set.add(b7);

        System.out.println("Set");
        for (Book book : set) {
            System.out.println(book.toString());
        }
        System.out.println(set.size());
        set.remove(b3);
        System.out.println(set.size());
        System.out.println(set);
        System.out.println(set.contains(b5));
        System.out.println("Is empty:"+set.isEmpty());
        System.out.println(set.addAll(set));
        System.out.println(set.addAll(list));
        System.out.println(set);

        list.add(b6);
        list.addAll(set);
        System.out.println();
        System.out.println("List:"+list.toString());
        list.removeAll(set);
        System.out.println("After removing set in list:"+ list.toString());

        set.addAll(list);
        System.out.println("Before removing list:"+set);
        System.out.println(set.size());
        set.removeAll(list);
        System.out.println("After removing list:"+set);
        System.out.println(set.contains(b7));
        System.out.println(set.size());



        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(1);
        System.out.println(l);

        Set<Integer> s =  new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println(s);

        l.addAll(s);
        System.out.println("List after adding set:"+l);

        s.addAll(l);
        System.out.println("Set after adding list:"+s);

        l.removeAll(s);
        System.out.println("List after removing :"+l);
        System.out.println(s);
        s.removeAll(l);
        System.out.println("Set after removing list:"+s);

        map();
    }
    public static void map(){
        Book b1 = new Book(1,"Java","Abc",20);
        Book b2 = new Book(2,"Python","Abc",30);
        Book b3 = new Book(3,"Junglebook","Abc",40);
        Book b4 = new Book(2,"Python","Abc",30);
        Book b5 = new Book(3,"Junglebook","Abc",40);
        Book b6 = new Book(4,"blues","Abc",50);
        Map<Integer,Book> map = new HashMap<>();
        map.put(5,b5);
        map.put(1,b1);
        map.put(2,b2);
        map.put(6,b4);
        map.put(3,b3);
        map.put(4,b4);



        System.out.println("Map...");
        for(Integer i : map.keySet())
        {
            System.out.println(i + "-->" + map.get(i).getPrice());
        }


        Map<Integer,Book> linkedMap = new LinkedHashMap<>();
        linkedMap.put(4,b4);
        linkedMap.put(3,b3);
        linkedMap.put(1,b1);
        linkedMap.put(2,b2);
        linkedMap.put(5,b4);


        System.out.println("Linked Hash map...");
        for (Integer i : linkedMap.keySet()){
            System.out.println(i + "-->" + linkedMap.get(i).getPrice());
        }
    }

}
