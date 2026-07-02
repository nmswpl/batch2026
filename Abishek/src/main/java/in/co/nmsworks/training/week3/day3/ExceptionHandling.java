package in.co.nmsworks.training.week3.day3;


public class ExceptionHandling {

    public static void main(String[] args) {

        ExceptionHandling handle = new ExceptionHandling();
//        handle.doOperation();
        handle.readNumber();

    }

    private void readNumber() {
        Integer s = Integer.valueOf("3.5");
        System.out.println(s);
    }

    private void doOperation() {

        Integer a = 5,b = null;
        try {
//            Integer c = addOf(a,b);
            divideOf(a,b);
        }
        catch (NumberFormatException e) {
            System.out.println("Nu");
            e.printStackTrace();
        }
        catch (Exception e)
        {
            System.out.println("Catch");;
        }
        finally {
            System.out.println("Finished");
        }
        System.out.println("Operation completed successfully");
    }

    private void divideOf(Integer a, Integer b) {

        if ( a == null || b == null)
        {
            throw new NumberFormatException("Value can't be null");
        }
        if( b == 0 || a == 0)
        {
            throw  new IllegalArgumentException("Value can't be zero");
        }

        Integer c;
        try {
            c = a/b;
            System.out.println("Add a and b: "+c);
        }

        catch (Exception e) {
            System.out.println("Exception occured for values a,b "+a+" "+b);
            e.printStackTrace();
        }
        System.out.println("Inside the divide method");
//         Integer d =b/a;
//        System.out.println(d);
    }

    private Integer addOf(Integer a, Integer b) {

//        if( b == 0)
//        {
//            throw  new IllegalArgumentException("Value can't be zero");
//        }
//        if( b == null)
//        {
//            throw new NumberFormatException("Value can't be null");
//        }
        Integer c = null;
        try {
            c = a+b;
            System.out.println("Add a and b: "+c);
        }

        catch (Exception e) {
        System.out.println("Exception occured for values a,b "+a+" "+b);
            e.printStackTrace();
        }
        System.out.println("Returning value is: "+c);
        return c;
    }

//    private Integer addOf(Integer a, Integer b) {
//
//        Integer c = null;
//        c = a+b;
//        System.out.println("Returning value is: "+c);
//        return c;
//    }
}
