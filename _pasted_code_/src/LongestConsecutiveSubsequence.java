import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSubsequence {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result = 1;
        //100, 4, 200, 1, 3, 2
        for (int i : nums) {
        	System.out.println(i);
            if (map.containsKey(i)) {
                continue;
            }
            int left = map.containsKey(i - 1) ? map.get(i - 1) : 0;
            System.out.println("left value" + left);
            int right = map.containsKey(i + 1) ? map.get(i + 1) : 0;
            System.out.println("right value" + right);
            int sum = left + right + 1;
            map.put(i, sum);
            result = Math.max(sum, result);
            System.out.println("result  " + result);
            map.put(i - left, sum);
            map.put(i + right, sum);
        }
        return result;
    }

    public static void main(String args[]) {
        LongestConsecutiveSubsequence lcs = new LongestConsecutiveSubsequence();
        int[] input = {100, 4, 200, 1, 3, 2};
        System.out.println(lcs.longestConsecutive(input));
    }
}