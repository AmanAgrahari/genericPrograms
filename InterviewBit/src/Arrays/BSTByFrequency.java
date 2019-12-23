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
package Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class BSTByFrequency {

    /**
     *
     */

    public BSTByFrequency() {
        // TODO Auto-generated constructor stub
    }

    public BSTNode insertRec(BSTNode root, final int key) {
        if (root == null) {
            root = new BSTNode(key);
            return root;
        }
        if (key == root.data) {
            root.freq += 1;
        }
        if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else if (key > root.data) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    public void store(final BSTNode root, final DataFreq count[], int index) {
        if (root == null) {
            return;
        }

        store(root.left, count, index);
        count[index].freq = root.freq;
        count[index].data = root.data;
        index++;
        store(root.right, count, index);
    }

    public void inOrder(final BSTNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data + "  frequency is:  " + root.freq);
        inOrder(root.right);
    }

    public static void main(final String[] args) throws InterruptedException {

        final BSTNode root = new BSTNode(10);
        final BSTByFrequency ob = new BSTByFrequency();
        ob.insertRec(root, 30);
        ob.insertRec(root, 30);
        ob.insertRec(root, 20);
        ob.insertRec(root, 20);
        ob.insertRec(root, 40);
        ob.insertRec(root, 50);
        ob.insertRec(root, 50);
        ob.insertRec(root, 60);
        ob.insertRec(root, 70);
        ob.inOrder(root);
        final DataFreq[] a = new DataFreq[6];

        for (int i = 0; i < a.length; i++) {
            a[i] = new DataFreq();
        }

        ob.store(root, a, 0);

        Arrays.sort(a, new Comparator<DataFreq>() {

            @Override
            public int compare(final DataFreq o1, final DataFreq o2) {
                // TODO Auto-generated method stub
                if (o1.getFreq() > o2.getFreq()) {
                    return +1;
                } else {
                    return -1;
                }
            }
        });

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].data + "  " + a[i].freq);
        }

    }

}
