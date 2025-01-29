class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;int z=0, o =0,t=0;
        for(int i =0;i<n;i++)
        {
        if(nums[i]==0){
            z++;
        }
        if(nums[i]==1)
        {
            o++;
        }
        if(nums[i]==2)
        {
            t++;
        }
        }
        for(int i =0;i<z;i++)
        {
            nums[i]=0;
        }
        for(int i = z;i<z+o;i++)
        {
            nums[i]=1;
        }
        for(int i = z+o;i<n;i++)
        {
            nums[i]=2;
        }
        
    }
}