class Solution {
    public int largestdigit(int a)
    {
        int t =a;
        int r=0;
        while(t>0)
        {
            r=Math.max(r,t%10);
            t=t/10;
        }
        return r;
    }
    public int maxSum(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxs = -1;
        for(int a : nums)
        {
            int lard = largestdigit(a);
            if(map.containsKey(lard))
            {
                maxs = Math.max(maxs,map.get(lard)+a);
                map.put(lard, Math.max(map.get(lard), a));
            }
            else
            {
                map.put(lard,a);
            }
        }
        return maxs;
    }
}