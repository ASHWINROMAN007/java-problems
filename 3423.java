class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int max=Integer.MIN_VALUE;
        for(int i = 0;i<n;i++)
        {
            int dif=0;
            if(i==n-1)
            {
                 dif = Math.abs(nums[i]-nums[0]);
            }
            else
            {
             dif = Math.abs(nums[i]-nums[i+1]);
            }
            if(dif>max)
            {
                max=dif;
            }
        }
        return max;
    }
}