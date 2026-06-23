package in.co.nmsworks.training.week1.exam;

public class ExamQuestionsSet2 {
    public static void main(String[] args) {
        System.out.println("hello");
        medianOfArray();
        hundredPosition(434);
    }

    public static void medianOfArray(){

        int[] arr = {1,2,3,4,5,6};
        if(arr.length % 2 ==0){
            float mid1 = arr[arr.length/2 -1];
            float mid2 = arr[(arr.length/2)];
            float median = (mid1 + mid2) / 2;
            System.out.println("Median: "+ median);
        }
        else{
            int median = arr.length/2;
            System.out.println(arr[median]);
        }
    }
    public static void hundredPosition(int number){
        int hundredValue= number / 100;
        switch(hundredValue){
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
                System.out.println("Six");
                break;

            case 7:
                System.out.println("Seven");
                break;

            case 8:
                System.out.println("Eight");
                break;

            case 9:
                System.out.println("Nine");
                break;

            case 0:
                System.out.println("Zero");
                break;
        }
    }
}

