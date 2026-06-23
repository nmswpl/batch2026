package in.co.nmsworks.training.week2.day1;

public class Runner {
    public static void main(String[] args) {
        Employee emp = new Employee("NMSWorks",1,"Priyo","IT",30000);
        System.out.println(emp);
        System.out.println(emp.getId());

        Employee emp2 = new Employee("NMSWorks",1,"Priyo","IT",30000);
        System.out.println(emp == emp2);
        System.out.println(emp.equals(emp2));

        String txtname="priyanka";
        System.out.println(txtname.endsWith("k"));;
        System.out.println(txtname.startsWith("i"));;




        String name = "NMSWorks";
        String company = "NMSWorks";
        System.out.println(name == company);
        System.out.println(name.equals(company));

        Integer i1=5;
        Integer i2=5;
        System.out.println(i1==i2);

        int i3 = i1;
        if(i1<=5){
            System.out.println("ok");
        }
    }
}
