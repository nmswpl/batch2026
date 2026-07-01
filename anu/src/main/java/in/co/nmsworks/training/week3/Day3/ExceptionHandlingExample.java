package in.co.nmsworks.training.week3.Day3;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        ExceptionHandlingExample exceptionHandling=new ExceptionHandlingExample();
        exceptionHandling.doOperation();
        exceptionHandling.readNumber();
    }

    private void readNumber() {
        Integer value = Integer.valueOf("3.5");
        System.out.println(value);

    }

    private void doOperation() {
        Integer a = null , b = null ;
        try{
            Integer c=add(a,b);
            div(c,5);
        }
        catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("number format ");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("always Finally executed");
        }
        System.out.println("Operqation completed successfully ");

    }

    private void div(Integer a, Integer b) {
        if(a == null || b == null){
            throw new NumberFormatException("value cannot be null");
        }
        if(a == 0 || b == 0){
            throw new IllegalArgumentException("illegal argument ");
        }
        System.out.println("Inside Divide Method ");
        Integer c = a / b ;
        System.out.println("divide : "  + c);
    }

    private Integer add(Integer a, Integer b) {
        Integer c = null ;
        try {
            c = a + b ;
            System.out.println("Adding : " + c);
        } catch (Exception e) {
//            System.out.println("Exception occur for a " + a + " and  b " + b);
//            e.printStackTrace();
        }
        System.out.println("Returning value of c  is : " + c);
        return c;
    }

//    private Integer add(Integer a, Integer b) {
//        Integer c = null ;
//        try {
//            c = a + b ;
//            System.out.println("Adding : " + c);
//        } catch (Exception e) {
////            System.out.println("Exception occur for a " + a + " and  b " + b);
////            e.printStackTrace();
//        }
//        System.out.println("Returning value of c  is : " + c);
//        return c;
//    }


}
