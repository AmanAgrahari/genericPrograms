package co.vinod.program;

public class program04 {

    public static void main(final String[] args) throws Exception {

        final Thread t1 = new MyThreadClass("MTC-1");
        // note that 
        t1.setDaemon(true);
        //it will kill all the thread till all undemon thread is executed
        //means when end of demo is printed the then no other thread will be executed
        /*
         * as in this println is executed first then start continues to print 15 times
         */
        t1.start();

        System.out.println("end of demo");

        /*
         * t1.start(); t1.join();//in this first it will kill the start thread and then print the end of demo System.out.println("end of demo");
         */

    }
}
