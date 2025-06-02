class Solution {
    public int column(int[][] nums,int i)
    {
        int max=0;
        for(int j = 0;j<nums.length;j++)
        {
            if(max<nums[j][i])
            {
                max = nums[j][i];
            }
        }
        return max;
    }
    public int matrixSum(int[][] nums) {
        for(int[] a : nums)
        {
            Arrays.sort(a);
        }
        int mac =0;
        for(int i =0;i<nums[0].length;i++)
        {
           mac+=column(nums,i);
        }
        return mac;
    }
}