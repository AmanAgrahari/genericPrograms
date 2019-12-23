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
package ReferncePassingNull;

public class C {

    /**
     * @param args
     */
    public static A a;

    public static void main(final String[] args) {
        a = new A();
        final C c = new C();
        c.process(a);
        c.process(null);
    }

    void process(final A a) {
        if (a != null) {
            System.out.println("ffws");
        } else {
            System.out.println("dfwewf");
        }
    }

}
