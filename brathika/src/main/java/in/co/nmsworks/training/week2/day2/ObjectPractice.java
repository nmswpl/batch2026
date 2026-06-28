package in.co.nmsworks.training.week2.day2;

public class ObjectPractice {
    public static void main(String[] args) {
        ObjectPractice ob = new ObjectPractice();
        ob.compareCustomer();
        ob.printTraineeDetails();

    }

    private void printTraineeDetails() {
        Trainee t1 = new Trainee("Brathika");
        Trainee t2 = new Trainee("AmruthaVarshini");
        Trainee t3 = new Trainee("Chinthana");
        Trainee t4 = new Trainee("Infant Lidwina");
        Trainee t5 = new Trainee("Rithika");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        String[] names = {"Brathika", "Amrutha", "Chintu", "Lid", "Rithika"};
        Trainee[] trainees = new Trainee[5];
        for (int i = 0; i < names.length; i++) {
            trainees[i] = new Trainee(names[i]);
        }
        for (Trainee trainee : trainees) {
            System.out.println(trainee);
        }
    }

    private void compareCustomer() {
        Customer cust = new Customer(101,"Brathika");
        Customer cust2 = new Customer(101,"Anu");
        System.out.println(cust.equals(cust2));
    }

}
