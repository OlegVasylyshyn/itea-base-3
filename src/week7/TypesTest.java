package week7;

public class TypesTest {

    public static void main(String[] args) {

        A<Integer> a = new A<>(1);
        System.out.println(a);
        f(a);

        System.out.println(getA(10));

        A<? extends Admin> admin = new A<>(new SuperAdmin());

    }

    private static void f(A<Integer> a){
        int num = a.getType();
    }

    private static A<?> getA(int choose){
        return choose > 0 ? new A<String>("Hello") : new A<Integer>(1);
    }

}


class A<T> {

    private T type;

    public A(T type) {
        this.type = type;
    }

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("A{");
        sb.append("type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
class Person {

}
class User extends Person {

}
class Admin extends User {

}
class SuperAdmin extends Admin {

}