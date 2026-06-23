package in.co.nmsworks.training.week2.day2;

import java.util.Scanner;

public class ObjectPractice {

    public static void main(String[] args) {
        ObjectPractice op = new ObjectPractice();
//        Customer customer1 = new Customer(1,"Siva");
//        Customer customer2 = new Customer(1,"Siva");
//        System.out.println(op.checkSameCustomer(customer1, customer2));
        op.manageTrainee();

    }

    private void manageTrainee() {
        Scanner scanner = new Scanner(System.in);
        Trainee[] trainee = new Trainee[5];
        for (int i = 0; i < 5; i++) {
            String name = scanner.nextLine();
            trainee[i] = new Trainee(name);
        }
//        trainee[0].setJoiningMonth(MonthsOfYear.JULY);
//        trainee[0].setJoiningMonth(MonthsOfYear.JUNE);
//        trainee[0].setJoiningMonth(MonthsOfYear.OCTOBER);
//        System.out.println(trainee[0].getJoiningMonth());
        for (Trainee t : trainee) {
            System.out.println(t);
        }
    }

    private boolean checkSameCustomer(Customer customer1, Customer customer2) {
        return customer1.equals(customer2);
    }
}
