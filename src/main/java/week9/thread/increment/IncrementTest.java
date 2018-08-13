package week9.thread.increment;

public class IncrementTest {

    private static int count;
    private static Object monitor = new Object();

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(IncrementTest::doIncrement);
        Thread t2 = new Thread(IncrementTest::doIncrement);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count);

    }

    private static void doIncrement(){
        for (int i = 0; i < 1_000; i++) {
            increment();
        }
    }

    // Monitor IncrementTest.class
    private static synchronized void increment() {
        synchronized (monitor){
            count++;
        }
    }

}
