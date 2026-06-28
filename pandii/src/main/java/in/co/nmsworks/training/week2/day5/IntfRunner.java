package in.co.nmsworks.training.week2.day5;

public class IntfRunner {
    public static void main(String[] args) {
//        AnimalPractice();

        CreditCardPayment cp=new CreditCardPayment();
        PaypalPayment pp=new PaypalPayment();
        CryptoPayment cy=new CryptoPayment();
        makePayment(cp, 21000);
        makePayment(pp, 2200);
        makePayment(cy, 2500);

//        CatImp(c);
    }

    private static void makePayment(PaymentGateWay paymentGateWay,double d) {
        paymentGateWay.processPayment(d);
    }

    private static void AnimalPractice() {
        Dog d=new Dog();

//        DogImp(d);
        AnimalMethod(d);
        Cat c=new Cat();
        AnimalMethod(c);
    }


    private static void AnimalMethod(LandBased animal) {
        animal.eat();
        animal.makeSound();
        System.out.println(animal.canWalk());
        System.out.println(animal.canWalk());
    }


    private static void CatImp(Cat c) {
        c.eat();
        c.makeSound();
    }

    private static void DogImp(Dog d) {
        d.eat();
        d.makeSound();
    }
}
