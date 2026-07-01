package in.co.nmsworks.training.week3.day3;

public class ExceptionHandling {
    public static void main(String[] args) {

        ExceptionHandling exceptionHandling = new ExceptionHandling();
        //exceptionHandling.doOperation();
        exceptionHandling.readNumber(new String("3.5"));
    }

    private void readNumber(String a) {
        Integer c = Integer.valueOf(a);
        System.out.println(c);
    }

    private void doOperation() {
        Integer a ,b;
        a = 5;
        b = null;

        try {
            Integer c = add(a,b);
            divide(c,null);
        }
        catch (NumberFormatException e) {
            System.out.println("Inside doOperation NumberFormatException");
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("Inside exception");
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("Operation completed successfully");
    }

    private Integer add(Integer a, Integer b) {
        Integer c = null;
        try {
            c = a + b;
            System.out.println("add : " + c);
        }
        catch (Exception e) {
            System.out.println("Exception occurred in add method a : " + a + " b : " + b);
            e.printStackTrace();
        }

        System.out.println("returning value of c : "+ c);
        return c;
    }

//    private Integer add(Integer a, Integer b) {
//        Integer c = null;
//        c = a + b;
//        System.out.println("add : " + c);
//        System.out.println("returning value of c : "+ c);
//        return c;
//    }


    private void divide(Integer a, Integer b) {

        if (a == null || b == null){
            throw new NumberFormatException("Null is not a valid number");
        }

        if(a.equals(0) || b.equals(0)){
            throw new IllegalArgumentException("Value cannot be zero");
        }

        System.out.println("Inside divide method");
        Integer c = a / b;
        System.out.println(c);
    }
}
