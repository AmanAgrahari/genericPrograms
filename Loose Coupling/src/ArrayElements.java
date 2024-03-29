import java.io.*;
import java.util.*;
 
class ArrayElements
{
    // Returns length of the longest consecutive subsequence
    static int findLongestConseqSubseq(int arr[],int n)
    {
        HashSet<Integer> S = new HashSet<Integer>();
        int ans = 0;
 
        // Hash all the array elements
        for (int i=0; i<n; ++i)
            S.add(arr[i]);
 
        // check each possible sequence from the start
        // then update optimal length
        for (int i=0; i<n; ++i)
        {
            // if current element is the starting
            // element of a sequence
        	System.out.println(S.contains(arr[i]-1));
            if (!S.contains(arr[i]-1))
            {
                // Then check for next elements in the
                // sequence
                int j = arr[i];
                while (S.contains(j))
                    j++;
 
                // update  optimal length if this length
                // is more
                if (ans<j-arr[i])
                    ans = j-arr[i];
            }
        }
        return ans;
    }
 
    // Testing program
    public static void main(String args[])
    {
        int arr[] =  {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};
        int n = arr.length;
        System.out.println("Length of the Longest consecutive subsequence is " +
                           findLongestConseqSubseq(arr,n));
    }
}