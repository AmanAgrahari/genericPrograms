import java.io.*;
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

public class RegexDemo4 {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(final String[] args) throws IOException {
        // TODO Auto-generated method stub

        final PrintWriter out = new PrintWriter("output.txt");
        final Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
        final BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line = br.readLine();
        while (line != null) {
            final Matcher m = p.matcher(line);
            while (m.find()) {
                out.println(m.group());
            }
            line = br.readLine();
        }
        out.flush();
    }

}
