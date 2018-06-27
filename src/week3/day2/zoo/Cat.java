package week3.day2.zoo;

public class Cat extends Animal {

    {
        System.out.println("CAT NON-STATIC INIT");
    }

    static {
        System.out.println("CAT STATIC INIT");
    }

    public Cat() {
        System.out.println("CAT CONSTRUCTOR");
    }

    public void feed() {
        System.out.println("Cat Feed");
    }

    public void feedChild() {
        System.out.println("Cat child feed");
    }

    public void run() {
        System.out.println("Cat run");
    }

    public void jump() {
        System.out.println("Cat jump");
    }
}
