package in.co.nmsworks.training.week2.day5;

public class InRunner {
    public static void main(String[] args) {
        Dog dog = new Dog();
//        dogImplements(dog);
        Cat cat = new Cat();
//        catImplements(cat);
        animalImplements(dog);
        animalImplements(cat);
    }

    private static void animalImplements(LandBased animal) {
        animal.makeSound();
        animal.eat();
        System.out.println(animal.canWalk());
        System.out.println(animal.canClimb());
    }

    private static void catImplements(Cat cat) {
        cat.eat();
        cat.makeSound();
    }

    private static void dogImplements(Dog dog) {
        dog.eat();
        dog.makeSound();
    }
}
