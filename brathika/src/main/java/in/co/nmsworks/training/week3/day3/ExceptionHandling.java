package in.co.nmsworks.training.week3.day3;

public class ExceptionHandling {
    public static void main(String[] args) {
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        exceptionHandling.doOperation();
    }

    private void doOperation() {
        Integer a = 5, b = null;
        try {
            Integer c = add(a, b);
            divide(c, 5);
        } catch (NumberFormatException nfe) {
            System.out.println("Number format Exception");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        System.out.println("Operation completed sucessfully");
    }

    private void divide(Integer a, Integer b) {
        System.out.println("Divide Entry");
        if (a == null || b == null) {
            throw new NumberFormatException("null is not a valid element");
        }
        else if (a == 0 || b == 0) {

            throw new IllegalArgumentException("Value cannot be zero");
        }

        System.out.println("Inside divide menthod");
        Integer c = a / b;
        System.out.println("Divison of a and b "+c);
    }

    private Integer add(Integer a, Integer b) {
        Integer c = null;
        try {
            c = a + b;
            System.out.println("Addition of a and b "+c);

        } catch (Exception e) {
            System.out.println("Exception occured for values "+a+" "+b);
            e.printStackTrace();
        }
        System.out.println("Returning value is "+c);
        return c;

    }
//    private Integer add(Integer a, Integer b) {
//        Integer c = a + b;
//
//        System.out.println("Returning value is "+c);
//        return c;
//
//    }
}
