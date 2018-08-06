package week9.thread.kill;

public class Stop {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(Stop::work);
        thread.start();

        Thread thread2 = new Thread(Stop::work2);
        thread2.start();


        Thread.sleep(2_000);

        thread.stop();
        thread2.stop();

    }

    // ThreadDeath
    private static void work(){
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("RUN THREAD");
        }
    }

    private static void work2(){
        while (true) {
            try {

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("RUN THREAD");
            } catch (ThreadDeath t) {
                System.out.println("Caught ThreadDeath error");
            }
        }
    }

}
