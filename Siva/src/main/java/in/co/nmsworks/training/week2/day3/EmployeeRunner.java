package in.co.nmsworks.training.week2.day3;

public class EmployeeRunner {
    public static void main(String[] args) {
        Manager m1 = new Manager(10000.0,"Siva",60000.0);
        Manager m2 = new Manager(5000.0,"Kumar",50000.0);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m1.annualSalary());
        System.out.println(m2.annualSalary());
    }
}
