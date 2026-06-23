package in.co.nmsworks.training.week2.day2;

public class Runner {
    public static void main(String[] args) {
        Employee emp = new Employee(1,"Brathika G S","cse",20000,"NMSWroks");
        System.out.println(emp);
        System.out.println(emp.getEmpId());

        String name = "NMSWorks";
        String company = "NMSWorks";
        System.out.println(name == company);
        System.out.println(name.equals(company));
        Employee emp2 = new Employee(1,"Brathika G S","cse",20000,"NMSWroks");
        System.out.println(emp.equals(emp2));
        System.out.println(emp == emp2);
        System.out.println(emp);

    }
}
