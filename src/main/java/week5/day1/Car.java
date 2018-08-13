package week5.day1;

import java.util.Objects;

public class Car implements Cloneable {

    private String name;
    private Color color;

    public Car(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public Car(Car car) {
        this.name = car.name;
        this.color = new Color(car.color);
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    /* Rules

        1) reflexive
        x=x -> true

        2) symmetric
        x=y -> y=x

        3) transitive
        x=y , y=z -> z=x

        4) null
        x=null -> false

        5) consistent
        x=y -> true
        x=y -> true

        */
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;

//        if(!(obj instanceof Car)) return false;
        if(obj.getClass() != Car.class) return false;

        Car car = (Car) obj;

        if(!car.color.equals(color)) return false;
        return car.name.equals(name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }

    public Car clone() throws CloneNotSupportedException {
        Car car = (Car) super.clone();
        car.color = this.color.clone();
        return car;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("name='").append(name).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static class Color implements Cloneable {

        private String color;

        public Color(String color) {
            this.color = color;
        }

        public Color(Color color) {
            this.color = color.color;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        protected Color clone() throws CloneNotSupportedException {
            return (Color) super.clone();
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Color{");
            sb.append("color='").append(color).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

}
