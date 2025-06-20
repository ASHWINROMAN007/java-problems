class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int zero = 0,l=0,r=0,max=0;
        while(r<n)
        {
            if(nums[r]==0) zero++;
            if(zero>k)
            {
                if(nums[l]==0) zero--;
                l++;
            }
            if(zero<=k)
            {
                max = Math.max(max,r-l+1);
            }
            r++;
        }
        return max;
    }
}