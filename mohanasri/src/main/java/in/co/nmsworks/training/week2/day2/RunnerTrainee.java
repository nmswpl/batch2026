package in.co.nmsworks.training.week2.day2;

public class RunnerTrainee {
    public static void main(String[] args) {

        String[] names = {"Arun", "Balaji", "Das", "Gopi", "Hari"};
        Trainee[] traineeArray = new Trainee[5];
        for (int i = 0; i < traineeArray.length; i++) {
            traineeArray[i] = new Trainee(names[i]);
        }
//        for (String name : names) {
//            System.out.println(name);
//        }
        for (Trainee trainee : traineeArray) {
            System.out.println(trainee.getName());
        }




    }
}
