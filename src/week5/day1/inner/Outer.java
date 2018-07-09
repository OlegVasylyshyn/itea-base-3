package week5.day1.inner;

public class Outer {

    private static int COUNTER = 0;
    private int numberOfInstance;

    public Outer() {
        this.numberOfInstance = ++COUNTER;
    }

    public Inner getInner() {
        return new Inner();
    }

    public class Inner {


        @Override
        protected void finalize() throws Throwable {
            System.out.println("INNER CLASS FINALIZE");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("OUTER CLASS FINALIZE");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Outer{");
        sb.append("numberOfInstance=").append(numberOfInstance);
        sb.append('}');
        return sb.toString();
    }
}
