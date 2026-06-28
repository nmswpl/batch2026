package in.co.nmsworks.training.week2.day2;

public class EmpRunner {
    public static void main(String [] args)
    {
        Employee emp=new Employee(1,"pandi","It",10000,"Nmsworks");

        System.out.println(emp);
        System.out.println(emp.getId());
        String name="NMSWorks";
        String cmpy="NMSWorks";
//        System.out.println(name == cmpy);
//        System.out.println(name.equals(cmpy));
        String txt="ssp";
        boolean p = txt.endsWith("p");

        Integer i1 = 5;
        Integer i2 = 5;



        System.out.println(i1 == i2);
        int i3=i1;
        if(i1 > 6)
        {
            System.out.println("sss");
        }

        Employee emp1=new Employee(1,"pandi","It",10000,"nms");

        System.out.println(emp.equals(emp1));
    }
}
