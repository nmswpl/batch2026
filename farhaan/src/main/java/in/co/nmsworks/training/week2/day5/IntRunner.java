package in.co.nmsworks.training.week2.day5;

public class IntRunner {
    public static void main(String[] args) {
        Dog dog = new Dog();
//        dogMethod(dog);
        Cat cat = new Cat();
//        catMethod(cat);
        amimalMethod(dog);
        amimalMethod(cat);
        landBased(dog);
        landBased(cat);
    }

    private static void landBased(LandBased land) {
        System.out.println( land.canClimb());
        System.out.println(land.canWalk());
    }

    private static void amimalMethod(Animal animal) {
        animal.makeSound();
        animal.eats();
    }

    private static void catMethod(Cat cat) {
        cat.eats();
        cat.makeSound();
    }

    private static void dogMethod(Dog dog) {
        dog.eats();
        dog.makeSound();
    }

}
