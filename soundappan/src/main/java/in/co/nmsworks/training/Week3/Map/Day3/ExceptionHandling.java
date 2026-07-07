package in.co.nmsworks.training.Week3.Map.Day3;

public class ExceptionHandling {
    public static void main(String[] args) {
        ExceptionHandling exceptionhandling = new ExceptionHandling();
        exceptionhandling.doOperation();
        exceptionhandling.readNumber(new String("3.5"));
    }

    private void readNumber(String a) {
       Integer b=Integer.valueOf(a);
        System.out.println(b);
    }

    private void doOperation() {
        Integer a, b;
        a = 5;
        b = null;
        try {
            Integer c = add(a, b);
            divide(c, 5);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Number Format Exception Found In DoOperation");
        } catch (Exception e) {
            System.out.println("Exception Found");
        }
    }

    private Integer add(Integer a, Integer b) {
        Integer c = null;
        try {
            c = a + b;
            System.out.println("Add of a+b = " + c);
        } catch (Exception e) {
            System.out.println("Exception occurred in the add method a " +a +"  b  " + b);
           e.printStackTrace();
        }
        finally {
            System.out.println("Program Completed");
        }
        System.out.println("Returning value of c is : " + c);
        return c;
    }
//private Integer add(Integer a, Integer b) {
//    Integer c=null;
//        c=a+b;
//        System.out.println("Add of a+b = " + c);

    /// /            System.out.println("Exception occurred in the add method a " +a +"  b  " + b);
    /// /           e.printStackTrace();
//    System.out.println("Returning value of c is : "+c);
//    return c;
//}
    public void divide(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new NumberFormatException("Value cannot be Null");
        }
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("Value cannot be Zero");
        }


        System.out.println("Inside Divide Method");
        Integer c = a / b;
        System.out.println("Divide of a/b = " + c);
    }
}
