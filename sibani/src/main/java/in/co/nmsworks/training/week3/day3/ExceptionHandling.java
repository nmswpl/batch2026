package in.co.nmsworks.training.week3.day3;

import static com.sun.javafx.fxml.expression.Expression.divide;

public class ExceptionHandling {
    public static void main(String[] args) {
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        //exceptionHandling.doOperation();
        exceptionHandling.readNumber();
    }

    private void readNumber() {
        Integer c = Integer.valueOf("3.5");
    }

    private void doOperation() {
        Integer a = 5, b = null;
        try {
            Integer c = add(a,b);
            divide(c, 5);
        } catch (NumberFormatException nfe) {
            System.out.println("Inside Number Format Exception");
        } catch (Exception e) {
            System.out.println("Inside Exception");
        }
        System.out.println("Operation completed successfully");
    }

    private void divide(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new NumberFormatException("Divisor cannot be null");
        }
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("Value Cannot be zero");
        }

        System.out.println("Inside divide method");
        Integer c = a / b;
        System.out.println(c);
    }

    private Integer add(Integer a, Integer b) {
        Integer c = null;
       try {
             c = a + b;
            System.out.println("Sum : " + c);
       }
        catch (Exception e) {
           e.printStackTrace();
           System.out.println("Exception occured  for values a : " + a + " and b is : " + b);
       }
       System.out.println("Returning value of c is : " + c);
       return c;
   }

//    private Integer add(Integer a, Integer b) {
//       Integer c = a + b ;
//       System.out.println("Returning value of c is : " + c);
//       return c;
//    }
}
