package week3.day2.pattern;

import week3.day2.zoo.Animal;

public class Zoo {

    private Animal animal1;
    private Animal animal2;

    public Zoo() {
    }

    public Zoo(Animal animal1, Animal animal2) {
        this.animal1 = animal1;
        this.animal2 = animal2;
    }

    public Animal getAnimal1() {
        return animal1;
    }

    public void setAnimal1(Animal animal1) {
        this.animal1 = animal1;
    }

    public Animal getAnimal2() {
        return animal2;
    }

    public void setAnimal2(Animal animal2) {
        this.animal2 = animal2;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Zoo{");
        sb.append("animal1=").append(animal1);
        sb.append(", animal2=").append(animal2);
        sb.append('}');
        return sb.toString();
    }

}
