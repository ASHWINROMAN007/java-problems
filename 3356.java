class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;

        
        boolean alreadyZero = true;
        for (int x : nums) {
            if (x > 0) {
                alreadyZero = false;
                break;
            }
        }
        if (alreadyZero) return 0;

        int low = 1, high = queries.length, result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (canZero(nums, queries, mid)) {
                result = mid;
                high = mid - 1;  
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    private boolean canZero(int[] nums, int[][] queries, int k) {
        int n = nums.length;
        int[] cov = new int[n + 1];  

        for (int i = 0; i < k; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            int val = queries[i][2];

            cov[l] += val;
            if (r + 1 < n) {
                cov[r + 1] -= val;
            }
        }

       
        for (int i = 1; i < n; i++) {
            cov[i] += cov[i - 1];
        }

        
        for (int i = 0; i < n; i++) {
            if (nums[i] > cov[i]) {
                return false;
            }
        }

        return true;
    }
}
