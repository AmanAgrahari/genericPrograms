
package anshulika;

import java.util.ArrayList;

public class Matrix2 {

    public static void main(final String[] args) {
        final ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<ArrayList<Integer>>();
        final ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(0);
        al.add(0);
        al.add(1);
        listOfLists.add(al);
        final ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(0);
        a2.add(1);
        a2.add(1);
        a2.add(1);
        listOfLists.add(a2);
        final ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(1);
        a3.add(0);
        a3.add(0);
        a3.add(1);
        listOfLists.add(a3);
        System.out.println(countConnection(listOfLists));
    }

    static boolean valid(final int i, final int j, final int r, final int c) {
        if (i < 0 || i >= r) {
            return false;
        }
        if (j < 0 || j >= c) {
            return false;
        }
        return true;
    }

    public static int countConnection(final ArrayList<ArrayList<Integer>> matrix) {
        final int r = matrix.size();
        if (r == 0) {
            return 0;
        }
        final int c = matrix.get(0).size();
        int i, j, ans = 0;
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                if (matrix.get(i).get(j) == 0) {
                    continue;
                }
                if (valid(i, j + 1, r, c) && matrix.get(i).get(j + 1) == 1) {
                    ans++;
                }
                if (valid(i + 1, j, r, c) && matrix.get(i + 1).get(j) == 1) {
                    ans++;
                }
                if (valid(i + 1, j + 1, r, c) && matrix.get(i + 1).get(j + 1) == 1) {
                    ans++;
                }
                if (valid(i - 1, j + 1, r, c) && matrix.get(i - 1).get(j + 1) == 1) {
                    ans++;
                }
            }
        }
        return ans;
    }

}