package in.co.nmsworks.training.week2.day3practices;

public class Runner {

    public static void main(String[] args) {


        Employee emp = new Employee("MANI",80000.0);
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Monthly Salary: Rs. " + emp.getSalaryPerMonth());
        System.out.println("Annual Salary: Rs. " + emp.annualSalary());

        Manager mgr = new Manager("MADS", 80000.0, 15000.0);

        System.out.println("Manager Name: " + mgr.getName());
        System.out.println("Monthly Salary: Rs. " + mgr.getSalaryPerMonth());
        System.out.println("Bonus: Rs. " + mgr.getBonus());
        System.out.println("Total Annual Salary: Rs. " + mgr.annualSalary());
    }
}

class reporter{
    public static void main(String[] args) {
        SalesReport s = new SalesReport();
        InventoryReport r = new InventoryReport();

        System.out.println(s.generate());
        System.out.println(r.generate());
    }
}
