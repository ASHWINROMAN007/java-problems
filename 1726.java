class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i =0;i<nums.length;i++)
        {
            for(int j = i+1;j<nums.length;j++)
            {
                int p = nums[i]*nums[j];
                m.put(p,m.getOrDefault(p,0)+1);
            }
        }
        int c=0;
        for(int k:m.keySet())
        {
            int f = m.get(k);
            if(f>1)
            {
                c+=((f-1)*f/2*8);
            }

        }
        return c;
    }
}