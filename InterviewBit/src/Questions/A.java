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

public class A extends B {

    /**
     * @param a
     */

    /**
     *
     */
    public A() {
        System.out.println("default B");
    }

    public A(final int a) {
        this();
        System.out.println("second");
        addValue();
    }

    @Override
    void addValue() {
        value += 20;
    }

    static void method() {
        System.out.println("Class B method");
    }

    /**
     * @param args
     */

    public void m1() {
        System.out.println("m1");
        garcia(10, 20);
    }

    public void m2() {
        System.out.println("m2");
    }

    public static void main(final String[] args) {
        final B s = new A(10);
        System.out.println(s.hashCode());
        System.out.println(s.getValue());
        s.method();

        /*
         * System.out.println(Integer.toBinaryString(s.hashCode())); s.garcia(100, 200); s.louis(1, 2); System.out.println(s.toString());
         *
         * final Super_This_1 s1 = (Super_This_1) s;
         *
         * final Super_This s2 = s1;
         *
         * s2.GFG(); s1.m1(); s1.m2();
         */

    }

}
