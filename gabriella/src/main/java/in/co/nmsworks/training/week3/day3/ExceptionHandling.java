package in.co.nmsworks.training.week3.day3;

import com.google.protobuf.Enum;

public class ExceptionHandling {

    public static void main(String[] args) {
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        exceptionHandling.doOperation();
        exceptionHandling.readNumber();

    }

    private void readNumber() {
        Integer c = Integer.valueOf("3.5");
        System.out.println("c: " + c);

    }

    private static Integer add(Integer a, Integer b) {
        Integer c = null;
        try {
            c = a + b;
            System.out.println("Sum of " + a + " and " + b + " : " + c);
        } catch (Exception e) {
            // System.out.println("Exception occurred for values " + a + " and " + b + " in add method");
            //e.printStackTrace();
        }
        System.out.println("Returning value of c: " + c);
        return c;


    }


//    private static Integer add(Integer a, Integer b) {
//        Integer c = a + b;
//        System.out.println("Returning value of c: " + c);
//        return c;
//    }

    private void doOperation() {
        Integer a = 5;
        Integer b = null;
        try {
            Integer c = add(a, b);
            divide(c,5);
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception");
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("Exception");
            e.printStackTrace();
        } finally {

        }
        System.out.println("Operation completed successfully");
    }

    private void divide(Integer a, Integer b) {

        System.out.println("Inside divide method");

        if (b == null || a == null){
            throw new NumberFormatException("Null is not a valid number");
        }

        if (b == 0 || a == 0){
            throw new IllegalArgumentException("Value invalid. Cannot be zero");
        }

        Integer c = a/b;
        System.out.println(c);
    }
}
