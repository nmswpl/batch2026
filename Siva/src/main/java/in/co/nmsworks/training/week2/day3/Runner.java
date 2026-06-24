package in.co.nmsworks.training.week2.day3;

import in.co.nmsworks.training.week2.day2.Trainee;

import java.util.*;

public class Runner {

    public static void main(String[] args) {

//        Square s1 = new Square(4.0);
//        s1.printArea();
//        s1.printPerimeter();
//
//        Rectangle r1 = new Rectangle(5.0,7.0);
//        r1.printArea();
//        r1.printPerimeter();
//
//        Triangle t1 = new Triangle(2,3,5);
//        t1.printArea();
//        t1.printPerimeter();

        manageTrainees();
    }

    private static void manageTrainees() {
        String[] names = {"Arun","Balaji","Dass","Gopi","Hari"};
        Trainee[] trainees = new Trainee[names.length];
        for (int i = 0; i < names.length; i++) {
            trainees[i] = new Trainee(names[i]);
        }
        for (Trainee trainee : trainees) {
            System.out.println(trainee.getName());
        }
    }
}
