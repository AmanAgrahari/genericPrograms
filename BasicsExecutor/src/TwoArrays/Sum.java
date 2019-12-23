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
package TwoArrays;

import java.util.concurrent.Callable;

public class Sum implements Callable {

    int i, j;

    Sum(final int i, final int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public Object call() throws Exception {
        final int sum = i + j;
        return sum;
    }

}
