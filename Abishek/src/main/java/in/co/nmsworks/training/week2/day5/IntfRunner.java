package in.co.nmsworks.training.week2.day5;

public class IntfRunner {
    public static void main(String[] args){
        Dog d = new Dog();
        dogMethod(d);
        Cat c = new Cat();
        catMethod(c);
        animalMethodOfDog(d);
        animalMethodOfCat(c);

        PaymentGateway cr = new CreditCardPayment();
        PaymentGateway cp = new CryptoPayment();
        PaymentGateway pp = new PayPalPayment();
        makePayment(cr,1000);
        makePayment(cp, 100);
        makePayment(pp, 10000);
    }

    public static void makePayment(PaymentGateway pg,double amount)
    {
       pg.processPayment(amount);
    }

    private static void animalMethodOfCat(Cat a) {
        a.eat();
        a.makeSound();
        if(a.canWalk()) System.out.println("Yes");
        else System.out.println("No");
        if(a.canClimb()) System.out.println("Yes");
        else System.out.println("No");
    }

    private static void animalMethodOfDog(LandBased a) {
        a.eat();
        a.makeSound();
        a.canClimb();
        a.canWalk();
    }

    private static void catMethod(Cat c) {
        c.eat();
        c.makeSound();
    }

    private static void dogMethod(Dog d) {
        d.eat();
        d.makeSound();
    }

}
