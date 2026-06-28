package in.co.nmsworks.training.week2.day3;

public class EmpManRunner {

    public static void main(String[] args) {
        empRunner();
        SalesReport s1=new SalesReport();
        s1.generate();

    }

    private static void empRunner() {
        Manager m1=new Manager("ssp",2000,300);
        System.out.println(m1.calSalary());
        System.out.println(m1);
    }
}
