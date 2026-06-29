package in.co.nmsworks.training.week2.Day1.Day3.Practice;

public class ObjectPractice {

    public static void main(String[] args) {
        Trainees();
    }

    private static void Trainees() {
        String []names={"Arun","Balaji","Das","Gopi","Hari"};
        Trainee[]trainees=new Trainee[5];
        for(int i=0;i<trainees.length;i++){
          trainees[i]=new Trainee(i,names[i]);
        }
        for(Trainee t:trainees){
            System.out.println(t);
        }
    }
}
