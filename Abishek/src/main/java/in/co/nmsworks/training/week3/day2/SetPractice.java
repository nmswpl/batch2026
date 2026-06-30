package in.co.nmsworks.training.week3.day2;

import java.util.*;



public class SetPractice {
    public static void main(String[] args) {
        addFruit();
        iterateThroughSet();
        searchCity();
        copySet();
        compareSet();
        removeVariable();
    }

    private static void removeVariable() {

        Set<Integer> numbers1= new HashSet<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);

        for (int number : numbers1)
            System.out.print(number+", ");

        numbers1.remove(3);

        for (int number : numbers1)
            System.out.print(number+", ");
    }

    private static void compareSet() {

        Set<Integer> numbers1= new HashSet<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);

        Set<Integer> numbers2 = new HashSet<>();
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);

        if (numbers1.size() != numbers2.size()){
            System.out.println("Not equal");
        }
        else {
            if(numbers2.equals(numbers1))
                System.out.println("Equal");

            else
            {
                System.out.println("Not equal");
            }
        }
    }


    private static void copySet() {
        Set<String> city = new HashSet<>();

        city.add("Chennai");
        city.add("Mumbai");
        city.add("Coimbatore");

        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Pineapple");

        Set<String> fruitAndCity = new HashSet<>();

        fruitAndCity.addAll(fruits);
        fruitAndCity.addAll(city);

        for (String fs : fruitAndCity)
        {
            System.out.print(fs+", ");
        }
    }

    private static void searchCity() {

        Set<String> city = new HashSet<>();

        city.add("Chennai");
        city.add("Mumbai");
        city.add("Coimbatore");

        System.out.println("It contains Mumbai: " + city.contains("Mumbai"));

    }

    private static void iterateThroughSet() {

        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Pineapple");

        for (String fruit : fruits)
        {
            System.out.print(fruit+", ");
        }
    }

    private static void addFruit() {

        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Pineapple");

        for (String fruit : fruits)
        {
            System.out.print(fruit+", ");
        }
    }
}
