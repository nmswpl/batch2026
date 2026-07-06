package in.co.nmsworks.week2.day5;

public class InterfaceRunner {
    public static void main(String[] args) {
        Dog dog=new Dog();
       // dogMethod(dog);



        Cat cat=new Cat();
       // catMethod(cat);

        Animal animal=new Cat();
        animalMethod(animal);
//        a.makeSound();
        //Animal a1=new Animal();

        LandBased landb=new Dog();
        System.out.println(landb.canclimb());

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
        dog.makeSound();
        dog.eat();
    }

    private static void animalMethod(Cat cat) {
        cat.eat();
        cat.makeSound();
    }

}
