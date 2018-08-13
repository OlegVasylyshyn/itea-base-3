package week5;

public class Test {

    public static void main(String[] args) {

        int age = 29;
        String result = 29 % 9 == 0 ? "1" : "2";
        System.out.println(result);

        boolean b = false;
        if(b = true){
            System.out.println("Ok");
        } else {
            System.out.println("Not Ok");
        }

        new Test().f();
        Test.f();

        new Test().f2();
//        MyLinkedListTest.f2();

        new B();

    }

    private static void f(){
        System.out.println("F");
    }

    private void f2(){
        System.out.println("F");
    }
}

class A {
    public A() {
        System.out.println("A");
    }
}
class B extends A {

    {
        System.out.println("BLOCK INIT");
    }

    public B() {
        super();
        // init-block
        System.out.println("B");
    }
}
