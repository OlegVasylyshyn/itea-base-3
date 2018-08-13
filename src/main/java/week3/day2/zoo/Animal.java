package week3.day2.zoo;

public abstract class Animal implements VertebrateBehaviour, MammalBehaviour {

    private String name;
    private int age;

    {
        System.out.println("ANIMAL NON-STATIC INIT");
    }

    static {
        // can't see non-static fields
//        age = 0;
        System.out.println("ANIMAL STATIC INIT");
    }

    public Animal() {
        System.out.println("ANIMAL CONSTRUCTOR");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void feed();

}
