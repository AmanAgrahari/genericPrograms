import java.io.File;
import java.io.IOException;
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

public class RegexDemo5 {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(final String[] args) throws IOException {
        // TODO Auto-generated method stub

        int count = 0;
        final Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_$.]*[.]java");
        final File f = new File("E:\\Concurrency1\\Concurrency1\\src\\com\\aman\\concurrent");
        final String[] s = f.list();
        for (final String s1 : s) {
            final Matcher m = p.matcher(s1);
            if (m.find() && m.group().equals(s1)) {
                count++;
                System.out.println(s1);
            }
        }
        System.out.println("the total number of files:" + count);

    }
}
