package in.co.nmsworks.training.week2.day5;

public class IntfRunner {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

//        dogMethod(dog);
//        catMethod(cat);

        animalMethod(dog);
        animalMethod(cat);

        landBasedMethod(dog);
    }

    private static void landBasedMethod(LandBased lb) {
        lb.canClimb();
        lb.canWalk();
        lb.eats();
        lb.makeSound();
    }

    private static void animalMethod(Animal animal) {
        animal.makeSound();;
        animal.eats();
    }

    private static void catMethod(Cat cat) {
        cat.makeSound();
        cat.eats();
        System.out.println(cat.canClimb());

    }

    private static void dogMethod(Dog dog) {

        dog.makeSound();
        dog.eats();
        System.out.println(dog.canClimb());
    }
}
