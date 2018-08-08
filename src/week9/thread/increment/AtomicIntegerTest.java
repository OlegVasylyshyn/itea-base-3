package week9.thread.increment;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {

    private static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(AtomicIntegerTest::doIncrement);
        Thread t2 = new Thread(AtomicIntegerTest::doIncrement);

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

    private static void increment() {
        count.incrementAndGet();
        count.compareAndSet(0, 100);
    }

}
