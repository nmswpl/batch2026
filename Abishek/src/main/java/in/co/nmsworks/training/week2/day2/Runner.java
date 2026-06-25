package in.co.nmsworks.training.week2.day2;

public class Runner {
    public static void main(String[] args)
    {
        Employee emp = new Employee(1,"Abi","CSE",72000,"NMS");
        System.out.println(emp);
        System.out.println(emp.getId());
        String name = "NMSworks";
        String company = "NMSworks";
        System.out.println(name == company);
        System.out.println(name.equals(company));
        Employee emp2 = new Employee(2,"Abi","CSE",72000,"NMSW");
        System.out.println(emp == emp2);
        System.out.println(emp.equals(emp2));
        System.out.println(emp);
        System.out.println(emp2);

    }
}
