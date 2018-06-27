package week3.day2.pattern;

import week3.day2.zoo.Cat;
import week3.day2.zoo.Dog;

public class Strategy {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        // code
        zoo.setAnimal1(new Cat());

        // code
        zoo.setAnimal1(new Dog());

    }

}
