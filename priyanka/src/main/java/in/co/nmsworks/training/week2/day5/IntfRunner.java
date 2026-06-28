package in.co.nmsworks.training.week2.day5;

public class IntfRunner {
    public static void main(String[] args) {

        Dog dog = new Dog();
//        dogMethod(dog);
        Animal a = new Dog();

        Cat cat = new Cat();
//        catMethod(cat);

        animalMethod(dog);
        animalMethod(cat);
        animalMethod(a);

        landBased(dog);
        landBased(cat);

    }

    private static void landBased(LandBased landBased) {
        System.out.println(landBased.canWalk());
        System.out.println(landBased.canClimb());
        landBased.eat();
        landBased.makeSound();
    }

    private static void animalMethod(Animal animal) {
        animal.eat();
        animal.makeSound();
//        animal.canWalk()...  it is not visible in Animal

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
