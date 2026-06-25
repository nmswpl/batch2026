package in.co.nmsworks.training.week2.day3.emp;

public class EmployeeRunner {
    public static void main(String[] args) {

        Manager m = new Manager("karthi",10000,3000);
        //double sal = m.annualSalary();
        System.out.println(m.annualSalary());
    }
}
