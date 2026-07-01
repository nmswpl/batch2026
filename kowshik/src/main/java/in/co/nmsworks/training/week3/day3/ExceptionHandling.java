package in.co.nmsworks.training.week3.day3;

public class ExceptionHandling {
    public static void main(String[] args) {
        ExceptionHandling eh = new ExceptionHandling();
        eh.doOperation();
        eh.readNumber();

    }

    private void readNumber() {
        Integer c = Integer.valueOf("3.5");
        System.out.println("Read number : " + c);
    }


    private void doOperation() {
        Integer a = 5, b = 5;
        try {
            Integer c = add(a, b);
            System.out.println("c in do operation() : " + c);
            divide(c,5);
        } catch (NumberFormatException nfe) {
            System.out.println("Number format exception block in doOperation()");
            nfe.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception block in doOperation()");
            e.printStackTrace();
        } finally {
            System.out.println("Finally block in doOperation()");
        }

        System.out.println("Operation completed successfully!");
    }

    private void divide(Integer a, Integer b) {
        System.out.println("Inside divide method..");

        if (b == null || a == null) {
            throw new NumberFormatException("Value cannot be zero!");
        }
        else if (b == 0 || a == 0) {
            throw new IllegalArgumentException("Value cannot be null!");
        }

        Integer c = a/b;
        System.out.println("C in divide : " + c);
    }

    private Integer add(Integer a, Integer b) {

        Integer c = null;
        try {
            c = a + b;
            System.out.println("C in add : " + c);
        } catch (Exception e) {
            System.out.println("Exception occured for values " + a + " ," + b + " : ");
            e.printStackTrace();
        }

        System.out.println("Return value of C is : " + c);
        return c;
    }
//private Integer add(Integer a, Integer b) {
//
//    Integer c = a+b;
//    System.out.println("Return value of C in add() is : " + c);
//    return c;
//}
}
