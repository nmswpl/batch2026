package in.co.nmsworks.training.week3.day3;

import com.sun.javafx.image.IntPixelGetter;

public class ExceptionHandling {
    public static void main(String[] args) {
        ExceptionHandling exceptionHandling=new ExceptionHandling();
        exceptionHandling.doOperation();
        exceptionHandling.readNumber();
    }

    private void readNumber() {
        Integer c=Integer.valueOf("3.5");
        System.out.println(c);
    }

    private void doOperation() {
        Integer a = 5 ,b = null;

        try {
            Integer c=add(a,b);
            divide(c,null);
        } catch (NumberFormatException ne) {
            System.out.println("Number Format Exception ");
            ne.printStackTrace();
        }
        catch (NullPointerException npe){
            System.out.println("Null ");
            npe.printStackTrace();
        }
        finally {
            System.out.println("Operation completed successfully");
        }
//        System.out.println("Operation completed successfully");
    }
    private Integer add(Integer a,Integer b)
    {
        Integer c=null;
        try {
            c= a + b;
            System.out.println("add of a + b : "+c);
        } catch (Exception e) {
            System.out.println("Exception occured for values a ,b "+a+" ,"+b);
            e.printStackTrace();
        }
        System.out.println("Returning value of c is "+c);
        return c;
    }
//    private Integer add(Integer a,Integer b)
//    {
//        Integer c = a + b;
//        System.out.println("add of a + b : "+c);
//        System.out.println("Returning value of c is "+c);
//        return c;
//    }
    private void divide(Integer a,Integer b)
    {
        if(b == null || a == null)
        {
            throw new NumberFormatException("null is not valid");
        }

        if(b == 0 || a == 0)
        {
            throw new IllegalArgumentException("Value cannot be 0");
        }

        System.out.println();
        Integer c = a / b;
        System.out.println(c);
    }
}
