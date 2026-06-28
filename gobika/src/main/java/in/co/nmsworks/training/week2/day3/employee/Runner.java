package in.co.nmsworks.training.week2.day3.employee;

public class Runner {
    public static void main(String[] args) {
        Manager m = new Manager("Gobika",30000,2_469.0);
        System.out.println(m.annualSalary(30000));
    }
}
