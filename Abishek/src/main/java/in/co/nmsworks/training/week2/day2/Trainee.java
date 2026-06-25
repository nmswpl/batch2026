package in.co.nmsworks.training.week2.day2;

public class Trainee {
    public static void main(String args[])
    {
        trainee();
    }

    private static void trainee() {
        TraineeDetails td1 = new TraineeDetails("Abi");
        TraineeDetails td2 = new TraineeDetails("Shek");
        System.out.println(td1);
        System.out.println(td2);
        TraineeDetails[] tr = new TraineeDetails[5];
        for (int i = 0; i < tr.length; i++) {
            tr[i] = new TraineeDetails(i+"k");
        }
        TraineeDetails[] trd = new TraineeDetails[5];
                String str[] = {"Arun", "Balaji", "Das",  "Gopi", "Hari"};
                for(int i = 0;i < trd.length; i++)
                {
                    trd[i] = new TraineeDetails(str[i]);
                }
        for (TraineeDetails traineeDetails : trd) {
            System.out.println(traineeDetails.getName());
        }
        for (TraineeDetails traineeDetails : tr) {
            System.out.println(traineeDetails);
        }
    }
}
