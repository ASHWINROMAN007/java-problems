class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int s=nums[0];
        int m=s;
        for(int i =0;i<n-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
            s+=nums[i+1];
            }
            else{
                s=nums[i+1];
            }
            if(s>m)
            {
                m=s;
            }
            
        }
        return m;
    }
}