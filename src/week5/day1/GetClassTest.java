package week5.day1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetClassTest {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        Car car = new Car("BMW", new Car.Color("BLACK"));

        Class carClass = car.getClass();

        System.out.println("Methods : ");
        for(Method m : carClass.getMethods()){
            System.out.println(m);
        }

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Fields : ");
        for(Field f : carClass.getDeclaredFields()) {
            System.out.println(f);
        }

        System.out.println("Simple name - " + carClass.getSimpleName());

        Car instance = (Car) carClass.newInstance();
        System.out.println(instance);

    }

}
