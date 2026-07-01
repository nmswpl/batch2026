package in.co.nmsworks.training.week3.day3;

public class ExceptionHandling {
    public static void main(String[] args) {
        ExceptionHandling eh = new ExceptionHandling();
        eh.doOperation();
        eh.readNumber();
    }

    private void readNumber() {
        Integer c = Integer.valueOf("7.6");
        System.out.println(c);
    }

    private void doOperation() {
        Integer a = 5, b = null;
        try {
            Integer c = add(a,b);
            divide(c,5);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException.................");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception.................");
            e.printStackTrace();
        }
        finally {
            System.out.println("Operation Completed Sucessfully!!!");
        }

    }

    private static void divide(Integer a, Integer b) {
        if (b == null || a == null) {
            throw new NumberFormatException("Value Cannot be Null");
        }
        if (b == 0 || a == 0) {
            throw new IllegalArgumentException("Value Cannot be zero");
        }
        try {
            System.out.println("Inside Divide Method");
            Integer c = a / b;
            System.out.println("Division :: " + c);
        }
        catch (Exception e) {
            System.out.println("Exception Ocuured in Divide method");
            e.printStackTrace();
        }
    }

//    private static Integer add(Integer a, Integer b) {
//        Integer c = a + b;
//        System.out.println("Returning value is "+c);
//        return c;
//    }
    private static Integer add(Integer a, Integer b) {
        Integer c = null;
        try {
            c = a + b;
            System.out.println("Addition :: "+c);
        }
        catch (Exception e) {
//            System.out.println("Exception Ocuured in Add method");
//            e.printStackTrace();
        }
        finally {
            System.out.println("add method Closed");
        }
        System.out.println("Returning value is "+c);
        return c;
    }
}
