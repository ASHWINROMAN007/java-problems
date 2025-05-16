class Solution {
    public boolean isMonotonic(int[] nums) {
       boolean in = true,de=true;
       for(int i = 1;i<nums.length;i++)
       {
        if(nums[i]>nums[i-1]) de=false;
        if(nums[i]<nums[i-1]) in=false;
       }
       return in||de;
    }
}