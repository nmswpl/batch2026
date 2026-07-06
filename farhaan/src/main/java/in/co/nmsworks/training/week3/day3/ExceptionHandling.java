package in.co.nmsworks.training.week3.day3;

public class ExceptionHandling {
    public static void main(String[] args) {
        ExceptionHandling handling = new ExceptionHandling();
        handling.doOperation();
        handling.readNumber();
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
            System.out.println("Add finished");
            divide(c,null);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Null pointer catch");
        }
        catch(Exception e){
            System.out.println("Exception catch");
            e.printStackTrace();
        }
        System.out.println(" Operation Completed successfully");
    }

    private void divide(Integer a, Integer b) {
        System.out.println("Inside divide method");
        if( a == null || b == null){
            throw new NumberFormatException("Num cant be null");
        }
        if(a == 0 || b == 0){
            throw new IllegalArgumentException("Value cannot be Zero ");
        }
        Integer c = a / b;
        System.out.println("C is :: " + c);
    }

    private Integer add(Integer a, Integer b) {
        Integer c = null;
        try {
            c = a + b;
            System.out.println("a :: " + a + " b :: " + b + " c :: " + c);
        }
        catch (Exception e) {
           System.out.println("Exception occurred... ");
           e.printStackTrace();
        }
        System.out.println(" Returns  c :: " + c);
        return c;
    }

//    private Integer add(Integer a, Integer b) {
//        Integer c = a + b;
//        System.out.println(" Returns  c :: " + c);
//        return c;
//    }
}
