package week3.day2.pattern;

import week3.day2.zoo.Animal;

public class Adaptor {

    public static void main(String[] args) {
        feed(new SomeEntity());
    }

    private static void feed(Animal animal){
        animal.feed();
    }

}
