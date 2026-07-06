package in.co.nmsworks.training.week2.day2;

public class ObjectPractice {
    public static void main(String[] args) {
        ObjectPractice obj = new ObjectPractice();
        Trainee[] trainees=new Trainee[5];
        String[] names={"Ram","Lokesh","jk","arnold","bai"};
        for (int i = 0; i < names.length; i++) {
            trainees[i]=new Trainee(names[i]);
        }
        for (Trainee trainee : trainees) {
            System.out.println(trainee);
        }

    }
}

