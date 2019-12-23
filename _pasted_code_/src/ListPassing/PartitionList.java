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
package ListPassing;

import java.util.*;

public class PartitionList {

    /**
     * @param args
     */

    static int count = 0;

    public static void main(final String[] args) {

        final List<Integer> al = new ArrayList<>();

        for (int i = 0; i < 14; i++) {
            final Random r = new Random();
            al.add(r.nextInt());
        }
        /*
         * List<Integer> first = new ArrayList<>(); final Iterator<Integer> itr = al.iterator(); final int batch = 0; while (itr.hasNext()) { final
         * Integer i = itr.next(); count++; first.add(i); if (count > 3) { print(first); count = 0; first = null; first = new ArrayList<Integer>(); }
         * }
         */ final String s = "aman";

        if (!al.isEmpty()) {
            System.out.println("******************************");
            print(al);
        } else if (s.equals("aman")) {
            System.out.println(s);
        } else {
            System.out.println("print");
        }

    }

    static int c = 0;

    static void print(final List<Integer> ll) {
        //System.out.println(c++);
        final Iterator<Integer> itr = ll.iterator();
        while (itr.hasNext()) {
            final Integer i = itr.next();
            System.out.println(i);
        }

    }
}
