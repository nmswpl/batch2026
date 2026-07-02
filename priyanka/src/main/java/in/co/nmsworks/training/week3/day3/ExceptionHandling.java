package in.co.nmsworks.training.week3.day3;

public class ExceptionHandling {
    public static void main(String[] args) {
        ExceptionHandling exceptionHandling = new ExceptionHandling();
//        exceptionHandling.doOperation();
        exceptionHandling.readNumber();
    }

    private void readNumber() {

        Integer c = Integer.valueOf("3.5");
        System.out.println(c);
    }

    private void doOperation() {
        Integer a = 5,b = null;
        try {
            Integer c = add(a,b);
            divide(c,null);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException in doOperation");
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("Exception in doOperation");
            e.printStackTrace();
        }
        finally {

        }
        System.out.println("Operation competed successfully");

    }

    private Integer add(Integer a, Integer b) {
        Integer c = null;
        try {
            c = a+b;
            System.out.println("Add: " + c);
        }
        catch (Exception e) {
//            System.out.println("Exception occured in add values: "+a+","+b);
//            e.printStackTrace();
        }
        System.out.println("Returning value of c is :"+ c);
        return c;
    }
//    private Integer add(Integer a, Integer b) {
//        Integer c = a + b;
//        System.out.println("Returning value is :"+ c);
//        return c;
//    }

    private void divide(Integer a, Integer b) {
        if (a == null || b == null){
            throw new NumberFormatException("B Value cannot be null");
        }
        if(a == 0 || b == 0){
            throw new IllegalArgumentException("B Value cannot be zero");
        }

        System.out.println("Inside divide method");
        Integer c = a/b;
        System.out.println("Divide: " + c);
    }

}
