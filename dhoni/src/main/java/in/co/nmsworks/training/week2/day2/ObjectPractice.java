package in.co.nmsworks.training.week2.day2;

public class ObjectPractice {

    public static void main(String[] args) {
        Customer customer = new Customer(1,"dhoni");
        Customer customer2 = new Customer(1,"dhoni");
        System.out.println(customer.equals(customer2));

        //printTrainees();

        Trainee[] trainees = new Trainee[5];
        String[] names = {"dhoni","karthi","ajith","vijay","soundappan"};

        for (int i = 0; i < 5; i++) {
            trainees[i] = new Trainee(names[i]);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(trainees[i].getId() + " " + trainees[i].getName());
        }

    }

    private static void printTrainees() {

        Trainee t = new Trainee("dhoni");
        Trainee t2 = new Trainee("dhoni");
        Trainee t3 = new Trainee("dhoni");
        Trainee t4 = new Trainee("dhoni");
        Trainee t5 = new Trainee("dhoni");
        System.out.println(t + " " + t2 + " " + t3 + " " + t4 + " " + t5);


    }
}
