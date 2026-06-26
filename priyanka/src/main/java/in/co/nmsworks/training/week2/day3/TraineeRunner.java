package in.co.nmsworks.training.week2.day3;

import in.co.nmsworks.training.week2.day2.Trainee;

public class TraineeRunner {
    public static void main(String[] args) {
        String[] names = {"arun","Balaji","Das","Gopi","Hari"};
        //Integer[] ids = {1,2,3,4,5};
        int i=0;
        Trainee[] trainee = new Trainee[names.length];
        for (String name : names) {
            trainee[i++] = new Trainee(name);
        }

        for (Trainee t : trainee){
            System.out.println(t);
        }
    }
}
