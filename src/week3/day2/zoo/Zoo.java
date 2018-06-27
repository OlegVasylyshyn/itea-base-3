package week3.day2.zoo;

public class Zoo {

    public static void main(String[] args) {

        Animal animal1 = new Cat();
        System.out.println();
        Animal animal2 = new Dog();
        System.out.println();
        System.out.println();

        feed(animal1);
        feed(animal2);

        run(animal1);
        run(animal2);

    }

    private static void feed(Animal animal) {
        animal.feed();
    }

    private static void run(VertebrateBehaviour animal) {
        animal.run();
    }

}
