class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int maxi = 0;
        for(int i : nums)
        {
if(i==1)
{
    c++;
    maxi = Math.max(maxi,c);
}
            else
            {
c=0;
            }
        }
        return maxi;
    }
}