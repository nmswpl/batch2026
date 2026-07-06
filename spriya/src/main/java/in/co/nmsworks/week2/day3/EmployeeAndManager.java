package in.co.nmsworks.week2.day3;

public class EmployeeAndManager {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.setName("Rohan");
        m1.setBonus(1500);
        m1.setSalaryPerMonth(50000);
        System.out.println("Salary of Manager: "+ m1.salaryOfManager());


        Employee e1 =new Employee();
        e1.name="Rahul";

        e1.salaryPerMonth=20000;
        System.out.println("Salary of Employee :" +e1.annualSalary());

    }
}
