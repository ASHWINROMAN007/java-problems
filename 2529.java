class Solution {
    public int maximumCount(int[] nums) {
        int m = 0, mi = 0;
        for (int a : nums) {
            if (a >0) m++;
            else if(a<0)mi++;
        }
        return Math.max(m, mi);
    }
}
