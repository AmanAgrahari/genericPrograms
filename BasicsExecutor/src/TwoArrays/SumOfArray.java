/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2015
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package TwoArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SumOfArray {

    /**
     * @param args
     * @throws ExecutionException
     * @throws InterruptedException
     */
    public static void main(final String[] args) throws InterruptedException, ExecutionException {

        final int A[] = { 1, 2, 3, 4, 5 };
        final int B[] = { 6, 7, 8, 9, 10 };

        final ArrayList<Sum> jobs = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            jobs.add(new Sum(A[i], B[i]));
        }
        final ExecutorService service = Executors.newFixedThreadPool(3);
        final List<Future> futureTasks = new ArrayList<>();
        for (final Sum job : jobs) {
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
