class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int c=0;
        int l =0;
        int pr=1;
        for(int i =0;i<n;i++)
       {
        pr*=nums[i];
        while(pr>=k&&l<=i)
        {
           pr=pr/nums[l];
           l++; 
        }
        c+=i-l+1;
       }
       return c;
    }
}