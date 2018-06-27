package week3.day2.zoo;

public class Dog extends Animal {

    {
        System.out.println("DOG NON-STATIC INIT");
    }

    static {
        System.out.println("DOG STATIC INIT");
    }

    public Dog() {
        System.out.println("DOG CONSTRUCTOR");
    }

    public void feed() {
        System.out.println("DOG FEED");
    }

    public void feedChild() {
        System.out.println("Dog child feed");
    }

    public void run() {
        System.out.println("Dog run");
    }

    public void jump() {
        System.out.println("Dog jump");
    }
}
