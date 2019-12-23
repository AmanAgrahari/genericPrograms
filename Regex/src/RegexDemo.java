import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

public class RegexDemo {

    /**
     * @param args
     */
    public static void main(final String[] args) {
        // TODO Auto-generated method stub

        int count = 0;
        final Pattern p = Pattern.compile("ab");
        final Matcher m = p.matcher("ababbaba");
        while (m.find()) {
            count++;
            System.out.println(m.start() + "----" + m.end() + "-----" + m.group());
        }
        System.out.println("the number of occurrrence " + count);
    }

}
