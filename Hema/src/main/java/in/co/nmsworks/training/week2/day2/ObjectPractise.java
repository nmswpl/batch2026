package in.co.nmsworks.training.week2.day2;

public class ObjectPractise {
    public static void main(String[] args) {
        Customer c1  = new Customer(1,"Hema");
        Customer c2  = new Customer(2,"Pooja");
        System.out.println(c1.equals(c2));

        Trainee trainee1 = new Trainee("Hema");
        Trainee trainee2 = new Trainee("Thanu");
        Trainee trainee3 = new Trainee("Pooja");
        Trainee trainee4 = new Trainee("Jensi");
        Trainee trainee5 = new Trainee("Shalu");

        System.out.println(trainee1);
        System.out.println(trainee2);
        System.out.println(trainee3);
        System.out.println(trainee4);
        System.out.println(trainee5);

        Trainee[] trainees = {trainee1, trainee2, trainee3, trainee4, trainee5};

        Trainee[] t = new Trainee[5];

        String[] names = {"Arun","Bala","Das","Gopi","Hari"};

        for (int i = 0; i < t.length; i++) {

            t[i] = new Trainee(names[i]);

        }

        for (Trainee trainee : t) {
            System.out.println(trainee.getName());
        }

    }
}
