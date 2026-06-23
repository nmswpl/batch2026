package in.co.nmsworks.training.week1.exam;

public class Position {
    public static void main(String[] args) {
        int num = 673;

        if (num < 99 && num >= 1000){
            System.out.println("Invalid inputs..");
        }
        else{
            int digit = num/100;
            String[] value = {"Zero", "One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
            System.out.println("Hundreth position : "+value[digit]);

        }


    }
}
