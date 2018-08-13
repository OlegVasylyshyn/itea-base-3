package week4.day1.inner;

public class StaticNesterClass {

    private static String a;
    public static final String CONSTANT = "STATIC_FIELD";

    public static class StaticNestedClass {
        public String f(){
            a = "";
            return week4.day1.inner.StaticNesterClass.CONSTANT;
        }
    }

}

class A {
    public void f(){
//        StaticNesterClass.a = "";
    }
}
