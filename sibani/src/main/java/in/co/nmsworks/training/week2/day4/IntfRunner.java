package in.co.nmsworks.training.week2.day4;

public class IntfRunner {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //dogMethod(dog);

        Cat cat = new Cat();
        //catMethod(cat);

        //AnimalMethod(dog);
        //AnimalMethod(cat);

        //LandMethod(dog);
        //LandMethod(cat);

        CreditCardPayment creditCardPayment = new CreditCardPayment();

        PayPalPayment payPalPayment = new PayPalPayment();

        CryptoPayment cryptoPayment = new CryptoPayment();

        makePayment(creditCardPayment, 8000);
        makePayment(payPalPayment, 9000);
        makePayment(cryptoPayment, 10000);
    }

    private static void makePayment(PaymentGateway paymentGateway, double amount) {
        paymentGateway.processPayment(amount);
    }

    private static void LandMethod(LandBased landBased) {
        System.out.println(landBased.canClimb());
        System.out.println(landBased.canWalk());
        landBased.eat();
        landBased.makeSound();
    }

    private static void AnimalMethod(Animal animal) {
        animal.makeSound();
        animal.eat();
    }

    private static void catMethod(Cat cat) {
        cat.eat();
        cat.makeSound();
        System.out.println(cat.canClimb());
        System.out.println(cat.canWalk());
    }

    private static void dogMethod(Dog dog) {
        dog.eat();
        dog.makeSound();
        System.out.println(dog.canClimb());
        System.out.println(dog.canWalk());
    }
}
