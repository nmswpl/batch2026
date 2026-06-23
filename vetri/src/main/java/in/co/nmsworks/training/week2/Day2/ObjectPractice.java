package in.co.nmsworks.training.week2.Day2;

public class ObjectPractice {
    public static void main(String[] args) {
        Trainee t1 = new Trainee("vetri");
        Trainee t2 = new Trainee("selvan");
        Trainee t3 = new Trainee("Sinthanai");
        Trainee t4 = new Trainee("gopi");
        Trainee t5 = new Trainee("hemachandar");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);

        Trainee[] trainee = new Trainee[5];
        for (int i = 0; i < trainee.length; i++) {
            trainee[i]=new Trainee("name:"+ (i+1));
        }
        for (Trainee t : trainee) {
            System.out.println(t);
        }

    }
}
