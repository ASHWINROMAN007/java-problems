import java.util.Arrays;

class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] results = new int[n - k + 1]; 
        
        for (int i = 0; i <= n - k; i++) {
            int[] subarray = Arrays.copyOfRange(nums, i, i + k);
            
            boolean isConsecutive = true;
            for (int j = 1; j < k; j++) {
                if (subarray[j] != subarray[j - 1] + 1) { 
                    isConsecutive = false;
                    break;
                }
            }
            
            if (isConsecutive) {
                results[i] = subarray[k - 1]; 
            } else {
                results[i] = -1; 
            }
        }
        return results;
    }
}
