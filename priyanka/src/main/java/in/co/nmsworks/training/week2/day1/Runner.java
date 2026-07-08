package in.co.nmsworks.training.week2.day1;

public class Runner {
    public static void main(String[] args) {
        Employee emp = new Employee("NMSWorks",1,"Priyo","IT",30000);
        System.out.println(emp);
        System.out.println(emp.getId());

        Employee emp2 = new Employee("NMSWorks",1,"Priyo","IT",30000);
        System.out.println(emp == emp2);
        System.out.println(emp.equals(emp2));

        String textname ="priyanka";
        System.out.println(textname.endsWith("k"));
        System.out.println(textname.startsWith("i"));

        String name = "NMSWorks";
        String company = "NMSWorks";
        System.out.println(name == company);
        System.out.println(name.equals(company));

        Integer integer1 =5;
        Integer integer2=5;
        System.out.println(integer1 == integer2);

        int integer3 = integer1;
        if(integer1 <=5){
            System.out.println("ok");
        }
    }
}
