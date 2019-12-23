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

public class DataFreq {
    Integer data;
    Integer freq;

    /**
     *
     */
    public DataFreq() {

        this.data = 0;
        this.freq = 0;
    }

    /**
     * @return the freq
     */
    public int getFreq() {
        return freq;
    }

    /**
     * @return the data
     */
    public int getData() {
        return data;
    }

    /**
     * @param data
     *            the data to set
     */
    public void setData(final int data) {
        this.data = data;
    }

    /**
     * @param freq
     *            the freq to set
     */
    public void setFreq(final int freq) {
        this.freq = freq;
    }

}
