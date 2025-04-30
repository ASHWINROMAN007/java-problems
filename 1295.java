class Solution {
    public int findNumbers(int[] nums) {
        int co=0;
        for(int a : nums)
        {
            int c =0;
            int n=a;
            while(n!=0)
            {
                n=n/10;
                c++;
            }
            if(c%2==0)
            {
                co++;
            }
        }
        return co;
    }
}