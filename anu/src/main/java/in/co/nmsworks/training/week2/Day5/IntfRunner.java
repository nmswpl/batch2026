package in.co.nmsworks.training.week2.Day5;

public class IntfRunner {
    public static void main(String[] args) {
//        Dog dogs=new Dog();
////        dogMethod(dogs);
//
//        Cat cats=new Cat();
////        catMethod(cats);
//
//        animalMethod(dogs);
//        animalMethod(cats);

        PaymentGateway cryptoPayment=new CryptoPayment();
        makepayment(cryptoPayment,10000);

        PaymentGateway creditCardPayment=new CreditCardPayment();
        makepayment(creditCardPayment,20000);

        PaymentGateway paypalpayment=new PayPalPayment();
        makepayment(paypalpayment,30000);

    }

    private static void makepayment(PaymentGateway paymentGateway,double amount) {
        paymentGateway.processPayment(amount);
    }

//    private static void landBasedMethod(LandBased landBased) {
//        landBased.canCilent();
//        landBased.canWalk();
//        landBased.eat();
//        landBased.makeSound();
//    }
//
//    private static void animalMethod(Animal animal) {
//        animal.eat();
//        animal.makeSound();
//    }
//
//    private static void catMethod(Cat cats) {
//        cats.eat();
//        cats.makeSound();
//    }
//
//    private static void dogMethod(Dog dogs) {
//        dogs.eat();
//        dogs.makeSound();
//    }
}
