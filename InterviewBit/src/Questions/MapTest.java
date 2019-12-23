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

import java.util.*;

public class MapTest {
    static int count = 0;

    public static void main(final String[] args) {
        final Map<String, String> first = new HashMap<>();
        first.put("1", "first");
        final Map<String, String> second = new HashMap<>();
        first.put("2", "first");
        final Map<String, String> third = new HashMap<>();
        first.put("3", "first");
        final Map<String, String> fourth = new HashMap<>();
        first.put("4", "first");
        final Map<String, String> fifth = new HashMap<>();
        first.put("5", "first");

        final Map<String, Map<String, String>> generic = new HashMap<>();
        generic.put("aman", first);
        generic.put("aman1", second);
        generic.put("aman2", third);
        generic.put("aman3", fourth);
        generic.put("aman4", fifth);

        final Iterator itr = generic.entrySet().iterator();
        while (itr.hasNext()) {
            final Map.Entry pairs = (Map.Entry) itr.next(); // <- pairs.getValue() is a map
            System.out.println("Key1: " + pairs.getKey());
            printMap((Map<String, String>) pairs.getValue());
            count++;
        }

        System.out.println(count);
        System.out.println(generic.size());

    }

    public static void printMap(final Map<String, String> map) {
        final Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            final Map.Entry pairs = (Map.Entry) it.next(); // <- pairs.getValue() is a String
            System.out.println("Key2: " + pairs.getKey() + " Value2: " + pairs.getValue());
            count++;
            it.remove();
        }
    }

}
