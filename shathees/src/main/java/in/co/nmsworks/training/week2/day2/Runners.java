package in.co.nmsworks.training.week2.day2;

public class Runners
{
    public static void main(String[] args) {
        Employee emp = new Employee(1,"Shathees","IT",2300.00,"NMSWorks");
        //System.out.println(emp);
       // System.out.println(emp.getId());

        String name = "NmsWorks";
        String company = "NmsWorks";
        //System.out.println(name == company);
       // System.out.println(name.equals(company));

        Employee emp1 = new Employee(1,"Shathees","IT",2300.00,"NMSWorks");
        System.out.println(emp.equals(emp1));
        System.out.println(emp.getCompanyName());
        System.out.println(emp.toString());



    }
}
