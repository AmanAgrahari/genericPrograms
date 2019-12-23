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
package FirstBasics;

public class Bridge {

    int value;

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value
     *            the value to set
     */
    public void setValue(final int value) {
        this.value = value;
    }

    /**
     * @return the toggle
     */
    public boolean isToggle() {
        return toggle;
    }

    /**
     * @param toggle
     *            the toggle to set
     */
    public void setToggle(final boolean toggle) {
        this.toggle = toggle;
    }

    boolean toggle;
}
