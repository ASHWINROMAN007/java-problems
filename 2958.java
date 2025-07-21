class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int r = 0;
        int max=0;
        HashMap<Integer,Integer> h = new HashMap<>();
        while(r<n)
        {
            h.put(nums[r],h.getOrDefault(nums[r],0)+1);
            while(h.get(nums[r])>k)
            {
                h.put(nums[l],h.get(nums[l])-1);
                if(h.get(nums[l])==0)
                {
                    h.remove(nums[l]);
                }
                l++;
            }
            max=Math.max(max,r-l+1);

            r++;
        }
        return max;
    }
}