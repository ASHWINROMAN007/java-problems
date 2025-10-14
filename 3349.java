import java.util.*;

class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        if (2 * k > n) return false; 
        
        for (int a = 0; a <= n - 2 * k; a++) {
            if (isIncreasing(nums, a, k) && isIncreasing(nums, a + k, k)) {
                return true;
            }
        }
        return false;
    }

    private boolean isIncreasing(List<Integer> nums, int start, int k) {
        for (int i = start; i < start + k - 1; i++) {
            if (nums.get(i) >= nums.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
