package week9.thread.kill;

public class Interrupt {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(Interrupt::work);
        thread.start();

        Thread.sleep(2_000);

        thread.interrupt();

    }

    private static void work(){
        // We may check isInterrupted
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Caught Interrupted exception!");
                break;
            }

            System.out.println("RUN THREAD");
        }
        System.out.println("This thread was interrupted");
    }

}
