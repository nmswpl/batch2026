package in.co.nmsworks.training.week2.day2;

public class RunnerTrainee {
    public static void main(String[] args) {

        Trainee[] trainees = new Trainee[5];
        String[] s1={"ajay","bala","gopi","hari","dass"};
        for (int i = 0; i < trainees.length; i++) {
            trainees[i]=new Trainee(s1[i]);
            System.out.println(trainees[i]);
        }

        
    }

}
