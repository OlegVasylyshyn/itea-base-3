package week3.day2.pattern;

import week3.day2.zoo.Animal;

public class SomeEntity extends Animal {


    public void doSomething(){
        System.out.println("Some action");
    }

    @Override
    public void feed() {
        doSomething();
    }

    @Override
    public void feedChild() {

    }

    @Override
    public void run() {

    }

    @Override
    public void jump() {

    }
}
