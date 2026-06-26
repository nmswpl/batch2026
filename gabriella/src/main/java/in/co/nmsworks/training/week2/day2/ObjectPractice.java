package in.co.nmsworks.training.week2.day2;

public class ObjectPractice {
    public static void main(String[] args) {

        ObjectPractice op = new ObjectPractice();
        Customer cust1 = new Customer(1, "Gaby");
        Customer cust2 = new Customer(1, "Gabriella");
        Customer cust3 = new Customer(2, "Some name");

        System.out.println(cust1.equals(cust2));
        System.out.println(cust1.equals(cust3));

        Trainee trainee1 = new Trainee("A");
        Trainee trainee2 = new Trainee("B");
        Trainee trainee3 = new Trainee("C");
        Trainee trainee4 = new Trainee("D");
        Trainee trainee5 = new Trainee("E");
        Trainee[] traineesArr = {trainee1, trainee2};

        System.out.println(trainee1);
        System.out.println(trainee2);
        System.out.println(trainee3);
        System.out.println(trainee4);
        System.out.println(trainee5);

        Trainee[] trainees = new Trainee[5];
        for (int i = 0; i < trainees.length; i++) {
            trainees[i] = new Trainee("Name"+i);
            System.out.println(trainees[i]);
        }


    }
}
