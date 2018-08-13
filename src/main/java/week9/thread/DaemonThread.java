package week9.thread;

public class DaemonThread {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignore) { /*NOPE*/}
                System.out.println(Thread.currentThread().getName() + " - RUN");
            }
        });
        thread.setDaemon(true);
        thread.start();

        Thread thread2 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignore) { /*NOPE*/}
                System.out.println(Thread.currentThread().getName() + " - RUN");
            }
        });
        thread2.setDaemon(false);
        thread2.start();

    }

}
