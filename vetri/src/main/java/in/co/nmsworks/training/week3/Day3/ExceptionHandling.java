package in.co.nmsworks.training.week3.Day3;

public class ExceptionHandling {
    public static void main(String[] args) {
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        exceptionHandling.doOperation();
        exceptionHandling.readNumber();
    }

    private void readNumber() {
        Integer i = Integer.valueOf("3.5");
        System.out.println(i);
    }

    private void doOperation() {
        Integer a = 5 ,b = 5;
        try {
            Integer c = add(a,b);
            divide(null,0);
        } catch (NumberFormatException e) {
            System.out.println("NumberFotmatException on Do operation");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception on Do operation");
            e.printStackTrace();
        } finally {
            System.out.println("Program Completed");
        }

    }
    private void divide(Integer a, Integer b) {

        System.out.println("Inside Divide method");

        if (a == null || b==null){
            throw new NumberFormatException("Value cant be Null");
        }

        if (a == 0 || b == 0){
            throw new IllegalArgumentException("Value cant be 0");
        }

        Integer c = a / b;
        System.out.println("Divide"+c);
    }


    private Integer add(Integer a, Integer b) {
        Integer c = null;
        try {
            c = a + b;
            System.out.println("Add: "+c);
        } catch (Exception e) {
            System.out.println("Exception occured in the Add methods for the a: "+a + ",b: "+b);
            e.printStackTrace();

        }
        System.out.println("returing val of c is:"+c);
        return c;
    }
}

//private Integer add(Integer a, Integer b) {
//    Integer c = null;
//    c = a + b;
//    System.out.println("Add: "+c);
//    System.out.println("returing val of c is:"+c);
//    return c;
//}
//}