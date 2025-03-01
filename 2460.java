class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int[] r = new int[n];
        int ind = 0;
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && nums[i] == nums[i + 1]&&nums[i]!=0) {
                r[ind++] = nums[i] * 2;
                nums[i + 1] = 0;
            } 
            else if (nums[i] != 0) {
                r[ind++] = nums[i];
            }

        }
        while (ind < n) {
            r[ind++] = 0;
        }
        return r;

    }
}