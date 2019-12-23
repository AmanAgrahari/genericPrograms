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
package GeeksForGeeks;

import java.util.LinkedList;
import java.util.Queue;

public class BscNodes {
    final static Queue<String> bscNodeQueue = new LinkedList<>();
    static int sizeOfQueue = 0;

    /**
     * @param args
     */
    public static void main(final String[] args) {

        for (int i = 0; i < 2; i++) {
            final String s = "check" + i + "";
            bscNodeQueue.offer(s);
        }
        sizeOfQueue = bscNodeQueue.size();
        while (!bscNodeQueue.isEmpty()) {
            final String node = getBscNodesEquallyDivided();
            System.out.println(node);
        }

    }

    private static String getBscNodesEquallyDivided() {
        final StringBuilder sb = new StringBuilder();
        final int getNumberOfInstances = 2;

        if (sizeOfQueue % getNumberOfInstances != 0) {
            for (int i = 0; i < sizeOfQueue / getNumberOfInstances; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                sb.append(bscNodeQueue.poll());
                if (bscNodeQueue.peek() == null) {
                    break;
                }
            }
            return sb.toString();
        } else {
            if (sizeOfQueue > getNumberOfInstances) {
                for (int i = 0; i < sizeOfQueue / getNumberOfInstances; i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    sb.append(bscNodeQueue.poll());
                }
                return sb.toString();
            } else {
                while (!bscNodeQueue.isEmpty()) {
                    sb.append(bscNodeQueue.poll());
                    if (bscNodeQueue.peek() == null) {
                        break;
                    }
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

}
