class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] a = new int[n* (n+1) / 2];
        int mod = 1000000007;
        int ind=0;int result=0;
        for(int i=0;i<nums.length;i++)
        {
            
            int sum =0;
            for(int j =i;j<nums.length;j++)
            {
                sum +=nums[j];
                a[ind++]=sum;
            }
        }
        Arrays.sort(nums);
        for(int i = left-1;i<right;i++)
            result = (result + nums[i])%mod;
        return result;
        
    }
}