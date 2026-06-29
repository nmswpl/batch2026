package in.co.nmsworks.training.week2.day5;

public class IntfRunner {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dogMethod(dog);

        Cat cat = new Cat();
        catMethod(cat);

        animalMethod(dog);
        animalMethod(cat);

        landBasedMethod(dog);
        landBasedMethod(cat);

        Animal a = new Dog();
        a.makeSound();

        Sbi sbi = new Sbi("SBI");
        sbi.calculateYearlyInterest(100000);

        Tmb tmb = new Tmb("TMB");
        tmb.calculateYearlyInterest(100000);

        Iob iob = new Iob("IOB");
        iob.calculateYearlyInterest(100000);

        PaymentProcessor.makePayment(new CreditCardPayment(), 10000);
        PaymentProcessor.makePayment(new PaypalPayment(), 20000);
        PaymentProcessor.makePayment(new CryptoPayment(), 50000);


    }

    private static void landBasedMethod(LandBased landBased) {
        System.out.println("Can climb : " + landBased.canClimb());;
        System.out.println("Can Walk : " + landBased.canWalk());;
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
    }

    private static void dogMethod(Dog dog) {
        dog.eat();
        dog.makeSound();
    }
}
