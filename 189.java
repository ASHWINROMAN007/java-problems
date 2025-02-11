class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; 
        reverse(nums, 0, n - k - 1); 
        reverse(nums, n - k, n - 1); 
        reverse(nums, 0, n - 1); 
    }

    private void reverse(int[] nums, int a, int k) {
        while (a < k) {
            int t = nums[a];
            nums[a] = nums[k];
            nums[k] = t;
            a++;
            k--;
        }
    }
}
