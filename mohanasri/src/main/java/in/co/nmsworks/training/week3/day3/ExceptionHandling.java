package in.co.nmsworks.training.week3.day3;

import jdk.nashorn.internal.runtime.ECMAException;

public class ExceptionHandling {
    public static void main(String[] args) {
        ExceptionHandling exp = new ExceptionHandling();
        exp.doOperation();
        exp.readNumber(Integer.valueOf("3.5"));
    }

    private void readNumber(Integer integer) {
        Integer c = integer;
        System.out.println(c);
    }

    private void doOperation() {
        Integer a = 5, b = null ;

        try {
            Integer c = add(a, b);
            divide(c, null);
        } catch (NumberFormatException e) {
            System.out.println("I'm in number format exception");
            e.printStackTrace();

        }
        catch (Exception e) {
            System.out.println("I'm in exception");
            e.printStackTrace();
        }
        finally {
            System.out.println();
        }
            System.out.println("Operation successful");

    }

    private void divide(Integer a, Integer b) {
        if (a == null || b == null){
            throw new NumberFormatException("value cannot be a null");
        }
        if (a == 0 || b == 0){
            throw new IllegalArgumentException("Value cannot be zero");

        }

        System.out.println("Inside divide method");
        Integer c = a / b;

        System.out.println(c);
    }

    private Integer add(Integer a, Integer b) {
        Integer c = null;
        try {
             c = a + b;
        } catch (Exception e) {
            //System.out.println("Exception occured in add method values : " + a + " " + b + c);
            //e.printStackTrace();

        }

        System.out.println("returning value is : " + c);
        System.out.println("Addition method ending ");
        return c;
    }

//    private Integer add(Integer a, Integer b) {
//        Integer c = a + b;
//        System.out.println("returning value is : " + c);
////        System.out.println("Addition method ending ");
//        return c;
//    }
}
