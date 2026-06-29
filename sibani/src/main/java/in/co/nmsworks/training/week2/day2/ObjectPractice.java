package in.co.nmsworks.training.week2.day2;

public class ObjectPractice {
    public static void main(String[] args) {
        ObjectPractice practice = new ObjectPractice();
        practice.checkEquals();
        practice.printTrainee();
            Trainee[] trainees = new Trainee[5];
            for (int i = 0; i < trainees.length; i++) {
                trainees[i] = new Trainee("Name" + (i+1));
            }
        for (Trainee trainee : trainees) {
            System.out.println(trainee);
        }
        Trainee trainee = trainees[2];
        System.out.println(trainee);

    }

    private void printTrainee() {
        Trainee t1 = new Trainee("Sibani");
        Trainee t2 = new Trainee("Gobika");
        Trainee t3 = new Trainee("Brathika");
        Trainee t4 = new Trainee("Yazhini");
        Trainee t5 = new Trainee("Jemuna");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);

    }

    private void checkEquals() {
        Customer cus1 = new Customer(1, "Sibani");
        Customer cus2 = new Customer(1, "Sibani");
        System.out.println(cus1.equals(cus2));
    }


}
