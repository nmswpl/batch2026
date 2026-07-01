package in.co.nmsworks.training.week3.day3;

import static com.sun.javafx.fxml.expression.Expression.divide;

public class ExceptionHandling {
    public static void main(String[] args) {
        ExceptionHandling exceptionHandling = new ExceptionHandling();
//        exceptionHandling.doOperation();
        exceptionHandling.readNumber();
    }

    private void readNumber() {
        Integer value = Integer.valueOf("7.5");
        System.out.println(value);
    }

    private void doOperation() {
        Integer a = 5;
        Integer b = null;
        try {
            Integer c = add(a, b);
            divide(c, 5);
        } catch (NumberFormatException nfe) {
            System.out.println("Inside nfe");
        } catch (Exception e) {
            System.out.println("Inside Exception");
            e.printStackTrace();
        }
        finally {

        }
        System.out.println("Do operation completed successfully...");
    }

    private void divide(Integer a, Integer b) {

        if (a == null || b == null) {
            throw new NumberFormatException("null is not a number....");
        }
        if (a == 0 || b == 0){
            throw new IllegalArgumentException("Value cannot be zero...");
        }

        System.out.println("Inside divide method");
        Integer c = a / b;
        System.out.println("Divide :  "+c);
    }

    private Integer add(Integer a, Integer b) {
            Integer c = null;
        try {
            c = a + b;
            System.out.println("Add : "+c);
        }
        catch (Exception e) {
            System.out.println("Exception Occurred for a and b "+ a + " "+b);
            e.printStackTrace();
        }
        System.out.println("Returning value of c is : "+c);
        return c;
    }
//private int add(Integer a, Integer b) {
//    Integer c = null;
//
//    c = a + b;
//    System.out.println("Add : "+c);
//
//    System.out.println("Returning value of c is : "+c);
//    return c;
//}
}
