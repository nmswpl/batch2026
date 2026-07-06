package in.co.nmsworks.week3.day3;

public class ExceptionHandling {

    public void doOperation() {
        Integer a = 5;
        Integer b = null;

        try {
            Integer c = add(a, b);
            System.out.println("C : " + c);
            divide(c, 5);
        } catch (NumberFormatException nfe) {
            System.out.println("Number format exception");
            nfe.printStackTrace();

        } catch (Exception e) {
            System.out.println("Exception Happened");
            e.printStackTrace();
        } finally {
            System.out.println("Finally executed");
        }
        System.out.println("---OPERATION COMPLETED SUCCESSFULLY---");

    }


    private Integer add(Integer a, Integer b) {

        Integer c = null;
        try {
            c = a + b;
            System.out.println("Add : " + c);
        } catch (Exception e) {
            System.out.println("Exception Occured for values a :" + a + " b : " + b);
            e.printStackTrace();
        }
        System.out.println("Returning value is C :");
        return c;

    }


//    private Integer add(Integer a, Integer b) {
//
//        Integer c = a + b;
//
//        System.out.println("Returning value is C :");
//        return c;
//
//    }

    private void divide(Integer a, Integer b) {

        System.out.println("Inside Divide");

        if (a == null || b == null) {

            throw new NumberFormatException("Value cannot be Null");
        }

        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("Value cannot be Zero");
        }


        Integer c = a / b;

        System.out.println("Divide : " + c);
    }

    public void readNumber() {

        Integer a = Integer.valueOf("3.5");
        System.out.println(a);

    }
}
