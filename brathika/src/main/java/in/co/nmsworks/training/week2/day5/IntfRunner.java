package in.co.nmsworks.training.week2.day5;

public class IntfRunner {
    public static void main(String[] args) {


       Dog d = new Dog();
        //dog(d);

        Cat c = new Cat();
        //cat(c);
        animalMethod(d);
        animalMethod(c);
        landMethod(d);

        CreditCardPayment pay1 = new CreditCardPayment();
        makePayment(pay1,1000.00);
        CryptoPayment pay2 = new CryptoPayment();
        makePayment(pay2,67000.0);
        PayPalPayment pay3 = new PayPalPayment();
        makePayment(pay3,6800.0);
    }

    private static void makePayment(PaymentGateway paymentGateway, double amount) {
        paymentGateway.processPayment(amount);
    }

    private static void landMethod(LandBased land) {
        land.canClimb();
        land.canWalk();


    }

    private static void animalMethod(Animal animal) {
        animal.makeSound();
        animal.eats();



    }

    private static void cat(Cat c) {
        c.makeSound();
        c.eats();


    }

    private static void dog(Dog d) {
        d.makeSound();
        d.eats();

    }
}
