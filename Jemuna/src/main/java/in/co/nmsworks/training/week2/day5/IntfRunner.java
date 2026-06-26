package in.co.nmsworks.training.week2.day5;

public class IntfRunner {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        CryptoPayment crypto = new CryptoPayment();
        PayPalPayment paypal = new PayPalPayment();
        CreditCardPayment creditCardPayment = new CreditCardPayment();

        paymentGatewayMethod(crypto,25000);
        paymentGatewayMethod(paypal,3000);
        paymentGatewayMethod(creditCardPayment,8000);

        //dogMethod(dog);
        //catMethod(cat);
        animalMethod(dog);
        animalMethod(cat);
        landMethod(dog);
        landMethod(cat);

    }

    private static void paymentGatewayMethod(PaymentGateway paymentGateway,double amount) {
        paymentGateway.processPayment(amount);
    }

    private static void landMethod(LandBased landBased) {
        landBased.canClimb();
        landBased.canwalk();
        landBased.eat();
        landBased.makeSound();
    }

    private static void animalMethod(Animal animal) {
        animal.makeSound();
        animal.eat();
    }


    private static void catMethod(Cat cat) {
        cat.eat();
        cat.makeSound();
        cat.canClimb();
        cat.canwalk();
        cat.play();
    }

    private static void dogMethod(Dog dog) {
        dog.eat();
        dog.makeSound();
        dog.canClimb();
        dog.canwalk();
        dog.smell();
    }
}
