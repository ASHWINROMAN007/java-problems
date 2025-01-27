class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;

        // Find the first decreasing element from the end
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }

        if (ind != -1) {
            // Find the smallest element larger than nums[ind] from the right
            for (int i = n - 1; i > ind; i--) {
                if (nums[i] > nums[ind]) {
                    swap(nums, i, ind);
                    break;
                }
            }
        }

        // Reverse the elements to the right of ind to get the next permutation
        rev(nums, ind + 1, n - 1);
    }

    // Swap method
    public void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    // Reverse method
    public void rev(int[] a, int s, int e) {
        while (s < e) {
            swap(a, s, e);
            s++;
            e--;
        }
    }
}
