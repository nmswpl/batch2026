package in.co.nmsworks.week3.day2;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {

    public void addFruits(Set<String> fruit) {


        System.out.println("Fruits name");

        for (Object s : fruit) {
            System.out.println(s);
        }
        System.out.println();


    }

    public void iterate(Set<String> fruit) {
        for (Object o : fruit) {
            System.out.println(o);
        }
    }

    public void searchCity() {
        Set<String> city = new HashSet<>();

        city.add("Chenai");
        city.add("Bangalore");
        city.add("Mumbai");
        city.add("Pune");
        int set = 0;
        for (String s : city) {
            if (s.equals("Mumbai")) {
                System.out.println(s);
                set = 1;
            }
        }
        if (set == 0) {
            System.out.println("No city Found");
        }
    }

    public void copyMethod(Set<String> fruit) {

        Set<String> fruit1 = new HashSet<>(fruit);

        for (String s : fruit1) {
            System.out.println(s);
        }

    }

    public void compare() {
        Set<Integer> age1 = new HashSet<>();
        age1.add(11);
        age1.add(12);
        age1.add(13);

        Set<Integer> age2 = new HashSet<>();
        age2.add(11);
        age2.add(12);
        age2.add(13);


        if (age1.size() != age2.size()) {
            System.out.println("Invalid not equal arrays");
            return;
        }

        System.out.println(age1.equals(age2));
        System.out.println();
    }

    public void removeElement(Set<String> fruit) {
        System.out.println("Remove Specified eleemnt from set");
        System.out.println(fruit.remove("Apple"));
    }


}
