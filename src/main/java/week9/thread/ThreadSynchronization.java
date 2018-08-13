package week9.thread;

public class ThreadSynchronization {

    public static void main(String[] args) {

        Thread t1 = new Thread(ThreadSynchronization::work1);
        Thread t2 = new Thread(ThreadSynchronization::work2);

        t1.start();
        t2.start();

    }

    private static void work1(){
        int i = 0;
        while (true) {

            synchronized (ThreadSynchronization.class) {
                try {
                    System.out.println("Gonna wait 1");
                    ThreadSynchronization.class.wait();
                    System.out.println("After wait 1");

                    System.out.println("Gonna notify 1");
                    ThreadSynchronization.class.notifyAll();
                    System.out.println("After notify 1");

                    Thread.sleep(200);
                    System.out.println("I - 1 " + i++);

                } catch (java.lang.InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    private static void work2(){
        int i = 0;
        while (true) {

            synchronized (ThreadSynchronization.class) {
                try {

                    System.out.println("Gonna notify 2");
                    ThreadSynchronization.class.notifyAll();
                    System.out.println("After notify 2");

                    System.out.println("Gonna wait 2");
                    ThreadSynchronization.class.wait();
                    System.out.println("After wait 2");

                    Thread.sleep(200);
                    System.out.println("I - 2 " + i++);

                } catch (java.lang.InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}
