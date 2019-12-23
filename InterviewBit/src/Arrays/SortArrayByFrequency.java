package Arrays;

import java.util.*;

public class SortArrayByFrequency {

    public static void main(final String[] args) {
        final int[] arr = { 2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12 };

        System.out.println("Arr " + Arrays.toString(arr));
        sortByFrequency(arr);
    }

    static void sortByFrequency(final int[] arr) {

        final Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                final int count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        System.out.println("**************************************");
        for (final Map.Entry<Integer, Integer> entry : map.entrySet()) {
            final int count = entry.getValue();
            for (int i = 1; i <= count; i++) {
                System.out.print(" " + entry.getKey());
            }
        }
        System.out.println();
        System.out.println("************************************");

        final Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        final List<Map.Entry<Integer, Integer>> list = new ArrayList<>(set);

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(final Map.Entry<Integer, Integer> o1, final Map.Entry<Integer, Integer> o2) {

                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (final Map.Entry<Integer, Integer> entry : list) {
            final int count = entry.getValue();
            for (int i = 1; i <= count; i++) {
                System.out.print(" " + entry.getKey());
            }
            System.out.println();

        }
    }
}