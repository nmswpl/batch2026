package in.co.nmsworks.training.week1.set1;

public class SetOneJava {

    public static void main(String[] args){
        float[] arr={1,2,3,4,5,6};
        System.out.print("MEAN OF AN ARRAY : ");
        meanOfArray(arr);
        int mark=75;
        GradeMark(mark);
    }

    private static void GradeMark(int mark) {
        if(mark > 100){
            System.out.println("Invalid Mark");
        }
        else{
            if(mark >90){
                System.out.println("Grade : " + "S");
            }
            else if(mark >80 && mark <=90){
                System.out.println("Grade : " + "A");
            }
            else if(mark >70 && mark <= 80){
                System.out.println("Grade : " + "B");
            }
            else if(mark >60 && mark <= 70){
                System.out.println("Grade : " + "C");
            }
            else if(mark >50 && mark <= 60){
                System.out.println("Grade : " + "D");
            }else{
                System.out.println("Grade : " + "F");
            }
        }
    }

    private static void meanOfArray(float[] arr) {
        float sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum/arr.length);
    }
}
