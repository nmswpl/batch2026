package in.co.nmsworks.training.week3.day3;

public class ExceptionHandling {
    public static void main(String[] args) {
        ExceptionHandling exceptionHandling = new ExceptionHandling();

        exceptionHandling.doOperation();
        exceptionHandling.readNumber();

//      Integer.valueOf("7.5");

    }

    private void readNumber() {
        Integer c = Integer.valueOf("3.5");
        System.out.println("c = " + c );
    }

    private void doOperation() {
        Integer a = 5 ,b = null;
        try {
            Integer c = add(a,b);
            divide(c,6);
        } catch (NumberFormatException e) {
            System.out.println("This is a number format exception");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("This is an exception");
            e.printStackTrace();
        }
        finally {

        }

        System.out.println("Operation Completed Successfully !");

    }

    private Integer add(Integer a, Integer b){
        Integer c = null;
        try {
            c = a + b;
            System.out.println(a + " + " + b  + " = " + c);
        } catch (Exception e) {
//            System.out.println("Exception occurred for values : " + "a = " + a + " " + "b = " + b);
//            e.printStackTrace();
//            System.out.println("returning value is c = " + c);
        }
        System.out.println("returning value is c = " + c);
        return c ;
    }

//    private Integer add(Integer a, Integer b){
//        Integer c = a + b;
//        System.out.println(a + " + " + b  + " = " + c);
//
//        System.out.println("returning value is c = " + c);
//        return c ;
//    }

    private void divide(Integer a, Integer b){
        if(a == null || b == null){
            throw new NumberFormatException("null is not a valid divisor");
        }

        if(a == 0 || b == 0){
            throw new IllegalArgumentException("The divisor cannot be zero");
        }

        System.out.println("Inside divide method ");

        Integer c = a / b ;
        System.out.println(a + " / " + b  + " = " + c);
    }
}
