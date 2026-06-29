package in.co.nmsworks.training.week2.day2;

public class TraineeObject {
    public static void main(String[] args) {

        String[] strArr = {"arun", "Balaji", "dhas", "gopi","hari"};
        Trainee[] trainee = new Trainee[strArr.length];
        for (int i = 0; i < trainee.length; i++) {
            trainee[i] = new Trainee(i,strArr[i]);
        }
        for (int i = 0; i < trainee.length; i++) {
            System.out.println(trainee[i].getName());
        }
    }
}
