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
package Bits;

public class Second {

    /**
     * @param args
     */
    public static void main(final String[] args) {
        //MaximumZeros(549);

        maxXORInRange(8, 20);
        maxXORInRange(16, 20);
        maxXORInRange(12, 32);
    }

    static int maxXORInRange(final int L, final int R) {
        // get xor of limits
        int LXR = L ^ R;
        System.out.println(Integer.toBinaryString(LXR));

        //  loop to get msb position of L^R
        int msbPos = 0;
        while (LXR > 0) {
            msbPos++;
            LXR >>= 1;
            System.out.println("inside while  " + msbPos + "   " + Integer.toBinaryString(LXR));
        }

        // construct result by adding 1,
        // msbPos times
        int maxXOR = 0;
        int two = 1;
        while (msbPos-- > 0) {
            maxXOR += two;
            two <<= 1;
            System.out.println("inside 2  while  " + maxXOR + "   " + Integer.toBinaryString(two));
        }

        return maxXOR;
    }

    static void MaximumZeros(final int n) {

        final String s = Integer.toBinaryString(n);
        System.out.println(s);
        int i = 0;
        final int bits = s.length();
        int prev_cnt = 0;
        int cur_cnt = 0;
        while (i < bits) {
            if (s.charAt(i) == '0') {
                cur_cnt++;
                i++;
            } else {
                if (cur_cnt > prev_cnt) {
                    prev_cnt = cur_cnt;
                }
                i++;
                cur_cnt = 0;
            }
        }
        System.out.println("maximum number of zeros" + prev_cnt);
    }

}
