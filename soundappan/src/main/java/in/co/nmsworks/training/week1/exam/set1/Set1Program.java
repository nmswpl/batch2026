package in.co.nmsworks.training.week1.exam.set1;
public class Set1Program {
    public static void meanOfArray(){
        int []arr={1,2,3,4,5};
        float sum=0;
        for (int i : arr) {
            sum+=i;
        }
        float mean=sum/arr.length;
        System.out.println(mean);
    }
    public static void GradeToMark(int num){
        if(num > 90 && num <= 100){
            System.out.println("S");
        }
        else if (num >= 81 && num <= 90){
            System.out.println("A");
        }
        else if (num >= 71 && num <= 80){
            System.out.println("B");
        }
        else if (num >= 61 && num <= 70) {
            System.out.println("C");
        }
        else if (num >= 51 && num <= 60) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
    public static void main(String[] args) {
        meanOfArray();
        GradeToMark(81);
        Book b1=new Book(101,"Java Programming","James Gosling",450.0);
        Book b2=new Book(102,"C Programming","Dennis",550.0);
        Book b3=new Book(103,"HTML","Tim",660.0);
        Book b4=new Book(104,"JavaScript","Brend",880.0);
        Book b5=new Book(105,"Css","Lie",990.0);
        b1.display();
        b2.display();
        b3.display();
        b4.display();
        b5.display();
    }
}
