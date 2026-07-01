package in.co.nmsworks.training.week3.day3;

public class ExceptionHanding {
    public static void main(String[] args) {
        ExceptionHanding exceptionHanding = new ExceptionHanding();
        exceptionHanding.doOperation();
        exceptionHanding.readNumber();

    }

    private void readNumber() {
        Integer c = Integer.valueOf("3.5");
        System.out.println(c);
    }

    private void doOperation() {
        Integer a = 5;
        Integer b = null;

        try {
            Integer c = add(a,b);
            divide(c,a);

        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Inside NFE exception in doOperation");
        }
        catch ( Exception e )
        {
            e.printStackTrace();
            System.out.println("Inside Exception in doOperation");
        }
        finally {
            //executed compulsorily
        }

        System.out.println("Operation completed successfully!");
    }

    private void divide(Integer a, Integer b) {

        if( a==null || b==null ){
            throw new NumberFormatException("a = null and b = null is not a valid number");
        }

        if(a==0 || b==0)
        {
            throw new IllegalArgumentException("a and b Values can't be zero");
        }

        System.out.println("Inside Divide method");
        Integer c = a/b;
        System.out.println("Division of a: "+a+", b= "+b+" => "+c);
    }

    private Integer add(Integer a, Integer b)
    {
        Integer c = null;
        try {
            c = a+b;
            System.out.println("Addition of a: "+a+", b= "+b+" => "+c);

        } catch (Exception e) {
//            System.out.println("Exception occured for values: a="+a+", b="+b);
//            e.printStackTrace();
        }

        System.out.println("Returning value of c is: "+c);
        return c ;

    }

//    private Integer add(Integer a, Integer b)
//    {
//        Integer c = null;
//        try {
//            c = a+b;
//            System.out.println("Addition of a: "+a+", b= "+b+" => "+c);
//
//        } catch (Exception e) {
////            System.out.println("Exception occured for values: a="+a+", b="+b);
////            e.printStackTrace();
//        }
//
//        System.out.println("Returning value of c is: "+c);
//        return c ;
//
//    }
}
