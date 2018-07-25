package week7.tree;

import java.util.Map;
import java.util.TreeMap;

public class TreeTest {

    public static void main(String[] args) {

        Map<Plane, String> planes = new TreeMap<>(/*Comparator.comparing(Plane::getModel)*/);
        planes.put(new Plane("3", "1", 1), "First plane");
        planes.put(new Plane("1", "2", 1), "Second plane");
        planes.put(new Plane("2", "2", 1), "Third plane");
        String fours = planes.put(new Plane("2", "2", 1), "Fours plane");

        System.out.println(planes);
        System.out.println("Returned value - " + fours);
    }

}

class Plane implements Comparable<Plane> {

    String name;
    String model;
    int age;

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getAge() {
        return age;
    }

    public Plane(String name, String model, int age) {
        this.name = name;
        this.model = model;
        this.age = age;
    }

    @Override
    public int compareTo(Plane o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Plane{");
        sb.append("name='").append(name).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}