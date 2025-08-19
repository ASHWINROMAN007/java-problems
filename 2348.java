class Solution {
    public long zeroFilledSubarray(int[] nums) {
        return zerocount(nums, 0 , 0L , 0L);
    }
    public long zerocount(int[] nums, int index , long count, long total)
    {
        if(index == nums.length)   return total;
        if(nums[index]==0)
        {
            count++;
            total+=count;
        }
        else
        {
            count=0;
        }
        return zerocount(nums,index+1,count,total);
    }
}