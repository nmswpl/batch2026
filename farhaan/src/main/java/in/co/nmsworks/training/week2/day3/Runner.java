package in.co.nmsworks.training.week2.day3;

public class Runner {
    public static void main(String[] args) {

    Employee employee1 = new Employee();
    employee1.setSalaryPerMonth(25000);
    System.out.println(employee1);
    double totalSalary = employee1.annualSalary();
    System.out.println("Total Salary: "+totalSalary);

    Manager manager1 = new Manager();
    manager1.setSalaryPerMonth(30000);
    manager1.setBonus(3000);
    totalSalary = manager1.annualSalary();
    System.out.println("Total Salary: "+ totalSalary);
    }
}
