package week9.thread;

public class InterruptedException {

    public static void main(String[] args) {

        Thread t1 = new Thread(InterruptedException::sleep);
        Thread t2 = new Thread(InterruptedException::join);
        Thread t3 = new Thread(InterruptedException::waitExample);

        t1.start();
        t2.start();
        t3.start();

        t1.interrupt();
        t2.interrupt();
        t3.interrupt();

    }

    private static void sleep(){
        try {
            Thread.sleep(1000000000);
        } catch (java.lang.InterruptedException e) {
            System.out.println("Interrupted exception was caught");
        }
    }

    private static void join(){

        Thread t1 = new Thread(() -> {
            int i = 0;
            while (true) {
                i++;
            }
        });

        t1.start();
        try {
            t1.join();
        } catch (java.lang.InterruptedException e) {
            System.out.println("Interrupted exception was caught");
        }

    }

    private static void waitExample(){

        synchronized (Thread.class) {
            try {
                Thread.class.wait();
            } catch (java.lang.InterruptedException e) {
                System.out.println("Interrupted exception was caught");
            }
        }

    }



}
