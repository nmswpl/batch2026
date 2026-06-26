package in.co.nmsworks.training.week2.Day4;

public class RunnerSchoolBag {
    public static void main(String[] args){
//        Textbook textbook=new Textbook("java Programming");
//        SchoolBag school=new SchoolBag("school bag",200.00,textbook);
//        school.open();
//        school.study();
//        System.out.println(school);

        Coin coin=new Coin(10);
        DigitalWallet digitalWallet=new DigitalWallet("Blue",coin);
        digitalWallet.makePayment();
        digitalWallet.carry();
        System.out.println(digitalWallet);
    }
}
