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
package Thread;

public class TestTask implements Runnable {

    private int number;

    private int sum = 0;

    public TestTask(final int num) {
        // TODO Auto-generated constructor stub
        this.number = num;
    }

    @Override
    public void run() {
        System.out.println("Start Executin the sum of " + number + " numbers");

        for (int i = 0; i < number; i++) {
            sum = sum + i;
        }
        try {
            Thread.sleep(1000);
        } catch (final InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Sum of " + number + " is " + sum);
    }
}
