package anshulika;

import java.util.*;

public class Matrix {

    public static void main(final String[] args) {
        final ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<ArrayList<Integer>>();
        final ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(3);
        al.add(4);
        listOfLists.add(al);
        final ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(5);
        a2.add(2);
        a2.add(9);
        listOfLists.add(a2);
        final ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(8);
        a3.add(7);
        a3.add(6);
        listOfLists.add(a3);
        System.out.println(countSpecialElements(listOfLists));
    }

    static int countSpecialElements(final ArrayList<ArrayList<Integer>> matrix) {

        final Set<Integer> ans = new HashSet<Integer>();
        final int r = matrix.size();
        if (r == 0) {
            return 0;
        }
        final int c = matrix.get(0).size();
        int i, j, maxi, mini;

        for (i = 0; i < r; i++) {
            maxi = Integer.MIN_VALUE;
            mini = Integer.MAX_VALUE;
            for (j = 0; j < c; j++) {
                if (matrix.get(i).get(j) >= maxi) {
                    maxi = matrix.get(i).get(j);
                }
                if (matrix.get(i).get(j) < mini) {
                    mini = matrix.get(i).get(j);
                }
            }
            ans.add(mini);
            ans.add(maxi);
        }

        for (i = 0; i < c; i++) {
            maxi = Integer.MIN_VALUE;
            mini = Integer.MAX_VALUE;
            for (j = 0; j < r; j++) {
                if (matrix.get(j).get(i) >= maxi) {
                    maxi = matrix.get(j).get(i);
                }
                if (matrix.get(j).get(i) < mini) {
                    mini = matrix.get(j).get(i);
                }
            }
            ans.add(mini);
            ans.add(maxi);
        }
        return ans.size();
    }
}