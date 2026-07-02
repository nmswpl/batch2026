package in.co.nmsworks.training.week3.day3;

import org.apache.commons.lang3.ObjectUtils;

public class ExceptionHandling {
    public static void main(String[] args) {
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        exceptionHandling.doOperation();
        exceptionHandling.readNumber();

    }

    private void readNumber() {
        Integer c = Integer.valueOf("3.5");
        System.out.println(c);
    }

    private void doOperation() {
        Integer a = 5;
        Integer b = null;
        try {
            Integer c = add(a,b);
            divide(c,5);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Number Format Exception in DoOperations");        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally BLock executed....");
        }
        System.out.println("Operation completed Successfully");
    }

    private void divide(Integer a, Integer b){
        if(a==null || b==null){
            throw new NumberFormatException("Null is not a alid number");
        }
        if(a==0 || b==0){
            throw new IllegalArgumentException("Value cannnot be zero");
        }

        System.out.println("Inside the Divide Method ");
        Integer c = a/b;
        System.out.println("Division of a and b = "+c);
    }


    private Integer add(Integer a, Integer b){
        Integer c=null;
        try {
            c = a+b;
            System.out.println("Addition of a and b = "+c);

        } catch (Exception e) {
            //System.out.println("Exception occured for values a= "+a+" b = "+b);
            //e.printStackTrace();
        }
        System.out.println("Returning value of c is : " +c);
        return c;
    }

//    private Integer add(Integer a, Integer b){
//        Integer c=null;
//        c = a+b;
//        System.out.println("Addition of a and b = "+c);
//
//
//            //System.out.println("Exception occured for values a= "+a+" b = "+b);
//            //e.printStackTrace();
//
//        System.out.println("Returning value of c is : " +c);
//        return c;
//    }

}
