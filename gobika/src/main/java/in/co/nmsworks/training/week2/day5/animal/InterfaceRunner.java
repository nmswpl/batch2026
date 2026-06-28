package in.co.nmsworks.training.week2.day5.animal;

public class InterfaceRunner {
    public static void main(String[] args) {
        Dog dog = new Dog();
//        dogMethod(dog);

        Cat cat = new Cat();
//        catMethod(cat);

        animalMethod(dog);
        animalMethod(cat);

        landBasedMethod(dog);
        landBasedMethod(cat);

    }

    private static void landBasedMethod(LandBased landBased) {
        System.out.println(landBased.canClaim());
        System.out.println(landBased.canWalk());
        landBased.makeSound();
        landBased.eat();
    }

    private static void animalMethod(Animal animal) {
        animal.eat();
        animal.makeSound();

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
