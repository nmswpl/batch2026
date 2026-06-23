package in.co.nmsworks.training.week1.exam;

public class SetTwoQuestions {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6};
//        findMedianOfAnArray(nums);
        displayAttributesOfEachPhone();
//        printHundredPositionValue(542);
    }

    public static void findMedianOfAnArray(int[] nums){
        int noOfElements = nums.length;

        if(noOfElements % 2 != 0){
            int medianIndex = noOfElements/2;
            System.out.println("Median of an array for odd elements : " + nums[medianIndex]);
        }
        else{
            int middle = noOfElements/2;
            int firstNum = nums[middle];
            int secondNum = nums[middle-1];

            System.out.println("Median of an array for even elements : " + (double)(firstNum+secondNum)/2);
        }
    }

    public static void displayAttributesOfEachPhone(){
        MobilePhone s24 = new MobilePhone(201, "Samsung", "Galaxy s24", 79999);
        MobilePhone s24Plus = new MobilePhone(202, "Samsung", "Galaxy s24 Plus", 99999);
        MobilePhone s24Ultra = new MobilePhone(203, "Samsung", "Galaxy s24 Ultra", 149999);
        MobilePhone iphone17 = new MobilePhone(204, "Iphone", "Iphone 17", 79999);
        MobilePhone iphone17Pro = new MobilePhone(205, "Iphone", "Iphone 17 Pro", 99999);

        printObject(s24);
        printObject(s24Plus);
        printObject(s24Ultra);
        printObject(iphone17);
        printObject(iphone17Pro);
    }

    private static void printObject(MobilePhone mobilePhone){
        System.out.println("ID = " + mobilePhone.getId());
        System.out.println("Brand = " + mobilePhone.getBrand());
        System.out.println("Model = " + mobilePhone.getModel());
        System.out.println("Price = " + mobilePhone.getPrice());
    }

    public static void printHundredPositionValue(int input){
        int hundredPositionVal = 0;

        for (int i=0; i<3; i++){
            int rem = input%10;
            input = input/10;

            hundredPositionVal = rem;
        }
        System.out.println("Value : " + hundredPositionVal);

        switch (hundredPositionVal) {
            case 1 :
                System.out.println("One");
                break;
            case 2 :
                System.out.println("Two");
                break;
            case 3 :
                System.out.println("Three");
                break;
            case 4 :
                System.out.println("Four");
                break;
            case 5 :
                System.out.println("Five");
                break;
            case 6 :
                System.out.println("Six");
                break;
            case 7 :
                System.out.println("Seven");
                break;
            case 8 :
                System.out.println("Eight");
                break;
            case 9 :
                System.out.println("Nine");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }


}
