package week4.day1.outer;

public class OuterClasses {

    public static void main(String[] args) {
//        A a = new A();
//        System.out.println(a);

        A a = new B();
        System.out.println(a.a);
        System.out.println(((B) a).a);

        System.out.println();

        a.f();
        ((B) a).f();

    }

}

class A {
    String a = "A";

    public void f(){
        System.out.println("A");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("A{");
        sb.append('}');
        return sb.toString();
    }
}

class B extends A {
    String a = "B";

    public void f(){
        System.out.println("B");
    }
}
