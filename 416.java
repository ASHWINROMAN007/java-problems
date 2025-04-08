class Solution {
    public boolean canPartition(int[] nums) {
        int s = 0;
        for (int a : nums) {
            s += a;
        }
        if (s % 2 != 0)
            return false;
        int t = s / 2;
        boolean[] p = new boolean[t + 1];
        p[0] = true;
        for (int n : nums) {
            for (int i = t; i >= n; i--) {
                p[i] = p[i] || p[i - n];
            }
        }
        return p[t];
    }
}