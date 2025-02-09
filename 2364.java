class Solution {
    public long countBadPairs(int[] nums) {
        long n = nums.length;
        long t = (n*(n-1)/2);
        long g = 0;
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i =0;i<n;i++)
        {
            int k = nums[i]-i;
            if(m.containsKey(k))
            {
                g+=m.get(k);
            }
            m.put(k,m.getOrDefault(k,0)+1);
        }
        return t-g;
    }
}