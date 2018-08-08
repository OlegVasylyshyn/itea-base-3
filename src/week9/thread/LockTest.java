package week9.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

    private static Lock lock = new ReentrantLock(true);
    private static Condition condition = lock.newCondition();

    public static void main(String[] args) {

        Thread t1 = new Thread(LockTest::work1);
        Thread t2 = new Thread(LockTest::work2);

        t1.start();
        t2.start();

    }

    private static void work1(){
        int i = 0;
        while (true) {

            try {
                lock.lock();
                    try {
                        System.out.println("Gonna wait 1");
                        condition.await();
                        System.out.println("After wait 1");

                        System.out.println("Gonna notify 1");
                        condition.signalAll();
                        System.out.println("After notify 1");

                        Thread.sleep(200);
                        System.out.println("I - 1 " + i++);

                    } catch (java.lang.InterruptedException e) {
                        e.printStackTrace();
                    }
            } finally {
                lock.unlock();
            }
        }

    }

    private static void work2(){
        int i = 0;
        while (true) {

            try {
                lock.lock();
                    try {

                        System.out.println("Gonna notify 2");
                        condition.signalAll();
                        System.out.println("After notify 2");

                        System.out.println("Gonna wait 2");
                        condition.await();
                        System.out.println("After wait 2");

                        Thread.sleep(200);
                        System.out.println("I - 2 " + i++);

                    } catch (java.lang.InterruptedException e) {
                        e.printStackTrace();
                    }
            } finally {
                lock.unlock();
            }

        }
    }

}
