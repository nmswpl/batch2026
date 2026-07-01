package in.co.nmsworks.training.week3.day3;

public class ExceptionHandling {
    public static void main(String[] args) {
        ExceptionHandling e1 = new ExceptionHandling();
        e1.doOperation();
        e1.readNumber();

    }

    private void readNumber() {
        Integer c = Integer.valueOf("3.5");
        System.out.println("read number : " + c);
    }

    private void doOperation() {
        Integer a = 5, b = null;
        try {
            Integer c = add(a, b);
            divide(c, 5);
        }
        catch (NumberFormatException nfe){
            System.out.println("number format exception");
            nfe.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {

        }
        System.out.println("operation completed successfully");
    }

    private void divide(Integer a, Integer b) {
        if (a == null || b == null){
            throw new NumberFormatException("value cannot be null");
        }
        if (a == 0 || b == 0){
            throw new IllegalArgumentException("value cannot be zero");
        }

        System.out.println("inside divide mathod : ");
        Integer c = a / b;
        System.out.println("Divide : " + c);
    }

    private Integer add(Integer a, Integer b) {
        Integer c = null;
        try {
            c = a + b;
            System.out.println("Addition : " + c);

        } catch (Exception e) {
            System.out.println("exception occured for addition");
            e.printStackTrace();
        }
        System.out.println("returning value in add block is : " + c);
        return c;
    }
   /* private Integer add(Integer a, Integer b) {
        Integer c = null;

            c = a + b;
            System.out.println("Addition : " + c);

//            System.out.println("exception occured for addition");
//            e.printStackTrace();

        System.out.println("returning value is : " + c);
        return c;
    }

    */
}
