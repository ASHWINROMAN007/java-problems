import java.util.*;

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < n; i += 3) {
            if (i + 2 >= n) return new int[0][];
            int a = nums[i], b = nums[i + 1], c = nums[i + 2];
            if (c - a > k) return new int[0][]; 
            result.add(new int[]{a, b, c});
        }
        return result.toArray(new int[result.size()][]);
    }
}
