package in.co.nmsworks.training.week1.set1;

import in.co.nmsworks.training.week1.exam.mobile;

public class RunnerBook {
    public static void main(String[] args){
       BookDetail book=new BookDetail(101,"Java Programming","James Gosling",450.0);
        System.out.println("ID : " + book.getId());
        System.out.println("Brand : " + book.getTitle());
        System.out.println("Modal :" + book.getAuthor());
        System.out.println("Price : " + book.getPrice());
    }
}
