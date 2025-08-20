class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (i % 2 == 0) {
                sum += nums[i];
            }
        }
        return sum;
    }
}