package week9.thread;

import java.io.IOException;

public class DefaultThreads {

    public static void main(String[] args) throws IOException {

        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();


        do {

            System.out.println(threadGroup);

            Thread[] threads = new Thread[10];
            threadGroup.enumerate(threads);

            System.out.println();
            for (Thread t: threads) {
                System.out.println(t);
                if(t != null) {
                    if ("Signal Dispatcher".equals(t.getName())) {
                        t.stop();
                    }
                }
            }

            System.out.println();

        } while ((threadGroup = threadGroup.getParent()) != null);


        System.in.read();

    }

}
