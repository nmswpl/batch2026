package in.co.nmsworks.training.week1.exam;

public class Runner {
    public static void main(String[] args)
    {
        Runner obj = new Runner();
        Book b1=new Book(101,"Pandi","pandi",450.0F);
        Book b2=new Book(102,"Pragath","waran",400.0F);
        Book b3=new Book(103,"suri","kumar",50.0F);
        Book b4=new Book(104,"suria","kriz",440.0F);
        Book b5=new Book(105,"Pan","ganes",420.0F);
        obj.display(b1);

        Phone p1=new Phone(201,"Nokia","X22",50000);
        phoneDisplay(p1);
        Phone p2=new Phone(202,"Samsung","s22",56000);
        Phone p3=new Phone(203,"Apple","iphone15",100000);
        Phone p4=new Phone(204,"Nothing","X22",56000);


    }
    private void display(Book book)
    {
        System.out.println("Id :"+book.getId()+" Name: "+book.getTitle()+" Author: "+book.getAuthor()+" price: "+book.getPrice());
    }
    private static void phoneDisplay(Phone ph)
    {
        System.out.println("Id :"+ph.getId()+" Brand: "+ ph.getBrand()+" Model: "+ph.getModel()+" price: "+ph.getPrice());
    }
}
