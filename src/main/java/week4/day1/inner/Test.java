package week4.day1.inner;

import static week4.day1.inner.StaticNesterClass.CONSTANT;
import static week4.day1.inner.StaticNesterClass.StaticNestedClass;

import week3.day2.zoo.Animal;
import week4.day1.inner.OuterClass.InnerClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        // STATIC NESTED CLASS
        System.out.println(new StaticNesterClass());
        System.out.println(new StaticNesterClass.StaticNestedClass().f());
        System.out.println(new StaticNestedClass().f());
        System.out.println(CONSTANT);


        // INNER CLASSES

        // METHOD LOCAL INNER CLASS

        new OuterClass().work();
        new OuterClass().work2();

        // INNER CLASS
        InnerClass inner = new OuterClass().new InnerClass();
        InnerClass inner2 = new OuterClass().getInnerClass();
        inner = null;

        // ANONYMOUS INNER CLASS
        OuterClass outerClass = new OuterClass(){

            public String s = "wer";

            @Override
            public void work() {
                System.out.println("OVERRIDE");
            }

        };

        outerClass.work();
        System.out.println(outerClass);

        OuterClass outerClass2 = new OuterClass(){

            public String s = "wer";

            @Override
            public void work() {
                System.out.println("OVERRIDE 2");
            }

        };

        outerClass2.work();
        System.out.println(outerClass2);

        // memory won't be return
        outerClass = null;

        // Anonymous class fow abstract class
        Animal animal = new Animal() {
            @Override
            public void feed() {

            }

            @Override
            public void feedChild() {

            }

            @Override
            public void run() {

            }

            @Override
            public void jump() {

            }
        };


        // Anonymous class for interface
        Comparator<String> comparator = new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };


        // Lambda expression instead of anonymous class
        Comparator<String> comparator2 = String::compareTo;
        comparator2.compare("", "");


        List<String> list = new ArrayList<String>(){{ add("2"); }};
        System.out.println(list.get(0));

    }

}
