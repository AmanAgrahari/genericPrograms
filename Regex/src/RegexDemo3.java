import java.util.Scanner;
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

public class RegexDemo3 {

    /**
     * @param args
     */
    public static void main(final String[] args) {
        // TODO Auto-generated method stub

        final Scanner sc = new Scanner(System.in);
        final String s = "7275659400";
        final int count = 0;
        final Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
        final Matcher m = p.matcher(s);
        if (m.find() && m.group().equals(s)) {
            System.out.println("valid moblie number");
        } else {
            System.out.println("invalid moblie number");
        }
    }

}
