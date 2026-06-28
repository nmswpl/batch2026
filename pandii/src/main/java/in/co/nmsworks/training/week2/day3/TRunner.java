package in.co.nmsworks.training.week2.day3;

import in.co.nmsworks.training.week2.day2.Trainee;

public class TRunner {

    public static void main(String[] args) {
//        int [] id={1, 2, 3, 4, 5};

        String[] s1={"ajay","bala","das","gopi","hari"};
        Trainee[] trainees = new Trainee[s1.length];
        for (int i = 0; i < trainees.length; i++) {
            trainees[i]=new Trainee(s1[i]);
            System.out.println(trainees[i].getName());
        }


    }
}
