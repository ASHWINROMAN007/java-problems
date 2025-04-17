class Solution {
    public int unequalTriplets(int[] nums) {
        int n = nums.length;
        int c=0;
        for(int i =0;i<n;i++)
        {
            int a = nums[i];
            for(int j = i+1;j<n;j++)
            {
                int b = nums[j];
                if(a!=b)
                {
                for(int k = j+1;k<n;k++)
                {
                    if(a!=nums[k]&&b!=nums[k])
                    {
                        c++;
                    }
                }
                }
            }
        }
        return c;
    }
}