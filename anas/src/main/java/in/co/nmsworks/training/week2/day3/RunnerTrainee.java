package in.co.nmsworks.training.week2.day3;

import in.co.nmsworks.training.week2.day2.Trainee;

public class RunnerTrainee {
    public static void main(String[] args) {
        Trainee[] trainees = new Trainee[5];
        String[] names = {"arun", "bala", "vetri", "siva", "kowshil"};
        int i = 0;
        for (String name : names) {
            trainees[i++] = new Trainee(name);
        }
        for (int i1 = 0; i1 < trainees.length; i1++) {
            System.out.println(trainees[i1].getName());

        }
        //System.out.println(trainees[1]);
    }
}
