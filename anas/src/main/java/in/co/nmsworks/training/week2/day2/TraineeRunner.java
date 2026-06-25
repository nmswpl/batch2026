package in.co.nmsworks.training.week2.day2;

import com.google.gson.internal.bind.util.ISO8601Utils;

public class TraineeRunner {
    public static void main(String[] args) {
        Trainee t1 = new Trainee("anas");
        Trainee t2 = new Trainee("vetri");
        Trainee t3 = new Trainee("kowshik");
        Trainee t4 = new Trainee("siva");
        Trainee t5 = new Trainee("satheesh");

        Trainee[] trainees = new Trainee[5];
        for (int i = 0; i < trainees.length; i++) {
            trainees[i] = new Trainee("name " + (i+1));
        }
        for (Trainee trainee : trainees) {
            System.out.println(trainee);
        }

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);

    }

}
