package in.co.nmsworks.training.week2.day2;

public class RunnerObject {
    public static void main(String[] args) {
        Customer cus1 = new Customer("Jemuna",1);
        Customer cus2 = new Customer("Jemu",1);
        System.out.println("Two customers are treated as the same customer :");
        //System.out.print(cus1.getId()==cus2.getId());
        System.out.println(cus1.equals(cus2));


        printTrainee();

        Trainee[] trainees = new Trainee[5];
        for (int i = 0; i < trainees.length; i++) {
            trainees[i] = new Trainee("Name "+(i+1));

        }

        for (Trainee trainee : trainees) {
            System.out.println(trainee);
        }


    }

    private static void printTrainee() {
        System.out.println("Printing the details of the Trainee");
        Trainee trainee1 = new Trainee("Jemuna");
        Trainee trainee2 = new Trainee("Anusri");
        Trainee trainee3 = new Trainee("Yaazhini");
        Trainee trainee4 = new Trainee("Hema");
        Trainee trainee5 = new Trainee("Brathika");
        System.out.println(trainee1);
        System.out.println(trainee2);
        System.out.println(trainee3);
        System.out.println(trainee4);
        System.out.println(trainee5);
    }
}
