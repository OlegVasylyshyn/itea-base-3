package week5.day1;

public class CarTest {

    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {

        Car opel = new Car("Opel", new Car.Color("RED"));
        Car bmw = new Car("BMW", new Car.Color("BLUE"));
        System.out.println("Equal - " + opel.equals(bmw));

        System.out.println("Reflexive - " + opel.equals(opel));
        System.out.println("Symmetric - " + (opel.equals(bmw) == bmw.equals(opel)));

        Car cloned = opel.clone();
        System.out.println("Cloned car - " + cloned);
        opel.getColor().setColor("BLACK");
        System.out.println("Cloned car - " + cloned);

        Car copied = new Car(opel);
        opel.getColor().setColor("WHITE");
        System.out.println("Copied - " + copied);

        System.out.println("Cloned equals - " + (opel.equals(cloned)));


        System.out.println();
        System.out.println();

        System.out.println(opel instanceof Car);
        Class<?> clazz = opel.getClass();
        System.out.println(clazz == Car.class);

        Thread.sleep(10_000_000);

    }

}
