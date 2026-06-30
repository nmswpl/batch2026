package in.co.nmsworks.training.week3.day2;
import com.sun.org.apache.xpath.internal.objects.XNumber;
import org.w3c.dom.ls.LSInput;

import java.util.*;
public class ListPractice {
    public static void main(String[] args) {
        addColors();
        iterateElement();
        insertAtFirstPosition();
        retriveThroughIndex();
        updateElement();
        removeElement();
        searchElement();
        copyList();
        printReverse();
        compareTwoList();
        joinuniqueList();
    }

    private static void joinuniqueList() {

        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);

        List<Integer> numbers = new ArrayList<>();

        for (int number : numbers1)
            numbers.add(number);

        for (int number : numbers2)
            numbers.add(number);

        for (int number : numbers)
            System.out.print(number+", ");


    }

    private static void compareTwoList() {

        int flag = 0;

        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);

        if (numbers1.size() != numbers2.size()){
            System.out.println("Not equal");
        }
        else {
            for (int i = 0; i < numbers1.size(); i++)
            {
                if (numbers1.get(i) != numbers2.get(i)) {
                    System.out.println("Not equal");
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 0)
            System.out.println("Equal");
    }

    private static void printReverse() {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        for (int i = numbers.size() - 1; i >= 0; i--)
        {
            System.out.print(numbers.get(i)+", ");
        }
    }

    private static void copyList() {

        List<Integer> numbers1 = new ArrayList<>();
        List<Integer> numbers2 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers2.add(4);
        numbers2.add(5);
        numbers2.add(6);

        for (int number : numbers1)
            System.out.print(number+", ");

        for(int number : numbers2)
        {
            numbers1.add(number);
        }

        for (int number : numbers1)
            System.out.print(number+", ");

    }

    private static void searchElement() {

        int key = 5,count = 0,flag = 0;

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);

        for (int number : numbers) {
            if (number == key)
            {
                System.out.println("Found at index "+count);
                flag = 1;
                break;
            }
            count++;
        }
        if(flag == 0)
        {
            System.out.println("Not found");
        }

    }

    private static void removeElement() {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);

        for (int number : numbers) {
            System.out.print(number + ", ");
        }

        numbers.remove(3);

        for (int number : numbers) {
            System.out.print(number + ", ");
        }
    }

    private static void updateElement() {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);

        for (int number : numbers) {
            System.out.print(number + ", ");
        }

        numbers.set(2, 3);

        for (int number : numbers) {
            System.out.print(number + ", ");
        }
    }
    private static void retriveThroughIndex() {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("Second index of "+ numbers.get(1));
    }

    private static void insertAtFirstPosition() {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        for (int number : numbers) {
            System.out.print(number + ", ");
        }

        numbers.add(0,0);

        for (int number : numbers)
        {
            System.out.print(number + ", ");
        }
    }

    private static void iterateElement() {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        for (int number : numbers)
        {
            System.out.print(number + " ");
        }
    }

    private static void addColors() {

        String color1 = "Blue";
        String color2 = "Green";
        String color3 = "Red";

        List<String> colors = new ArrayList<>();
        colors.add(color1);
        colors.add(color2);
        colors.add(color3);

        for(String color : colors)
        {
            System.out.print(color+", ");
        }
    }
}
