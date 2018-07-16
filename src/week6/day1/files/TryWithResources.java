package week6.day1.files;

public class TryWithResources {

    public static void main(String[] args) {

        try(A a = new A()) {

            a.doSomething();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

class A implements AutoCloseable {
    @Override
    public void close() throws Exception {
        //
    }

    public void doSomething(){
        System.out.println("SOME");
    }
}
