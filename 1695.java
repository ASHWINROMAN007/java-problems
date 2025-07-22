class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = 0;
        int s=0;
        int max = 0;
        Set<Integer> h = new HashSet<>();
        while(r<n)
        {
            
            while(h.contains(nums[r]))
            {
                h.remove(nums[l]);
                s-=nums[l];
                l++;
            }
            h.add(nums[r]);
            s+=nums[r];
            max=Math.max(max,s);
            r++;
        }
        return max;
    }
}