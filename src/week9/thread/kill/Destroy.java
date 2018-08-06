package week9.thread.kill;

public class Destroy {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(Destroy::work);
        thread.start();

        Thread.sleep(2_000);

        thread.destroy();

    }

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

}
