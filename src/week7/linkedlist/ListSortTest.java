package week7.linkedlist;

import java.util.*;

public class ListSortTest {

    public static void main(String[] args) {

        // Comparable
        List<Plane> planes = new LinkedList<>();
        planes.add(new Plane("AIRLINES3", "ABB_1", 3));
        planes.add(new Plane("AIRLINES5", "ABB_3", 1));
        planes.add(new Plane("AIRLINES4", "ABC_2", 6));
        planes.add(new Plane("AIRLINES2", "ACC_1", 2));
        planes.add(new Plane("AIRLINES1", "ABC_1", 5));

        System.out.println(planes);
        Collections.sort(planes);
        System.out.println(planes);


        // Comparator
        Collections.sort(planes, PlaneComparator.INSTANCE);
        System.out.println(planes);

        planes.sort(Comparator.comparingInt(Plane::getAge));
        planes.sort(Comparator.comparing(Plane::getName));

        System.out.println(planes);

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

class PlaneComparator implements Comparator<Plane> {

    public static final PlaneComparator INSTANCE = new PlaneComparator();

    private PlaneComparator() {
    }

    @Override
    public int compare(Plane o1, Plane o2) {
        return o1.age - o2.age;
    }
}
