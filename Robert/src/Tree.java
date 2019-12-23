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

public class Tree<E> {

    /**
     * @param args
     */

    Node<E> root;

    public static void main(final String[] args) {

    }

    public boolean contains(final E obj) {
        return contains(obj, root);
    }

    public boolean contains(final E obj, final Node<E> node) {
        if (node == null) {
            return false;
        }
        if (((Comparable<E>) obj).compareTo(node.data) == 0) {
            return true;
        }
        if (((Comparable<E>) obj).compareTo(node.data) > 0) {
            return contains(obj, node.right);
        }
        return contains(obj, node.left);
    }

    <E> void add(final E obj, final Node<E> node) {
        if (((Comparable<E>) obj).compareTo(node.data) > 0) {
            if (node.right == null) {
                node.right = new Node<E>(obj);
                return;
            }
            add(obj, node.right);
        }
        if (node.left == null) {
            node.left = new Node<E>(obj);
            return;
        }
        add(obj, node.left);
    }

    public void add(final E obj) {
        if (root == null) {
            root = new Node<E>(obj);
        } else {
            add(obj, root);
        }
    }

}
