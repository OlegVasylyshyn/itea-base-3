package week8;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {

        List<? extends B> l1 = new ArrayList<D>();
//        B b = l1.get(0);

        List<? super C> l2 = new ArrayList<>();
        l2.add(new D());
//        Object o = l2.get(0);


//        List<Object> objects = new ArrayList<String>();

//        String[] strings = new String[1];
//        Object[] objects = strings;
//        objects[0] = 1;
//        String s = strings[0];
//        System.out.println(s);

    }


}

class A {

}
class B extends A {

}
class C extends B {

}
class D extends C {

}