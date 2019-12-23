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
package Questions;

public class B {

    /**
     * @param args
     */

    int a = 10;

    // static variable
    static int b = 20;

    int first = 22;
    int second = 33;
    int value = 0;

    /**
     *
     */

    /**
     *
     */
    public B() {
        System.out.println("first");
        addValue();
    }

    void addValue() {
        System.out.println("add");
        value += 10;
    }

    int getValue() {
        return value;
    }

    static void method() {
        System.out.println("Class A method");
    }

    /*
     * public Super_This(final int a) { this.a = 100;
     *
     * }
     */
    void garcia(int a, int b) {
        a = this.first;
        b = this.second;
        System.out.println(first);
        System.out.println(second);
        System.out.println(a);
        System.out.println(b);
    }

    void louis(final int m, final int n) {
        garcia(10, 20);
        this.first = m;
        this.second = n;
        System.out.println(first);
        System.out.println(second);
        System.out.println(m);
        System.out.println(n);
    }

    void GFG() {
        // referring current class(i.e, class RR)
        // instance variable(i.e, a

        System.out.println(a);

        // referring current class(i.e, class RR)
        // static variable(i.e, b)
        this.b = 600;

        System.out.println(b);
    }
}
