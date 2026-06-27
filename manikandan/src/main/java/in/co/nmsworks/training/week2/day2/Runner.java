package in.co.nmsworks.training.week2.day2;

public class Runner {

    public static void main(String[]args)
    {

        Employee emp1 = new Employee(1,"MAD","CYBER",90000,"NMS");
        Employee emp2 = new Employee(1,"MAD","CYBER",90000,"NMS");
        System.out.println(emp1);
        System.out.println(emp1.getId());
        String name = "NMSWorks";
        String company= "NMSWorks";

        //String s= name.startsWith();

        System.out.println(name==company);
        System.out.println(name.equals(company));

        System.out.println(emp1.getId()==emp2.getId());
        System.out.println(emp1==emp2);

        Employee emp3 = new Employee(1,"MAD","CYBER",90000,"NMS");
        System.out.println(emp3);

        Integer i1=5;
        Integer i2=5;
        System.out.println(i1==i2);
        int i3=i1;



    }
//    public static void Trainee(){
//
////        Trainee t1 = new Trainee("M");
////        Trainee t2 = new Trainee("S");
////
////        Trainee[] t3 = new Trainee[5];
////
////        for (int i = 0; i < t3.length; i++) {
////            t3[i] = new Trainee(i+ "M");
////        }
////        for(Trainee trainees:t3){
////            System.out.println(trainees);
////        }
//
//    }


}
