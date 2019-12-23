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

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU {

    /**
     * @param args
     */
    private static final int MAX_CACHE_ENTRIES = 2000;

    public static void main(final String[] args) {
        final Map<String, String> cache = createLRUMap(MAX_CACHE_ENTRIES);

    }

    public static <K, V> Map<K, V> createLRUMap(final int maxEntries) {

        return new LinkedHashMap<K, V>(maxEntries * 10 / 7, 0.7f, true) {

            private static final long serialVersionUID = 8872489438005896890L;

            @Override
            protected boolean removeEldestEntry(final Map.Entry<K, V> eldest) {
                return size() > maxEntries;
            }
        };
    }
}
