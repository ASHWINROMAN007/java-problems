class Solution {
    public int numOfSubarrays(int[] arr) {
         final int MOD = 1_000_000_007;
        int n = arr.length;
        long s = 0; 
        int r = 0;
        int ce = 1;
        int co = 0; 
        
        for (int i = 0; i < n; i++) {
            s += (long) arr[i]; 
            if (s % 2 != 0) {
                r =(r+ce)%MOD;
                co++;
            } else {
                r =(r+co)%MOD;
                ce++;
            }
        }
        
        return r;
    }
}
