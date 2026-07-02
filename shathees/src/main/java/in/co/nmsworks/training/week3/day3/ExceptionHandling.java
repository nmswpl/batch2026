package in.co.nmsworks.training.week3.day3;

public class ExceptionHandling {

    public static void main(String[] args) {
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        exceptionHandling.doOperations();
        exceptionHandling.readNumber();
    }

    private void readNumber() {
        try {
            Double a = Double.valueOf("3.5");
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }

    private void doOperations() {
        Integer a = 5, b = null;

        try {
            Integer c = add(a, b);
            div(c, null);

        } catch (NumberFormatException e) {
            System.out.println("Number format exception.......");
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("Inside exception ......");
            e.printStackTrace();

        } finally {
            System.out.println("Execution finished");
        }

        System.out.println("operation completed successfully....");
    }

    private void div(Integer a, Integer b) {

        if (a == null || b == null) {
            throw new IllegalArgumentException("value cannot be null");
        }

        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("value cannot be zero");
        }

        System.out.println("Inside divide method");
        Integer c = a / b;
        System.out.println("div :" + c);
    }

    private Integer add(Integer a, Integer b) {
        Integer c = null;

        try {
            c = a + b;
            System.out.println("Add : " + c);
        } catch (Exception e) {
            System.out.println("Exception in add method");
        }

        System.out.println("returning value of c = " + c);
        return c;
    }
}