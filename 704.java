class Solution {
    public int search(int[] nums, int target) {
        int l =0;
        int r =nums.length-1;
        while(l<=r)
        {
            int mi = ((l+r-1)+1)/2;
            if(nums[mi]==target)  return mi;
            if(nums[mi]>target)   r=mi-1;
            else  l=mi+1;
        }
        return -1;
    }
}