class Solution {
    public boolean isArraySpecial(int[] nums) { 
        boolean a = true;
        for(int i =0;i<(nums.length)-1;i++)
        {
            if(nums[i]%2==nums[i+1]%2)
            {
                a=false;
                break;
            }
        }
       
        return a;
    }
}