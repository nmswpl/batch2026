package in.co.nmsworks.training.week2.day2;

public class RunnerObject {
    public static void main(String[] args){
        System.out.print("Check Customer ID is equal : ");
        Customer cs=new Customer("anu",1);
        Customer cs1=new Customer("anu",1);
        System.out.println(cs.equals(cs1));

        System.out.println("Training details :");
        Training tr1=new Training("anushri");
        Training tr2=new Training("vijaya shree");
        Training tr3=new Training("archana");
        Training tr4=new Training("anisha");
        Training tr5=new Training("yuvashri");

        System.out.println(tr1);
        System.out.println(tr2);
        System.out.println(tr3);
        System.out.println(tr4);
        System.out.println(tr5);

        Training[] trainees=new Training[5];
        for(int i=0;i<trainees.length;i++){
            trainees[i]=new Training("Name : " + (i+1)) ;
        }
        for(Training tr:trainees){
            System.out.println(tr);
        }
    }
}
