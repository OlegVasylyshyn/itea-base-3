package week6.day1.solid;

import java.util.Objects;

public class LiskovTest {

    public static void main(String[] args) {

        Point colorPointRed = new ColorPoint(1, 2, "RED");
        Point colorPointBlack = new ColorPoint(1, 2, "BLACK");

        Point point = new Point(1, 2);


        System.out.println("Inheritance example");
        System.out.println(point.equals(colorPointRed));
        System.out.println(point.equals(colorPointBlack));

        System.out.println(colorPointBlack.equals(colorPointRed));


        System.out.println("Composition example");
        ColorPointComposition redPoint = new ColorPointComposition(new Point(1, 2), "RED");
        ColorPointComposition blackPoint = new ColorPointComposition(new Point(1, 2), "BLACK");

        System.out.println(point.equals(redPoint.point));
        System.out.println(point.equals(blackPoint.point));

        System.out.println(redPoint.equals(blackPoint));

    }

}

class Point {

    int x;
    int y;

    public Point() {
    }

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

class ColorPoint extends Point {

    String color;

    public ColorPoint(){
    }

    public ColorPoint(String color) {
        this.color = color;
    }

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), color);
    }
}

class ColorPointComposition {

    Point point;
    String color;

    public ColorPointComposition(Point point, String color) {
        this.point = point;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ColorPointComposition)) return false;
        ColorPointComposition that = (ColorPointComposition) o;
        return Objects.equals(point, that.point) &&
                Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(point, color);
    }
}