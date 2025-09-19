class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = -1;

        // Find the first zero in the arrays
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        // If  there are no zeros,no need to do anything
        if (j == -1) {
            return;
        }

        // Move non-zero elements forward
        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                // Swap nums[j] and nums[i]
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++; // Move j forward
            }
        }
    }
}
