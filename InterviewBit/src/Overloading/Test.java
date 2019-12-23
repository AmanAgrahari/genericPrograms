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
package Overloading;

public class Test {

    /**
     * @param args
     */
    public static void main(final String[] args) {
        // TODO Auto-generated method stub

    }

    public void m1(final A a) {
        System.out.println("inside a method");
    }

    public void m1(final B a) {
        System.out.println("inside a method");
    }

}
