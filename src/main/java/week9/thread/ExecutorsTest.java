package week9.thread;

import java.util.concurrent.*;

public class ExecutorsTest {

    public static void main(String[] args) {

        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
        service.scheduleAtFixedRate(() -> System.out.println("Hello"), 2, 5, TimeUnit.SECONDS);
        service.scheduleAtFixedRate(() -> System.out.println("Hello"), 2, 5, TimeUnit.SECONDS);
        service.scheduleAtFixedRate(() -> System.out.println("Hello"), 2, 5, TimeUnit.SECONDS);
        service.scheduleAtFixedRate(() -> System.out.println("Hello"), 2, 5, TimeUnit.SECONDS);

    }


}
