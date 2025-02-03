class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int in =1;
        int d =1;
        int result = 1;
        for(int i =1;i<n;i++)
        {
           if(nums[i]>nums[i-1])
           {
            in++;
            d=1;

           }
           else if(nums[i]<nums[i-1])
           {
            d++;
            in=1;
           }
           else
           {
            d=1;
            in=1;
           }
           result=Math.max(result,Math.max(d,in));
        }
        return result;
    }
}