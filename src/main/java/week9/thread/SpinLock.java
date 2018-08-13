package week9.thread;

public class SpinLock {

    private static volatile boolean isSleep = false;

    public static void main(String[] args) {

        Thread work = new Thread(SpinLock::work);
        Thread sleep = new Thread(SpinLock::sleep);
        Thread awake = new Thread(SpinLock::awake);

        work.start();
        sleep.start();
        awake.start();

    }

    private static void work(){
        while (true) {
            while (isSleep);
            System.out.println("WORK");
            try {
                Thread.sleep(100);
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void sleep(){
        while (true) {
            try {
                while (isSleep);
                Thread.sleep(2_000);
                System.out.println("SLEEP");
                isSleep = true;
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void awake(){
        while (true) {
            try {
                while (!isSleep);
                Thread.sleep(2_000);
                System.out.println("AWAKE");
                isSleep = false;
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
