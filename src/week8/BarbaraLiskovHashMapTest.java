package week8;

import week8.map.HashMapTest;

import java.util.HashMap;
import java.util.Objects;

import static week8.Color.BLACK;
import static week8.Color.RED;

public class BarbaraLiskovHashMapTest {

    public static void main(String[] args) {

        HashMap<Point, String> map = new HashMap<>();

        map.put(new Point(1, 2), "triangle");

        System.out.println(map.get(new Point(1, 2)));
        System.out.println(map.get(new ColorPoint(1, 2, RED)));

        Point p1 = new Point(1, 2);
        ColorPoint p2 = new ColorPoint(1, 2, RED);
        ColorPoint p3 = new ColorPoint(1, 2, BLACK);

        System.out.println("Equals test : ");
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p2.equals(p3));

        /*
        *
        * p1 = p2
        * p1 = p3
        *
        * p2 != p3
        *
        *
        * */

    }

}

class Point {

    protected final int x;
    protected final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

final class ColorPoint extends Point {

    final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true
//        if(o == null) return false;
//        if(o.getClass() == Point.class) {
//            return super.equals(o);
//        }
//        if(!(o instanceof ColorPoint)) return false;
//        ColorPoint that = (ColorPoint) o;
//        return color == that.color;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

enum Color {

    RED,
    BLUE,
    BLACK

}