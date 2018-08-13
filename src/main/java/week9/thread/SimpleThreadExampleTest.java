package week9.thread;

public class SimpleThreadExampleTest {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ignore) { /*NOPE*/}
                    System.out.println(Thread.currentThread().getName() + " - RUN");
                }
            }
        });
        thread.setName("MyThread");
        thread.start();


        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { /*NOPE*/}
            System.out.println(Thread.currentThread().getName() + " - RUN MAIN");
        }

    }

}
