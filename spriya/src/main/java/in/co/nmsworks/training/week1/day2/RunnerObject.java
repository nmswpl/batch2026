package in.co.nmsworks.training.week1.day2;

public class RunnerObject {
    public static void main(String[] args) {
        String[] name = {"A", "B", "C", "D", "E"};
        Trainee[] t = new Trainee[6];

        for (int i = 0; i < t.length; i++) {
            t[i] = new Trainee(i++, name[i]);
        }
        System.out.println("List of Trainees");

        for (Trainee trainee : t) {
            System.out.println(trainee.getName());

        }
        }

    }

