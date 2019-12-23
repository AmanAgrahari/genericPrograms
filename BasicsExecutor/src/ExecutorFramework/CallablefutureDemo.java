package ExecutorFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallablefutureDemo {

    public static void main(final String[] args) throws InterruptedException, ExecutionException {

        final MyCallable[] jobs = { new MyCallable(10), new MyCallable(20), new MyCallable(30), new MyCallable(40), new MyCallable(50),
                new MyCallable(60) };

        final ExecutorService service = Executors.newFixedThreadPool(3);
        final List<Future> futureTasks = new ArrayList<>();
        for (final MyCallable job : jobs) {
            final Future f = service.submit(job);
            futureTasks.add(f);
        }

        for (final Future f : futureTasks) {
            if (f.isDone()) {
                System.out.println(" === " + f.get());
            }
        }
        service.shutdown();

    }

}
