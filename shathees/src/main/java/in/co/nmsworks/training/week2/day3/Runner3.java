package in.co.nmsworks.training.week2.day3;

import in.co.nmsworks.training.week2.day2.Trainee;

public class Runner3 {
    public static void main(String[] args) {
       /* Circle cr = new Circle();
        cr.printArea();
        cr.printPerimeter();

        Rectangle re = new Rectangle();
        re.printArea();
        re.printPerimeter();

        Square sq = new Square();
        sq.printArea();
        sq.printPerimeter();*/

            Trainee[] trainees = new Trainee[5];
            String[] arr = {"Arun", "balaji", "das", "gopi", "hari"};
            for (int i = 0; i < arr.length; i++) {
                trainees[i] = new Trainee(arr[i]);
            }
            for (Trainee trainee : trainees) {
                System.out.println(trainee);
            }

    }
}
