package davenkin.servlet;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by yteng on 3/14/17.
 */
public class LongRunningProcess {

    public void run() {
        try {

            int millis = ThreadLocalRandom.current().nextInt(2000);
            String currentThread = Thread.currentThread().getName();
            System.out.println(currentThread + " sleep for " + millis + " milliseconds.");
            Thread.sleep(millis);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
