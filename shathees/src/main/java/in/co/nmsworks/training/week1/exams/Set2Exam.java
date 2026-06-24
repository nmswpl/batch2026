package in.co.nmsworks.training.week1.exams;

public class Set2Exam {
    public static void main(String[] args) {
        median();
        checkHundredPos();
    }

    public static void checkHundredPos() {
        int number = 140;
        int pos = number/100;
        switch (pos){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            default:
                System.out.println("Invalid Input ");
        }
    }

    public static void median(){
        int arr[] = {1,2,3,4,5};
        int length = arr.length;
        double answer;
        if (length % 2 == 0){
            answer = arr[length / 2]+arr[length/2 -1];
        }else {
            answer =arr[length/2];
        }
        System.out.println(answer);


    }
}
