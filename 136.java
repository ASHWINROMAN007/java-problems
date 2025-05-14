class Solution {
    public int singleNumber(int[] nums) {
        int re=0;
        for(int a : nums)
        {
            re = re ^ a;
        }
        return (int)(re);
    }
}