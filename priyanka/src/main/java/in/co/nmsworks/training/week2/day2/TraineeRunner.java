package in.co.nmsworks.training.week2.day2;

public class TraineeRunner {
    public static void main(String[] args) {
        Trainee t1 = new Trainee("abc");
        System.out.println(t1);
        Trainee t2 = new Trainee("def");
        System.out.println(t2);
        Trainee t3 =  new Trainee("ghi");
        System.out.println(t3);
        Trainee t4 = new Trainee("jkl");
        System.out.println(t4);
        Trainee t5 = new Trainee("mno");
        System.out.println(t5);

        Trainee[] traineeArray = {t1, t2, t3, t4, t5};
        Trainee[] arr = new Trainee[5];
        for (int i = 0; i < traineeArray.length; i++) {
            arr[i]=new Trainee("Name"+(i+1));
        }
        for (Trainee trainee : arr) {
            System.out.println(trainee);
        }
    }
}
